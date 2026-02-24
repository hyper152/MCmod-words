# MCmod-words

# Words Mod - 墙面写字模组

[![Fabric](https://img.shields.io/badge/modloader-Fabric-blue)](https://fabricmc.net/)
[![Minecraft](https://img.shields.io/badge/minecraft-1.21.1-green)](https://minecraft.net/)
[![Version](https://img.shields.io/badge/version-1.0.2-orange)](https://github.com/)

一个简单好用的 Minecraft Fabric 模组，让你可以在墙面上写字！拿着写字笔右键点击墙面，输入文字后就会永久显示在墙上。

## 📖 功能介绍

- ✍️ **墙面写字**：拿着写字笔右键点击墙面，输入文字即可
- ⚪ **白色文字**：文字颜色固定为白色，清晰可见
- 📏 **可调大小**：支持调节字体大小（40% - 400%）
- 🔍 **完全透明**：方块本身完全透明不可见，只显示文字
- 💾 **永久保存**：文字会保存到世界中，重启游戏依然存在
- 🌐 **多人兼容**：完全支持多人游戏，其他玩家也能看到文字

## 📦 安装要求

- Minecraft **1.21.1**
- Fabric Loader **≥0.16.0**
- Fabric API **≥0.102.1+1.21.1**
- Java **21**

## ⚙️ 安装方法

1. 安装 [Fabric Loader](https://fabricmc.net/use/)
2. 下载 [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. 下载本模组的 `.jar` 文件
4. 将上述文件放入 `.minecraft/mods` 文件夹
5. 启动游戏

## 🎮 使用方法

### 获取物品
在游戏中输入指令获取写字笔：
```
/give @p words:writing_tool
```

### 写字步骤
1. 手持**写字笔**
2. 右键点击任意实心墙面（石头、木头、泥土等）
3. 在弹出的界面中输入文字
4. 调节字体大小滑块（40% - 400%）
5. 点击"确定"
6. 白色文字就会显示在墙面上！

### 修改文字
再次右键点击已经写字的墙面，可以修改文字内容。

## 🎚️ 字体大小调节

- 滑块范围：**40% - 400%**
- 默认大小：**100%**
- 实时预览：拖动滑块时实时看到文字大小变化

## 🛠️ 技术特性

- **服务端安全**：所有客户端代码都被正确隔离，可在纯净服务端运行
- **网络同步**：文字内容实时同步给所有玩家
- **数据持久化**：文字保存在方块实体 NBT 中
- **粒子效果**：写字时会有白色粒子效果

## 📁 文件结构

```
words-X.X.X.jar
├── com/hyper/
│   ├── block/              # 方块相关类
│   │   ├── WritingBlock.java
│   │   ├── WritingBlockEntity.java
│   │   └── BlockClientProxy.java
│   ├── client/              # 客户端相关类
│   │   ├── WritingBlockEntityRenderer.java
│   │   └── WritingScreen.java
│   ├── item/                # 物品相关类
│   │   ├── WritingToolItem.java
│   │   └── WritingToolClientProxy.java
│   ├── network/             # 网络包相关类
│   │   └── WritingPacket.java
│   ├── ModBlockEntities.java
│   ├── ModBlocks.java
│   ├── ModItems.java
│   ├── Words.java
│   └── WordsClient.java
└── assets/
    └── words/
        ├── models/          # 模型文件
        ├── textures/        # 纹理文件
        └── zh_cn.json       # 中文语言文件
```

## 🔧 配置文件

模组无需配置，开箱即用！

## 👤 作者

hyper


## 运行调试程序
gradlew runClient

## 生成mod
gradlew build
