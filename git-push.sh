#!/bin/bash

# Git 一键推送脚本
# 点开后提示输入提交信息

# 颜色输出
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

echo -e "${YELLOW}🚀  Git 一键推送脚本${NC}"
echo "=========================="

# 1. 提示输入提交信息
echo -e "${YELLOW}📝 请输入提交信息:${NC}"
read -p "> " COMMIT_MSG

# 检查是否输入了提交信息
if [ -z "$COMMIT_MSG" ]; then
    echo -e "${RED}❌ 提交信息不能为空！${NC}"
    echo -e "${YELLOW}使用默认提交信息: 更新${NC}"
    COMMIT_MSG="更新"
fi

# 2. 检查是否是 Git 仓库
if ! git rev-parse --git-dir > /dev/null 2>&1; then
    echo -e "${RED}❌ 当前目录不是 Git 仓库！${NC}"
    echo "请先在当前目录执行: git init"
    read -p "按回车键退出..."
    exit 1
fi

# 3. 检查是否有远程仓库
REMOTE=$(git remote)
if [ -z "$REMOTE" ]; then
    echo -e "${RED}❌ 没有找到远程仓库！${NC}"
    echo "请先运行: git remote add origin 仓库地址"
    echo -e "${YELLOW}例如: git remote add origin git@github.com:用户名/仓库名.git${NC}"
    read -p "按回车键退出..."
    exit 1
fi

# 4. 获取当前分支
BRANCH=$(git symbolic-ref --short HEAD 2>/dev/null)
if [ -z "$BRANCH" ]; then
    BRANCH="main"
fi

echo -e "${GREEN}📌 当前分支: $BRANCH${NC}"
echo -e "${GREEN}📌 提交信息: $COMMIT_MSG${NC}"
echo "=========================="

# 5. 显示当前更改状态
echo -e "${YELLOW}📊 当前更改状态:${NC}"
git status -s
echo "=========================="

# 6. 确认是否继续
echo -e "${YELLOW}是否继续提交？(y/n)${NC}"
read -p "> " CONFIRM
if [[ ! "$CONFIRM" =~ ^[Yy]$ ]]; then
    echo -e "${RED}❌ 已取消提交${NC}"
    read -p "按回车键退出..."
    exit 0
fi

# 7. 添加所有更改
echo -e "${YELLOW}📦 添加文件...${NC}"
git add .

# 8. 提交更改
echo -e "${YELLOW}💾 提交更改...${NC}"
git commit -m "$COMMIT_MSG"

# 9. 尝试拉取远程更改
echo -e "${YELLOW}⬇️  拉取远程更新...${NC}"
if git pull origin "$BRANCH" --no-rebase > /dev/null 2>&1; then
    echo -e "${GREEN}✅ 拉取成功${NC}"
else
    echo -e "${YELLOW}⚠️  尝试使用 --allow-unrelated-histories 拉取...${NC}"
    git pull origin "$BRANCH" --allow-unrelated-histories --no-rebase
    if [ $? -ne 0 ]; then
        echo -e "${RED}❌ 拉取失败，请手动解决冲突！${NC}"
        echo -e "${YELLOW}解决冲突后，手动执行:${NC}"
        echo "  git add ."
        echo "  git commit -m \"解决冲突\""
        echo "  git push"
        read -p "按回车键退出..."
        exit 1
    fi
fi

# 10. 推送代码
echo -e "${YELLOW}⬆️  推送到远程...${NC}"
if git push origin "$BRANCH"; then
    echo -e "${GREEN}✅ 一键推送成功！${NC}"
else
    echo -e "${RED}❌ 推送失败，请检查网络或权限${NC}"
    read -p "按回车键退出..."
    exit 1
fi

echo "=========================="
echo -e "${GREEN}✨ 所有操作完成！${NC}"
read -p "按回车键退出..."