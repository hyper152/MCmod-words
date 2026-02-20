# Project Directory Structure

```text
MCmod-words/
    .classpath
    .gitattributes
    .gitignore
    .project
    build.gradle
    git-push.sh
    gradle.properties
    gradlew
    gradlew.bat
    LICENSE
    MCmod-words_client.launch
    MCmod-words_server.launch
    README.md
    settings.gradle
    .github/
        workflows/
            build.yml
    .settings/
        org.eclipse.jdt.core.prefs
    run/
        command_history.txt
        options.txt
        usercache.json
        config/
            fabric/
                indigo-renderer.properties
        crash-reports/
            crash-2026-02-20_19.05.49-client.txt
            crash-2026-02-20_19.08.00-client.txt
        data/
            fabricDefaultResourcePacks.dat
        downloads/
            log.json
        logs/
            2026-02-20-1.log.gz
            2026-02-20-2.log.gz
            2026-02-20-3.log.gz
            2026-02-20-4.log.gz
            2026-02-20-5.log.gz
            2026-02-20-6.log.gz
            2026-02-20-7.log.gz
            debug-1.log.gz
            debug-2.log.gz
            debug-3.log.gz
            debug-4.log.gz
            debug-5.log.gz
            debug.log
            latest.log
            telemetry/
        mods/
        resourcepacks/
        resources/
        saves/
            新的世界/
                icon.png
                level.dat
                level.dat_old
                session.lock
                advancements/
                    17b67947-156d-3518-9500-f7e04df5e64d.json
                data/
                    raids.dat
                    random_sequences.dat
                datapacks/
                DIM-1/
                    data/
                        raids.dat
                DIM1/
                    data/
                        raids_end.dat
                entities/
                    r.-1.-1.mca
                    r.-1.-2.mca
                    r.-2.-1.mca
                    r.-2.-2.mca
                playerdata/
                    17b67947-156d-3518-9500-f7e04df5e64d.dat
                    17b67947-156d-3518-9500-f7e04df5e64d.dat_old
                poi/
                    r.-2.-1.mca
                region/
                    r.-1.-1.mca
                    r.-1.-2.mca
                    r.-2.-1.mca
                    r.-2.-2.mca
                    r.0.-1.mca
                    r.0.-2.mca
                stats/
                    17b67947-156d-3518-9500-f7e04df5e64d.json
    src/
        client/
            java/
                com/
                    hyper/
                        WordsClient.java
            resources/
        main/
            java/
                com/
                    hyper/
                        Words.java
                        WordsClient.java
                        block/
                            WritingBlock.java
                        mixin/
            resources/
                fabric.mod.json
                words.mixins.json
                assets/
                    words/
                        icon.png
                        zh_cn.json
        test/
            java/
```

---

## File: .classpath

```text
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="output" path="bin/default"/>
	<classpathentry output="bin/main" kind="src" path="src/main/java">
		<attributes>
			<attribute name="gradle_scope" value="main"/>
			<attribute name="gradle_used_by_scope" value="main,test,client"/>
		</attributes>
	</classpathentry>
	<classpathentry output="bin/main" kind="src" path="src/main/resources">
		<attributes>
			<attribute name="gradle_scope" value="main"/>
			<attribute name="gradle_used_by_scope" value="main,test,client"/>
		</attributes>
	</classpathentry>
	<classpathentry output="bin/client" kind="src" path="src/client/java">
		<attributes>
			<attribute name="gradle_scope" value="client"/>
			<attribute name="gradle_used_by_scope" value="test,client"/>
		</attributes>
	</classpathentry>
	<classpathentry output="bin/client" kind="src" path="src/client/resources">
		<attributes>
			<attribute name="gradle_scope" value="client"/>
			<attribute name="gradle_used_by_scope" value="test,client"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-21/"/>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/26.0.2/bfa27b5e683363963c8d5e2fec39d755295cbb82/annotations-26.0.2-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/26.0.2/c7ce3cdeda3d18909368dfe5977332dfad326c6d/annotations-26.0.2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value=""/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/9.9/5aa89c77317a704e2e34d117b72756ff1c1530bb/asm-9.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/9.9/c29635c8a7afa03d74b33c1884df8abb2b3f3dcc/asm-9.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-analysis/9.9/3ce67cca2a5bf3d1d271fb13e0011714df6c68e6/asm-analysis-9.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-analysis/9.9/bf4fa6e66638851c1cd22c2caea0c3ee5d5f437/asm-analysis-9.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-commons/9.9/a51d8b4b55baa109a6c4ac1e897820ad638f63d2/asm-commons-9.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-commons/9.9/db9165a3bf908ded6b08612d583a15d1d0c7bda0/asm-commons-9.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-tree/9.9/60b736062debb8f627d06fa42b962744b1e1a43a/asm-tree-9.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-tree/9.9/f8de6eead6d24dd0f45bd065bbe112b2cda6ea21/asm-tree-9.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-util/9.9/4e8aceea08c648727bb173f03e6fd31fbdb86289/asm-util-9.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-util/9.9/42fdfc0508b43807c8078d6e82ecff2ce2112ae8/asm-util-9.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.17.0+mixin.0.8.7/d3ea80c8aa7974ecfcde80e7be1b3eb796fb2022/sponge-mixin-0.17.0+mixin.0.8.7-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.17.0+mixin.0.8.7/cf31463202f72d03b0ef1e1e38e8ee71b7faaab6/sponge-mixin-0.17.0+mixin.0.8.7.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.github.llamalad7/mixinextras-fabric/0.5.0/763194e452da1311d6e93091d431854f4a4b4c5d/mixinextras-fabric-0.5.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.github.llamalad7/mixinextras-fabric/0.5.0/91a83dfb7abd320f6236bd1fcf5c0ff143d59a13/mixinextras-fabric-0.5.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.github.oshi/oshi-core/6.4.10/4ed9e291040b618d12880f00fe77f13777dfa7cb/oshi-core-6.4.10-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.github.oshi/oshi-core/6.4.10/b1d8ab82d11d92fd639b56d639f8f46f739dd5fa/oshi-core-6.4.10.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.10.1/982a90132e942f302e6fe79d6e78c4bc2e998569/gson-2.10.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.10.1/b3add478d4382b78ea20b1671390a858002feb6c/gson-2.10.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.guava/failureaccess/1.0.1/1d064e61aad6c51cc77f9b59dc2cccc78e792f5a/failureaccess-1.0.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.guava/failureaccess/1.0.1/1dcf1de382a0bf95a3d8b0849546c88bac1292c9/failureaccess-1.0.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/32.1.2-jre/e1911d4544f426600132fbd450a7ccab8a3ce8dc/guava-32.1.2-jre-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/32.1.2-jre/5e64ec7e056456bef3a4bc4c6fdaef71e8ab6318/guava-32.1.2-jre.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.ibm.icu/icu4j/73.2/824467d920134624effab17374434d00fe7b3b40/icu4j-73.2-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.ibm.icu/icu4j/73.2/61ad4ef7f9131fcf6d25c34b817f90d6da06c9e9/icu4j-73.2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/authlib/6.0.54/1e11f447b3029c31afa41291f02d0da3701af827/authlib-6.0.54-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/authlib/6.0.54/de8bc95660e1b2fe8793fd427a7a10dcec5b3ea7/authlib-6.0.54.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/blocklist/1.0.10/ef44852fa1707a833bfa8e8518659ab18f368d25/blocklist-1.0.10-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/blocklist/1.0.10/5c685c5ffa94c4cd39496c7184c1d122e515ecef/blocklist-1.0.10.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/brigadier/1.3.10/d4b579a2b795ff6bfe5eb02760a2748d29addd2e/brigadier-1.3.10-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/brigadier/1.3.10/d15b53a14cf20fdcaa98f731af5dda654452c010/brigadier-1.3.10.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/datafixerupper/8.0.16/1482506562a012761c60594c23f6bcbeb0d354a3/datafixerupper-8.0.16-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/datafixerupper/8.0.16/67d4de6d7f95d89bcf5862995fb854ebaec02a34/datafixerupper-8.0.16.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/logging/1.2.7/3913c421c4f6b914a15fa267e6dbab44c989690f/logging-1.2.7-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/logging/1.2.7/24cb95ffb0e3433fd6e844c04e68009e504ca1c0/logging-1.2.7.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/patchy/2.2.10/da05971b07cbb379d002cf7eaec6a2048211fefc/patchy-2.2.10.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/text2speech/1.17.9/1898fbfd00a552b7f9a3cc0438623845a91e74ed/text2speech-1.17.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/com.mojang/text2speech/1.17.9/3cad216e3a7f0c19b4b394388bc9ffc446f13b14/text2speech-1.17.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-codec/commons-codec/1.16.0/57c67a979689051a455570196d0f48134db9909e/commons-codec-1.16.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-codec/commons-codec/1.16.0/4e3eb3d79888d76b54e28b350915b5dc3919c9de/commons-codec-1.16.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.15.1/f23737700ceaddc75169d994c7d9c9a2e5dddf39/commons-io-2.15.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.15.1/f11560da189ab563a5c8e351941415430e9304ea/commons-io-2.15.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.2/ecf26c7507d67782a3bbd148d170b31dfad001aa/commons-logging-1.2-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.2/4bfc12adfe4842bf07b657f0369c4cb522955686/commons-logging-1.2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-buffer/4.1.97.Final/5d2c3a0c097b4fd07fe87c35ad6ad125a683cf05/netty-buffer-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-buffer/4.1.97.Final/f8f3d8644afa5e6e1a40a3a6aeb9d9aa970ecb4f/netty-buffer-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec/4.1.97.Final/ec4abd65dbbb57b39e4e7ca40d8883e052038862/netty-codec-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec/4.1.97.Final/384ba4d75670befbedb45c4d3b497a93639c206d/netty-codec-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-common/4.1.97.Final/6602f651718b461cd2d17244d95cc87d58c3169a/netty-common-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-common/4.1.97.Final/7cceacaf11df8dc63f23d0fb58e9d4640fc88404/netty-common-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-handler/4.1.97.Final/badecb27f6b39814c8932d2ba8d5c3ce2a8dffe/netty-handler-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-handler/4.1.97.Final/abb86c6906bf512bf2b797a41cd7d2e8d3cd7c36/netty-handler-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-resolver/4.1.97.Final/79dbdd5bddcb4f901c18337b367db354df56fca1/netty-resolver-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-resolver/4.1.97.Final/cec8348108dc76c47cf87c669d514be52c922144/netty-resolver-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-classes-epoll/4.1.97.Final/c4c9f444bc376a359b3159d45947ffc510d77d38/netty-transport-classes-epoll-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-classes-epoll/4.1.97.Final/795da37ded759e862457a82d9d92c4d39ce8ecee/netty-transport-classes-epoll-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-unix-common/4.1.97.Final/d9bcfe2c9bc55a77973fc4bb7e4d6c1a298ac9e9/netty-transport-native-unix-common-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-unix-common/4.1.97.Final/d469d84265ab70095b01b40886cabdd433b6e664/netty-transport-native-unix-common-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport/4.1.97.Final/80452a42374b6c4e1a3596ce09f337b4ff4f4efb/netty-transport-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport/4.1.97.Final/f37380d23c9bb079bc702910833b2fd532c9abd0/netty-transport-4.1.97.Final.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/it.unimi.dsi/fastutil/8.5.12/a57be04c180ac69159c5dc2e9902deebc25780bd/fastutil-8.5.12-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/it.unimi.dsi/fastutil/8.5.12/c24946d46824bd528054bface3231d2ecb7e95e8/fastutil-8.5.12.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna-platform/5.14.0/cefe3d258159eb44f4369ff5d8e12602a340bd15/jna-platform-5.14.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna-platform/5.14.0/28934d48aed814f11e4c584da55c49fa7032b31b/jna-platform-5.14.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna/5.14.0/13bda98796cf4739f5d40cb825578cfaa8463c6e/jna-5.14.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna/5.14.0/67bf3eaea4f0718cb376a181a629e5f88fa1c9dd/jna-5.14.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.sf.jopt-simple/jopt-simple/5.0.4/950831646d014c9162999019a3cb17d5fc01ac0d/jopt-simple-5.0.4-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.sf.jopt-simple/jopt-simple/5.0.4/4fdac2fbe92dfad86aa6e9301736f6b4342a3f5c/jopt-simple-5.0.4.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-compress/1.26.0/35d0a3e49b7c2321c8445a375adc6df9d148c132/commons-compress-1.26.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-compress/1.26.0/659feffdd12280201c8aacb8f7be94f9a883c824/commons-compress-1.26.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.14.0/9ef3e18356f4ac30b15bfa48c02a7f54b51af382/commons-lang3-3.14.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-lang3/3.14.0/1ed471194b02f2c6cb734a0cd6f6f107c673afae/commons-lang3-3.14.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.httpcomponents/httpclient/4.5.13/9654e91a61d7662c36be6710ef8e720c0e3f9807/httpclient-4.5.13-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.httpcomponents/httpclient/4.5.13/e5f6cae5ca7ecaac1ec2827a9e2d65ae2869cada/httpclient-4.5.13.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.httpcomponents/httpcore/4.4.16/229e4c0eae80465381ae02adf61bca5558360777/httpcore-4.4.16-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.httpcomponents/httpcore/4.4.16/51cf043c87253c9f58b539c9f7e44c8894223850/httpcore-4.4.16.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.22.1/a56be5b0028ef8f3e2d6f3b057e8d19794fc5116/log4j-api-2.22.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.22.1/bea6fede6328fabafd7e68363161a7ea6605abd1/log4j-api-2.22.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-core/2.22.1/594b6169e6bba2c964282fd657672f8893304f97/log4j-core-2.22.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-core/2.22.1/7183a25510a02ad00cc6a95d3b3d2a7d3c5a8dc4/log4j-core-2.22.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-slf4j2-impl/2.22.1/81724a054d0618d7a15cf217ede478c0d08e421/log4j-slf4j2-impl-2.22.1-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-slf4j2-impl/2.22.1/d7e6693c2606cb7e7335047d7bb96dec52db5665/log4j-slf4j2-impl-2.22.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.jcraft/jorbis/0.0.17/5446be5d62e4c6b347c8e6cd28dc00a936417ba2/jorbis-0.0.17-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.jcraft/jorbis/0.0.17/8872d22b293e8f5d7d56ff92be966e6dc28ebdc6/jorbis-0.0.17.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.joml/joml/1.10.5/c1f2266a7d0386d7643879ed1b93f51d29126180/joml-1.10.5-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.joml/joml/1.10.5/22566d58af70ad3d72308bab63b8339906deb649/joml-1.10.5.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/d9fba96328a80677edbab28a843f33b847cf1e57/lwjgl-freetype-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/a0db6c84a8becc8ca05f9dbfa985edc348a824c7/lwjgl-freetype-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/fa2c760452674d3eaf336123539b0dd9a83041a4/lwjgl-glfw-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/efa1eb78c5ccd840e9f329717109b5e892d72f8e/lwjgl-glfw-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/6a4ea7a9095e1684a9c6adb2c49d28daae2b6e45/lwjgl-jemalloc-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/b543467b7ff3c6920539a88ee602d34098628be5/lwjgl-jemalloc-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/60a4ce24d71b3376ce53b50cfe3eaaf3277dd727/lwjgl-openal-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/daada81ceb5fc0c291fbfdd4433cb8d9423577f2/lwjgl-openal-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/3353d0b2cac91b84088b01711d33cc403893450b/lwjgl-opengl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/2f6b0147078396a58979125a4c947664e98293a/lwjgl-opengl-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/37c2b604ec4a5ee356dd734dc8167a193e8874ed/lwjgl-stb-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/25dd6161988d7e65f71d5065c99902402ee32746/lwjgl-stb-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/dcda55223f2f940654d222bf4371baa969c60bb9/lwjgl-tinyfd-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/82d755ca94b102e9ca77283b9e2dc46d1b15fbe5/lwjgl-tinyfd-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/e5949c7bbf4f839afe6d1a631e9b75f63c559e0/lwjgl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/29589b5f87ed335a6c7e7ee6a5775f81f97ecb84/lwjgl-3.3.3.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lz4/lz4-java/1.8.0/7609c362f37f0c0bd3743bc1976df2daa28ad19e/lz4-java-1.8.0-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lz4/lz4-java/1.8.0/4b986a99445e49ea5fbf5d149c4b63f6ed6c6780/lz4-java-1.8.0.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.9/97e46b94d70f47892145e09d685461245584d596/slf4j-api-2.0.9-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.9/7cf2726fdcfbc8610f9a71fb3ed639871f315340/slf4j-api-2.0.9.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/minecraftMaven/net/minecraft/minecraft-clientOnly-48f5f74c97/1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2/minecraft-clientOnly-48f5f74c97-1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/minecraftMaven/net/minecraft/minecraft-clientOnly-48f5f74c97/1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2/minecraft-clientOnly-48f5f74c97-1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/minecraftMaven/net/minecraft/minecraft-common-48f5f74c97/1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2/minecraft-common-48f5f74c97-1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/minecraftMaven/net/minecraft/minecraft-common-48f5f74c97/1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2/minecraft-common-48f5f74c97-1.21.1-loom.mappings.1_21_1.layered+hash.2198-v2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-epoll/4.1.97.Final/88dc2589ab3fdf0199ec0bd1b7c094ae9bab31fb/netty-transport-native-epoll-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-epoll/4.1.97.Final/54188f271e388e7f313aea995e82f58ce2cdb809/netty-transport-native-epoll-4.1.97.Final-linux-x86_64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-epoll/4.1.97.Final/88dc2589ab3fdf0199ec0bd1b7c094ae9bab31fb/netty-transport-native-epoll-4.1.97.Final-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport-native-epoll/4.1.97.Final/5514744c588190ffda076b35a9b8c9f24946a960/netty-transport-native-epoll-4.1.97.Final-linux-aarch_64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transfer-api-v1-37f46004-client/5.4.3+c24bd99419/fabric-transfer-api-v1-37f46004-client-5.4.3+c24bd99419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transfer-api-v1-37f46004-client/5.4.3+c24bd99419/fabric-transfer-api-v1-37f46004-client-5.4.3+c24bd99419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-blockrenderlayer-v1-37f46004-client/1.1.52+0af3f5a719/fabric-blockrenderlayer-v1-37f46004-client-1.1.52+0af3f5a719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-blockrenderlayer-v1-37f46004-client/1.1.52+0af3f5a719/fabric-blockrenderlayer-v1-37f46004-client-1.1.52+0af3f5a719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-client-tags-api-v1-37f46004-client/1.1.15+6573ed8c19/fabric-client-tags-api-v1-37f46004-client-1.1.15+6573ed8c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-client-tags-api-v1-37f46004-client/1.1.15+6573ed8c19/fabric-client-tags-api-v1-37f46004-client-1.1.15+6573ed8c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v2-37f46004-client/2.2.28+6ced4dd919/fabric-command-api-v2-37f46004-client-2.2.28+6ced4dd919-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v2-37f46004-client/2.2.28+6ced4dd919/fabric-command-api-v2-37f46004-client-2.2.28+6ced4dd919.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-generation-api-v1-37f46004-client/20.2.35+37516cd619/fabric-data-generation-api-v1-37f46004-client-20.2.35+37516cd619-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-generation-api-v1-37f46004-client/20.2.35+37516cd619/fabric-data-generation-api-v1-37f46004-client-20.2.35+37516cd619.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-attachment-api-v1-37f46004-client/1.4.6+5b36e0f719/fabric-data-attachment-api-v1-37f46004-client-1.4.6+5b36e0f719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-attachment-api-v1-37f46004-client/1.4.6+5b36e0f719/fabric-data-attachment-api-v1-37f46004-client-1.4.6+5b36e0f719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-entity-events-v1-37f46004-client/1.8.0+2b27e0a419/fabric-entity-events-v1-37f46004-client-1.8.0+2b27e0a419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-entity-events-v1-37f46004-client/1.8.0+2b27e0a419/fabric-entity-events-v1-37f46004-client-1.8.0+2b27e0a419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-events-interaction-v0-37f46004-client/0.7.13+ba9dae0619/fabric-events-interaction-v0-37f46004-client-0.7.13+ba9dae0619-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-events-interaction-v0-37f46004-client/0.7.13+ba9dae0619/fabric-events-interaction-v0-37f46004-client-0.7.13+ba9dae0619.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-api-v1-37f46004-client/11.2.0+3b3cb2e819/fabric-item-api-v1-37f46004-client-11.2.0+3b3cb2e819-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-api-v1-37f46004-client/11.2.0+3b3cb2e819/fabric-item-api-v1-37f46004-client-11.2.0+3b3cb2e819.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-group-api-v1-37f46004-client/4.1.7+def88e3a19/fabric-item-group-api-v1-37f46004-client-4.1.7+def88e3a19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-group-api-v1-37f46004-client/4.1.7+def88e3a19/fabric-item-group-api-v1-37f46004-client-4.1.7+def88e3a19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-lifecycle-events-v1-37f46004-client/2.6.0+0865547519/fabric-lifecycle-events-v1-37f46004-client-2.6.0+0865547519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-lifecycle-events-v1-37f46004-client/2.6.0+0865547519/fabric-lifecycle-events-v1-37f46004-client-2.6.0+0865547519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-message-api-v1-37f46004-client/6.0.14+8aaf3aca19/fabric-message-api-v1-37f46004-client-6.0.14+8aaf3aca19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-message-api-v1-37f46004-client/6.0.14+8aaf3aca19/fabric-message-api-v1-37f46004-client-6.0.14+8aaf3aca19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-model-loading-api-v1-37f46004-client/2.1.0+b4d813fc19/fabric-model-loading-api-v1-37f46004-client-2.1.0+b4d813fc19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-model-loading-api-v1-37f46004-client/2.1.0+b4d813fc19/fabric-model-loading-api-v1-37f46004-client-2.1.0+b4d813fc19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-recipe-api-v1-37f46004-client/5.0.15+2475392c19/fabric-recipe-api-v1-37f46004-client-5.0.15+2475392c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-recipe-api-v1-37f46004-client/5.0.15+2475392c19/fabric-recipe-api-v1-37f46004-client-5.0.15+2475392c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-handler-api-v1-37f46004-client/1.3.90+b559734419/fabric-screen-handler-api-v1-37f46004-client-1.3.90+b559734419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-handler-api-v1-37f46004-client/1.3.90+b559734419/fabric-screen-handler-api-v1-37f46004-client-1.3.90+b559734419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-registry-sync-v0-37f46004-client/5.3.1+e3eddc2119/fabric-registry-sync-v0-37f46004-client-5.3.1+e3eddc2119-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-registry-sync-v0-37f46004-client/5.3.1+e3eddc2119/fabric-registry-sync-v0-37f46004-client-5.3.1+e3eddc2119.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-networking-api-v1-37f46004-client/4.3.0+c7469b2119/fabric-networking-api-v1-37f46004-client-4.3.0+c7469b2119-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-networking-api-v1-37f46004-client/4.3.0+c7469b2119/fabric-networking-api-v1-37f46004-client-4.3.0+c7469b2119.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-object-builder-api-v1-37f46004-client/15.2.1+40875a9319/fabric-object-builder-api-v1-37f46004-client-15.2.1+40875a9319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-object-builder-api-v1-37f46004-client/15.2.1+40875a9319/fabric-object-builder-api-v1-37f46004-client-15.2.1+40875a9319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-particles-v1-37f46004-client/4.0.2+6573ed8c19/fabric-particles-v1-37f46004-client-4.0.2+6573ed8c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-particles-v1-37f46004-client/4.0.2+6573ed8c19/fabric-particles-v1-37f46004-client-4.0.2+6573ed8c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-indigo-37f46004-client/1.7.1+c705a49c19/fabric-renderer-indigo-37f46004-client-1.7.1+c705a49c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-indigo-37f46004-client/1.7.1+c705a49c19/fabric-renderer-indigo-37f46004-client-1.7.1+c705a49c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-api-v1-37f46004-client/3.4.1+b4d813fc19/fabric-renderer-api-v1-37f46004-client-3.4.1+b4d813fc19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-api-v1-37f46004-client/3.4.1+b4d813fc19/fabric-renderer-api-v1-37f46004-client-3.4.1+b4d813fc19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-fluids-v1-37f46004-client/3.1.6+1daea21519/fabric-rendering-fluids-v1-37f46004-client-3.1.6+1daea21519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-fluids-v1-37f46004-client/3.1.6+1daea21519/fabric-rendering-fluids-v1-37f46004-client-3.1.6+1daea21519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-registries-v1-37f46004-client/3.2.69+df3654b319/fabric-renderer-registries-v1-37f46004-client-3.2.69+df3654b319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-renderer-registries-v1-37f46004-client/3.2.69+df3654b319/fabric-renderer-registries-v1-37f46004-client-3.2.69+df3654b319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-v0-37f46004-client/1.1.72+df3654b319/fabric-rendering-v0-37f46004-client-1.1.72+df3654b319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-v0-37f46004-client/1.1.72+df3654b319/fabric-rendering-v0-37f46004-client-1.1.72+df3654b319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-v1-37f46004-client/5.1.0+ab4c25a019/fabric-rendering-v1-37f46004-client-5.1.0+ab4c25a019-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-v1-37f46004-client/5.1.0+ab4c25a019/fabric-rendering-v1-37f46004-client-5.1.0+ab4c25a019.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-api-v1-37f46004-client/2.0.25+8b68f1c719/fabric-screen-api-v1-37f46004-client-2.0.25+8b68f1c719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-api-v1-37f46004-client/2.0.25+8b68f1c719/fabric-screen-api-v1-37f46004-client-2.0.25+8b68f1c719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-data-attachment-v1-37f46004-client/0.3.49+73761d2e19/fabric-rendering-data-attachment-v1-37f46004-client-0.3.49+73761d2e19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-data-attachment-v1-37f46004-client/0.3.49+73761d2e19/fabric-rendering-data-attachment-v1-37f46004-client-0.3.49+73761d2e19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-view-api-v2-37f46004-client/1.0.11+ebb2264e19/fabric-block-view-api-v2-37f46004-client-1.0.11+ebb2264e19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-view-api-v2-37f46004-client/1.0.11+ebb2264e19/fabric-block-view-api-v2-37f46004-client-1.0.11+ebb2264e19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-game-rule-api-v1-37f46004-client/1.0.53+6ced4dd919/fabric-game-rule-api-v1-37f46004-client-1.0.53+6ced4dd919-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-game-rule-api-v1-37f46004-client/1.0.53+6ced4dd919/fabric-game-rule-api-v1-37f46004-client-1.0.53+6ced4dd919.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-keybindings-v0-37f46004-client/0.2.45+df3654b319/fabric-keybindings-v0-37f46004-client-0.2.45+df3654b319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-keybindings-v0-37f46004-client/0.2.45+df3654b319/fabric-keybindings-v0-37f46004-client-0.2.45+df3654b319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-key-binding-api-v1-37f46004-client/1.0.47+0af3f5a719/fabric-key-binding-api-v1-37f46004-client-1.0.47+0af3f5a719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-key-binding-api-v1-37f46004-client/1.0.47+0af3f5a719/fabric-key-binding-api-v1-37f46004-client-1.0.47+0af3f5a719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-loader-v0-37f46004-client/1.3.1+5b5275af19/fabric-resource-loader-v0-37f46004-client-1.3.1+5b5275af19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-loader-v0-37f46004-client/1.3.1+5b5275af19/fabric-resource-loader-v0-37f46004-client-1.3.1+5b5275af19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-sound-api-v1-37f46004-client/1.0.23+6573ed8c19/fabric-sound-api-v1-37f46004-client-1.0.23+6573ed8c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-sound-api-v1-37f46004-client/1.0.23+6573ed8c19/fabric-sound-api-v1-37f46004-client-1.0.23+6573ed8c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.18.4/c346b05fad0e97adcf357f519cf8e61b153e5ee2/fabric-loader-0.18.4-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.18.4/dc4682125d5db647d6ce80a98b98945835adcd4b/fabric-loader-0.18.4.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-37f46004-common/0.116.8+1.21.1/fabric-api-37f46004-common-0.116.8+1.21.1-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-37f46004-common/0.116.8+1.21.1/fabric-api-37f46004-common-0.116.8+1.21.1.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transfer-api-v1-37f46004-common/5.4.3+c24bd99419/fabric-transfer-api-v1-37f46004-common-5.4.3+c24bd99419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transfer-api-v1-37f46004-common/5.4.3+c24bd99419/fabric-transfer-api-v1-37f46004-common-5.4.3+c24bd99419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-lookup-api-v1-37f46004-common/1.6.71+b559734419/fabric-api-lookup-api-v1-37f46004-common-1.6.71+b559734419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-lookup-api-v1-37f46004-common/1.6.71+b559734419/fabric-api-lookup-api-v1-37f46004-common-1.6.71+b559734419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v1-37f46004-common/1.2.49+f71b366f19/fabric-command-api-v1-37f46004-common-1.2.49+f71b366f19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v1-37f46004-common/1.2.49+f71b366f19/fabric-command-api-v1-37f46004-common-1.2.49+f71b366f19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-commands-v0-37f46004-common/0.2.66+df3654b319/fabric-commands-v0-37f46004-common-0.2.66+df3654b319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-commands-v0-37f46004-common/0.2.66+df3654b319/fabric-commands-v0-37f46004-common-0.2.66+df3654b319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v2-37f46004-common/2.2.28+6ced4dd919/fabric-command-api-v2-37f46004-common-2.2.28+6ced4dd919-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-command-api-v2-37f46004-common/2.2.28+6ced4dd919/fabric-command-api-v2-37f46004-common-2.2.28+6ced4dd919.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-content-registries-v0-37f46004-common/8.0.19+b559734419/fabric-content-registries-v0-37f46004-common-8.0.19+b559734419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-content-registries-v0-37f46004-common/8.0.19+b559734419/fabric-content-registries-v0-37f46004-common-8.0.19+b559734419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-generation-api-v1-37f46004-common/20.2.35+37516cd619/fabric-data-generation-api-v1-37f46004-common-20.2.35+37516cd619-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-generation-api-v1-37f46004-common/20.2.35+37516cd619/fabric-data-generation-api-v1-37f46004-common-20.2.35+37516cd619.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-convention-tags-v1-37f46004-common/2.1.6+7f945d5b19/fabric-convention-tags-v1-37f46004-common-2.1.6+7f945d5b19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-convention-tags-v1-37f46004-common/2.1.6+7f945d5b19/fabric-convention-tags-v1-37f46004-common-2.1.6+7f945d5b19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-convention-tags-v2-37f46004-common/2.11.2+fa89716719/fabric-convention-tags-v2-37f46004-common-2.11.2+fa89716719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-convention-tags-v2-37f46004-common/2.11.2+fa89716719/fabric-convention-tags-v2-37f46004-common-2.11.2+fa89716719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-attachment-api-v1-37f46004-common/1.4.6+5b36e0f719/fabric-data-attachment-api-v1-37f46004-common-1.4.6+5b36e0f719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-data-attachment-api-v1-37f46004-common/1.4.6+5b36e0f719/fabric-data-attachment-api-v1-37f46004-common-1.4.6+5b36e0f719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-entity-events-v1-37f46004-common/1.8.0+2b27e0a419/fabric-entity-events-v1-37f46004-common-1.8.0+2b27e0a419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-entity-events-v1-37f46004-common/1.8.0+2b27e0a419/fabric-entity-events-v1-37f46004-common-1.8.0+2b27e0a419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-events-interaction-v0-37f46004-common/0.7.13+ba9dae0619/fabric-events-interaction-v0-37f46004-common-0.7.13+ba9dae0619-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-events-interaction-v0-37f46004-common/0.7.13+ba9dae0619/fabric-events-interaction-v0-37f46004-common-0.7.13+ba9dae0619.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-gametest-api-v1-37f46004-common/2.0.5+6fc22b9919/fabric-gametest-api-v1-37f46004-common-2.0.5+6fc22b9919-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-gametest-api-v1-37f46004-common/2.0.5+6fc22b9919/fabric-gametest-api-v1-37f46004-common-2.0.5+6fc22b9919.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-api-v1-37f46004-common/11.2.0+3b3cb2e819/fabric-item-api-v1-37f46004-common-11.2.0+3b3cb2e819-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-api-v1-37f46004-common/11.2.0+3b3cb2e819/fabric-item-api-v1-37f46004-common-11.2.0+3b3cb2e819.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-group-api-v1-37f46004-common/4.1.7+def88e3a19/fabric-item-group-api-v1-37f46004-common-4.1.7+def88e3a19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-item-group-api-v1-37f46004-common/4.1.7+def88e3a19/fabric-item-group-api-v1-37f46004-common-4.1.7+def88e3a19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-lifecycle-events-v1-37f46004-common/2.6.0+0865547519/fabric-lifecycle-events-v1-37f46004-common-2.6.0+0865547519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-lifecycle-events-v1-37f46004-common/2.6.0+0865547519/fabric-lifecycle-events-v1-37f46004-common-2.6.0+0865547519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-loot-api-v2-37f46004-common/3.0.15+3f89f5a519/fabric-loot-api-v2-37f46004-common-3.0.15+3f89f5a519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-loot-api-v2-37f46004-common/3.0.15+3f89f5a519/fabric-loot-api-v2-37f46004-common-3.0.15+3f89f5a519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-loot-api-v3-37f46004-common/1.0.3+3f89f5a519/fabric-loot-api-v3-37f46004-common-1.0.3+3f89f5a519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-loot-api-v3-37f46004-common/1.0.3+3f89f5a519/fabric-loot-api-v3-37f46004-common-1.0.3+3f89f5a519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-message-api-v1-37f46004-common/6.0.14+8aaf3aca19/fabric-message-api-v1-37f46004-common-6.0.14+8aaf3aca19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-message-api-v1-37f46004-common/6.0.14+8aaf3aca19/fabric-message-api-v1-37f46004-common-6.0.14+8aaf3aca19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-recipe-api-v1-37f46004-common/5.0.15+2475392c19/fabric-recipe-api-v1-37f46004-common-5.0.15+2475392c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-recipe-api-v1-37f46004-common/5.0.15+2475392c19/fabric-recipe-api-v1-37f46004-common-5.0.15+2475392c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-handler-api-v1-37f46004-common/1.3.90+b559734419/fabric-screen-handler-api-v1-37f46004-common-1.3.90+b559734419-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-screen-handler-api-v1-37f46004-common/1.3.90+b559734419/fabric-screen-handler-api-v1-37f46004-common-1.3.90+b559734419.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-registry-sync-v0-37f46004-common/5.3.1+e3eddc2119/fabric-registry-sync-v0-37f46004-common-5.3.1+e3eddc2119-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-registry-sync-v0-37f46004-common/5.3.1+e3eddc2119/fabric-registry-sync-v0-37f46004-common-5.3.1+e3eddc2119.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-networking-api-v1-37f46004-common/4.3.0+c7469b2119/fabric-networking-api-v1-37f46004-common-4.3.0+c7469b2119-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-networking-api-v1-37f46004-common/4.3.0+c7469b2119/fabric-networking-api-v1-37f46004-common-4.3.0+c7469b2119.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-object-builder-api-v1-37f46004-common/15.2.1+40875a9319/fabric-object-builder-api-v1-37f46004-common-15.2.1+40875a9319-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-object-builder-api-v1-37f46004-common/15.2.1+40875a9319/fabric-object-builder-api-v1-37f46004-common-15.2.1+40875a9319.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-particles-v1-37f46004-common/4.0.2+6573ed8c19/fabric-particles-v1-37f46004-common-4.0.2+6573ed8c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-particles-v1-37f46004-common/4.0.2+6573ed8c19/fabric-particles-v1-37f46004-common-4.0.2+6573ed8c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-fluids-v1-37f46004-common/3.1.6+1daea21519/fabric-rendering-fluids-v1-37f46004-common-3.1.6+1daea21519-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-fluids-v1-37f46004-common/3.1.6+1daea21519/fabric-rendering-fluids-v1-37f46004-common-3.1.6+1daea21519.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-base-37f46004-common/0.4.42+6573ed8c19/fabric-api-base-37f46004-common-0.4.42+6573ed8c19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-api-base-37f46004-common/0.4.42+6573ed8c19/fabric-api-base-37f46004-common-0.4.42+6573ed8c19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-biome-api-v1-37f46004-common/13.0.31+d527f9fd19/fabric-biome-api-v1-37f46004-common-13.0.31+d527f9fd19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-biome-api-v1-37f46004-common/13.0.31+d527f9fd19/fabric-biome-api-v1-37f46004-common-13.0.31+d527f9fd19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-api-v1-37f46004-common/1.1.0+0bc3503219/fabric-block-api-v1-37f46004-common-1.1.0+0bc3503219-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-api-v1-37f46004-common/1.1.0+0bc3503219/fabric-block-api-v1-37f46004-common-1.1.0+0bc3503219.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-data-attachment-v1-37f46004-common/0.3.49+73761d2e19/fabric-rendering-data-attachment-v1-37f46004-common-0.3.49+73761d2e19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-rendering-data-attachment-v1-37f46004-common/0.3.49+73761d2e19/fabric-rendering-data-attachment-v1-37f46004-common-0.3.49+73761d2e19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-view-api-v2-37f46004-common/1.0.11+ebb2264e19/fabric-block-view-api-v2-37f46004-common-1.0.11+ebb2264e19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-block-view-api-v2-37f46004-common/1.0.11+ebb2264e19/fabric-block-view-api-v2-37f46004-common-1.0.11+ebb2264e19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-crash-report-info-v1-37f46004-common/0.2.29+0af3f5a719/fabric-crash-report-info-v1-37f46004-common-0.2.29+0af3f5a719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-crash-report-info-v1-37f46004-common/0.2.29+0af3f5a719/fabric-crash-report-info-v1-37f46004-common-0.2.29+0af3f5a719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-dimensions-v1-37f46004-common/4.0.1+65213ef819/fabric-dimensions-v1-37f46004-common-4.0.1+65213ef819-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-dimensions-v1-37f46004-common/4.0.1+65213ef819/fabric-dimensions-v1-37f46004-common-4.0.1+65213ef819.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-game-rule-api-v1-37f46004-common/1.0.53+6ced4dd919/fabric-game-rule-api-v1-37f46004-common-1.0.53+6ced4dd919-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-game-rule-api-v1-37f46004-common/1.0.53+6ced4dd919/fabric-game-rule-api-v1-37f46004-common-1.0.53+6ced4dd919.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-conditions-api-v1-37f46004-common/4.3.0+8dc279b119/fabric-resource-conditions-api-v1-37f46004-common-4.3.0+8dc279b119-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-conditions-api-v1-37f46004-common/4.3.0+8dc279b119/fabric-resource-conditions-api-v1-37f46004-common-4.3.0+8dc279b119.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-loader-v0-37f46004-common/1.3.1+5b5275af19/fabric-resource-loader-v0-37f46004-common-1.3.1+5b5275af19-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-resource-loader-v0-37f46004-common/1.3.1+5b5275af19/fabric-resource-loader-v0-37f46004-common-1.3.1+5b5275af19.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transitive-access-wideners-v1-37f46004-common/6.2.0+45b9699719/fabric-transitive-access-wideners-v1-37f46004-common-6.2.0+45b9699719-sources.jar" kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/.gradle/loom-cache/remapped_mods/remapped/net/fabricmc/fabric-api/fabric-transitive-access-wideners-v1-37f46004-common/6.2.0+45b9699719/fabric-transitive-access-wideners-v1-37f46004-common-6.2.0+45b9699719.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/dev-launch-injector/0.2.1+build.8/da8bef7e6e2f952da707f282bdb46882a0fce5e3/dev-launch-injector-0.2.1+build.8.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-log4j-util/1.0.2/201d8a3ecff0b60ef3aba97140dde83c22801a36/fabric-log4j-util-1.0.2-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-log4j-util/1.0.2/ef0b3fb613356feb75a67d54f2fad6f03a006648/fabric-log4j-util-1.0.2.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/d9fba96328a80677edbab28a843f33b847cf1e57/lwjgl-freetype-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/81091b006dbb43fab04c8c638e9ac87c51b4096d/lwjgl-freetype-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/d9fba96328a80677edbab28a843f33b847cf1e57/lwjgl-freetype-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/82028265a0a2ff33523ca75137ada7dc176e5210/lwjgl-freetype-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/d9fba96328a80677edbab28a843f33b847cf1e57/lwjgl-freetype-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-freetype/3.3.3/15a8c1de7f51d07a92eae7ce1222557073a0c0c3/lwjgl-freetype-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/fa2c760452674d3eaf336123539b0dd9a83041a4/lwjgl-glfw-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/e449e28b4891fc423c54c85fbc5bb0b9efece67a/lwjgl-glfw-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/fa2c760452674d3eaf336123539b0dd9a83041a4/lwjgl-glfw-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/f27018dc74f6289574502b46cce55d52817554e2/lwjgl-glfw-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/fa2c760452674d3eaf336123539b0dd9a83041a4/lwjgl-glfw-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-glfw/3.3.3/32334f3fd5270a59bad9939a93115acb6de36dcf/lwjgl-glfw-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/6a4ea7a9095e1684a9c6adb2c49d28daae2b6e45/lwjgl-jemalloc-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/426222fc027602a5f21b9c0fe79cde6a4c7a011f/lwjgl-jemalloc-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/6a4ea7a9095e1684a9c6adb2c49d28daae2b6e45/lwjgl-jemalloc-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/ba1f3fed0ee4be0217eaa41c5bbfb4b9b1383c33/lwjgl-jemalloc-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/6a4ea7a9095e1684a9c6adb2c49d28daae2b6e45/lwjgl-jemalloc-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-jemalloc/3.3.3/f6063b6e0f23be483c5c88d84ce51b39dc69126c/lwjgl-jemalloc-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/60a4ce24d71b3376ce53b50cfe3eaaf3277dd727/lwjgl-openal-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/cf83862ae95d98496b26915024c7e666d8ab1c8f/lwjgl-openal-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/60a4ce24d71b3376ce53b50cfe3eaaf3277dd727/lwjgl-openal-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/8e0615235116b9e4160dfe87bec90f5f6378bf72/lwjgl-openal-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/60a4ce24d71b3376ce53b50cfe3eaaf3277dd727/lwjgl-openal-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-openal/3.3.3/87b8d5050e3adb46bb58fe1cb2669a4a48fce10d/lwjgl-openal-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/3353d0b2cac91b84088b01711d33cc403893450b/lwjgl-opengl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/e6c1eec8be8a71951b830a4d69efc01c6531900c/lwjgl-opengl-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/3353d0b2cac91b84088b01711d33cc403893450b/lwjgl-opengl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/65e956d3735a1abdc82eff4baec1b61174697d4b/lwjgl-opengl-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/3353d0b2cac91b84088b01711d33cc403893450b/lwjgl-opengl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-opengl/3.3.3/d32d833dcaa2f355a886eaf21f0408b5f03241d/lwjgl-opengl-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/37c2b604ec4a5ee356dd734dc8167a193e8874ed/lwjgl-stb-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/1d9facdf6541de114b0f963be33505b7679c78cb/lwjgl-stb-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/37c2b604ec4a5ee356dd734dc8167a193e8874ed/lwjgl-stb-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/a584ab44de569708871f0a79561f4d8c37487f2c/lwjgl-stb-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/37c2b604ec4a5ee356dd734dc8167a193e8874ed/lwjgl-stb-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-stb/3.3.3/b5c874687b9aac1a936501d4ed2c49567fd1b575/lwjgl-stb-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/dcda55223f2f940654d222bf4371baa969c60bb9/lwjgl-tinyfd-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/a6697981b0449a5087c1d546fc08b4f73e8f98c9/lwjgl-tinyfd-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/dcda55223f2f940654d222bf4371baa969c60bb9/lwjgl-tinyfd-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/a88c494f3006eb91a7433b12a3a55a9a6c20788b/lwjgl-tinyfd-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/dcda55223f2f940654d222bf4371baa969c60bb9/lwjgl-tinyfd-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl-tinyfd/3.3.3/c336c84ee88cccb495c6ffa112395509e7378e8a/lwjgl-tinyfd-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/e5949c7bbf4f839afe6d1a631e9b75f63c559e0/lwjgl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/a5ed18a2b82fc91b81f40d717cb1f64c9dcb0540/lwjgl-3.3.3-natives-windows.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/e5949c7bbf4f839afe6d1a631e9b75f63c559e0/lwjgl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/e9aca8c5479b520a2a7f0d542a118140e812c5e8/lwjgl-3.3.3-natives-windows-arm64.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry sourcepath="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/e5949c7bbf4f839afe6d1a631e9b75f63c559e0/lwjgl-3.3.3-sources.jar" kind="lib" path="C:/Users/hyper/.gradle/caches/modules-2/files-2.1/org.lwjgl/lwjgl/3.3.3/9e670718e050aeaeea0c2d5b907cffb142f2e58f/lwjgl-3.3.3-natives-windows-x86.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="C:/Users/hyper/.gradle/caches/fabric-loom/1.21.1/loom.mappings.1_21_1.layered+hash.2198-v2/mappings.jar">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,main,test"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/build/classes/java/client">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="lib" path="C:/Users/hyper/Desktop/program/MCmod-words/build/resources/client">
		<attributes>
			<attribute name="gradle_used_by_scope" value="client,test"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
</classpath>

```

---

## File: .gitattributes

```text
#
# https://help.github.com/articles/dealing-with-line-endings/
#
# Linux start script should use lf
/gradlew        text eol=lf

# These are Windows script files and should use crlf
*.bat           text eol=crlf


```

---

## File: .github\workflows\build.yml

```yml
# Automatically build the project and run any configured tests for every push
# and submitted pull request. This can help catch issues that only occur on
# certain platforms or Java versions, and provides a first line of defence
# against bad commits.

name: build
on: [pull_request, push]

jobs:
  build:
    runs-on: ubuntu-24.04
    steps:
      - name: checkout repository
        uses: actions/checkout@v4
      - name: validate gradle wrapper
        uses: gradle/actions/wrapper-validation@v4
      - name: setup jdk
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'microsoft'
      - name: make gradle wrapper executable
        run: chmod +x ./gradlew
      - name: build
        run: ./gradlew build
      - name: capture build artifacts
        uses: actions/upload-artifact@v4
        with:
          name: Artifacts
          path: build/libs/

```

---

## File: .gitignore

```text
# gradle

.gradle/
build/
out/
classes/

# eclipse

*.launch

# idea

.idea/
*.iml
*.ipr
*.iws

# vscode

.settings/
.vscode/
bin/
.classpath
.project

# macos

*.DS_Store

# fabric

run/

# java

hs_err_*.log
replay_*.log
*.hprof
*.jfr

```

---

## File: .project

```text
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>MCmod-words</name>
	<comment></comment>
	<projects/>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
	</natures>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments/>
		</buildCommand>
	</buildSpec>
	<linkedResources/>
	<filteredResources/>
</projectDescription>

```

---

## File: .settings\org.eclipse.jdt.core.prefs

```prefs
#
#Fri Feb 20 17:10:06 CST 2026
eclipse.preferences.version=1
org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
org.eclipse.jdt.core.compiler.codegen.targetPlatform=21
org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
org.eclipse.jdt.core.compiler.compliance=21
org.eclipse.jdt.core.compiler.debug.lineNumber=generate
org.eclipse.jdt.core.compiler.debug.localVariable=generate
org.eclipse.jdt.core.compiler.debug.sourceFile=generate
org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
org.eclipse.jdt.core.compiler.source=21

```

---

## File: LICENSE

```text
Creative Commons Legal Code

CC0 1.0 Universal

    CREATIVE COMMONS CORPORATION IS NOT A LAW FIRM AND DOES NOT PROVIDE
    LEGAL SERVICES. DISTRIBUTION OF THIS DOCUMENT DOES NOT CREATE AN
    ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS
    INFORMATION ON AN "AS-IS" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES
    REGARDING THE USE OF THIS DOCUMENT OR THE INFORMATION OR WORKS
    PROVIDED HEREUNDER, AND DISCLAIMS LIABILITY FOR DAMAGES RESULTING FROM
    THE USE OF THIS DOCUMENT OR THE INFORMATION OR WORKS PROVIDED
    HEREUNDER.

Statement of Purpose

The laws of most jurisdictions throughout the world automatically confer
exclusive Copyright and Related Rights (defined below) upon the creator
and subsequent owner(s) (each and all, an "owner") of an original work of
authorship and/or a database (each, a "Work").

Certain owners wish to permanently relinquish those rights to a Work for
the purpose of contributing to a commons of creative, cultural and
scientific works ("Commons") that the public can reliably and without fear
of later claims of infringement build upon, modify, incorporate in other
works, reuse and redistribute as freely as possible in any form whatsoever
and for any purposes, including without limitation commercial purposes.
These owners may contribute to the Commons to promote the ideal of a free
culture and the further production of creative, cultural and scientific
works, or to gain reputation or greater distribution for their Work in
part through the use and efforts of others.

For these and/or other purposes and motivations, and without any
expectation of additional consideration or compensation, the person
associating CC0 with a Work (the "Affirmer"), to the extent that he or she
is an owner of Copyright and Related Rights in the Work, voluntarily
elects to apply CC0 to the Work and publicly distribute the Work under its
terms, with knowledge of his or her Copyright and Related Rights in the
Work and the meaning and intended legal effect of CC0 on those rights.

1. Copyright and Related Rights. A Work made available under CC0 may be
protected by copyright and related or neighboring rights ("Copyright and
Related Rights"). Copyright and Related Rights include, but are not
limited to, the following:

  i. the right to reproduce, adapt, distribute, perform, display,
     communicate, and translate a Work;
 ii. moral rights retained by the original author(s) and/or performer(s);
iii. publicity and privacy rights pertaining to a person's image or
     likeness depicted in a Work;
 iv. rights protecting against unfair competition in regards to a Work,
     subject to the limitations in paragraph 4(a), below;
  v. rights protecting the extraction, dissemination, use and reuse of data
     in a Work;
 vi. database rights (such as those arising under Directive 96/9/EC of the
     European Parliament and of the Council of 11 March 1996 on the legal
     protection of databases, and under any national implementation
     thereof, including any amended or successor version of such
     directive); and
vii. other similar, equivalent or corresponding rights throughout the
     world based on applicable law or treaty, and any national
     implementations thereof.

2. Waiver. To the greatest extent permitted by, but not in contravention
of, applicable law, Affirmer hereby overtly, fully, permanently,
irrevocably and unconditionally waives, abandons, and surrenders all of
Affirmer's Copyright and Related Rights and associated claims and causes
of action, whether now known or unknown (including existing as well as
future claims and causes of action), in the Work (i) in all territories
worldwide, (ii) for the maximum duration provided by applicable law or
treaty (including future time extensions), (iii) in any current or future
medium and for any number of copies, and (iv) for any purpose whatsoever,
including without limitation commercial, advertising or promotional
purposes (the "Waiver"). Affirmer makes the Waiver for the benefit of each
member of the public at large and to the detriment of Affirmer's heirs and
successors, fully intending that such Waiver shall not be subject to
revocation, rescission, cancellation, termination, or any other legal or
equitable action to disrupt the quiet enjoyment of the Work by the public
as contemplated by Affirmer's express Statement of Purpose.

3. Public License Fallback. Should any part of the Waiver for any reason
be judged legally invalid or ineffective under applicable law, then the
Waiver shall be preserved to the maximum extent permitted taking into
account Affirmer's express Statement of Purpose. In addition, to the
extent the Waiver is so judged Affirmer hereby grants to each affected
person a royalty-free, non transferable, non sublicensable, non exclusive,
irrevocable and unconditional license to exercise Affirmer's Copyright and
Related Rights in the Work (i) in all territories worldwide, (ii) for the
maximum duration provided by applicable law or treaty (including future
time extensions), (iii) in any current or future medium and for any number
of copies, and (iv) for any purpose whatsoever, including without
limitation commercial, advertising or promotional purposes (the
"License"). The License shall be deemed effective as of the date CC0 was
applied by Affirmer to the Work. Should any part of the License for any
reason be judged legally invalid or ineffective under applicable law, such
partial invalidity or ineffectiveness shall not invalidate the remainder
of the License, and in such case Affirmer hereby affirms that he or she
will not (i) exercise any of his or her remaining Copyright and Related
Rights in the Work or (ii) assert any associated claims and causes of
action with respect to the Work, in either case contrary to Affirmer's
express Statement of Purpose.

4. Limitations and Disclaimers.

 a. No trademark or patent rights held by Affirmer are waived, abandoned,
    surrendered, licensed or otherwise affected by this document.
 b. Affirmer offers the Work as-is and makes no representations or
    warranties of any kind concerning the Work, express, implied,
    statutory or otherwise, including without limitation warranties of
    title, merchantability, fitness for a particular purpose, non
    infringement, or the absence of latent or other defects, accuracy, or
    the present or absence of errors, whether or not discoverable, all to
    the greatest extent permissible under applicable law.
 c. Affirmer disclaims responsibility for clearing rights of other persons
    that may apply to the Work or any use thereof, including without
    limitation any person's Copyright and Related Rights in the Work.
    Further, Affirmer disclaims responsibility for obtaining any necessary
    consents, permissions or other rights required for any use of the
    Work.
 d. Affirmer understands and acknowledges that Creative Commons is not a
    party to this document and has no duty or obligation with respect to
    this CC0 or use of the Work.
```

---

## File: MCmod-words_client.launch

```launch
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.eclipse.jdt.launching.localJavaApplication">
    <listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
        <listEntry value="/MCmod-words"/>
    </listAttribute>
    <listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
        <listEntry value="4"/>
    </listAttribute>
    <mapAttribute key="org.eclipse.debug.core.environmentVariables">
        
    </mapAttribute>
    <booleanAttribute key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true"/>
    <stringAttribute key="org.eclipse.jdt.launching.CLASSPATH_PROVIDER" value="org.eclipse.buildship.core.classpathprovider"/>
    <stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="net.fabricmc.devlaunchinjector.Main"/>
    <stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value=""/>
    <stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="MCmod-words"/>
    <stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Dfabric.dli.config=C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\launch.cfg -Dfabric.dli.env=client -Dfabric.dli.main=net.fabricmc.loader.impl.launch.knot.KnotClient"/>
    <stringAttribute key="org.eclipse.jdt.launching.WORKING_DIRECTORY" value="${workspace_loc:MCmod-words}/run"/>
    <booleanAttribute key="org.eclipse.jdt.launching.ATTR_ATTR_USE_ARGFILE" value="true"/>
</launchConfiguration>

```

---

## File: MCmod-words_server.launch

```launch
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.eclipse.jdt.launching.localJavaApplication">
    <listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
        <listEntry value="/MCmod-words"/>
    </listAttribute>
    <listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
        <listEntry value="4"/>
    </listAttribute>
    <mapAttribute key="org.eclipse.debug.core.environmentVariables">
        
    </mapAttribute>
    <booleanAttribute key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true"/>
    <stringAttribute key="org.eclipse.jdt.launching.CLASSPATH_PROVIDER" value="org.eclipse.buildship.core.classpathprovider"/>
    <stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="net.fabricmc.devlaunchinjector.Main"/>
    <stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="nogui"/>
    <stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="MCmod-words"/>
    <stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Dfabric.dli.config=C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\launch.cfg -Dfabric.dli.env=server -Dfabric.dli.main=net.fabricmc.loader.impl.launch.knot.KnotServer"/>
    <stringAttribute key="org.eclipse.jdt.launching.WORKING_DIRECTORY" value="${workspace_loc:MCmod-words}/run"/>
    <booleanAttribute key="org.eclipse.jdt.launching.ATTR_ATTR_USE_ARGFILE" value="true"/>
</launchConfiguration>

```

---

## File: README.md

```md
# MCmod-words
```

---

## File: build.gradle

```gradle
plugins {
    id 'fabric-loom' version '1.12.1'
    id 'maven-publish'
}

version = "1.0.0"
group = "com.hyper"

// 正确配置 archivesBaseName
base {
    archivesName = "words"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    withSourcesJar()
}

loom {
    // 没有accessWidener文件就保持注释
    // accessWidenerPath = file("src/main/resources/words.accesswidener")
}

repositories {
    mavenCentral()
}

dependencies {
    // 1.21.1核心依赖（版本完全匹配）
    minecraft "com.mojang:minecraft:1.21.1"
    mappings "net.fabricmc:yarn:1.21.1+build.1:v2"
    modImplementation "net.fabricmc:fabric-loader:0.16.5"

    // 1.21.1 Fabric API
    modImplementation "net.fabricmc.fabric-api:fabric-api:0.102.1+1.21.1"

    // 移除手动的Mixin依赖！Loom会自动提供适配版本
    // implementation "org.spongepowered:mixin:0.8.8"
    // annotationProcessor "org.spongepowered:mixin:0.8.8:processor"
}

processResources {
    inputs.property "version", project.version
    filesMatching("fabric.mod.json") {
        expand "version": project.version
    }
}

tasks.withType(JavaCompile) {
    options.encoding = "UTF-8"
    options.release = 21
}

jar {
    from("LICENSE") {
        rename { "${it}_${project.base.archivesName.get()}" }
    }
}

// 注释发布配置
/*
publishing {
    publications {
        mavenJava(MavenPublication) {
            artifactId = project.base.archivesName.get()
            from components.java
        }
    }
    repositories {
        maven {
            url = file("${project.projectDir}/mcmodsrepo").toURI()
        }
    }
}
*/
```

---

## File: git-push.sh

```sh
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
```

---

## File: gradle.properties

```properties
# 模组属性
mod_version = 1.0.0
maven_group = com.hyper
archives_base_name = words

# Minecraft 1.21.1 版本配置（核心：和build.gradle一致）
minecraft_version = 1.21.1
yarn_mappings = 1.21.1+build.1
loader_version = 0.16.5
fabric_version = 0.102.1+1.21.1

# 启动优化（解决卡住问题）
fabric.loom.downloadAssets=false
org.gradle.jvmargs=-Xmx4G -XX:+UseG1GC -Dfile.encoding=UTF-8
fabric.loom.memory.max=4G
# 确认Java 21路径正确（检查C:\.Environment\JDK21是否存在）
org.gradle.java.home=C:/.Environment/JDK21
```

---

## File: gradlew

```text
#!/bin/sh

#
# Copyright © 2015 the original authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
#

##############################################################################
#
#   Gradle start up script for POSIX generated by Gradle.
#
#   Important for running:
#
#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
#       noncompliant, but you have some other compliant shell such as ksh or
#       bash, then to run this script, type that shell name before the whole
#       command line, like:
#
#           ksh Gradle
#
#       Busybox and similar reduced shells will NOT work, because this script
#       requires all of these POSIX shell features:
#         * functions;
#         * expansions «$var», «${var}», «${var:-default}», «${var+SET}»,
#           «${var#prefix}», «${var%suffix}», and «$( cmd )»;
#         * compound commands having a testable exit status, especially «case»;
#         * various built-in commands including «command», «set», and «ulimit».
#
#   Important for patching:
#
#   (2) This script targets any POSIX shell, so it avoids extensions provided
#       by Bash, Ksh, etc; in particular arrays are avoided.
#
#       The "traditional" practice of packing multiple parameters into a
#       space-separated string is a well documented source of bugs and security
#       problems, so this is (mostly) avoided, by progressively accumulating
#       options in "$@", and eventually passing that to Java.
#
#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
#       see the in-line comments for details.
#
#       There are tweaks for specific operating systems such as AIX, CygWin,
#       Darwin, MinGW, and NonStop.
#
#   (3) This script is generated from the Groovy template
#       https://github.com/gradle/gradle/blob/HEAD/platforms/jvm/plugins-application/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
#       within the Gradle project.
#
#       You can find Gradle at https://github.com/gradle/gradle/.
#
##############################################################################

# Attempt to set APP_HOME

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
    [ -h "$app_path" ]
do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in             #(
      /*)   app_path=$link ;; #(
      *)    app_path=$APP_HOME$link ;;
    esac
done

# This is normally unused
# shellcheck disable=SC2034
APP_BASE_NAME=${0##*/}
# Discard cd standard output in case $CDPATH is set (https://github.com/gradle/gradle/issues/25036)
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s\n' "$PWD" ) || exit

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "$( uname )" in                #(
  CYGWIN* )         cygwin=true  ;; #(
  Darwin* )         darwin=true  ;; #(
  MSYS* | MINGW* )  msys=true    ;; #(
  NONSTOP* )        nonstop=true ;;
esac



# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD=$JAVA_HOME/jre/sh/java
    else
        JAVACMD=$JAVA_HOME/bin/java
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    if ! command -v java >/dev/null 2>&1
    then
        die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
fi

# Increase the maximum file descriptors if we can.
if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
    case $MAX_FD in #(
      max*)
        # In POSIX sh, ulimit -H is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        MAX_FD=$( ulimit -H -n ) ||
            warn "Could not query maximum file descriptor limit"
    esac
    case $MAX_FD in  #(
      '' | soft) :;; #(
      *)
        # In POSIX sh, ulimit -n is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        ulimit -n "$MAX_FD" ||
            warn "Could not set maximum file descriptor limit to $MAX_FD"
    esac
fi

# Collect all arguments for the java command, stacking in reverse order:
#   * args from the command line
#   * the main class name
#   * -classpath
#   * -D...appname settings
#   * --module-path (only if needed)
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.

# For Cygwin or MSYS, switch paths to Windows format before running java
if "$cygwin" || "$msys" ; then
    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )

    JAVACMD=$( cygpath --unix "$JAVACMD" )

    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    for arg do
        if
            case $arg in                                #(
              -*)   false ;;                            # don't mess with options #(
              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
                    [ -e "$t" ] ;;                      #(
              *)    false ;;
            esac
        then
            arg=$( cygpath --path --ignore --mixed "$arg" )
        fi
        # Roll the args list around exactly as many times as the number of
        # args, so each arg winds up back in the position where it started, but
        # possibly modified.
        #
        # NB: a `for` loop captures its iteration list before it begins, so
        # changing the positional parameters here affects neither the number of
        # iterations, nor the values presented in `arg`.
        shift                   # remove old arg
        set -- "$@" "$arg"      # push replacement arg
    done
fi


# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Collect all arguments for the java command:
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and optsEnvironmentVar are not allowed to contain shell fragments,
#     and any embedded shellness will be escaped.
#   * For example: A user cannot expect ${Hostname} to be expanded, as it is an environment variable and will be
#     treated as '${Hostname}' itself on the command line.

set -- \
        "-Dorg.gradle.appname=$APP_BASE_NAME" \
        -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" \
        "$@"

# Stop when "xargs" is not available.
if ! command -v xargs >/dev/null 2>&1
then
    die "xargs is not available"
fi

# Use "xargs" to parse quoted args.
#
# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
#
# In Bash we could simply go:
#
#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
#   set -- "${ARGS[@]}" "$@"
#
# but POSIX shell has neither arrays nor command substitution, so instead we
# post-process each arg (as a line of input to sed) to backslash-escape any
# character that might be a shell metacharacter, then use eval to reverse
# that process (while maintaining the separation between arguments), and wrap
# the whole thing up as a single "set" statement.
#
# This will of course break if any of these variables contains a newline or
# an unmatched quote.
#

eval "set -- $(
        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
        xargs -n1 |
        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
        tr '\n' ' '
    )" '"$@"'

exec "$JAVACMD" "$@"

```

---

## File: gradlew.bat

```bat
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line



@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega

```

---

## File: run\command_history.txt

```txt
/words

```

---

## File: run\config\fabric\indigo-renderer.properties

```properties
#Indigo properties file
#Fri Feb 20 19:09:43 CST 2026
always-tesselate-blocks=auto
ambient-occlusion-mode=hybrid
debug-compare-lighting=auto
fix-exterior-vertex-lighting=auto
fix-luminous-block-ambient-occlusion=auto
fix-mean-light-calculation=auto
fix-smooth-lighting-offset=auto

```

---

## File: run\crash-reports\crash-2026-02-20_19.05.49-client.txt

```txt
---- Minecraft Crash Report ----
// I bet Cylons wouldn't have this problem.

Time: 2026-02-20 19:05:49
Description: Initializing game

java.lang.RuntimeException: Could not execute entrypoint stage 'client' due to errors, provided by 'words' at 'com.hyper.WordsClient'!
	at net.fabricmc.loader.impl.FabricLoaderImpl.lambda$invokeEntrypoints$2(FabricLoaderImpl.java:403)
	at net.fabricmc.loader.impl.util.ExceptionUtil.gatherExceptions(ExceptionUtil.java:33)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:401)
	at net.fabricmc.loader.impl.game.minecraft.Hooks.startClient(Hooks.java:53)
	at net.minecraft.client.MinecraftClient.<init>(MinecraftClient.java:477)
	at net.minecraft.client.main.Main.main(Main.java:239)
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480)
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74)
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23)
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86)
Caused by: net.fabricmc.loader.api.EntrypointException: Exception while loading entries for entrypoint 'client' provided by 'words'
	at net.fabricmc.loader.impl.entrypoint.EntrypointContainerImpl.getEntrypoint(EntrypointContainerImpl.java:56)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:399)
	... 7 more
Caused by: net.fabricmc.loader.api.LanguageAdapterException: java.lang.ClassNotFoundException: com.hyper.WordsClient
	at net.fabricmc.loader.impl.util.DefaultLanguageAdapter.create(DefaultLanguageAdapter.java:52)
	at net.fabricmc.loader.impl.entrypoint.EntrypointStorage$NewEntry.getOrCreate(EntrypointStorage.java:124)
	at net.fabricmc.loader.impl.entrypoint.EntrypointContainerImpl.getEntrypoint(EntrypointContainerImpl.java:53)
	... 8 more
Caused by: java.lang.ClassNotFoundException: com.hyper.WordsClient
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at net.fabricmc.loader.impl.launch.knot.KnotClassDelegate.loadClass(KnotClassDelegate.java:226)
	at net.fabricmc.loader.impl.launch.knot.KnotClassLoader.loadClass(KnotClassLoader.java:119)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:536)
	at java.base/java.lang.Class.forName(Class.java:515)
	at net.fabricmc.loader.impl.util.DefaultLanguageAdapter.create(DefaultLanguageAdapter.java:50)
	... 10 more


A detailed walkthrough of the error, its code path and all known details is as follows:
---------------------------------------------------------------------------------------

-- Head --
Thread: Render thread
Stacktrace:
	at net.fabricmc.loader.impl.FabricLoaderImpl.lambda$invokeEntrypoints$2(FabricLoaderImpl.java:403)
	at net.fabricmc.loader.impl.util.ExceptionUtil.gatherExceptions(ExceptionUtil.java:33)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:401)
	at net.fabricmc.loader.impl.game.minecraft.Hooks.startClient(Hooks.java:53)
	at net.minecraft.client.MinecraftClient.<init>(MinecraftClient.java:477)

-- Initialization --
Details:
	Modules: 
		ADVAPI32.dll:高级 Windows 32 基本 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		COMCTL32.dll:用户体验控件库:6.10 (WinBuild.160101.0800):Microsoft Corporation
		CRYPT32.dll:加密 API32:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		CRYPTBASE.dll:Base cryptographic API DLL:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		CRYPTSP.dll:Cryptographic Service Provider API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		DBGHELP.DLL:Windows Image Helper:10.0.26100.5074 (WinBuild.160101.0800):Microsoft Corporation
		DNSAPI.dll:DNS 客户端 API DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		GDI32.dll:GDI Client DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		IMM32.DLL:Multi-User Windows IMM32 API Client DLL:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		IPHLPAPI.DLL:IP 帮助程序 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		KERNEL32.DLL:Windows NT 基本 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		KERNELBASE.dll:Windows NT 基本 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		MpOav.dll:IOfficeAntiVirus Module:4.18.26010.5 (1e74b9adf5ed0dd9a81fac912007d1b65cd9b869):Microsoft Corporation
		NSI.dll:NSI User-mode interface DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		NTASN1.dll:Microsoft ASN.1 API:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		OLEAUT32.dll:OLEAUT32.DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		Ole32.dll:用于 Windows 的 Microsoft OLE:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		POWRPROF.dll:电源配置文件帮助程序 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		PSAPI.DLL:Process Status Helper:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		Pdh.dll:Windows 性能数据助手 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		RPCRT4.dll:远程过程调用运行时:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		SHCORE.dll:SHCORE:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		SHELL32.dll:Windows Shell 公用 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		UMPDC.dll:User Mode Power Dependency Coordinator:10.0.26100.7019 (WinBuild.160101.0800):Microsoft Corporation
		USER32.dll:多用户 Windows 用户 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		USERENV.dll:Userenv:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		VCRUNTIME140.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		VERSION.dll:Version Checking and File Installation Libraries:10.0.26100.1150 (WinBuild.160101.0800):Microsoft Corporation
		WINHTTP.dll:Windows HTTP 服务:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		WINMM.dll:MCI API DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		WS2_32.dll:Windows Socket 2.0 32 位 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		amsi.dll:Anti-Malware Scan Interface:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		bcrypt.dll:Windows 加密基元库:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		bcryptPrimitives.dll:Windows Cryptographic Primitives Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		clbcatq.dll:COM+ Configuration Catalog:2001.12.10941.16384 (WinBuild.160101.0800):Microsoft Corporation
		combase.dll:用于 Windows 的 Microsoft COM:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		dbgcore.DLL:Windows Core Debugging Helpers:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		extnet.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		fwpuclnt.dll:FWP/IPsec 用户模式 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		gdi32full.dll:GDI Client DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		java.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		java.exe:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jemalloc.dll
		jimage.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jli.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jna17490977894415304329.dll:JNA native library:7.0.0:Java(TM) Native Access (JNA)
		jsvml.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jvm.dll:Java HotSpot(TM) 64-Bit server VM:21.0.9.0:Oracle Corporation
		kernel.appcore.dll:AppModel API Host:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		lwjgl.dll
		management.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		management_ext.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		msvcp140.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		msvcp_win.dll:Microsoft® C Runtime Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		msvcrt.dll:Windows NT CRT DLL:7.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		mswsock.dll:Microsoft Windows Sockets 2.0 服务提供程序:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		napinsp.dll:电子邮件命名填充提供程序:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		ncrypt.dll:Windows NCrypt 路由器:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		net.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		nio.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		nlansp_c.dll:NLA Namespace Service Provider DLL:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		ntdll.dll:NT 层 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		perfos.dll:Windows 系统性能对象 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		pfclient.dll:SysMain Client:10.0.26100.4202 (WinBuild.160101.0800):Microsoft Corporation
		profapi.dll:User Profile Basic API:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		rasadhlp.dll:Remote Access AutoDial Helper:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		rsaenh.dll:Microsoft Enhanced Cryptographic Provider:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		sechost.dll:Host for SCM/SDDL/LSA Lookup APIs:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		shlwapi.dll:外壳简易实用工具库:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		sunmscapi.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		ucrtbase.dll:Microsoft® C Runtime Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		vcruntime140_1.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		verify.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		win32u.dll:Win32u:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		windows.storage.dll:Microsoft WinRT Storage API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		winrnr.dll:LDAP RnR Provider DLL:10.0.26100.1882 (WinBuild.160101.0800):Microsoft Corporation
		wintypes.dll:Windows 基本类型 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		wshbth.dll:Windows Sockets Helper DLL:10.0.26100.5074 (WinBuild.160101.0800):Microsoft Corporation
		zip.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
Stacktrace:
	at net.minecraft.client.main.Main.main(Main.java:239)
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480)
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74)
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23)
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86)

-- System Details --
Details:
	Minecraft Version: 1.21.1
	Minecraft Version ID: 1.21.1
	Operating System: Windows 11 (amd64) version 10.0
	Java Version: 21.0.9, Oracle Corporation
	Java VM Version: Java HotSpot(TM) 64-Bit Server VM (mixed mode, sharing), Oracle Corporation
	Memory: 100433792 bytes (95 MiB) / 490733568 bytes (468 MiB) up to 8422162432 bytes (8032 MiB)
	CPUs: 24
	Processor Vendor: GenuineIntel
	Processor Name: Intel(R) Core(TM) Ultra 9 275HX
	Identifier: Intel64 Family 6 Model 198 Stepping 2
	Microarchitecture: unknown
	Frequency (GHz): 3.07
	Number of physical packages: 1
	Number of physical CPUs: 24
	Number of logical CPUs: 24
	Memory slot #0 capacity (MiB): 16384.00
	Memory slot #0 clockSpeed (GHz): 5.60
	Memory slot #0 type: Unknown
	Memory slot #1 capacity (MiB): 16384.00
	Memory slot #1 clockSpeed (GHz): 5.60
	Memory slot #1 type: Unknown
	Virtual memory max (MiB): 39284.34
	Virtual memory used (MiB): 35404.33
	Swap memory total (MiB): 7168.00
	Swap memory used (MiB): 497.36
	Space in storage for jna.tmpdir (MiB): <path not set>
	Space in storage for org.lwjgl.system.SharedLibraryExtractPath (MiB): <path not set>
	Space in storage for io.netty.native.workdir (MiB): <path not set>
	Space in storage for java.io.tmpdir (MiB): available: 326703.00, total: 946463.31
	Space in storage for workdir (MiB): available: 326703.00, total: 946463.31
	JVM Flags: 0 total; 
	Fabric Mods: 
		fabric-api: Fabric API 0.102.1+1.21.1
		fabric-api-base: Fabric API Base 0.4.42+6573ed8c6a
		fabric-api-lookup-api-v1: Fabric API Lookup API (v1) 1.6.68+b55973446a
		fabric-biome-api-v1: Fabric Biome API (v1) 13.0.29+5bd9f1bc6a
		fabric-block-api-v1: Fabric Block API (v1) 1.0.22+0af3f5a76a
		fabric-block-view-api-v2: Fabric BlockView API (v2) 1.0.10+6573ed8c6a
		fabric-blockrenderlayer-v1: Fabric BlockRenderLayer Registration (v1) 1.1.52+0af3f5a76a
		fabric-client-tags-api-v1: Fabric Client Tags 1.1.15+6573ed8c6a
		fabric-command-api-v1: Fabric Command API (v1) 1.2.49+f71b366f6a
		fabric-command-api-v2: Fabric Command API (v2) 2.2.28+6ced4dd96a
		fabric-commands-v0: Fabric Commands (v0) 0.2.66+df3654b36a
		fabric-content-registries-v0: Fabric Content Registries (v0) 8.0.16+b55973446a
		fabric-convention-tags-v1: Fabric Convention Tags 2.0.20+7f945d5b6a
		fabric-convention-tags-v2: Fabric Convention Tags (v2) 2.6.0+605f22ad6a
		fabric-crash-report-info-v1: Fabric Crash Report Info (v1) 0.2.29+0af3f5a76a
		fabric-data-attachment-api-v1: Fabric Data Attachment API (v1) 1.1.27+1daea2156a
		fabric-data-generation-api-v1: Fabric Data Generation API (v1) 20.2.17+16c4ae256a
		fabric-dimensions-v1: Fabric Dimensions API (v1) 4.0.0+6fc22b996a
		fabric-entity-events-v1: Fabric Entity Events (v1) 1.6.12+6fc22b996a
		fabric-events-interaction-v0: Fabric Events Interaction (v0) 0.7.12+ba9dae066a
		fabric-game-rule-api-v1: Fabric Game Rule API (v1) 1.0.53+6ced4dd96a
		fabric-gametest-api-v1: Fabric Game Test API (v1) 2.0.4+6fc22b996a
		fabric-item-api-v1: Fabric Item API (v1) 11.0.0+afdfc9216a
		fabric-item-group-api-v1: Fabric Item Group API (v1) 4.1.4+780172706a
		fabric-key-binding-api-v1: Fabric Key Binding API (v1) 1.0.47+0af3f5a76a
		fabric-keybindings-v0: Fabric Key Bindings (v0) 0.2.45+df3654b36a
		fabric-lifecycle-events-v1: Fabric Lifecycle Events (v1) 2.3.12+6c1df3606a
		fabric-loot-api-v2: Fabric Loot API (v2) 3.0.14+3f89f5a56a
		fabric-loot-api-v3: Fabric Loot API (v3) 1.0.2+3f89f5a56a
		fabric-message-api-v1: Fabric Message API (v1) 6.0.13+6573ed8c6a
		fabric-model-loading-api-v1: Fabric Model Loading API (v1) 2.0.0+fe474d6b6a
		fabric-networking-api-v1: Fabric Networking API (v1) 4.2.2+60c3209b6a
		fabric-object-builder-api-v1: Fabric Object Builder API (v1) 15.2.0+40875a936a
		fabric-particles-v1: Fabric Particles (v1) 4.0.2+6573ed8c6a
		fabric-recipe-api-v1: Fabric Recipe API (v1) 5.0.12+650897126a
		fabric-registry-sync-v0: Fabric Registry Sync (v0) 5.1.2+60c3209b6a
		fabric-renderer-api-v1: Fabric Renderer API (v1) 3.4.0+c705a49c6a
		fabric-renderer-indigo: Fabric Renderer - Indigo 1.7.0+c705a49c6a
		fabric-renderer-registries-v1: Fabric Renderer Registries (v1) 3.2.68+df3654b36a
		fabric-rendering-data-attachment-v1: Fabric Rendering Data Attachment (v1) 0.3.48+73761d2e6a
		fabric-rendering-fluids-v1: Fabric Rendering Fluids (v1) 3.1.6+1daea2156a
		fabric-rendering-v0: Fabric Rendering (v0) 1.1.71+df3654b36a
		fabric-rendering-v1: Fabric Rendering (v1) 5.0.5+df16efd06a
		fabric-resource-conditions-api-v1: Fabric Resource Conditions API (v1) 4.3.0+8dc279b16a
		fabric-resource-loader-v0: Fabric Resource Loader (v0) 1.3.0+565991296a
		fabric-screen-api-v1: Fabric Screen API (v1) 2.0.25+8b68f1c76a
		fabric-screen-handler-api-v1: Fabric Screen Handler API (v1) 1.3.86+b55973446a
		fabric-sound-api-v1: Fabric Sound API (v1) 1.0.23+6573ed8c6a
		fabric-transfer-api-v1: Fabric Transfer API (v1) 5.1.17+1db1cc1f6a
		fabric-transitive-access-wideners-v1: Fabric Transitive Access Wideners (v1) 6.1.0+1daea2156a
		fabricloader: Fabric Loader 0.16.5
		java: Java HotSpot(TM) 64-Bit Server VM 21
		minecraft: Minecraft 1.21.1
		mixinextras: MixinExtras 0.4.1
		words: Words Mod 1.0.0
	Launched Version: Fabric
	Backend library: LWJGL version 3.3.3-snapshot
	Backend API: Unknown
	Window size: <not initialized>
	GFLW Platform: <error>
	GL Caps: Using framebuffer using OpenGL 3.2
	GL debug messages: <disabled>
	Is Modded: Definitely; Client brand changed to 'fabric'
	Universe: 404
	Type: Client (map_client.txt)
	Locale: zh_CN
	System encoding: GBK
	File encoding: UTF-8
	CPU: <unknown>
```

---

## File: run\crash-reports\crash-2026-02-20_19.08.00-client.txt

```txt
---- Minecraft Crash Report ----
// Don't be sad, have a hug! <3

Time: 2026-02-20 19:08:00
Description: Initializing game

java.lang.RuntimeException: Could not execute entrypoint stage 'client' due to errors, provided by 'words' at 'com.hyper.WordsClient'!
	at net.fabricmc.loader.impl.FabricLoaderImpl.lambda$invokeEntrypoints$2(FabricLoaderImpl.java:403)
	at net.fabricmc.loader.impl.util.ExceptionUtil.gatherExceptions(ExceptionUtil.java:33)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:401)
	at net.fabricmc.loader.impl.game.minecraft.Hooks.startClient(Hooks.java:53)
	at net.minecraft.client.MinecraftClient.<init>(MinecraftClient.java:477)
	at net.minecraft.client.main.Main.main(Main.java:239)
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480)
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74)
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23)
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86)
Caused by: net.fabricmc.loader.api.EntrypointException: Exception while loading entries for entrypoint 'client' provided by 'words'
	at net.fabricmc.loader.impl.entrypoint.EntrypointContainerImpl.getEntrypoint(EntrypointContainerImpl.java:56)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:399)
	... 7 more
Caused by: net.fabricmc.loader.api.LanguageAdapterException: java.lang.ClassNotFoundException: com.hyper.WordsClient
	at net.fabricmc.loader.impl.util.DefaultLanguageAdapter.create(DefaultLanguageAdapter.java:52)
	at net.fabricmc.loader.impl.entrypoint.EntrypointStorage$NewEntry.getOrCreate(EntrypointStorage.java:124)
	at net.fabricmc.loader.impl.entrypoint.EntrypointContainerImpl.getEntrypoint(EntrypointContainerImpl.java:53)
	... 8 more
Caused by: java.lang.ClassNotFoundException: com.hyper.WordsClient
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at net.fabricmc.loader.impl.launch.knot.KnotClassDelegate.loadClass(KnotClassDelegate.java:226)
	at net.fabricmc.loader.impl.launch.knot.KnotClassLoader.loadClass(KnotClassLoader.java:119)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:536)
	at java.base/java.lang.Class.forName(Class.java:515)
	at net.fabricmc.loader.impl.util.DefaultLanguageAdapter.create(DefaultLanguageAdapter.java:50)
	... 10 more


A detailed walkthrough of the error, its code path and all known details is as follows:
---------------------------------------------------------------------------------------

-- Head --
Thread: Render thread
Stacktrace:
	at net.fabricmc.loader.impl.FabricLoaderImpl.lambda$invokeEntrypoints$2(FabricLoaderImpl.java:403)
	at net.fabricmc.loader.impl.util.ExceptionUtil.gatherExceptions(ExceptionUtil.java:33)
	at net.fabricmc.loader.impl.FabricLoaderImpl.invokeEntrypoints(FabricLoaderImpl.java:401)
	at net.fabricmc.loader.impl.game.minecraft.Hooks.startClient(Hooks.java:53)
	at net.minecraft.client.MinecraftClient.<init>(MinecraftClient.java:477)

-- Initialization --
Details:
	Modules: 
		ADVAPI32.dll:高级 Windows 32 基本 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		COMCTL32.dll:用户体验控件库:6.10 (WinBuild.160101.0800):Microsoft Corporation
		CRYPT32.dll:加密 API32:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		CRYPTBASE.dll:Base cryptographic API DLL:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		CRYPTSP.dll:Cryptographic Service Provider API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		DBGHELP.DLL:Windows Image Helper:10.0.26100.5074 (WinBuild.160101.0800):Microsoft Corporation
		DNSAPI.dll:DNS 客户端 API DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		GDI32.dll:GDI Client DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		IMM32.DLL:Multi-User Windows IMM32 API Client DLL:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		IPHLPAPI.DLL:IP 帮助程序 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		KERNEL32.DLL:Windows NT 基本 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		KERNELBASE.dll:Windows NT 基本 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		MpOav.dll:IOfficeAntiVirus Module:4.18.26010.5 (1e74b9adf5ed0dd9a81fac912007d1b65cd9b869):Microsoft Corporation
		NSI.dll:NSI User-mode interface DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		NTASN1.dll:Microsoft ASN.1 API:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		OLEAUT32.dll:OLEAUT32.DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		Ole32.dll:用于 Windows 的 Microsoft OLE:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		POWRPROF.dll:电源配置文件帮助程序 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		PSAPI.DLL:Process Status Helper:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		Pdh.dll:Windows 性能数据助手 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		RPCRT4.dll:远程过程调用运行时:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		SHCORE.dll:SHCORE:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		SHELL32.dll:Windows Shell 公用 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		UMPDC.dll:User Mode Power Dependency Coordinator:10.0.26100.7019 (WinBuild.160101.0800):Microsoft Corporation
		USER32.dll:多用户 Windows 用户 API 客户端 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		USERENV.dll:Userenv:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		VCRUNTIME140.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		VERSION.dll:Version Checking and File Installation Libraries:10.0.26100.1150 (WinBuild.160101.0800):Microsoft Corporation
		WINHTTP.dll:Windows HTTP 服务:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		WINMM.dll:MCI API DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		WS2_32.dll:Windows Socket 2.0 32 位 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		amsi.dll:Anti-Malware Scan Interface:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		bcrypt.dll:Windows 加密基元库:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		bcryptPrimitives.dll:Windows Cryptographic Primitives Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		clbcatq.dll:COM+ Configuration Catalog:2001.12.10941.16384 (WinBuild.160101.0800):Microsoft Corporation
		combase.dll:用于 Windows 的 Microsoft COM:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		dbgcore.DLL:Windows Core Debugging Helpers:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		extnet.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		fwpuclnt.dll:FWP/IPsec 用户模式 API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		gdi32full.dll:GDI Client DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		java.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		java.exe:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jemalloc.dll
		jimage.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jli.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jna8665344480837288183.dll:JNA native library:7.0.0:Java(TM) Native Access (JNA)
		jsvml.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		jvm.dll:Java HotSpot(TM) 64-Bit server VM:21.0.9.0:Oracle Corporation
		kernel.appcore.dll:AppModel API Host:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		lwjgl.dll
		management.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		management_ext.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		msvcp140.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		msvcp_win.dll:Microsoft® C Runtime Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		msvcrt.dll:Windows NT CRT DLL:7.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		mswsock.dll:Microsoft Windows Sockets 2.0 服务提供程序:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		napinsp.dll:电子邮件命名填充提供程序:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		ncrypt.dll:Windows NCrypt 路由器:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		net.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		nio.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		nlansp_c.dll:NLA Namespace Service Provider DLL:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		ntdll.dll:NT 层 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		perfos.dll:Windows 系统性能对象 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		pfclient.dll:SysMain Client:10.0.26100.4202 (WinBuild.160101.0800):Microsoft Corporation
		profapi.dll:User Profile Basic API:10.0.26100.7309 (WinBuild.160101.0800):Microsoft Corporation
		rasadhlp.dll:Remote Access AutoDial Helper:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		rsaenh.dll:Microsoft Enhanced Cryptographic Provider:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		sechost.dll:Host for SCM/SDDL/LSA Lookup APIs:10.0.26100.1 (WinBuild.160101.0800):Microsoft Corporation
		shlwapi.dll:外壳简易实用工具库:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		sunmscapi.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		ucrtbase.dll:Microsoft® C Runtime Library:10.0.26100.7623 (WinBuild.160101.0800):Microsoft Corporation
		vcruntime140_1.dll:Microsoft® C Runtime Library:14.36.32532.0:Microsoft Corporation
		verify.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
		win32u.dll:Win32u:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		windows.storage.dll:Microsoft WinRT Storage API:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		winrnr.dll:LDAP RnR Provider DLL:10.0.26100.1882 (WinBuild.160101.0800):Microsoft Corporation
		wintypes.dll:Windows 基本类型 DLL:10.0.26100.7705 (WinBuild.160101.0800):Microsoft Corporation
		wshbth.dll:Windows Sockets Helper DLL:10.0.26100.5074 (WinBuild.160101.0800):Microsoft Corporation
		zip.dll:Java(TM) Platform SE binary:21.0.9.0:Oracle Corporation
Stacktrace:
	at net.minecraft.client.main.Main.main(Main.java:239)
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480)
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74)
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23)
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86)

-- System Details --
Details:
	Minecraft Version: 1.21.1
	Minecraft Version ID: 1.21.1
	Operating System: Windows 11 (amd64) version 10.0
	Java Version: 21.0.9, Oracle Corporation
	Java VM Version: Java HotSpot(TM) 64-Bit Server VM (mixed mode, sharing), Oracle Corporation
	Memory: 81349352 bytes (77 MiB) / 390070272 bytes (372 MiB) up to 8422162432 bytes (8032 MiB)
	CPUs: 24
	Processor Vendor: GenuineIntel
	Processor Name: Intel(R) Core(TM) Ultra 9 275HX
	Identifier: Intel64 Family 6 Model 198 Stepping 2
	Microarchitecture: unknown
	Frequency (GHz): 3.07
	Number of physical packages: 1
	Number of physical CPUs: 24
	Number of logical CPUs: 24
	Memory slot #0 capacity (MiB): 16384.00
	Memory slot #0 clockSpeed (GHz): 5.60
	Memory slot #0 type: Unknown
	Memory slot #1 capacity (MiB): 16384.00
	Memory slot #1 clockSpeed (GHz): 5.60
	Memory slot #1 type: Unknown
	Virtual memory max (MiB): 39284.34
	Virtual memory used (MiB): 35528.77
	Swap memory total (MiB): 7168.00
	Swap memory used (MiB): 498.50
	Space in storage for jna.tmpdir (MiB): <path not set>
	Space in storage for org.lwjgl.system.SharedLibraryExtractPath (MiB): <path not set>
	Space in storage for io.netty.native.workdir (MiB): <path not set>
	Space in storage for java.io.tmpdir (MiB): available: 326702.25, total: 946463.31
	Space in storage for workdir (MiB): available: 326702.25, total: 946463.31
	JVM Flags: 0 total; 
	Fabric Mods: 
		fabric-api: Fabric API 0.102.1+1.21.1
		fabric-api-base: Fabric API Base 0.4.42+6573ed8c6a
		fabric-api-lookup-api-v1: Fabric API Lookup API (v1) 1.6.68+b55973446a
		fabric-biome-api-v1: Fabric Biome API (v1) 13.0.29+5bd9f1bc6a
		fabric-block-api-v1: Fabric Block API (v1) 1.0.22+0af3f5a76a
		fabric-block-view-api-v2: Fabric BlockView API (v2) 1.0.10+6573ed8c6a
		fabric-blockrenderlayer-v1: Fabric BlockRenderLayer Registration (v1) 1.1.52+0af3f5a76a
		fabric-client-tags-api-v1: Fabric Client Tags 1.1.15+6573ed8c6a
		fabric-command-api-v1: Fabric Command API (v1) 1.2.49+f71b366f6a
		fabric-command-api-v2: Fabric Command API (v2) 2.2.28+6ced4dd96a
		fabric-commands-v0: Fabric Commands (v0) 0.2.66+df3654b36a
		fabric-content-registries-v0: Fabric Content Registries (v0) 8.0.16+b55973446a
		fabric-convention-tags-v1: Fabric Convention Tags 2.0.20+7f945d5b6a
		fabric-convention-tags-v2: Fabric Convention Tags (v2) 2.6.0+605f22ad6a
		fabric-crash-report-info-v1: Fabric Crash Report Info (v1) 0.2.29+0af3f5a76a
		fabric-data-attachment-api-v1: Fabric Data Attachment API (v1) 1.1.27+1daea2156a
		fabric-data-generation-api-v1: Fabric Data Generation API (v1) 20.2.17+16c4ae256a
		fabric-dimensions-v1: Fabric Dimensions API (v1) 4.0.0+6fc22b996a
		fabric-entity-events-v1: Fabric Entity Events (v1) 1.6.12+6fc22b996a
		fabric-events-interaction-v0: Fabric Events Interaction (v0) 0.7.12+ba9dae066a
		fabric-game-rule-api-v1: Fabric Game Rule API (v1) 1.0.53+6ced4dd96a
		fabric-gametest-api-v1: Fabric Game Test API (v1) 2.0.4+6fc22b996a
		fabric-item-api-v1: Fabric Item API (v1) 11.0.0+afdfc9216a
		fabric-item-group-api-v1: Fabric Item Group API (v1) 4.1.4+780172706a
		fabric-key-binding-api-v1: Fabric Key Binding API (v1) 1.0.47+0af3f5a76a
		fabric-keybindings-v0: Fabric Key Bindings (v0) 0.2.45+df3654b36a
		fabric-lifecycle-events-v1: Fabric Lifecycle Events (v1) 2.3.12+6c1df3606a
		fabric-loot-api-v2: Fabric Loot API (v2) 3.0.14+3f89f5a56a
		fabric-loot-api-v3: Fabric Loot API (v3) 1.0.2+3f89f5a56a
		fabric-message-api-v1: Fabric Message API (v1) 6.0.13+6573ed8c6a
		fabric-model-loading-api-v1: Fabric Model Loading API (v1) 2.0.0+fe474d6b6a
		fabric-networking-api-v1: Fabric Networking API (v1) 4.2.2+60c3209b6a
		fabric-object-builder-api-v1: Fabric Object Builder API (v1) 15.2.0+40875a936a
		fabric-particles-v1: Fabric Particles (v1) 4.0.2+6573ed8c6a
		fabric-recipe-api-v1: Fabric Recipe API (v1) 5.0.12+650897126a
		fabric-registry-sync-v0: Fabric Registry Sync (v0) 5.1.2+60c3209b6a
		fabric-renderer-api-v1: Fabric Renderer API (v1) 3.4.0+c705a49c6a
		fabric-renderer-indigo: Fabric Renderer - Indigo 1.7.0+c705a49c6a
		fabric-renderer-registries-v1: Fabric Renderer Registries (v1) 3.2.68+df3654b36a
		fabric-rendering-data-attachment-v1: Fabric Rendering Data Attachment (v1) 0.3.48+73761d2e6a
		fabric-rendering-fluids-v1: Fabric Rendering Fluids (v1) 3.1.6+1daea2156a
		fabric-rendering-v0: Fabric Rendering (v0) 1.1.71+df3654b36a
		fabric-rendering-v1: Fabric Rendering (v1) 5.0.5+df16efd06a
		fabric-resource-conditions-api-v1: Fabric Resource Conditions API (v1) 4.3.0+8dc279b16a
		fabric-resource-loader-v0: Fabric Resource Loader (v0) 1.3.0+565991296a
		fabric-screen-api-v1: Fabric Screen API (v1) 2.0.25+8b68f1c76a
		fabric-screen-handler-api-v1: Fabric Screen Handler API (v1) 1.3.86+b55973446a
		fabric-sound-api-v1: Fabric Sound API (v1) 1.0.23+6573ed8c6a
		fabric-transfer-api-v1: Fabric Transfer API (v1) 5.1.17+1db1cc1f6a
		fabric-transitive-access-wideners-v1: Fabric Transitive Access Wideners (v1) 6.1.0+1daea2156a
		fabricloader: Fabric Loader 0.16.5
		java: Java HotSpot(TM) 64-Bit Server VM 21
		minecraft: Minecraft 1.21.1
		mixinextras: MixinExtras 0.4.1
		words: Words Mod 1.0.0
	Launched Version: Fabric
	Backend library: LWJGL version 3.3.3-snapshot
	Backend API: Unknown
	Window size: <not initialized>
	GFLW Platform: <error>
	GL Caps: Using framebuffer using OpenGL 3.2
	GL debug messages: <disabled>
	Is Modded: Definitely; Client brand changed to 'fabric'
	Universe: 404
	Type: Client (map_client.txt)
	Locale: zh_CN
	System encoding: GBK
	File encoding: UTF-8
	CPU: <unknown>
```

---

## File: run\downloads\log.json

```json

```

---

## File: run\logs\debug.log

```log
[19:09:34] [main/INFO] (FabricLoader/GameProvider) Loading Minecraft 1.21.1 with Fabric Loader 0.16.5
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Found game constructor: net.minecraft.client.main.Main -> net.minecraft.client.MinecraftClient
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Patching game constructor <init>(Lnet/minecraft/client/RunArgs;)V
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Run directory field is thought to be net/minecraft/client/MinecraftClient/runDirectory
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Applying brand name hook to net/minecraft/client/ClientBrandRetriever::getClientModName
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Applying brand name hook to net/minecraft/server/MinecraftServer::getServerModName
[19:09:34] [main/DEBUG] (FabricLoader/Mappings) Loading mappings took 98 ms
[19:09:34] [main/DEBUG] (FabricLoader/GamePatch) Patched 3 classs
[19:09:34] [main/DEBUG] (FabricLoader/Discovery) Mod discovery time: 46.0 ms
[19:09:34] [main/DEBUG] (FabricLoader/Resolution) Mod resolution time: 85.2 ms
[19:09:34] [main/INFO] (FabricLoader) Loading 55 mods:
	- fabric-api 0.102.1+1.21.1
	- fabric-api-base 0.4.42+6573ed8c6a
	- fabric-api-lookup-api-v1 1.6.68+b55973446a
	- fabric-biome-api-v1 13.0.29+5bd9f1bc6a
	- fabric-block-api-v1 1.0.22+0af3f5a76a
	- fabric-block-view-api-v2 1.0.10+6573ed8c6a
	- fabric-blockrenderlayer-v1 1.1.52+0af3f5a76a
	- fabric-client-tags-api-v1 1.1.15+6573ed8c6a
	- fabric-command-api-v1 1.2.49+f71b366f6a
	- fabric-command-api-v2 2.2.28+6ced4dd96a
	- fabric-commands-v0 0.2.66+df3654b36a
	- fabric-content-registries-v0 8.0.16+b55973446a
	- fabric-convention-tags-v1 2.0.20+7f945d5b6a
	- fabric-convention-tags-v2 2.6.0+605f22ad6a
	- fabric-crash-report-info-v1 0.2.29+0af3f5a76a
	- fabric-data-attachment-api-v1 1.1.27+1daea2156a
	- fabric-data-generation-api-v1 20.2.17+16c4ae256a
	- fabric-dimensions-v1 4.0.0+6fc22b996a
	- fabric-entity-events-v1 1.6.12+6fc22b996a
	- fabric-events-interaction-v0 0.7.12+ba9dae066a
	- fabric-game-rule-api-v1 1.0.53+6ced4dd96a
	- fabric-gametest-api-v1 2.0.4+6fc22b996a
	- fabric-item-api-v1 11.0.0+afdfc9216a
	- fabric-item-group-api-v1 4.1.4+780172706a
	- fabric-key-binding-api-v1 1.0.47+0af3f5a76a
	- fabric-keybindings-v0 0.2.45+df3654b36a
	- fabric-lifecycle-events-v1 2.3.12+6c1df3606a
	- fabric-loot-api-v2 3.0.14+3f89f5a56a
	- fabric-loot-api-v3 1.0.2+3f89f5a56a
	- fabric-message-api-v1 6.0.13+6573ed8c6a
	- fabric-model-loading-api-v1 2.0.0+fe474d6b6a
	- fabric-networking-api-v1 4.2.2+60c3209b6a
	- fabric-object-builder-api-v1 15.2.0+40875a936a
	- fabric-particles-v1 4.0.2+6573ed8c6a
	- fabric-recipe-api-v1 5.0.12+650897126a
	- fabric-registry-sync-v0 5.1.2+60c3209b6a
	- fabric-renderer-api-v1 3.4.0+c705a49c6a
	- fabric-renderer-indigo 1.7.0+c705a49c6a
	- fabric-renderer-registries-v1 3.2.68+df3654b36a
	- fabric-rendering-data-attachment-v1 0.3.48+73761d2e6a
	- fabric-rendering-fluids-v1 3.1.6+1daea2156a
	- fabric-rendering-v0 1.1.71+df3654b36a
	- fabric-rendering-v1 5.0.5+df16efd06a
	- fabric-resource-conditions-api-v1 4.3.0+8dc279b16a
	- fabric-resource-loader-v0 1.3.0+565991296a
	- fabric-screen-api-v1 2.0.25+8b68f1c76a
	- fabric-screen-handler-api-v1 1.3.86+b55973446a
	- fabric-sound-api-v1 1.0.23+6573ed8c6a
	- fabric-transfer-api-v1 5.1.17+1db1cc1f6a
	- fabric-transitive-access-wideners-v1 6.1.0+1daea2156a
	- fabricloader 0.16.5
	- java 21
	- minecraft 1.21.1
	- mixinextras 0.4.1
	- words 1.0.0
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-lifecycle-events-v1-cfa6c1e6\2.3.12+6c1df3606a\fabric-lifecycle-events-v1-cfa6c1e6-2.3.12+6c1df3606a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\build\resources\main to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-convention-tags-v2-cfa6c1e6\2.6.0+605f22ad6a\fabric-convention-tags-v2-cfa6c1e6-2.6.0+605f22ad6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-api-v1-cfa6c1e6\3.4.0+c705a49c6a\fabric-renderer-api-v1-cfa6c1e6-3.4.0+c705a49c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-command-api-v2-cfa6c1e6\2.2.28+6ced4dd96a\fabric-command-api-v2-cfa6c1e6-2.2.28+6ced4dd96a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-convention-tags-v1-cfa6c1e6\2.0.20+7f945d5b6a\fabric-convention-tags-v1-cfa6c1e6-2.0.20+7f945d5b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-model-loading-api-v1-cfa6c1e6\2.0.0+fe474d6b6a\fabric-model-loading-api-v1-cfa6c1e6-2.0.0+fe474d6b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-data-attachment-api-v1-cfa6c1e6\1.1.27+1daea2156a\fabric-data-attachment-api-v1-cfa6c1e6-1.1.27+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-lookup-api-v1-cfa6c1e6\1.6.68+b55973446a\fabric-api-lookup-api-v1-cfa6c1e6-1.6.68+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-entity-events-v1-cfa6c1e6\1.6.12+6fc22b996a\fabric-entity-events-v1-cfa6c1e6-1.6.12+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-object-builder-api-v1-cfa6c1e6\15.2.0+40875a936a\fabric-object-builder-api-v1-cfa6c1e6-15.2.0+40875a936a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-block-view-api-v2-cfa6c1e6\1.0.10+6573ed8c6a\fabric-block-view-api-v2-cfa6c1e6-1.0.10+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-game-rule-api-v1-cfa6c1e6\1.0.53+6ced4dd96a\fabric-game-rule-api-v1-cfa6c1e6-1.0.53+6ced4dd96a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-recipe-api-v1-cfa6c1e6\5.0.12+650897126a\fabric-recipe-api-v1-cfa6c1e6-5.0.12+650897126a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-networking-api-v1-cfa6c1e6\4.2.2+60c3209b6a\fabric-networking-api-v1-cfa6c1e6-4.2.2+60c3209b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-client-tags-api-v1-cfa6c1e6\1.1.15+6573ed8c6a\fabric-client-tags-api-v1-cfa6c1e6-1.1.15+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-item-api-v1-cfa6c1e6\11.0.0+afdfc9216a\fabric-item-api-v1-cfa6c1e6-11.0.0+afdfc9216a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-resource-conditions-api-v1-cfa6c1e6\4.3.0+8dc279b16a\fabric-resource-conditions-api-v1-cfa6c1e6-4.3.0+8dc279b16a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-item-group-api-v1-cfa6c1e6\4.1.4+780172706a\fabric-item-group-api-v1-cfa6c1e6-4.1.4+780172706a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-cfa6c1e6\0.102.1+1.21.1\fabric-api-cfa6c1e6-0.102.1+1.21.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-data-generation-api-v1-cfa6c1e6\20.2.17+16c4ae256a\fabric-data-generation-api-v1-cfa6c1e6-20.2.17+16c4ae256a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-loot-api-v3-cfa6c1e6\1.0.2+3f89f5a56a\fabric-loot-api-v3-cfa6c1e6-1.0.2+3f89f5a56a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-content-registries-v0-cfa6c1e6\8.0.16+b55973446a\fabric-content-registries-v0-cfa6c1e6-8.0.16+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-block-api-v1-cfa6c1e6\1.0.22+0af3f5a76a\fabric-block-api-v1-cfa6c1e6-1.0.22+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-fluids-v1-cfa6c1e6\3.1.6+1daea2156a\fabric-rendering-fluids-v1-cfa6c1e6-3.1.6+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-transfer-api-v1-cfa6c1e6\5.1.17+1db1cc1f6a\fabric-transfer-api-v1-cfa6c1e6-5.1.17+1db1cc1f6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-resource-loader-v0-cfa6c1e6\1.3.0+565991296a\fabric-resource-loader-v0-cfa6c1e6-1.3.0+565991296a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-events-interaction-v0-cfa6c1e6\0.7.12+ba9dae066a\fabric-events-interaction-v0-cfa6c1e6-0.7.12+ba9dae066a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-screen-handler-api-v1-cfa6c1e6\1.3.86+b55973446a\fabric-screen-handler-api-v1-cfa6c1e6-1.3.86+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-v1-cfa6c1e6\5.0.5+df16efd06a\fabric-rendering-v1-cfa6c1e6-5.0.5+df16efd06a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-registries-v1-cfa6c1e6\3.2.68+df3654b36a\fabric-renderer-registries-v1-cfa6c1e6-3.2.68+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-indigo-cfa6c1e6\1.7.0+c705a49c6a\fabric-renderer-indigo-cfa6c1e6-1.7.0+c705a49c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-blockrenderlayer-v1-cfa6c1e6\1.1.52+0af3f5a76a\fabric-blockrenderlayer-v1-cfa6c1e6-1.1.52+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-base-cfa6c1e6\0.4.42+6573ed8c6a\fabric-api-base-cfa6c1e6-0.4.42+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-sound-api-v1-cfa6c1e6\1.0.23+6573ed8c6a\fabric-sound-api-v1-cfa6c1e6-1.0.23+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-gametest-api-v1-cfa6c1e6\2.0.4+6fc22b996a\fabric-gametest-api-v1-cfa6c1e6-2.0.4+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-biome-api-v1-cfa6c1e6\13.0.29+5bd9f1bc6a\fabric-biome-api-v1-cfa6c1e6-13.0.29+5bd9f1bc6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-loot-api-v2-cfa6c1e6\3.0.14+3f89f5a56a\fabric-loot-api-v2-cfa6c1e6-3.0.14+3f89f5a56a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-commands-v0-cfa6c1e6\0.2.66+df3654b36a\fabric-commands-v0-cfa6c1e6-0.2.66+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.github.llamalad7\mixinextras-fabric\0.4.1\8d1a9e96afb990367fa1f904d17580d164da72e3\mixinextras-fabric-0.4.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-dimensions-v1-cfa6c1e6\4.0.0+6fc22b996a\fabric-dimensions-v1-cfa6c1e6-4.0.0+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-keybindings-v0-cfa6c1e6\0.2.45+df3654b36a\fabric-keybindings-v0-cfa6c1e6-0.2.45+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-key-binding-api-v1-cfa6c1e6\1.0.47+0af3f5a76a\fabric-key-binding-api-v1-cfa6c1e6-1.0.47+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-crash-report-info-v1-cfa6c1e6\0.2.29+0af3f5a76a\fabric-crash-report-info-v1-cfa6c1e6-0.2.29+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-screen-api-v1-cfa6c1e6\2.0.25+8b68f1c76a\fabric-screen-api-v1-cfa6c1e6-2.0.25+8b68f1c76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-data-attachment-v1-cfa6c1e6\0.3.48+73761d2e6a\fabric-rendering-data-attachment-v1-cfa6c1e6-0.3.48+73761d2e6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-v0-cfa6c1e6\1.1.71+df3654b36a\fabric-rendering-v0-cfa6c1e6-1.1.71+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-command-api-v1-cfa6c1e6\1.2.49+f71b366f6a\fabric-command-api-v1-cfa6c1e6-1.2.49+f71b366f6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-message-api-v1-cfa6c1e6\6.0.13+6573ed8c6a\fabric-message-api-v1-cfa6c1e6-6.0.13+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-transitive-access-wideners-v1-cfa6c1e6\6.1.0+1daea2156a\fabric-transitive-access-wideners-v1-cfa6c1e6-6.1.0+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-registry-sync-v0-cfa6c1e6\5.1.2+60c3209b6a\fabric-registry-sync-v0-cfa6c1e6-5.1.2+60c3209b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-particles-v1-cfa6c1e6\4.0.2+6573ed8c6a\fabric-particles-v1-cfa6c1e6-4.0.2+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.event.lifecycle.ClientLifecycleEventsImpl for mod fabric-lifecycle-events-v1 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.event.lifecycle.LifecycleEventsImpl for mod fabric-lifecycle-events-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer com.hyper.WordsClient for mod words (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer com.hyper.Words for mod words (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.tag.convention.v2.TranslationConventionLogWarnings for mod fabric-convention-tags-v2 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.tag.convention.ConventionLogWarnings for mod fabric-convention-tags-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint for mod fabric-data-attachment-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.lookup.ApiLookupImpl for mod fabric-api-lookup-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.client.CustomIngredientSyncClient for mod fabric-recipe-api-v1 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientInit for mod fabric-recipe-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync for mod fabric-recipe-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl::clientInit for mod fabric-networking-api-v1 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.CommonPacketsImpl::init for mod fabric-networking-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.networking.NetworkingImpl::init for mod fabric-networking-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl for mod fabric-resource-conditions-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.event.interaction.client.InteractionEventsRouterClient for mod fabric-events-interaction-v0 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.event.interaction.InteractionEventsRouter for mod fabric-events-interaction-v0 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.screenhandler.client.ClientNetworking for mod fabric-screen-handler-api-v1 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.screenhandler.Networking for mod fabric-screen-handler-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.indigo.Indigo for mod fabric-renderer-indigo (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.gametest.FabricGameTestModInitializer for mod fabric-gametest-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.loot.v2.LootInitializer for mod fabric-loot-api-v2 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.rendering.v0.RenderingCallbackInvoker for mod fabric-rendering-v0 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.command.v1.LegacyHandler for mod fabric-command-api-v1 (key main)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.client.registry.sync.FabricRegistryClientInit for mod fabric-registry-sync-v0 (key client)
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) Registering new-style initializer net.fabricmc.fabric.impl.registry.sync.FabricRegistryInit for mod fabric-registry-sync-v0 (key main)
[19:09:34] [main/INFO] (FabricLoader/Mixin) SpongePowered MIXIN Subsystem Version=0.8.7 Source=file:/C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.15.3+mixin.0.8.7/51ee0a44ab05f6fddd66b09e66b3a16904f9c55d/sponge-mixin-0.15.3+mixin.0.8.7.jar Service=Knot/Fabric Env=CLIENT
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Initialising Mixin Platform Manager
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Adding mixin platform agents for container ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Instancing new MixinPlatformAgentDefault for ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) MixinPlatformAgentDefault accepted container ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Instancing new MixinPlatformAgentDefault for ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) MixinPlatformAgentDefault accepted container ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Processing prepare() for PlatformAgent[MixinPlatformAgentDefault:ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)]
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Processing prepare() for PlatformAgent[MixinPlatformAgentDefault:ContainerHandleURI(file:///C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.5/fc45b2f400c08c023cdbe75c9b0aebe7a2b61579/fabric-loader-0.16.5.jar)]
[19:09:34] [main/INFO] (FabricLoader/Mixin) Loaded Fabric development mappings for mixin remapper!
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-lifecycle-events-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_17
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-lifecycle-events-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-lifecycle-events-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-convention-tags-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_21 specified by fabric-renderer-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_21
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-renderer-api-v1.debughud.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-api-v1.debughud.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-command-api-v2.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-command-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-command-api-v2.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-command-api-v2.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-model-loading-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-model-loading-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-data-attachment-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-attachment-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-data-attachment-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-attachment-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-api-lookup-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-api-lookup-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-entity-events-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-entity-events-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-entity-events-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-entity-events-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-object-builder-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-object-builder-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-object-builder-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-object-builder-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-block-view-api-v2.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-view-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-block-view-api-v2.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-view-api-v2.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-game-rule-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-game-rule-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-game-rule-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-game-rule-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-recipe-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-recipe-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-networking-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-networking-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-networking-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-networking-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-item-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-item-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-resource-conditions-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-conditions-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-item-group-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-group-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-item-group-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-item-group-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-data-generation-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-generation-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-data-generation-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-data-generation-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-loot-api-v3.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-loot-api-v3.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-content-registries-v0.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-content-registries-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-block-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-block-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-rendering-fluids-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-fluids-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-transfer-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-transfer-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-resource-loader-v0.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-loader-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-resource-loader-v0.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-resource-loader-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-events-interaction-v0.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-events-interaction-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-events-interaction-v0.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-events-interaction-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-screen-handler-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-screen-handler-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-rendering-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-renderer-indigo.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-blockrenderlayer-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-blockrenderlayer-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-sound-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-sound-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-gametest-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-gametest-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-biome-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-biome-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-loot-api-v2.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-loot-api-v2.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-dimensions-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-dimensions-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-key-binding-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-key-binding-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-crash-report-info-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-crash-report-info-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-screen-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-screen-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-rendering-data-attachment-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-data-attachment-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-rendering-data-attachment-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-rendering-data-attachment-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-message-api-v1.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-message-api-v1.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-message-api-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-message-api-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-registry-sync-v0.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-registry-sync-v0.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-registry-sync-v0.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-registry-sync-v0.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Compatibility level JAVA_17 specified by fabric-particles-v1.client.mixins.json is higher than the maximum level supported by this version of mixin (JAVA_13).
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Mixin config fabric-particles-v1.client.mixins.json does not specify "minVersion" or "requiredFeatures" property
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\minecraftMaven\net\minecraft\minecraft-merged-c453a9ae23\1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2\minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\build\classes\java\main to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\build\resources\main to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\fabric-loom\1.21.1\net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2\mappings.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.github.llamalad7\mixinextras-fabric\0.4.1\8d1a9e96afb990367fa1f904d17580d164da72e3\mixinextras-fabric-0.4.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\net.fabricmc\dev-launch-injector\0.2.1+build.8\da8bef7e6e2f952da707f282bdb46882a0fce5e3\dev-launch-injector-0.2.1+build.8.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.github.oshi\oshi-core\6.4.10\b1d8ab82d11d92fd639b56d639f8f46f739dd5fa\oshi-core-6.4.10.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.google.guava\failureaccess\1.0.1\1dcf1de382a0bf95a3d8b0849546c88bac1292c9\failureaccess-1.0.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.google.guava\guava\32.1.2-jre\5e64ec7e056456bef3a4bc4c6fdaef71e8ab6318\guava-32.1.2-jre.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.ibm.icu\icu4j\73.2\61ad4ef7f9131fcf6d25c34b817f90d6da06c9e9\icu4j-73.2.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.mojang\blocklist\1.0.10\5c685c5ffa94c4cd39496c7184c1d122e515ecef\blocklist-1.0.10.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.mojang\brigadier\1.3.10\d15b53a14cf20fdcaa98f731af5dda654452c010\brigadier-1.3.10.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.mojang\datafixerupper\8.0.16\67d4de6d7f95d89bcf5862995fb854ebaec02a34\datafixerupper-8.0.16.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.mojang\patchy\2.2.10\da05971b07cbb379d002cf7eaec6a2048211fefc\patchy-2.2.10.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\com.mojang\text2speech\1.17.9\3cad216e3a7f0c19b4b394388bc9ffc446f13b14\text2speech-1.17.9.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\commons-codec\commons-codec\1.16.0\4e3eb3d79888d76b54e28b350915b5dc3919c9de\commons-codec-1.16.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\commons-io\commons-io\2.15.1\f11560da189ab563a5c8e351941415430e9304ea\commons-io-2.15.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\commons-logging\commons-logging\1.2\4bfc12adfe4842bf07b657f0369c4cb522955686\commons-logging-1.2.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-buffer\4.1.97.Final\f8f3d8644afa5e6e1a40a3a6aeb9d9aa970ecb4f\netty-buffer-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-codec\4.1.97.Final\384ba4d75670befbedb45c4d3b497a93639c206d\netty-codec-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-common\4.1.97.Final\7cceacaf11df8dc63f23d0fb58e9d4640fc88404\netty-common-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-handler\4.1.97.Final\abb86c6906bf512bf2b797a41cd7d2e8d3cd7c36\netty-handler-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-resolver\4.1.97.Final\cec8348108dc76c47cf87c669d514be52c922144\netty-resolver-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-classes-epoll\4.1.97.Final\795da37ded759e862457a82d9d92c4d39ce8ecee\netty-transport-classes-epoll-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-unix-common\4.1.97.Final\d469d84265ab70095b01b40886cabdd433b6e664\netty-transport-native-unix-common-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport\4.1.97.Final\f37380d23c9bb079bc702910833b2fd532c9abd0\netty-transport-4.1.97.Final.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\it.unimi.dsi\fastutil\8.5.12\c24946d46824bd528054bface3231d2ecb7e95e8\fastutil-8.5.12.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\net.java.dev.jna\jna-platform\5.14.0\28934d48aed814f11e4c584da55c49fa7032b31b\jna-platform-5.14.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\net.java.dev.jna\jna\5.14.0\67bf3eaea4f0718cb376a181a629e5f88fa1c9dd\jna-5.14.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\net.sf.jopt-simple\jopt-simple\5.0.4\4fdac2fbe92dfad86aa6e9301736f6b4342a3f5c\jopt-simple-5.0.4.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-compress\1.26.0\659feffdd12280201c8aacb8f7be94f9a883c824\commons-compress-1.26.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.apache.commons\commons-lang3\3.14.0\1ed471194b02f2c6cb734a0cd6f6f107c673afae\commons-lang3-3.14.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpclient\4.5.13\e5f6cae5ca7ecaac1ec2827a9e2d65ae2869cada\httpclient-4.5.13.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.apache.httpcomponents\httpcore\4.4.16\51cf043c87253c9f58b539c9f7e44c8894223850\httpcore-4.4.16.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.jcraft\jorbis\0.0.17\8872d22b293e8f5d7d56ff92be966e6dc28ebdc6\jorbis-0.0.17.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.joml\joml\1.10.5\22566d58af70ad3d72308bab63b8339906deb649\joml-1.10.5.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\a0db6c84a8becc8ca05f9dbfa985edc348a824c7\lwjgl-freetype-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\81091b006dbb43fab04c8c638e9ac87c51b4096d\lwjgl-freetype-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\82028265a0a2ff33523ca75137ada7dc176e5210\lwjgl-freetype-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-freetype\3.3.3\15a8c1de7f51d07a92eae7ce1222557073a0c0c3\lwjgl-freetype-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\efa1eb78c5ccd840e9f329717109b5e892d72f8e\lwjgl-glfw-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\e449e28b4891fc423c54c85fbc5bb0b9efece67a\lwjgl-glfw-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\f27018dc74f6289574502b46cce55d52817554e2\lwjgl-glfw-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-glfw\3.3.3\32334f3fd5270a59bad9939a93115acb6de36dcf\lwjgl-glfw-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\b543467b7ff3c6920539a88ee602d34098628be5\lwjgl-jemalloc-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\426222fc027602a5f21b9c0fe79cde6a4c7a011f\lwjgl-jemalloc-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\ba1f3fed0ee4be0217eaa41c5bbfb4b9b1383c33\lwjgl-jemalloc-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-jemalloc\3.3.3\f6063b6e0f23be483c5c88d84ce51b39dc69126c\lwjgl-jemalloc-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\daada81ceb5fc0c291fbfdd4433cb8d9423577f2\lwjgl-openal-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\cf83862ae95d98496b26915024c7e666d8ab1c8f\lwjgl-openal-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\8e0615235116b9e4160dfe87bec90f5f6378bf72\lwjgl-openal-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-openal\3.3.3\87b8d5050e3adb46bb58fe1cb2669a4a48fce10d\lwjgl-openal-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\2f6b0147078396a58979125a4c947664e98293a\lwjgl-opengl-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\e6c1eec8be8a71951b830a4d69efc01c6531900c\lwjgl-opengl-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\65e956d3735a1abdc82eff4baec1b61174697d4b\lwjgl-opengl-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-opengl\3.3.3\d32d833dcaa2f355a886eaf21f0408b5f03241d\lwjgl-opengl-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\25dd6161988d7e65f71d5065c99902402ee32746\lwjgl-stb-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\1d9facdf6541de114b0f963be33505b7679c78cb\lwjgl-stb-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\a584ab44de569708871f0a79561f4d8c37487f2c\lwjgl-stb-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-stb\3.3.3\b5c874687b9aac1a936501d4ed2c49567fd1b575\lwjgl-stb-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\82d755ca94b102e9ca77283b9e2dc46d1b15fbe5\lwjgl-tinyfd-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\a6697981b0449a5087c1d546fc08b4f73e8f98c9\lwjgl-tinyfd-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\a88c494f3006eb91a7433b12a3a55a9a6c20788b\lwjgl-tinyfd-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl-tinyfd\3.3.3\c336c84ee88cccb495c6ffa112395509e7378e8a\lwjgl-tinyfd-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\29589b5f87ed335a6c7e7ee6a5775f81f97ecb84\lwjgl-3.3.3.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\a5ed18a2b82fc91b81f40d717cb1f64c9dcb0540\lwjgl-3.3.3-natives-windows.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\e9aca8c5479b520a2a7f0d542a118140e812c5e8\lwjgl-3.3.3-natives-windows-arm64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lwjgl\lwjgl\3.3.3\9e670718e050aeaeea0c2d5b907cffb142f2e58f\lwjgl-3.3.3-natives-windows-x86.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\org.lz4\lz4-java\1.8.0\4b986a99445e49ea5fbf5d149c4b63f6ed6c6780\lz4-java-1.8.0.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-epoll\4.1.97.Final\54188f271e388e7f313aea995e82f58ce2cdb809\netty-transport-native-epoll-4.1.97.Final-linux-x86_64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\.gradle\caches\modules-2\files-2.1\io.netty\netty-transport-native-epoll\4.1.97.Final\5514744c588190ffda076b35a9b8c9f24946a960\netty-transport-native-epoll-4.1.97.Final-linux-aarch_64.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-cfa6c1e6\0.102.1+1.21.1\fabric-api-cfa6c1e6-0.102.1+1.21.1.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-transfer-api-v1-cfa6c1e6\5.1.17+1db1cc1f6a\fabric-transfer-api-v1-cfa6c1e6-5.1.17+1db1cc1f6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-lookup-api-v1-cfa6c1e6\1.6.68+b55973446a\fabric-api-lookup-api-v1-cfa6c1e6-1.6.68+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-blockrenderlayer-v1-cfa6c1e6\1.1.52+0af3f5a76a\fabric-blockrenderlayer-v1-cfa6c1e6-1.1.52+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-client-tags-api-v1-cfa6c1e6\1.1.15+6573ed8c6a\fabric-client-tags-api-v1-cfa6c1e6-1.1.15+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-command-api-v1-cfa6c1e6\1.2.49+f71b366f6a\fabric-command-api-v1-cfa6c1e6-1.2.49+f71b366f6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-commands-v0-cfa6c1e6\0.2.66+df3654b36a\fabric-commands-v0-cfa6c1e6-0.2.66+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-command-api-v2-cfa6c1e6\2.2.28+6ced4dd96a\fabric-command-api-v2-cfa6c1e6-2.2.28+6ced4dd96a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-content-registries-v0-cfa6c1e6\8.0.16+b55973446a\fabric-content-registries-v0-cfa6c1e6-8.0.16+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-data-generation-api-v1-cfa6c1e6\20.2.17+16c4ae256a\fabric-data-generation-api-v1-cfa6c1e6-20.2.17+16c4ae256a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-convention-tags-v1-cfa6c1e6\2.0.20+7f945d5b6a\fabric-convention-tags-v1-cfa6c1e6-2.0.20+7f945d5b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-convention-tags-v2-cfa6c1e6\2.6.0+605f22ad6a\fabric-convention-tags-v2-cfa6c1e6-2.6.0+605f22ad6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-data-attachment-api-v1-cfa6c1e6\1.1.27+1daea2156a\fabric-data-attachment-api-v1-cfa6c1e6-1.1.27+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-entity-events-v1-cfa6c1e6\1.6.12+6fc22b996a\fabric-entity-events-v1-cfa6c1e6-1.6.12+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-events-interaction-v0-cfa6c1e6\0.7.12+ba9dae066a\fabric-events-interaction-v0-cfa6c1e6-0.7.12+ba9dae066a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-gametest-api-v1-cfa6c1e6\2.0.4+6fc22b996a\fabric-gametest-api-v1-cfa6c1e6-2.0.4+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-item-api-v1-cfa6c1e6\11.0.0+afdfc9216a\fabric-item-api-v1-cfa6c1e6-11.0.0+afdfc9216a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-item-group-api-v1-cfa6c1e6\4.1.4+780172706a\fabric-item-group-api-v1-cfa6c1e6-4.1.4+780172706a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-lifecycle-events-v1-cfa6c1e6\2.3.12+6c1df3606a\fabric-lifecycle-events-v1-cfa6c1e6-2.3.12+6c1df3606a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-loot-api-v2-cfa6c1e6\3.0.14+3f89f5a56a\fabric-loot-api-v2-cfa6c1e6-3.0.14+3f89f5a56a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-loot-api-v3-cfa6c1e6\1.0.2+3f89f5a56a\fabric-loot-api-v3-cfa6c1e6-1.0.2+3f89f5a56a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-message-api-v1-cfa6c1e6\6.0.13+6573ed8c6a\fabric-message-api-v1-cfa6c1e6-6.0.13+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-model-loading-api-v1-cfa6c1e6\2.0.0+fe474d6b6a\fabric-model-loading-api-v1-cfa6c1e6-2.0.0+fe474d6b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-recipe-api-v1-cfa6c1e6\5.0.12+650897126a\fabric-recipe-api-v1-cfa6c1e6-5.0.12+650897126a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-screen-handler-api-v1-cfa6c1e6\1.3.86+b55973446a\fabric-screen-handler-api-v1-cfa6c1e6-1.3.86+b55973446a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-registry-sync-v0-cfa6c1e6\5.1.2+60c3209b6a\fabric-registry-sync-v0-cfa6c1e6-5.1.2+60c3209b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-networking-api-v1-cfa6c1e6\4.2.2+60c3209b6a\fabric-networking-api-v1-cfa6c1e6-4.2.2+60c3209b6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-object-builder-api-v1-cfa6c1e6\15.2.0+40875a936a\fabric-object-builder-api-v1-cfa6c1e6-15.2.0+40875a936a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-particles-v1-cfa6c1e6\4.0.2+6573ed8c6a\fabric-particles-v1-cfa6c1e6-4.0.2+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-indigo-cfa6c1e6\1.7.0+c705a49c6a\fabric-renderer-indigo-cfa6c1e6-1.7.0+c705a49c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-api-v1-cfa6c1e6\3.4.0+c705a49c6a\fabric-renderer-api-v1-cfa6c1e6-3.4.0+c705a49c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-fluids-v1-cfa6c1e6\3.1.6+1daea2156a\fabric-rendering-fluids-v1-cfa6c1e6-3.1.6+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-renderer-registries-v1-cfa6c1e6\3.2.68+df3654b36a\fabric-renderer-registries-v1-cfa6c1e6-3.2.68+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-v0-cfa6c1e6\1.1.71+df3654b36a\fabric-rendering-v0-cfa6c1e6-1.1.71+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-v1-cfa6c1e6\5.0.5+df16efd06a\fabric-rendering-v1-cfa6c1e6-5.0.5+df16efd06a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-screen-api-v1-cfa6c1e6\2.0.25+8b68f1c76a\fabric-screen-api-v1-cfa6c1e6-2.0.25+8b68f1c76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-api-base-cfa6c1e6\0.4.42+6573ed8c6a\fabric-api-base-cfa6c1e6-0.4.42+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-biome-api-v1-cfa6c1e6\13.0.29+5bd9f1bc6a\fabric-biome-api-v1-cfa6c1e6-13.0.29+5bd9f1bc6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-block-api-v1-cfa6c1e6\1.0.22+0af3f5a76a\fabric-block-api-v1-cfa6c1e6-1.0.22+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-rendering-data-attachment-v1-cfa6c1e6\0.3.48+73761d2e6a\fabric-rendering-data-attachment-v1-cfa6c1e6-0.3.48+73761d2e6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-block-view-api-v2-cfa6c1e6\1.0.10+6573ed8c6a\fabric-block-view-api-v2-cfa6c1e6-1.0.10+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-crash-report-info-v1-cfa6c1e6\0.2.29+0af3f5a76a\fabric-crash-report-info-v1-cfa6c1e6-0.2.29+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-dimensions-v1-cfa6c1e6\4.0.0+6fc22b996a\fabric-dimensions-v1-cfa6c1e6-4.0.0+6fc22b996a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-game-rule-api-v1-cfa6c1e6\1.0.53+6ced4dd96a\fabric-game-rule-api-v1-cfa6c1e6-1.0.53+6ced4dd96a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-keybindings-v0-cfa6c1e6\0.2.45+df3654b36a\fabric-keybindings-v0-cfa6c1e6-0.2.45+df3654b36a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-key-binding-api-v1-cfa6c1e6\1.0.47+0af3f5a76a\fabric-key-binding-api-v1-cfa6c1e6-1.0.47+0af3f5a76a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-resource-conditions-api-v1-cfa6c1e6\4.3.0+8dc279b16a\fabric-resource-conditions-api-v1-cfa6c1e6-4.3.0+8dc279b16a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-resource-loader-v0-cfa6c1e6\1.3.0+565991296a\fabric-resource-loader-v0-cfa6c1e6-1.3.0+565991296a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-sound-api-v1-cfa6c1e6\1.0.23+6573ed8c6a\fabric-sound-api-v1-cfa6c1e6-1.0.23+6573ed8c6a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Knot) Adding C:\Users\hyper\Desktop\program\MCmod-words\.gradle\loom-cache\remapped_mods\remapped\net\fabricmc\fabric-api\fabric-transitive-access-wideners-v1-cfa6c1e6\6.1.0+1daea2156a\fabric-transitive-access-wideners-v1-cfa6c1e6-6.1.0+1daea2156a.jar to classpath.
[19:09:34] [main/DEBUG] (FabricLoader/Entrypoint) No subscribers for entrypoint 'preLaunch'
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Preparing mixins for MixinEnvironment[DEFAULT]
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-lifecycle-events-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-lifecycle-events-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-lifecycle-events-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-lifecycle-events-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-convention-tags-api-v2.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-convention-tags-v2-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-renderer-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-api-v1.debughud.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-renderer-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-command-api-v2.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-command-api-v2-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-command-api-v2.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-command-api-v2-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-model-loading-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-model-loading-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-attachment-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-data-attachment-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-attachment-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-data-attachment-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-api-lookup-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-api-lookup-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-entity-events-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-entity-events-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-entity-events-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-entity-events-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-object-builder-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-object-builder-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-object-builder-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-object-builder-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-view-api-v2.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-block-view-api-v2-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-view-api-v2.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-block-view-api-v2-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-game-rule-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-game-rule-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-game-rule-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-game-rule-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-recipe-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-recipe-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-networking-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-networking-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-networking-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-networking-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-item-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-item-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-conditions-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-resource-conditions-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-group-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-item-group-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-item-group-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-item-group-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-generation-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-data-generation-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-data-generation-api-v1.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-data-generation-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-loot-api-v3.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-loot-api-v3-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-content-registries-v0.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-content-registries-v0-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-block-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-block-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-fluids-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-rendering-fluids-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-transfer-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-transfer-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-loader-v0.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-resource-loader-v0-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-resource-loader-v0.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-resource-loader-v0-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-events-interaction-v0.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-events-interaction-v0-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-events-interaction-v0.client.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-events-interaction-v0-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-screen-handler-api-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-screen-handler-api-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-v1.mixins.json
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-rendering-v1-refmap.json using remapper chain
[19:09:34] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-renderer-indigo.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-renderer-indigo-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-blockrenderlayer-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-blockrenderlayer-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-sound-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-sound-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-gametest-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-gametest-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-biome-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-biome-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-loot-api-v2.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-loot-api-v2-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config mixinextras.init.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/MixinExtras|Service) com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1) is taking over from null
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @Inject with org.spongepowered.asm.mixin.injection.struct.CallbackInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyArg with org.spongepowered.asm.mixin.injection.struct.ModifyArgInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyArgs with org.spongepowered.asm.mixin.injection.struct.ModifyArgsInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @Redirect with org.spongepowered.asm.mixin.injection.struct.RedirectInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyVariable with org.spongepowered.asm.mixin.injection.struct.ModifyVariableInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @ModifyConstant with org.spongepowered.asm.mixin.injection.struct.ModifyConstantInjectionInfo
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-dimensions-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-dimensions-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-key-binding-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-key-binding-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-crash-report-info-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-crash-report-info-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-screen-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-screen-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-data-attachment-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-rendering-data-attachment-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-rendering-data-attachment-v1.client.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-rendering-data-attachment-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-message-api-v1.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-message-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-message-api-v1.client.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-message-api-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-registry-sync-v0.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap fabric-registry-sync-v0-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-registry-sync-v0.client.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-registry-sync-v0-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Selecting config fabric-particles-v1.client.mixins.json
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Remapping refMap client-fabric-particles-v1-refmap.json using remapper chain
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-lifecycle-events-v1.mixins.json (10)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/world/ServerWorld$ServerEntityHandler is public in fabric-lifecycle-events-v1.mixins.json:ServerWorldServerEntityHandlerMixin from mod fabric-lifecycle-events-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-lifecycle-events-v1.client.mixins.json (7)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/world/ClientWorld$ClientEntityHandler is public in fabric-lifecycle-events-v1.client.mixins.json:ClientWorldClientEntityHandlerMixin from mod fabric-lifecycle-events-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-convention-tags-api-v2.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-api-v1.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-api-v1.debughud.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-command-api-v2.mixins.json (5)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-command-api-v2.client.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-model-loading-api-v1.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/render/model/ModelLoader$BakerImpl is public in fabric-model-loading-api-v1.mixins.json:ModelLoaderBakerImplMixin from mod fabric-model-loading-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-attachment-api-v1.mixins.json (8)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-attachment-api-v1.client.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-api-lookup-api-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-entity-events-v1.mixins.json (12)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-entity-events-v1.client.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-object-builder-v1.mixins.json (11)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-object-builder-v1.client.mixins.json (5)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-view-api-v2.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-view-api-v2.client.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-game-rule-api-v1.mixins.json (6)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/command/GameRuleCommand$1 is public in fabric-game-rule-api-v1.mixins.json:GameRuleCommandVisitorMixin from mod fabric-game-rule-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-game-rule-api-v1.client.mixins.json (3)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/gui/screen/world/EditGameRulesScreen$RuleListWidget$1 is public in fabric-game-rule-api-v1.client.mixins.json:RuleListWidgetVisitorMixin from mod fabric-game-rule-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-recipe-api-v1.mixins.json (3)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-networking-api-v1.mixins.json (18)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/network/packet/CustomPayload$1 is public in fabric-networking-api-v1.mixins.json:CustomPayloadPacketCodecMixin from mod fabric-networking-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/world/ServerChunkLoadingManager$EntityTracker is public in fabric-networking-api-v1.mixins.json:accessor.EntityTrackerAccessor from mod fabric-networking-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-networking-api-v1.client.mixins.json (9)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-api-v1.mixins.json (13)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-api-v1.client.mixins.json (3)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-conditions-api-v1.mixins.json (10)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-group-api-v1.mixins.json (3)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-item-group-api-v1.client.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-generation-api-v1.mixins.json (7)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-data-generation-api-v1.client.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-loot-api-v3.mixins.json (6)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-content-registries-v0.mixins.json (13)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-block-api-v1.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/world/chunk/ChunkSection$BlockStateCounter is public in fabric-block-api-v1.mixins.json:ChunkSectionBlockStateCounterMixin from mod fabric-block-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-fluids-v1.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-transfer-api-v1.mixins.json (13)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-loader-v0.mixins.json (14)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-resource-loader-v0.client.mixins.json (8)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/option/GameOptions$3 is public in fabric-resource-loader-v0.client.mixins.json:GameOptionsWriteVisitorMixin from mod fabric-resource-loader-v0 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-events-interaction-v0.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/server/network/ServerPlayNetworkHandler$1 is public in fabric-events-interaction-v0.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-events-interaction-v0 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-events-interaction-v0.client.mixins.json (3)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-screen-handler-api-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-v1.mixins.json (19)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/gl/ShaderProgram$1 is public in fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-renderer-indigo.mixins.json (5)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-blockrenderlayer-v1.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-sound-api-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-gametest-api-v1.mixins.json (8)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-biome-api-v1.mixins.json (9)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/world/biome/source/MultiNoiseBiomeSourceParameterList$Preset$1 is public in fabric-biome-api-v1.mixins.json:NetherBiomePresetMixin from mod fabric-biome-api-v1 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-loot-api-v2.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing mixinextras.init.mixins.json (0)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-dimensions-v1.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-key-binding-api-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-crash-report-info-v1.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-screen-api-v1.mixins.json (7)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-data-attachment-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-rendering-data-attachment-v1.client.mixins.json (1)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-message-api-v1.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-message-api-v1.client.mixins.json (2)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-registry-sync-v0.mixins.json (14)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-registry-sync-v0.client.mixins.json (6)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) @Mixin target net/minecraft/client/network/ClientRegistries$DynamicRegistries is public in fabric-registry-sync-v0.client.mixins.json:ClientRegistriesDynamicRegistriesMixin from mod fabric-registry-sync-v0 and should be specified in value
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Preparing fabric-particles-v1.client.mixins.json (4)
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Inner class net/fabricmc/fabric/mixin/itemgroup/ItemGroupsMixin$1ItemGroupPosition in net/fabricmc/fabric/mixin/itemgroup/ItemGroupsMixin on net/minecraft/item/ItemGroups gets unique name net/minecraft/item/ItemGroups$1ItemGroupPosition$6d9d666dffaf4b7b830112cc599fe8f2
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Inner class net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin$1 in net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin on net/minecraft/block/entity/ChiseledBookshelfBlockEntity gets unique name net/minecraft/block/entity/ChiseledBookshelfBlockEntity$Anonymous$9cff969dda5c44d18ef3258b86202573
[19:09:35] [main/DEBUG] (FabricLoader/Mixin) Prepared 310 mixins in 0.408 sec (1.3ms avg) (0ms load, 0ms transform, 0ms plugin)
[19:09:35] [main/DEBUG] (io.netty.util.internal.logging.InternalLoggerFactory) Using SLF4J as the default logging framework
[19:09:35] [main/DEBUG] (io.netty.util.ResourceLeakDetector) -Dio.netty.leakDetection.level: simple
[19:09:35] [main/DEBUG] (io.netty.util.ResourceLeakDetector) -Dio.netty.leakDetection.targetRecords: 4
[19:09:36] [main/INFO] (FabricLoader/MixinExtras|Service) Initializing MixinExtras via com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1).
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @SugarWrapper with com.llamalad7.mixinextras.sugar.impl.SugarWrapperInjectionInfo
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Registering new injector for @FactoryRedirectWrapper with com.llamalad7.mixinextras.wrapper.factory.FactoryRedirectWrapperInjectionInfo
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Mixing TaggedChoiceMixin from fabric-dimensions-v1.mixins.json into com.mojang.datafixers.types.templates.TaggedChoice
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceMixin from mod fabric-dimensions-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceMixin from mod fabric-dimensions-v1->@Inject::onApply(Lcom/mojang/datafixers/util/Pair;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Mixing TaggedChoiceTypeMixin from fabric-dimensions-v1.mixins.json into com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceTypeMixin from mod fabric-dimensions-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:TaggedChoiceTypeMixin from mod fabric-dimensions-v1->@Inject::onGetCodec(Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Mixing Schema2832Mixin from fabric-dimensions-v1.mixins.json into net.minecraft.datafixer.schema.Schema2832
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:Schema2832Mixin from mod fabric-dimensions-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Mixing SystemDetailsMixin from fabric-crash-report-info-v1.mixins.json into net.minecraft.util.SystemDetails
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$appendMods$1(Lnet/fabricmc/loader/api/ModContainer;)Ljava/lang/String; to md263364$fabric-crash-report-info-v1$lambda$appendMods$1$0 in fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1
[19:09:36] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fillSystemDetails$0()Ljava/lang/String; to md263364$fabric-crash-report-info-v1$lambda$fillSystemDetails$0$1 in fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1
[19:09:37] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:37] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:37] [main/DEBUG] (FabricLoader/Mixin) fabric-crash-report-info-v1.mixins.json:SystemDetailsMixin from mod fabric-crash-report-info-v1->@Inject::fillSystemDetails(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:37] [Datafixer Bootstrap/INFO] (com.mojang.datafixers.DataFixerBuilder) 226 Datafixer optimizations took 451 milliseconds
[19:09:37] [main/WARN] (net.minecraft.util.SystemDetails) Failed retrieving info for group graphics
com.sun.jna.platform.win32.Win32Exception: 系统找不到指定的文件。
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:769) ~[jna-platform-5.14.0.jar:?]
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:744) ~[jna-platform-5.14.0.jar:?]
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:718) ~[jna-platform-5.14.0.jar:?]
	at oshi.hardware.platform.windows.WindowsGraphicsCard.getGraphicsCards(WindowsGraphicsCard.java:83) ~[oshi-core-6.4.10.jar:?]
	at oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer.getGraphicsCards(WindowsHardwareAbstractionLayer.java:87) ~[oshi-core-6.4.10.jar:?]
	at net.minecraft.util.SystemDetails.method_37140(SystemDetails.java:80) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.tryAddGroup(SystemDetails.java:87) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.addHardwareGroup(SystemDetails.java:80) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.method_37143(SystemDetails.java:56) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.tryAddGroup(SystemDetails.java:87) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.<init>(SystemDetails.java:56) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.crash.CrashReport.<init>(CrashReport.java:35) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.crash.CrashReport.initCrashReport(CrashReport.java:234) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:125) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86) [dev-launch-injector-0.2.1+build.8.jar:?]
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing BootstrapMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.Bootstrap
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$initialize$1(Lnet/minecraft/fluid/Fluid;)Ljava/util/Collection; to md263364$fabric-registry-sync-v0$lambda$initialize$1$0 in fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$initialize$0(Lnet/minecraft/block/Block;)Ljava/util/Collection; to md263364$fabric-registry-sync-v0$lambda$initialize$0$1 in fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:BootstrapMixin from mod fabric-registry-sync-v0->@Inject::initialize(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesMixin from fabric-item-api-v1.mixins.json into net.minecraft.registry.Registries
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RegistriesMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.Registries
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistriesAccessor from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getROOT()Lnet/minecraft/registry/MutableRegistry; to getROOT$fabric-registry-sync-v0_$md$263364$0 in fabric-registry-sync-v0.mixins.json:RegistriesAccessor from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistriesMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.Registries
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistriesMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RegistriesMixin from mod fabric-item-api-v1->@Inject::modifyDefaultItemComponents(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistriesMixin from mod fabric-registry-sync-v0->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.SimpleRegistry
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryAccessor from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleRegistryMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.SimpleRegistry
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$3([Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback;)Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback; to md263364$fabric-registry-sync-v0$lambda$init$3$0 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$2([Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback;Lnet/fabricmc/fabric/api/event/registry/RegistryIdRemapCallback$RemapState;)V to md263364$fabric-registry-sync-v0$lambda$init$2$1 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$1([Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback;)Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback; to md263364$fabric-registry-sync-v0$lambda$init$1$2 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0([Lnet/fabricmc/fabric/api/event/registry/RegistryEntryAddedCallback;ILnet/minecraft/util/Identifier;Ljava/lang/Object;)V to md263364$fabric-registry-sync-v0$lambda$init$0$3 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming @Unique field LOGGERLorg/slf4j/Logger; to fd263364$fabric-registry-sync-v0$LOGGER$0 in fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::init(Lnet/minecraft/registry/RegistryKey;Lcom/mojang/serialization/Lifecycle;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SimpleRegistryMixin from mod fabric-registry-sync-v0->@Inject::set(Lnet/minecraft/registry/RegistryKey;Ljava/lang/Object;Lnet/minecraft/registry/entry/RegistryEntryInfo;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing RegistryKeysMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.RegistryKeys
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistryKeysMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ArgumentTypesAccessor from fabric-command-api-v2.mixins.json into net.minecraft.command.argument.ArgumentTypes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:ArgumentTypesAccessor from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_getClassMap()Ljava/util/Map; to fabric_getClassMap$fabric-command-api-v2_$md$263364$0 in fabric-command-api-v2.mixins.json:ArgumentTypesAccessor from mod fabric-command-api-v2
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ArgumentTypesMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.command.argument.ArgumentTypes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:ArgumentTypesMixin from mod fabric-gametest-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:ArgumentTypesMixin from mod fabric-gametest-api-v1->@Inject::register(Lnet/minecraft/registry/Registry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupsMixin from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroups
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$paginateGroups$0(Lnet/minecraft/registry/entry/RegistryEntry$Reference;Lnet/minecraft/registry/entry/RegistryEntry$Reference;)I to md263364$fabric-item-group-api-v1$lambda$paginateGroups$0$0 in fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1->@Inject::deferDuplicateCheck(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupsMixin from mod fabric-item-group-api-v1->@Inject::paginateGroups(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupAccessor from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroup
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupAccessor from mod fabric-item-group-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemGroupMixin from fabric-item-group-api-v1.mixins.json into net.minecraft.item.ItemGroup
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getStacks$0(Lnet/minecraft/item/ItemGroup;)Ljava/lang/IllegalStateException; to md263364$fabric-item-group-api-v1$lambda$getStacks$0$0 in fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.mixins.json:ItemGroupMixin from mod fabric-item-group-api-v1->@Inject::getStacks(Lnet/minecraft/item/ItemGroup$DisplayContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing FireBlockMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.FireBlock
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::afterConstruct(Lnet/minecraft/block/AbstractBlock$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::getFabricBurnChance(Lnet/minecraft/block/BlockState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:FireBlockMixin from mod fabric-content-registries-v0->@Inject::getFabricSpreadChance(Lnet/minecraft/block/BlockState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockMixin from fabric-block-api-v1.mixins.json into net.minecraft.block.Block
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-block-api-v1.mixins.json:BlockMixin from mod fabric-block-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractBlockAccessor from fabric-object-builder-v1.mixins.json into net.minecraft.block.AbstractBlock
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:AbstractBlockAccessor from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockViewMixin from fabric-block-view-api-v2.mixins.json into net.minecraft.world.BlockView
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.mixins.json:BlockViewMixin from mod fabric-block-view-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.entity.Entity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:AttachmentTargetsMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.entity.Entity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.Entity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::readEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:EntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/world/TeleportTarget;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/world/TeleportTarget;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1->@Inject::afterEntityTeleportedToWorld(Lnet/minecraft/server/world/ServerWorld;DDDLjava/util/Set;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FLnet/minecraft/entity/Entity;)V doesn't use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1->@Inject::afterEntityTeleportedToWorld(Lnet/minecraft/server/world/ServerWorld;DDDLjava/util/Set;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FLnet/minecraft/entity/Entity;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:EntityMixin from mod fabric-entity-events-v1->@Inject::afterEntityTeleportedToWorld(Lnet/minecraft/server/world/ServerWorld;DDDLjava/util/Set;FFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;FLnet/minecraft/entity/Entity;)V won't be passed a CallbackInfoReturnable as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing PlayerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.player.PlayerEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing elytra.PlayerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.player.PlayerEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.PlayerEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onTrySleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onIsSleepingLongEnough(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.PlayerEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraCheck(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing elytra.LivingEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.LivingEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.LivingEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.entity.LivingEntity
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:LivingEntityMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Ljava/util/Map;[Lnet/minecraft/entity/EquipmentSlot;IILnet/minecraft/entity/EquipmentSlot;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V doesn't use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Ljava/util/Map;[Lnet/minecraft/entity/EquipmentSlot;IILnet/minecraft/entity/EquipmentSlot;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:LivingEntityMixin from mod fabric-lifecycle-events-v1->@Inject::getEquipmentChanges(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Ljava/util/Map;[Lnet/minecraft/entity/EquipmentSlot;IILnet/minecraft/entity/EquipmentSlot;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V won't be passed a CallbackInfoReturnable as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::beforeDamage(Lnet/minecraft/entity/damage/DamageSource;FLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onSleep(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onWakeUp(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:LivingEntityMixin from mod fabric-entity-events-v1->@Inject::onIsSleepingInBed(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:elytra.LivingEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:LivingEntityMixin from mod fabric-item-api-v1->@Inject::onGetPreferredEquipmentSlot(Lnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.world.World
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:WorldMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.World
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:AttachmentTargetsMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldViewMixin from fabric-rendering-data-attachment-v1.mixins.json into net.minecraft.world.WorldView
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-data-attachment-v1.mixins.json:WorldViewMixin from mod fabric-rendering-data-attachment-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.world.ServerWorld
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.server.world.ServerWorld
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$createAttachmentsPersistentState$1(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;)Lnet/fabricmc/fabric/impl/attachment/AttachmentPersistentState; to md263364$fabric-data-attachment-api-v1$lambda$createAttachmentsPersistentState$1$0 in fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$createAttachmentsPersistentState$0(Lnet/minecraft/server/world/ServerWorld;)Lnet/fabricmc/fabric/impl/attachment/AttachmentPersistentState; to md263364$fabric-data-attachment-api-v1$lambda$createAttachmentsPersistentState$0$1 in fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldMixin from fabric-api-lookup-api-v1.mixins.json into net.minecraft.server.world.ServerWorld
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$5(Ljava/util/Map$Entry;)Z to md263364$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$5$2 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$4(Ljava/lang/ref/WeakReference;)Z to md263364$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$4$3 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$3(Ljava/lang/ref/WeakReference;)V to md263364$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$3$4 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_invalidateCache$2(Ljava/lang/ref/WeakReference;)Z to md263364$fabric-api-lookup-api-v1$lambda$fabric_invalidateCache$2$5 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_registerCache$1(Ljava/lang/ref/WeakReference;)Z to md263364$fabric-api-lookup-api-v1$lambda$fabric_registerCache$1$6 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_registerCache$0(Lnet/minecraft/util/math/BlockPos;)Ljava/util/List; to md263364$fabric-api-lookup-api-v1$lambda$fabric_registerCache$0$7 in fabric-api-lookup-api-v1.mixins.json:ServerWorldMixin from mod fabric-api-lookup-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldMixin from mod fabric-lifecycle-events-v1->@Inject::endWorldTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ServerWorldMixin from mod fabric-data-attachment-api-v1->@Inject::createAttachmentsPersistentState(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractBlockSettingsAccessor from fabric-object-builder-v1.mixins.json into net.minecraft.block.AbstractBlock$Settings
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:AbstractBlockSettingsAccessor from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing IdListMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.util.collection.IdList
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:IdListMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_remapIds$0(Lit/unimi/dsi/fastutil/ints/Int2IntMap;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer; to md263364$fabric-registry-sync-v0$lambda$fabric_remapIds$0$0 in fabric-registry-sync-v0.mixins.json:IdListMixin from mod fabric-registry-sync-v0
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing DetectorRailBlockMixin from fabric-object-builder-v1.mixins.json into net.minecraft.block.DetectorRailBlock
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DetectorRailBlockMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getCustomComparatorOutput$0(Lnet/minecraft/entity/Entity;)Z to md263364$fabric-object-builder-api-v1$lambda$getCustomComparatorOutput$0$0 in fabric-object-builder-v1.mixins.json:DetectorRailBlockMixin from mod fabric-object-builder-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DetectorRailBlockMixin from mod fabric-object-builder-api-v1->@Inject::getCustomComparatorOutput(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing DropperBlockMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.DropperBlock
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:DropperBlockMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookDispense$0(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md263364$fabric-transfer-api-v1$lambda$hookDispense$0$0 in fabric-transfer-api-v1.mixins.json:DropperBlockMixin from mod fabric-transfer-api-v1
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:DropperBlockMixin from mod fabric-transfer-api-v1->@Inject::hookDispense(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing OxidizableMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.Oxidizable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:OxidizableMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:OxidizableMixin from mod fabric-content-registries-v0->@Inject::createOxidationLevelIncreasesMap(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing CrafterBlockMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.CrafterBlock
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:CrafterBlockMixin from mod fabric-transfer-api-v1->@Inject::transferOrSpawnStack(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/CrafterBlockEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/BlockState;Lnet/minecraft/recipe/RecipeEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockStateMixin from fabric-block-api-v1.mixins.json into net.minecraft.block.BlockState
[19:09:38] [main/DEBUG] (FabricLoader/Mixin) fabric-block-api-v1.mixins.json:BlockStateMixin from mod fabric-block-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityTypeMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.EntityType
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::alwaysUpdateVelocity(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing FluidMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.fluid.Fluid
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:FluidMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:FluidMixin from mod fabric-transfer-api-v1->@Inject::hookGetBucketFillSound(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:AttachmentTargetsMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-block-view-api-v2.mixins.json into net.minecraft.block.entity.BlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.mixins.json:BlockEntityMixin from mod fabric-block-view-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityMixin from fabric-rendering-data-attachment-v1.mixins.json into net.minecraft.block.entity.BlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-rendering-data-attachment-v1.mixins.json:BlockEntityMixin from mod fabric-rendering-data-attachment-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::readBlockEntityAttachments(Lnet/minecraft/nbt/NbtCompound;Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BlockEntityMixin from mod fabric-data-attachment-api-v1->@Inject::writeBlockEntityAttachments(Lnet/minecraft/registry/RegistryWrapper$WrapperLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing NamedScreenHandlerFactoryMixin from fabric-screen-handler-api-v1.mixins.json into net.minecraft.screen.NamedScreenHandlerFactory
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:NamedScreenHandlerFactoryMixin from mod fabric-screen-handler-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing LockableContainerBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.LockableContainerBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:LockableContainerBlockEntityMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing MobEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.mob.MobEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:MobEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing ChiseledBookshelfBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.ChiseledBookshelfBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:ChiseledBookshelfBlockEntityMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:ChiseledBookshelfBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackBypass(ILnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityTypeAccessor from fabric-api-lookup-api-v1.mixins.json into net.minecraft.block.entity.BlockEntityType
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-api-lookup-api-v1.mixins.json:BlockEntityTypeAccessor from mod fabric-api-lookup-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityTypeMixin from fabric-object-builder-v1.mixins.json into net.minecraft.block.entity.BlockEntityType
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lcom/mojang/datafixers/types/Type;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lcom/mojang/datafixers/types/Type;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeMixin from mod fabric-object-builder-api-v1->@Inject::mutableBlocks(Lnet/minecraft/block/entity/BlockEntityType$BlockEntityFactory;Ljava/util/Set;Lcom/mojang/datafixers/types/Type;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractFurnaceBlockEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.block.entity.AbstractFurnaceBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractFurnaceBlockEntityMixin from fabric-content-registries-v0.mixins.json into net.minecraft.block.entity.AbstractFurnaceBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing AbstractFurnaceBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.AbstractFurnaceBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-item-api-v1->@Inject::getStackRemainder(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/entity/AbstractFurnaceBlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZZLnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;ZZLnet/minecraft/recipe/RecipeEntry;I)V doesn't use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-content-registries-v0->@Inject::fuelTimeMapHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-content-registries-v0->@Inject::fuelTimeMapHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:AbstractFurnaceBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackSuppressUpdate(ILnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing JukeboxBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.JukeboxBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:JukeboxBlockEntityMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:JukeboxBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::setStackBypass(Lnet/minecraft/item/ItemStack;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BrewingStandBlockEntityMixin from fabric-item-api-v1.mixins.json into net.minecraft.block.entity.BrewingStandBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:BrewingStandBlockEntityMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:BrewingStandBlockEntityMixin from mod fabric-item-api-v1->@Inject::captureItemStack(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/collection/DefaultedList;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/item/ItemStack;)V doesn't use it's CallbackInfo
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemStackMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.ItemStack
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemStackMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookDamage$0(Lorg/apache/commons/lang3/mutable/MutableBoolean;Ljava/util/function/Consumer;)V to md263364$fabric-item-api-v1$lambda$hookDamage$0$0 in fabric-item-api-v1.mixins.json:ItemStackMixin from mod fabric-item-api-v1
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemStackMixin from fabric-item-api-v1.client.mixins.json into net.minecraft.item.ItemStack
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:ItemStackMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:ItemStackMixin from mod fabric-item-api-v1->@Inject::getTooltip(Lnet/minecraft/item/Item$TooltipContext;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/item/tooltip/TooltipType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing AnvilScreenHandlerMixin from fabric-item-api-v1.mixins.json into net.minecraft.screen.AnvilScreenHandler
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:AnvilScreenHandlerMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing HopperBlockEntityMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.block.entity.HopperBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookExtract$1(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md263364$fabric-transfer-api-v1$lambda$hookExtract$1$0 in fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookInsert$0(Lnet/fabricmc/fabric/api/transfer/v1/item/ItemVariant;)Z to md263364$fabric-transfer-api-v1$lambda$hookInsert$0$1 in fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::hookInsert(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/HopperBlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:HopperBlockEntityMixin from mod fabric-transfer-api-v1->@Inject::hookExtract(Lnet/minecraft/world/World;Lnet/minecraft/block/entity/Hopper;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) Mixing BannerBlockEntityMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.block.entity.BannerBlockEntity
[19:09:39] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:BannerBlockEntityMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing TadpoleEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.passive.TadpoleEntity
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:TadpoleEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemAccessor from fabric-item-api-v1.mixins.json into net.minecraft.item.Item
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemAccessor from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.Item
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.item.Item
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:ItemMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemMixin from mod fabric-item-api-v1->@Inject::onConstruct(Lnet/minecraft/item/Item$Settings;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing ShovelItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.ShovelItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:ShovelItemAccessor from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getPathStates()Ljava/util/Map; to getPathStates$fabric-content-registries-v0_$md$263364$0 in fabric-content-registries-v0.mixins.json:ShovelItemAccessor from mod fabric-content-registries-v0
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing AxeItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.AxeItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:AxeItemAccessor from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getStrippedBlocks()Ljava/util/Map; to getStrippedBlocks$fabric-content-registries-v0_$md$263364$0 in fabric-content-registries-v0.mixins.json:AxeItemAccessor from mod fabric-content-registries-v0
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setStrippedBlocks(Ljava/util/Map;)V to setStrippedBlocks$fabric-content-registries-v0_$md$263364$1 in fabric-content-registries-v0.mixins.json:AxeItemAccessor from mod fabric-content-registries-v0
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing HoeItemAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.item.HoeItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:HoeItemAccessor from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getTillingActions()Ljava/util/Map; to getTillingActions$fabric-content-registries-v0_$md$263364$0 in fabric-content-registries-v0.mixins.json:HoeItemAccessor from mod fabric-content-registries-v0
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing BucketItemAccessor from fabric-transfer-api-v1.mixins.json into net.minecraft.item.BucketItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:BucketItemAccessor from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing BucketItemMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.item.BucketItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:BucketItemMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing HoneycombItemMixin from fabric-content-registries-v0.mixins.json into net.minecraft.item.HoneycombItem
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:HoneycombItemMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:HoneycombItemMixin from mod fabric-content-registries-v0->@Inject::createUnwaxedToWaxedMap(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing ItemSettingsMixin from fabric-item-api-v1.mixins.json into net.minecraft.item.Item$Settings
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:ItemSettingsMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing TagKeyMixin from fabric-convention-tags-api-v2.mixins.json into net.minecraft.registry.tag.TagKey
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-convention-tags-api-v2.mixins.json:TagKeyMixin from mod fabric-convention-tags-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing AttachmentTargetsMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.Chunk
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:AttachmentTargetsMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldChunkMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.world.chunk.WorldChunk
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) Mixing WorldChunkMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.WorldChunk
[19:09:40] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onLoadBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/block/entity/BlockEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:WorldChunkMixin from mod fabric-lifecycle-events-v1->@Inject::onRemoveBlockEntity(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lnet/minecraft/block/entity/BlockEntity;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachement(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachement(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WorldChunkMixin from mod fabric-data-attachment-api-v1->@Inject::transferProtoChunkAttachement(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/ProtoChunk;Lnet/minecraft/world/chunk/WorldChunk$EntityLoader;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing EntityTypeBuilderMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.EntityType$Builder
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeBuilderMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:EntityTypeBuilderMixin from mod fabric-object-builder-api-v1->@Inject::applyChildBuilders(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-events-interaction-v0.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerEntityMixin from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerEntityMixin from fabric-screen-handler-api-v1.mixins.json into net.minecraft.server.network.ServerPlayerEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::callOnKillForPlayer(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::notifyDeath(Lnet/minecraft/entity/damage/DamageSource;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::afterWorldChanged(Lnet/minecraft/server/world/ServerWorld;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onCopyFrom(Lnet/minecraft/server/network/ServerPlayerEntity;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::onTrySleepDirectionCheck(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/util/math/Direction;)V does use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerEntityMixin from mod fabric-events-interaction-v0->@Inject::onPlayerInteractEntity(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V doesn't use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-screen-handler-api-v1.mixins.json:ServerPlayerEntityMixin from mod fabric-screen-handler-api-v1->@Inject::fabric_storeOpenedScreenHandler(Lnet/minecraft/screen/NamedScreenHandlerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/screen/ScreenHandler;)V won't be passed a CallbackInfoReturnable as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing MooshroomEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.passive.MooshroomEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:MooshroomEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing PigEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.passive.PigEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PigEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing VillagerEntityMixin from fabric-entity-events-v1.mixins.json into net.minecraft.entity.passive.VillagerEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:VillagerEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing VillagerEntityAccessor from fabric-content-registries-v0.mixins.json into net.minecraft.entity.passive.VillagerEntity
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:VillagerEntityAccessor from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_setItemFoodValues(Ljava/util/Map;)V to fabric_setItemFoodValues$fabric-content-registries-v0_$md$263364$0 in fabric-content-registries-v0.mixins.json:VillagerEntityAccessor from mod fabric-content-registries-v0
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_setGatherableItems(Ljava/util/Set;)V to fabric_setGatherableItems$fabric-content-registries-v0_$md$263364$1 in fabric-content-registries-v0.mixins.json:VillagerEntityAccessor from mod fabric-content-registries-v0
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_getGatherableItems()Ljava/util/Set; to fabric_getGatherableItems$fabric-content-registries-v0_$md$263364$2 in fabric-content-registries-v0.mixins.json:VillagerEntityAccessor from mod fabric-content-registries-v0
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing ingredient.IngredientMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.recipe.Ingredient
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$3(Lnet/minecraft/recipe/Ingredient;)Lcom/mojang/datafixers/util/Either; to md263364$fabric-recipe-api-v1$lambda$injectCodec$3$0 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$2(Lcom/mojang/datafixers/util/Either;)Lnet/minecraft/recipe/Ingredient; to md263364$fabric-recipe-api-v1$lambda$injectCodec$2$1 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$1(Lnet/minecraft/recipe/Ingredient;)Lnet/minecraft/recipe/Ingredient; to md263364$fabric-recipe-api-v1$lambda$injectCodec$1$2 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$injectCodec$0(ZLnet/fabricmc/fabric/api/recipe/v1/ingredient/CustomIngredientSerializer;)Lcom/mojang/serialization/MapCodec; to md263364$fabric-recipe-api-v1$lambda$injectCodec$0$3 in fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.IngredientMixin from mod fabric-recipe-api-v1->@Inject::injectCodec(ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing EntitySelectorOptionsAccessor from fabric-command-api-v2.mixins.json into net.minecraft.command.EntitySelectorOptions
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:EntitySelectorOptionsAccessor from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callPutOption(Ljava/lang/String;Lnet/minecraft/command/EntitySelectorOptions$SelectorHandler;Ljava/util/function/Predicate;Lnet/minecraft/text/Text;)V to callPutOption$fabric-command-api-v2_$md$263364$0 in fabric-command-api-v2.mixins.json:EntitySelectorOptionsAccessor from mod fabric-command-api-v2
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing EntitySelectorReaderMixin from fabric-command-api-v2.mixins.json into net.minecraft.command.EntitySelectorReader
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:EntitySelectorReaderMixin from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityTypeBuilderMixin from fabric-object-builder-v1.mixins.json into net.minecraft.block.entity.BlockEntityType$Builder
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:BlockEntityTypeBuilderMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Generating mapped inner class net/minecraft/block/entity/ChiseledBookshelfBlockEntity$Anonymous$9cff969dda5c44d18ef3258b86202573 (originally net/fabricmc/fabric/mixin/transfer/ChiseledBookshelfBlockEntityMixin$1)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing SimpleInventoryMixin from fabric-transfer-api-v1.mixins.json into net.minecraft.inventory.SimpleInventory
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-transfer-api-v1.mixins.json:SimpleInventoryMixin from mod fabric-transfer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing RecipeMixin from fabric-item-api-v1.mixins.json into net.minecraft.recipe.Recipe
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RecipeMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RecipeMixin from mod fabric-item-api-v1->@Inject::captureStack(Lnet/minecraft/recipe/input/RecipeInput;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/util/collection/DefaultedList;I)V doesn't use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RecipeMixin from mod fabric-item-api-v1->@Inject::captureStack(Lnet/minecraft/recipe/input/RecipeInput;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/util/collection/DefaultedList;I)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:RecipeMixin from mod fabric-item-api-v1->@Inject::captureStack(Lnet/minecraft/recipe/input/RecipeInput;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/util/collection/DefaultedList;I)V won't be passed a CallbackInfoReturnable as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing ingredient.ShapelessRecipeMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.recipe.ShapelessRecipe
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/collection/DefaultedList;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/collection/DefaultedList;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::cacheRequiresTesting(Ljava/lang/String;Lnet/minecraft/recipe/book/CraftingRecipeCategory;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/collection/DefaultedList;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.ShapelessRecipeMixin from mod fabric-recipe-api-v1->@Inject::customIngredientMatch(Lnet/minecraft/recipe/input/CraftingRecipeInput;Lnet/minecraft/world/World;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) Mixing EnchantRandomlyLootFunctionMixin from fabric-item-api-v1.mixins.json into net.minecraft.loot.function.EnchantRandomlyLootFunction
[19:09:41] [main/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:EnchantRandomlyLootFunctionMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing LootTableAccessor from fabric-loot-api-v3.mixins.json into net.minecraft.loot.LootTable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:LootTableAccessor from mod fabric-loot-api-v3: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing LootPoolAccessor from fabric-loot-api-v3.mixins.json into net.minecraft.loot.LootPool
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:LootPoolAccessor from mod fabric-loot-api-v3: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing StructureTemplateManagerMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.structure.StructureTemplateManager
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V doesn't use it's CallbackInfo
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V has 0 override(s) in child classes
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:StructureTemplateManagerMixin from mod fabric-gametest-api-v1->@Inject::addFabricTemplateProvider(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Lcom/google/common/collect/ImmutableList$Builder;)V won't be passed a CallbackInfo as a result
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing BiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.BiomeSource
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:BiomeSourceMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing MultiNoiseBiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.MultiNoiseBiomeSource
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:MultiNoiseBiomeSourceMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing NetherBiomePresetMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList$Preset$1
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:NetherBiomePresetMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:NetherBiomePresetMixin from mod fabric-biome-api-v1->@Inject::apply(Ljava/util/function/Function;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing TheEndBiomeSourceMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.TheEndBiomeSource
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$1(Lnet/minecraft/registry/RegistryEntryLookup;)Lnet/fabricmc/fabric/impl/biome/TheEndBiomeData$Overrides; to md263364$fabric-biome-api-v1$lambda$init$1$0 in fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$modifyCodec$0(Lcom/mojang/serialization/codecs/RecordCodecBuilder$Instance;)Lcom/mojang/datafixers/kinds/App; to md263364$fabric-biome-api-v1$lambda$modifyCodec$0$1 in fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::modifyCodec(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::rememberLookup(Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::clearLookup(Lnet/minecraft/registry/RegistryEntryLookup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lnet/minecraft/registry/entry/RegistryEntry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:TheEndBiomeSourceMixin from mod fabric-biome-api-v1->@Inject::getWeightedEndBiome(IIILnet/minecraft/world/biome/source/util/MultiNoiseUtil$MultiNoiseSampler;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing DebugChunkGeneratorAccessor from fabric-registry-sync-v0.mixins.json into net.minecraft.world.gen.chunk.DebugChunkGenerator
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setBLOCK_STATES(Ljava/util/List;)V to setBLOCK_STATES$fabric-registry-sync-v0_$md$263364$0 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setX_SIDE_LENGTH(I)V to setX_SIDE_LENGTH$fabric-registry-sync-v0_$md$263364$1 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method setZ_SIDE_LENGTH(I)V to setZ_SIDE_LENGTH$fabric-registry-sync-v0_$md$263364$2 in fabric-registry-sync-v0.mixins.json:DebugChunkGeneratorAccessor from mod fabric-registry-sync-v0
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing DefaultAttributeRegistryAccessor from fabric-object-builder-v1.mixins.json into net.minecraft.entity.attribute.DefaultAttributeRegistry
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryAccessor from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getRegistry()Ljava/util/Map; to getRegistry$fabric-object-builder-api-v1_$md$263364$0 in fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryAccessor from mod fabric-object-builder-api-v1
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) Mixing DefaultAttributeRegistryMixin from fabric-object-builder-v1.mixins.json into net.minecraft.entity.attribute.DefaultAttributeRegistry
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [main/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:DefaultAttributeRegistryMixin from mod fabric-object-builder-api-v1->@Inject::injectAttributes(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.MinecraftClientAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:accessor.MinecraftClientAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-data-generation-api-v1.client.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-events-interaction-v0.client.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Unique field LOGGERLorg/slf4j/Logger; to fd263364$fabric-screen-api-v1$LOGGER$0 in fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftClientMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.MinecraftClient
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:MinecraftClientMixin from mod fabric-lifecycle-events-v1->@Inject::onStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-generation-api-v1.client.mixins.json:MinecraftClientMixin from mod fabric-data-generation-api-v1->@Inject::main(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::fabric_doItemPickWrapper(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::cancelItemPick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectUseEntityCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;[Lnet/minecraft/util/Hand;IILnet/minecraft/util/Hand;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/hit/EntityHitResult;Lnet/minecraft/entity/Entity;)V does use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleInputEventsForPreAttackCallback(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectDoAttackForCancelling(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:MinecraftClientMixin from mod fabric-events-interaction-v0->@Inject::injectHandleBlockBreakingForCancelling(ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::checkThreadOnDev(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemove(Lnet/minecraft/client/gui/screen/Screen;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::onScreenRemoveBecauseStopping(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::beforeLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MinecraftClientMixin from mod fabric-screen-api-v1->@Inject::afterLoadingScreenTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::disconnectAfter(Lnet/minecraft/client/gui/screen/Screen;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:MinecraftClientMixin from mod fabric-registry-sync-v0->@Inject::afterModInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ScreenAccessor from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.Screen
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenAccessor from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ScreenMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.Screen
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterInitScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::beforeResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:ScreenMixin from mod fabric-screen-api-v1->@Inject::afterResizeScreen(Lnet/minecraft/client/MinecraftClient;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientWorldMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.world.ClientWorld
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientWorldMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.world.ClientWorld
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$new$1(Lnet/minecraft/world/biome/ColorResolver;)Lnet/minecraft/client/world/BiomeColorCache; to md263364$fabric-rendering-v1$lambda$new$1$0 in fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$new$0(Lnet/minecraft/world/biome/ColorResolver;Lnet/minecraft/util/math/BlockPos;)I to md263364$fabric-rendering-v1$lambda$new$0$1 in fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::tickWorldAfterBlockEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldMixin from mod fabric-lifecycle-events-v1->@Inject::startWorldTick(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onResetChunkColor(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ClientWorldMixin from mod fabric-rendering-v1->@Inject::onReloadColor(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing elytra.ClientPlayerEntityMixin from fabric-entity-events-v1.client.mixins.json into net.minecraft.client.network.ClientPlayerEntity
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.client.mixins.json:elytra.ClientPlayerEntityMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.client.mixins.json:elytra.ClientPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.client.mixins.json:elytra.ClientPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.client.mixins.json:elytra.ClientPlayerEntityMixin from mod fabric-entity-events-v1->@Inject::injectElytraStart(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing HandledScreenMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.gui.screen.ingame.HandledScreen
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:HandledScreenMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:HandledScreenMixin from mod fabric-screen-api-v1->@Inject::callSuperMouseReleased(DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:HandledScreenMixin from mod fabric-screen-api-v1->@Inject::callSuperMouseReleased(DDIDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SinglePreparationResourceReloaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.SinglePreparationResourceReloader
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:SinglePreparationResourceReloaderMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:SinglePreparationResourceReloaderMixin from mod fabric-resource-conditions-api-v1->@Inject::applyResourceConditions(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:SinglePreparationResourceReloaderMixin from mod fabric-resource-conditions-api-v1->@Inject::applyResourceConditions(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:42] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:SinglePreparationResourceReloaderMixin from mod fabric-resource-conditions-api-v1->@Inject::applyResourceConditions(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing VanillaResourcePackProviderMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.resource.VanillaResourcePackProvider
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:VanillaResourcePackProviderMixin from mod fabric-resource-loader-v0->@Inject::addBuiltinResourcePacks(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackManagerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.ResourcePackManager
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$handleAutoDisable$0(Ljava/util/Set;Lnet/minecraft/resource/ResourcePackProfile;)Z to md263364$fabric-resource-loader-v0$lambda$handleAutoDisable$0$0 in fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::construct([Lnet/minecraft/resource/ResourcePackProvider;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnableDisable(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoEnable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackManagerMixin from mod fabric-resource-loader-v0->@Inject::handleAutoDisable(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/INFO] (com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService) Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[19:09:43] [Yggdrasil Key Fetcher/DEBUG] (com.mojang.authlib.minecraft.client.MinecraftClient) Connecting to https://api.minecraftservices.com/publickeys
[19:09:43] [Download-1/DEBUG] (com.mojang.authlib.minecraft.client.MinecraftClient) Connecting to https://sessionserver.mojang.com/session/minecraft/profile/17b67947156d35189500f7e04df5e64d?unsigned=false
[19:09:43] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Setting user: Player421
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyBindingAccessor from fabric-events-interaction-v0.client.mixins.json into net.minecraft.client.option.KeyBinding
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:KeyBindingAccessor from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyBindingAccessor from fabric-key-binding-api-v1.mixins.json into net.minecraft.client.option.KeyBinding
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:KeyBindingAccessor from mod fabric-key-binding-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method fabric_getCategoryMap()Ljava/util/Map; to fabric_getCategoryMap$fabric-key-binding-api-v1_$md$263364$0 in fabric-key-binding-api-v1.mixins.json:KeyBindingAccessor from mod fabric-key-binding-api-v1
[19:09:43] [Render thread/DEBUG] (FabricLoader/Entrypoint) Iterating over entrypoint 'main'
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.MinecraftServer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$endResourceReload$0(Ljava/lang/Void;Ljava/lang/Throwable;)Ljava/lang/Void; to md263364$fabric-lifecycle-events-v1$lambda$endResourceReload$0$0 in fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.MinecraftServer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0(Lnet/minecraft/resource/ResourcePack;)Ljava/util/stream/Stream; to md263364$fabric-resource-loader-v0$lambda$init$0$1 in fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.server.MinecraftServer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:MinecraftServerMixin from mod fabric-gametest-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing modification.MinecraftServerMixin from fabric-biome-api-v1.mixins.json into net.minecraft.server.MinecraftServer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MinecraftServerMixin from fabric-message-api-v1.mixins.json into net.minecraft.server.MinecraftServer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:MinecraftServerMixin from mod fabric-message-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$onGetChatDecorator$0(Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/text/Text;)Lnet/minecraft/text/Text; to md263364$fabric-message-api-v1$lambda$onGetChatDecorator$0$2 in fabric-message-api-v1.mixins.json:MinecraftServerMixin from mod fabric-message-api-v1
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterSetupServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::beforeShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::afterShutdownServer(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onStartTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onEndTick(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::onUnloadWorldAtShutdown(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;Ljava/util/Iterator;Lnet/minecraft/server/world/ServerWorld;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endResourceReload(Ljava/util/Collection;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::startSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:MinecraftServerMixin from mod fabric-lifecycle-events-v1->@Inject::endSave(ZZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:MinecraftServerMixin from mod fabric-resource-loader-v0->@Inject::init(Ljava/lang/Thread;Lnet/minecraft/world/level/storage/LevelStorage$Session;Lnet/minecraft/resource/ResourcePackManager;Lnet/minecraft/server/SaveLoader;Ljava/net/Proxy;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/util/ApiServices;Lnet/minecraft/server/WorldGenerationProgressListenerFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:MinecraftServerMixin from mod fabric-gametest-api-v1->@Inject::tickWorlds(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:MinecraftServerMixin from mod fabric-gametest-api-v1->@Inject::tickWorlds(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:MinecraftServerMixin from mod fabric-gametest-api-v1->@Inject::tickWorlds(Ljava/util/function/BooleanSupplier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.MinecraftServerMixin from mod fabric-biome-api-v1->@Inject::finalizeWorldGen(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:MinecraftServerMixin from mod fabric-message-api-v1->@Inject::onGetChatDecorator(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:43] [Render thread/INFO] (words) Initializing Words Mod for 1.21.1!
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerConfigurationNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerConfigurationNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerConfigurationNetworkHandlerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.network.ServerConfigurationNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onClientReady(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerCommonNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerCommonNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ServerCommonNetworkHandlerAccessor from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerCommonNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:accessor.ServerCommonNetworkHandlerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleCustomPayloadReceivedAsync(Lnet/minecraft/network/packet/c2s/common/CustomPayloadC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onPlayPong(Lnet/minecraft/network/packet/c2s/common/CommonPongC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LootTableBuilderMixin from fabric-loot-api-v3.mixins.json into net.minecraft.loot.LootTable$Builder
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:LootTableBuilderMixin from mod fabric-loot-api-v3: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LootTableBuilderMixin from fabric-loot-api-v2.mixins.json into net.minecraft.loot.LootTable$Builder
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v2.mixins.json:LootTableBuilderMixin from mod fabric-loot-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Entrypoint) Iterating over entrypoint 'client'
[19:09:43] [Render thread/INFO] (words) Initializing Words Mod Client for 1.21.1!
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConnectionMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.ClientConnection
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_getPendingChannelsNames$0(Lnet/minecraft/network/NetworkPhase;)Ljava/util/Collection; to md263364$fabric-networking-api-v1$lambda$fabric_getPendingChannelsNames$0$0 in fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::initAddedFields(Lnet/minecraft/network/NetworkSide;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::checkPacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::unwatchAddon(Lnet/minecraft/network/NetworkState;Lnet/minecraft/network/listener/PacketListener;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lio/netty/channel/ChannelHandlerContext;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ClientConnectionMixin from mod fabric-networking-api-v1->@Inject::disconnectAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-message-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-message-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-command-api-v2.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayNetworkHandlerMixin from fabric-data-attachment-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowSendChatMessage(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowSendCommandMessage(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleServerPlayReady(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onPlayerRespawn(Lnet/minecraft/network/packet/s2c/play/PlayerRespawnS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::onClearWorld(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onOnCommandTree(Lnet/minecraft/network/packet/s2c/play/CommandTreeS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onSendCommand(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientPlayNetworkHandlerMixin from mod fabric-command-api-v2->@Inject::onSendCommand(Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientCommonNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientCommonNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:accessor.ClientCommonNetworkHandlerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientCommonNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientCommonNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientCommonNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientCommonNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::onCustomPayload(Lnet/minecraft/network/packet/s2c/common/CustomPayloadS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientConfigurationNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientConfigurationNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientConfigurationNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientConfigurationNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:accessor.ClientConfigurationNetworkHandlerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientConfigurationNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleComplete(Lnet/minecraft/network/packet/s2c/config/ReadyS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ClientLoginNetworkHandlerAccessor from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientLoginNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:accessor.ClientLoginNetworkHandlerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientLoginNetworkHandlerMixin from fabric-networking-api-v1.client.mixins.json into net.minecraft.client.network.ClientLoginNetworkHandler
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.client.mixins.json:ClientLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleQueryRequest(Lnet/minecraft/network/packet/s2c/login/LoginQueryRequestS2CPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/INFO] (net.fabricmc.fabric.impl.client.indigo.Indigo) [Indigo] Registering Indigo renderer!
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing shader.GameRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.GameRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.GameRendererMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$registerShaders$0(Lnet/minecraft/resource/ResourceFactory;Ljava/util/List;Lnet/minecraft/util/Identifier;Lnet/minecraft/client/render/VertexFormat;Ljava/util/function/Consumer;)V to md263364$fabric-rendering-v1$lambda$registerShaders$0$0 in fabric-rendering-v1.mixins.json:shader.GameRendererMixin from mod fabric-rendering-v1
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRendererMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.render.GameRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:GameRendererMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.GameRendererMixin from mod fabric-rendering-v1->@Inject::registerShaders(Lnet/minecraft/resource/ResourceFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.GameRendererMixin from mod fabric-rendering-v1->@Inject::registerShaders(Lnet/minecraft/resource/ResourceFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.GameRendererMixin from mod fabric-rendering-v1->@Inject::registerShaders(Lnet/minecraft/resource/ResourceFactory;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing shader.ShaderProgramMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gl.ShaderProgram
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.SpriteAtlasTextureMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.texture.SpriteAtlasTexture
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.SpriteAtlasTextureMixin from mod fabric-renderer-api-v1->@Inject::uploadHook(Lnet/minecraft/client/texture/SpriteLoader$StitchResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.item.ItemRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemRendererAccessor from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.item.ItemRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method fabric_callUsesDynamicDisplay(Lnet/minecraft/item/ItemStack;)Z to fabric_callUsesDynamicDisplay$fabric-renderer-indigo_$md$263364$0 in fabric-renderer-indigo.mixins.json:ItemRendererAccessor from mod fabric-renderer-indigo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemRendererMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.item.ItemRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$new$0()Lnet/fabricmc/fabric/impl/client/indigo/renderer/render/ItemRenderContext; to md263364$fabric-renderer-indigo$lambda$new$0$1 in fabric-renderer-indigo.mixins.json:ItemRendererMixin from mod fabric-renderer-indigo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:ItemRendererMixin from mod fabric-renderer-indigo->@Inject::hook_renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.WorldRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing WorldRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.WorldRenderer
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/render/LightmapTextureManager;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/render/LightmapTextureManager;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRender(Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lnet/minecraft/client/render/LightmapTextureManager;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSetup(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterTerrainSolid(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterEntities(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeRenderOutline(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onDrawBlockOutline(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/entity/Entity;DDDLnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::beforeClouds(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onChunkDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onChunkDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onChunkDebugRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::afterRender(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::onReload(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderWeather(Lnet/minecraft/client/render/LightmapTextureManager;FDDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderCloud(Lnet/minecraft/client/util/math/MatrixStack;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;FDDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:WorldRendererMixin from mod fabric-rendering-v1->@Inject::renderSky(Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;FLnet/minecraft/client/render/Camera;ZLjava/lang/Runnable;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SoundInstanceMixin from fabric-sound-api-v1.mixins.json into net.minecraft.client.sound.SoundInstance
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-sound-api-v1.mixins.json:SoundInstanceMixin from mod fabric-sound-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.option.GameOptions
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsMixin from fabric-key-binding-api-v1.mixins.json into net.minecraft.client.option.GameOptions
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsMixin from mod fabric-resource-loader-v0->@Inject::onLoad(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-key-binding-api-v1.mixins.json:GameOptionsMixin from mod fabric-key-binding-api-v1->@Inject::loadHook(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackProfileMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.ResourcePackProfile
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:ResourcePackProfileMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourcePackProfileMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.ResourcePackProfile
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackProfileMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$static$0(Ljava/util/Set;)Z to md263364$fabric-resource-loader-v0$lambda$static$0$0 in fabric-resource-loader-v0.mixins.json:ResourcePackProfileMixin from mod fabric-resource-loader-v0
[19:09:43] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourcePackProfileMixin from mod fabric-resource-loader-v0->@Inject::onCreateResourcePack(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:43] [Download-1/DEBUG] (com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService) Couldn't fetch profile properties for 17b67947-156d-3518-9500-f7e04df5e64d as the profile does not exist
[19:09:43] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Backend library: LWJGL version 3.3.3-snapshot
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MouseMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.Mouse
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::beforeMouseClickedEvent([ZLnet/minecraft/client/gui/screen/Screen;DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::afterMouseClickedEvent([ZLnet/minecraft/client/gui/screen/Screen;DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::beforeMouseReleasedEvent([ZLnet/minecraft/client/gui/screen/Screen;DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::afterMouseReleasedEvent([ZLnet/minecraft/client/gui/screen/Screen;DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::beforeMouseScrollEvent(JDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZDDDDD)V does use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::afterMouseScrollEvent(JDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZDDDDD)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::afterMouseScrollEvent(JDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZDDDDD)V has 0 override(s) in child classes
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:MouseMixin from mod fabric-screen-api-v1->@Inject::afterMouseScrollEvent(JDDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ZDDDDD)V won't be passed a CallbackInfo as a result
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyboardMixin from fabric-screen-api-v1.mixins.json into net.minecraft.client.Keyboard
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:KeyboardMixin from mod fabric-screen-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:KeyboardMixin from mod fabric-screen-api-v1->@Inject::beforeKeyPressedEvent(ILnet/minecraft/client/gui/screen/Screen;[ZIIILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:KeyboardMixin from mod fabric-screen-api-v1->@Inject::afterKeyPressedEvent(ILnet/minecraft/client/gui/screen/Screen;[ZIIILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:KeyboardMixin from mod fabric-screen-api-v1->@Inject::beforeKeyReleasedEvent(ILnet/minecraft/client/gui/screen/Screen;[ZIIILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-screen-api-v1.mixins.json:KeyboardMixin from mod fabric-screen-api-v1->@Inject::afterKeyReleasedEvent(ILnet/minecraft/client/gui/screen/Screen;[ZIIILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LifecycledResourceManagerImplMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.LifecycledResourceManagerImpl
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:LifecycledResourceManagerImplMixin from mod fabric-resource-loader-v0->@Inject::init(Lnet/minecraft/resource/ResourceType;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api, currently enabled: [vanilla, fabric, fabric-api]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-base, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-lookup-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-biome-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-view-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-blockrenderlayer-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-tags-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-commands-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-content-registries-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-crash-report-info-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-attachment-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-generation-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-dimensions-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-entity-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-events-interaction-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-game-rule-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-group-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-key-binding-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-keybindings-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-lifecycle-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v3, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-message-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-model-loading-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-networking-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-object-builder-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-particles-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-recipe-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-registry-sync-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-indigo, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-registries-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-data-attachment-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-fluids-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-conditions-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-loader-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-handler-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-sound-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transfer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transitive-access-wideners-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabricloader, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled words, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-lifecycle-events-v1, words, fabric-convention-tags-v2, fabric-renderer-api-v1, fabric-command-api-v2, fabric-convention-tags-v1, fabric-model-loading-api-v1, fabric-data-attachment-api-v1, fabric-api-lookup-api-v1, fabric-entity-events-v1, fabric-object-builder-api-v1, fabric-block-view-api-v2, fabric-game-rule-api-v1, fabric-recipe-api-v1, fabric-networking-api-v1, fabric-client-tags-api-v1, fabric-item-api-v1, fabric-resource-conditions-api-v1, fabric-item-group-api-v1, fabric-api, fabric-data-generation-api-v1, fabric-loot-api-v3, fabric-content-registries-v0, fabric-block-api-v1, fabric-rendering-fluids-v1, fabric-transfer-api-v1, fabric-resource-loader-v0, fabric-events-interaction-v0, fabric-screen-handler-api-v1, fabric-rendering-v1, fabric-renderer-registries-v1, fabric-renderer-indigo, fabric-blockrenderlayer-v1, fabric-api-base, fabricloader, fabric-sound-api-v1, fabric-gametest-api-v1, fabric-biome-api-v1, fabric-loot-api-v2, fabric-commands-v0, fabric-dimensions-v1, fabric-keybindings-v0, fabric-key-binding-api-v1, fabric-crash-report-info-v1, fabric-screen-api-v1, fabric-rendering-data-attachment-v1, fabric-rendering-v0, fabric-command-api-v1, fabric-message-api-v1, fabric-transitive-access-wideners-v1, fabric-registry-sync-v0, fabric-particles-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api, currently enabled: [vanilla, fabric, fabric-api]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-base, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-lookup-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-biome-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-view-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-blockrenderlayer-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-tags-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-commands-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-content-registries-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-crash-report-info-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-attachment-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-generation-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-dimensions-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-entity-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-events-interaction-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-game-rule-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-group-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-key-binding-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-keybindings-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-lifecycle-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v3, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-message-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-model-loading-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-networking-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-object-builder-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-particles-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-recipe-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-registry-sync-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-indigo, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-registries-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-data-attachment-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-fluids-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-conditions-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-loader-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-handler-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-sound-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transfer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transitive-access-wideners-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabricloader, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled words, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:09:44] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.resource.language.LanguageManager
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.texture.TextureManager
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.sound.SoundManager
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing modification.DynamicRegistryManagerImmutableImplMixin from fabric-biome-api-v1.mixins.json into net.minecraft.registry.DynamicRegistryManager$ImmutableImpl
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:modification.DynamicRegistryManagerImmutableImplMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SoundSystemMixin from fabric-sound-api-v1.mixins.json into net.minecraft.client.sound.SoundSystem
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-sound-api-v1.mixins.json:SoundSystemMixin from mod fabric-sound-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing FontManagerMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.font.FontManager
[19:09:44] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:FontManagerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockColorsMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.color.block.BlockColors
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockColorsMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockColorsMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.color.block.BlockColors
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockColorsMixin from mod fabric-rendering-v1->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:BlockColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemColorsMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.color.item.ItemColors
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ItemColorsMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemColorsMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.color.item.ItemColors
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemColorsMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ItemColorsMixin from mod fabric-rendering-v1->@Inject::create(Lnet/minecraft/client/color/block/BlockColors;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemColorsMixin from mod fabric-registry-sync-v0->@Inject::create(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BakedModelManagerMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.BakedModelManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$loadModelPluginData$0(Ljava/util/function/BiFunction;Lnet/minecraft/util/Pair;Ljava/util/List;)Lnet/minecraft/client/render/model/ModelLoader; to md263364$fabric-model-loading-api-v1$lambda$loadModelPluginData$0$0 in fabric-model-loading-api-v1.mixins.json:BakedModelManagerMixin from mod fabric-model-loading-api-v1
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.model.BakedModelManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing TexturedRenderLayersMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.render.TexturedRenderLayers
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:TexturedRenderLayersMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:TexturedRenderLayersMixin from mod fabric-object-builder-api-v1->@Inject::modifyTextureId(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:TexturedRenderLayersMixin from mod fabric-object-builder-api-v1->@Inject::modifyHangingTextureId(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerClientMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.render.block.BlockRenderManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:KeyedResourceReloadListenerClientMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BuiltinModelItemRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.item.BuiltinModelItemRenderer
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BuiltinModelItemRendererMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BuiltinModelItemRendererMixin from mod fabric-rendering-v1->@Inject::fabric_onRender(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ItemModelsMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.render.item.ItemModels
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemModelsMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemModelsMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/render/model/BakedModelManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemModelsMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/render/model/BakedModelManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ItemModelsMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/render/model/BakedModelManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ModelLoaderMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.ModelLoader
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$allowRecursiveLoading$0(Lnet/minecraft/util/Identifier;)Ljava/lang/String; to md263364$fabric-model-loading-api-v1$lambda$allowRecursiveLoading$0$0 in fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1->@Inject::afterMissingModelInit(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/util/profiler/Profiler;Ljava/util/Map;Ljava/util/Map;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1->@Inject::afterMissingModelInit(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/util/profiler/Profiler;Ljava/util/Map;Ljava/util/Map;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1->@Inject::afterMissingModelInit(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/util/profiler/Profiler;Ljava/util/Map;Ljava/util/Map;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderMixin from mod fabric-model-loading-api-v1->@Inject::allowRecursiveLoading(Lnet/minecraft/util/Identifier;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing client.BakedModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.BakedModel
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockModelRendererMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.block.BlockModelRenderer
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:BlockModelRendererMixin from mod fabric-renderer-indigo->@Inject::hookRender(Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/client/render/model/BakedModel;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;ZLnet/minecraft/util/math/random/Random;JILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:BlockModelRendererMixin from mod fabric-renderer-indigo->@Inject::onInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:BlockModelRendererMixin from mod fabric-renderer-indigo->@Inject::onInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:BlockModelRendererMixin from mod fabric-renderer-indigo->@Inject::onInit(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing FluidRendererMixin from fabric-rendering-fluids-v1.mixins.json into net.minecraft.client.render.block.FluidRenderer
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onResourceReloadReturn(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-fluids-v1.mixins.json:FluidRendererMixin from mod fabric-rendering-fluids-v1->@Inject::onHeadRender(Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/block/BlockState;Lnet/minecraft/fluid/FluidState;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing HeldItemRendererMixin from fabric-item-api-v1.client.mixins.json into net.minecraft.client.render.item.HeldItemRenderer
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:HeldItemRendererMixin from mod fabric-item-api-v1->@Inject::modifyProgressAnimation(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.particle.ParticleManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerMixin from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerAccessor from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerAccessor from mod fabric-particles-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ParticleManagerMixin from mod fabric-registry-sync-v0->@Inject::onInit(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/texture/TextureManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerMixin from mod fabric-particles-v1->@Inject::onRegisterDefaultFactories(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockDustParticleMixin from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.BlockDustParticle
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:BlockDustParticleMixin from mod fabric-particles-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ParticleManagerAccessor$SimpleSpriteProviderAccessor from fabric-particles-v1.client.mixins.json into net.minecraft.client.particle.ParticleManager$SimpleSpriteProvider
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-particles-v1.client.mixins.json:ParticleManagerAccessor$SimpleSpriteProviderAccessor from mod fabric-particles-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 0, new limit 9360.
[19:09:45] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 0, new limit 20.
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing InGameHudMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gui.hud.InGameHud
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:InGameHudMixin from mod fabric-rendering-v1->@Inject::render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DebugHudMixin from fabric-renderer-api-v1.debughud.mixins.json into net.minecraft.client.gui.hud.DebugHud
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.debughud.mixins.json:DebugHudMixin from mod fabric-renderer-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.debughud.mixins.json:DebugHudMixin from mod fabric-renderer-api-v1->@Inject::getLeftText(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.debughud.mixins.json:DebugHudMixin from mod fabric-renderer-api-v1->@Inject::getLeftText(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing shader.ShaderProgramImportProcessorMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gl.ShaderProgram$1
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::captureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::captureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::captureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:shader.ShaderProgramImportProcessorMixin from mod fabric-rendering-v1->@Inject::uncaptureImport(ZLjava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ResourceMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.Resource
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:ResourceMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing MessageHandlerMixin from fabric-message-api-v1.client.mixins.json into net.minecraft.client.network.message.MessageHandler
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onSignedChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/text/Text;Lcom/mojang/authlib/GameProfile;ZLjava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onFilteredSignedChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/text/Text;Lcom/mojang/authlib/GameProfile;ZLjava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_onProfilelessChatMessage(Lnet/minecraft/network/message/MessageType$Parameters;Lnet/minecraft/text/Text;Ljava/time/Instant;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.client.mixins.json:MessageHandlerMixin from mod fabric-message-api-v1->@Inject::fabric_allowGameMessage(Lnet/minecraft/text/Text;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:45] [Render thread/INFO] (net.minecraft.resource.ReloadableResourceManagerImpl) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SimpleResourceReloadMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.resource.SimpleResourceReload
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SimpleResourceReloadMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SimpleResourceReloadMixin from mod fabric-resource-loader-v0->@Inject::method_40087(Lnet/minecraft/resource/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:09:45] [Worker-Main-4/DEBUG] (FabricLoader/Mixin) Mixing BlockStatesLoaderMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.BlockStatesLoader
[19:09:45] [Worker-Main-4/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BlockStatesLoaderMixin from mod fabric-model-loading-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Worker-Main-4/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:BlockStatesLoaderMixin from mod fabric-model-loading-api-v1->@Inject::onHeadLoadBlockStates(Lnet/minecraft/util/Identifier;Lnet/minecraft/state/StateManager;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:45] [Worker-Main-3/DEBUG] (FabricLoader/Mixin) Mixing AtlasSourceManagerAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.texture.atlas.AtlasSourceManager
[19:09:45] [Worker-Main-3/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:AtlasSourceManagerAccessor from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:45] [Worker-Main-3/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getSourceTypeById()Lcom/google/common/collect/BiMap; to getSourceTypeById$fabric-rendering-v1_$md$263364$0 in fabric-rendering-v1.mixins.json:AtlasSourceManagerAccessor from mod fabric-rendering-v1
[19:09:45] [Worker-Main-12/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_jp_patch-15.1.05.hex, loading
[19:09:45] [Worker-Main-13/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_all_no_pua-15.1.05.hex, loading
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Mixing ModelLoaderBakerImplMixin from fabric-model-loading-api-v1.mixins.json into net.minecraft.client.render.model.ModelLoader$BakerImpl
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-model-loading-api-v1.mixins.json:ModelLoaderBakerImplMixin from mod fabric-model-loading-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Mixing client.MultipartBakedModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.MultipartBakedModel
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$emitBlockQuads$0(Lnet/minecraft/util/math/random/Random;J)Lnet/minecraft/util/math/random/Random; to md263364$fabric-renderer-api-v1$lambda$emitBlockQuads$0$0 in fabric-renderer-api-v1.mixins.json:client.MultipartBakedModelMixin from mod fabric-renderer-api-v1
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.MultipartBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.MultipartBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.MultipartBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Mixing client.WeightedBakedModelMixin from fabric-renderer-api-v1.mixins.json into net.minecraft.client.render.model.WeightedBakedModel
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$emitItemQuads$1(Ljava/util/function/Supplier;)Lnet/minecraft/util/math/random/Random; to md263364$fabric-renderer-api-v1$lambda$emitItemQuads$1$0 in fabric-renderer-api-v1.mixins.json:client.WeightedBakedModelMixin from mod fabric-renderer-api-v1
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$emitBlockQuads$0(Ljava/util/function/Supplier;)Lnet/minecraft/util/math/random/Random; to md263364$fabric-renderer-api-v1$lambda$emitBlockQuads$0$1 in fabric-renderer-api-v1.mixins.json:client.WeightedBakedModelMixin from mod fabric-renderer-api-v1
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.WeightedBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.WeightedBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:09:46] [Worker-Main-14/DEBUG] (FabricLoader/Mixin) fabric-renderer-api-v1.mixins.json:client.WeightedBakedModelMixin from mod fabric-renderer-api-v1->@Inject::onInit(Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:09:46] [Render thread/WARN] (net.minecraft.client.sound.SoundSystem) Missing sound for event: minecraft:item.goat_horn.play
[19:09:46] [Render thread/WARN] (net.minecraft.client.sound.SoundSystem) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[19:09:46] [Render thread/INFO] (net.minecraft.client.sound.SoundEngine) OpenAL initialized on device OpenAL Soft on 扬声器 (SIMGOT GEW1)
[19:09:46] [Render thread/INFO] (net.minecraft.client.sound.SoundSystem) Sound engine started
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EntityModelsMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.model.EntityModels
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityModelsMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityModelsMixin from mod fabric-rendering-v1->@Inject::registerExtraModelData(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lcom/google/common/collect/ImmutableMap$Builder;)V doesn't use it's CallbackInfoReturnable
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EntityModelLayersMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.render.entity.model.EntityModelLayers
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EntityModelLayersAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.model.EntityModelLayers
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityModelLayersAccessor from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getLayers()Ljava/util/Set; to getLayers$fabric-rendering-v1_$md$263364$0 in fabric-rendering-v1.mixins.json:EntityModelLayersAccessor from mod fabric-rendering-v1
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1->@Inject::createSign(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:EntityModelLayersMixin from mod fabric-object-builder-api-v1->@Inject::createHangingSign(Lnet/minecraft/block/WoodType;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BlockEntityRendererFactoriesMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.block.entity.BlockEntityRendererFactories
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockEntityRendererFactoriesMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0(Lnet/minecraft/block/entity/BlockEntityType;Lnet/minecraft/client/render/block/entity/BlockEntityRendererFactory;)V to md263364$fabric-rendering-v1$lambda$init$0$0 in fabric-rendering-v1.mixins.json:BlockEntityRendererFactoriesMixin from mod fabric-rendering-v1
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:BlockEntityRendererFactoriesMixin from mod fabric-rendering-v1->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EntityRenderersMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.EntityRenderers
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityRenderersMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$onRegisterRenderers$0(Lnet/minecraft/entity/EntityType;Lnet/minecraft/client/render/entity/EntityRendererFactory;)V to md263364$fabric-rendering-v1$lambda$onRegisterRenderers$0$0 in fabric-rendering-v1.mixins.json:EntityRenderersMixin from mod fabric-rendering-v1
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:EntityRenderersMixin from mod fabric-rendering-v1->@Inject::onRegisterRenderers(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LivingEntityRendererAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.LivingEntityRenderer
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:LivingEntityRendererAccessor from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ArmorFeatureRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.feature.ArmorFeatureRenderer
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:ArmorFeatureRendererMixin from mod fabric-rendering-v1->@Inject::renderArmor(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/entity/EquipmentSlot;ILnet/minecraft/client/render/entity/model/BipedEntityModel;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CapeFeatureRendererMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.render.entity.feature.CapeFeatureRenderer
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:CapeFeatureRendererMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:09:47] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:CapeFeatureRendererMixin from mod fabric-rendering-v1->@Inject::injectCapeRenderCheck(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/network/AbstractClientPlayerEntity;FFFFFFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[19:09:47] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[19:09:47] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Shader rendertype_entity_translucent_emissive could not find sampler named Sampler2 in the specified shader program.
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api, currently enabled: [vanilla, fabric, fabric-api]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-base, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-api-lookup-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-biome-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-block-view-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-blockrenderlayer-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-client-tags-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-command-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-commands-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-content-registries-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-crash-report-info-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-attachment-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-data-generation-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-dimensions-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-entity-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-events-interaction-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-game-rule-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-item-group-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-key-binding-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-keybindings-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-lifecycle-events-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v2, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-loot-api-v3, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-message-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-model-loading-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-networking-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-object-builder-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-particles-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-recipe-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-registry-sync-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-indigo, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-renderer-registries-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-data-attachment-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-fluids-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-rendering-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-conditions-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-resource-loader-v0, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-screen-handler-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-sound-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transfer-api-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-transitive-access-wideners-v1, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabricloader, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled words, currently enabled: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:10:03] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words]
[19:10:03] [Render thread/INFO] (net.minecraft.resource.ReloadableResourceManagerImpl) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words
[19:10:03] [Worker-Main-13/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_all_no_pua-15.1.05.hex, loading
[19:10:03] [Worker-Main-17/INFO] (net.minecraft.client.font.UnihexFont) Found unifont_jp_patch-15.1.05.hex, loading
[19:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameOptionsWriteVisitorMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.option.GameOptions$3
[19:10:03] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:GameOptionsWriteVisitorMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:04] [Render thread/WARN] (net.minecraft.client.sound.SoundSystem) Missing sound for event: minecraft:item.goat_horn.play
[19:10:04] [Render thread/WARN] (net.minecraft.client.sound.SoundSystem) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[19:10:04] [Render thread/INFO] (net.minecraft.client.sound.SoundEngine) OpenAL initialized on device OpenAL Soft on 扬声器 (SIMGOT GEW1)
[19:10:04] [Render thread/INFO] (net.minecraft.client.sound.SoundSystem) Sound engine started
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[19:10:04] [Render thread/INFO] (net.minecraft.client.texture.SpriteAtlasTexture) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[19:10:04] [Render thread/WARN] (net.minecraft.client.gl.ShaderProgram) Shader rendertype_entity_translucent_emissive could not find sampler named Sampler2 in the specified shader program.
[19:10:14] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing TooltipComponentMixin from fabric-rendering-v1.mixins.json into net.minecraft.client.gui.tooltip.TooltipComponent
[19:10:14] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:TooltipComponentMixin from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:14] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:TooltipComponentMixin from mod fabric-rendering-v1->@Inject::convertCustomTooltipData(Lnet/minecraft/item/tooltip/TooltipData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CreateWorldScreenMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.gui.screen.world.CreateWorldScreen
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:CreateWorldScreenMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:CreateWorldScreenMixin from mod fabric-resource-loader-v0->@Inject::onScanPacks(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:CreateWorldScreenMixin from mod fabric-resource-loader-v0->@Inject::onScanPacks(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:CreateWorldScreenMixin from mod fabric-resource-loader-v0->@Inject::onScanPacks(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DataPackContentsMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.DataPackContents
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:DataPackContentsMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DataPackContentsMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.server.DataPackContents
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:DataPackContentsMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:DataPackContentsMixin from mod fabric-lifecycle-events-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:DataPackContentsMixin from mod fabric-lifecycle-events-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:DataPackContentsMixin from mod fabric-lifecycle-events-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:DataPackContentsMixin from mod fabric-resource-conditions-api-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:DataPackContentsMixin from mod fabric-resource-conditions-api-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:DataPackContentsMixin from mod fabric-resource-conditions-api-v1->@Inject::hookRefresh(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:DataPackContentsMixin from mod fabric-resource-conditions-api-v1->@Inject::hookReload(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/registry/CombinedDynamicRegistries;Lnet/minecraft/resource/featuretoggle/FeatureSet;Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;ILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SaveLoadingMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.server.SaveLoading
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SaveLoadingMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayerInteractionManagerMixin from fabric-events-interaction-v0.mixins.json into net.minecraft.server.network.ServerPlayerInteractionManager
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::startBlockBreak(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/network/packet/c2s/play/PlayerActionC2SPacket$Action;Lnet/minecraft/util/math/Direction;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::interactBlock(Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::interactItem(Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/Hand;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::breakBlock(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/block/Block;Lnet/minecraft/block/BlockState;)V does use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/block/Block;Lnet/minecraft/block/BlockState;Z)V doesn't use it's CallbackInfoReturnable
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/block/Block;Lnet/minecraft/block/BlockState;Z)V has 0 override(s) in child classes
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:ServerPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/block/Block;Lnet/minecraft/block/BlockState;Z)V won't be passed a CallbackInfoReturnable as a result
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRulesAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRulesAccessor from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callRegister(Ljava/lang/String;Lnet/minecraft/world/GameRules$Category;Lnet/minecraft/world/GameRules$Type;)Lnet/minecraft/world/GameRules$Key; to callRegister$fabric-game-rule-api-v1_$md$263364$0 in fabric-game-rule-api-v1.mixins.json:GameRulesAccessor from mod fabric-game-rule-api-v1
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getRuleTypes()Ljava/util/Map; to getRuleTypes$fabric-game-rule-api-v1_$md$263364$1 in fabric-game-rule-api-v1.mixins.json:GameRulesAccessor from mod fabric-game-rule-api-v1
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRulesKeyMixin from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$Key
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRulesKeyMixin from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRulesBooleanRuleAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$BooleanRule
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRulesBooleanRuleAccessor from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method invokeCreate(ZLjava/util/function/BiConsumer;)Lnet/minecraft/world/GameRules$Type; to invokeCreate$fabric-game-rule-api-v1_$md$263364$0 in fabric-game-rule-api-v1.mixins.json:GameRulesBooleanRuleAccessor from mod fabric-game-rule-api-v1
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing GameRulesIntRuleAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.world.GameRules$IntRule
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRulesIntRuleAccessor from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing RegistryLoaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.registry.RegistryLoader
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:RegistryLoaderMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing RegistryLoaderMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.RegistryLoader
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistryLoaderMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$static$0()Ljava/lang/Boolean; to md263364$fabric-registry-sync-v0$lambda$static$0$0 in fabric-registry-sync-v0.mixins.json:RegistryLoaderMixin from mod fabric-registry-sync-v0
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:RegistryLoaderMixin from mod fabric-resource-conditions-api-v1->@Inject::checkResourceCondition(Lnet/minecraft/registry/MutableRegistry;Lcom/mojang/serialization/Decoder;Lnet/minecraft/registry/RegistryOps;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/resource/Resource;Lnet/minecraft/registry/entry/RegistryEntryInfo;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:16] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:RegistryLoaderMixin from mod fabric-registry-sync-v0->@Inject::beforeLoad(Ljava/lang/Object;Lnet/minecraft/registry/DynamicRegistryManager;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DimensionOptionsRegistryHolderMixin from fabric-dimensions-v1.mixins.json into net.minecraft.world.dimension.DimensionOptionsRegistryHolder
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-dimensions-v1.mixins.json:DimensionOptionsRegistryHolderMixin from mod fabric-dimensions-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ReloadableRegistriesMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.registry.ReloadableRegistries
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:ReloadableRegistriesMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ReloadableRegistriesMixin from fabric-loot-api-v3.mixins.json into net.minecraft.registry.ReloadableRegistries
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:ReloadableRegistriesMixin from mod fabric-loot-api-v3: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$modifyLootTable$1(Lnet/minecraft/util/Identifier;Lnet/minecraft/registry/RegistryOps;Ljava/lang/Object;)Ljava/lang/Object; to md263364$fabric-loot-api-v3$lambda$modifyLootTable$1$0 in fabric-loot-api-v3.mixins.json:ReloadableRegistriesMixin from mod fabric-loot-api-v3
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$removeOps$0(Lnet/minecraft/registry/RegistryOps;Ljava/util/List;)Ljava/util/List; to md263364$fabric-loot-api-v3$lambda$removeOps$0$1 in fabric-loot-api-v3.mixins.json:ReloadableRegistriesMixin from mod fabric-loot-api-v3
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:ReloadableRegistriesMixin from mod fabric-resource-conditions-api-v1->@Inject::storeWrapperLookup(Lnet/minecraft/registry/CombinedDynamicRegistries;Lnet/minecraft/resource/ResourceManager;Ljava/util/concurrent/Executor;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:ReloadableRegistriesMixin from mod fabric-resource-conditions-api-v1->@Inject::applyConditions(Lnet/minecraft/loot/LootDataType;Lnet/minecraft/registry/RegistryOps;Lnet/minecraft/registry/MutableRegistry;Lnet/minecraft/util/Identifier;Lcom/google/gson/JsonElement;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:17] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:ReloadableRegistriesMixin from mod fabric-loot-api-v3->@Inject::onLootTablesLoaded(Lnet/minecraft/loot/LootDataType;Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/registry/RegistryOps;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:17] [Worker-Main-11/DEBUG] (FabricLoader/Mixin) Mixing JsonDataLoaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.resource.JsonDataLoader
[19:10:17] [Worker-Main-11/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:JsonDataLoaderMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-11/DEBUG] (FabricLoader/Mixin) Mixing JsonDataLoaderMixin from fabric-loot-api-v3.mixins.json into net.minecraft.resource.JsonDataLoader
[19:10:17] [Worker-Main-11/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:JsonDataLoaderMixin from mod fabric-loot-api-v3: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-11/DEBUG] (FabricLoader/Mixin) fabric-loot-api-v3.mixins.json:JsonDataLoaderMixin from mod fabric-loot-api-v3->@Inject::fillSourceMap(Lnet/minecraft/resource/ResourceManager;Ljava/lang/String;Lcom/google/gson/Gson;Ljava/util/Map;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing RecipeManagerMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.recipe.RecipeManager
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:RecipeManagerMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.recipe.RecipeManager
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:KeyedResourceReloadListenerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing TagManagerLoaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.registry.tag.TagManagerLoader
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:TagManagerLoaderMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.registry.tag.TagManagerLoader
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:KeyedResourceReloadListenerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:TagManagerLoaderMixin from mod fabric-resource-conditions-api-v1->@Inject::hookApply(Ljava/util/List;Ljava/lang/Void;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:TagManagerLoaderMixin from mod fabric-resource-conditions-api-v1->@Inject::hookApply(Ljava/util/List;Ljava/lang/Void;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:TagManagerLoaderMixin from mod fabric-resource-conditions-api-v1->@Inject::hookApply(Ljava/util/List;Ljava/lang/Void;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing CommandManagerMixin from fabric-command-api-v2.mixins.json into net.minecraft.server.command.CommandManager
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:CommandManagerMixin from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing CommandManagerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.command.CommandManager
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CommandManagerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing CommandManagerMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.server.command.CommandManager
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:CommandManagerMixin from mod fabric-gametest-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:CommandManagerMixin from mod fabric-command-api-v2->@Inject::fabric_addCommands(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:CommandManagerMixin from mod fabric-command-api-v2->@Inject::fabric_addCommands(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:CommandManagerMixin from mod fabric-command-api-v2->@Inject::fabric_addCommands(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CommandManagerMixin from mod fabric-networking-api-v1->@Inject::init(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CommandManagerMixin from mod fabric-networking-api-v1->@Inject::init(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CommandManagerMixin from mod fabric-networking-api-v1->@Inject::init(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:CommandManagerMixin from mod fabric-gametest-api-v1->@Inject::construct(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:CommandManagerMixin from mod fabric-gametest-api-v1->@Inject::construct(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:CommandManagerMixin from mod fabric-gametest-api-v1->@Inject::construct(Lnet/minecraft/server/command/CommandManager$RegistrationEnvironment;Lnet/minecraft/command/CommandRegistryAccess;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing DatapackCommandMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.command.DatapackCommand
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:DatapackCommandMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$filterDisabledPackSuggestions$2(Lnet/minecraft/resource/ResourcePackProfile;)Z to md263364$fabric-resource-loader-v0$lambda$filterDisabledPackSuggestions$2$0 in fabric-resource-loader-v0.mixins.json:DatapackCommandMixin from mod fabric-resource-loader-v0
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$filterEnabledPackSuggestions$1(Lnet/minecraft/resource/ResourcePackProfile;)Z to md263364$fabric-resource-loader-v0$lambda$filterEnabledPackSuggestions$1$1 in fabric-resource-loader-v0.mixins.json:DatapackCommandMixin from mod fabric-resource-loader-v0
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$static$0(Ljava/lang/Object;)Lcom/mojang/brigadier/Message; to md263364$fabric-resource-loader-v0$lambda$static$0$2 in fabric-resource-loader-v0.mixins.json:DatapackCommandMixin from mod fabric-resource-loader-v0
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:DatapackCommandMixin from mod fabric-resource-loader-v0->@Inject::errorOnInternalPack(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing EnchantCommandMixin from fabric-item-api-v1.mixins.json into net.minecraft.server.command.EnchantCommand
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:EnchantCommandMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing GameRuleCommandAccessor from fabric-game-rule-api-v1.mixins.json into net.minecraft.server.command.GameRuleCommand
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRuleCommandAccessor from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method invokeExecuteSet(Lcom/mojang/brigadier/context/CommandContext;Lnet/minecraft/world/GameRules$Key;)I to invokeExecuteSet$fabric-game-rule-api-v1_$md$263364$0 in fabric-game-rule-api-v1.mixins.json:GameRuleCommandAccessor from mod fabric-game-rule-api-v1
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method invokeExecuteQuery(Lnet/minecraft/server/command/ServerCommandSource;Lnet/minecraft/world/GameRules$Key;)I to invokeExecuteQuery$fabric-game-rule-api-v1_$md$263364$1 in fabric-game-rule-api-v1.mixins.json:GameRuleCommandAccessor from mod fabric-game-rule-api-v1
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing GameRuleCommandVisitorMixin from fabric-game-rule-api-v1.mixins.json into net.minecraft.server.command.GameRuleCommand$1
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRuleCommandVisitorMixin from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.mixins.json:GameRuleCommandVisitorMixin from mod fabric-game-rule-api-v1->@Inject::onRegisterCommand(Lnet/minecraft/world/GameRules$Key;Lnet/minecraft/world/GameRules$Type;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing HelpCommandAccessor from fabric-command-api-v2.mixins.json into net.minecraft.server.command.HelpCommand
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.mixins.json:HelpCommandAccessor from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getFailedException()Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType; to getFailedException$fabric-command-api-v2_$md$263364$0 in fabric-command-api-v2.mixins.json:HelpCommandAccessor from mod fabric-command-api-v2
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing TestCommandMixin from fabric-gametest-api-v1.mixins.json into net.minecraft.server.command.TestCommand
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-gametest-api-v1.mixins.json:TestCommandMixin from mod fabric-gametest-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing ServerAdvancementLoaderMixin from fabric-resource-conditions-api-v1.mixins.json into net.minecraft.server.ServerAdvancementLoader
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-conditions-api-v1.mixins.json:ServerAdvancementLoaderMixin from mod fabric-resource-conditions-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.ServerAdvancementLoader
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:KeyedResourceReloadListenerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) Mixing KeyedResourceReloadListenerMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.function.FunctionLoader
[19:10:17] [Worker-Main-17/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:KeyedResourceReloadListenerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:17] [Render thread/INFO] (net.minecraft.recipe.RecipeManager) Loaded 1290 recipes
[19:10:17] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 1399 advancements
[19:10:18] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing EditGameRulesScreenAccessor from fabric-game-rule-api-v1.client.mixins.json into net.minecraft.client.gui.screen.world.EditGameRulesScreen
[19:10:18] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-game-rule-api-v1.client.mixins.json:EditGameRulesScreenAccessor from mod fabric-game-rule-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:23] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:24] [Render thread/INFO] (net.minecraft.recipe.RecipeManager) Loaded 1290 recipes
[19:10:24] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 1399 advancements
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:50] [Render thread/INFO] (net.minecraft.recipe.RecipeManager) Loaded 1290 recipes
[19:10:50] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 1399 advancements
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing PlayerManagerMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.PlayerManager
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing PlayerManagerMixin from fabric-entity-events-v1.mixins.json into net.minecraft.server.PlayerManager
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerManagerMixin from mod fabric-entity-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing PlayerManagerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.PlayerManager
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PlayerManagerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing PlayerManagerMixin from fabric-message-api-v1.mixins.json into net.minecraft.server.PlayerManager
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:PlayerManagerMixin from mod fabric-message-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnPlayerConnect(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnPlayerConnect(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnPlayerConnect(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnDataPacksReloaded(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnDataPacksReloaded(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:PlayerManagerMixin from mod fabric-lifecycle-events-v1->@Inject::hookOnDataPacksReloaded(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-entity-events-v1.mixins.json:PlayerManagerMixin from mod fabric-entity-events-v1->@Inject::afterRespawn(Lnet/minecraft/server/network/ServerPlayerEntity;ZLnet/minecraft/entity/Entity$RemovalReason;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PlayerManagerMixin from mod fabric-networking-api-v1->@Inject::handlePlayerConnection(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PlayerManagerMixin from mod fabric-networking-api-v1->@Inject::handlePlayerConnection(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PlayerManagerMixin from mod fabric-networking-api-v1->@Inject::handlePlayerConnection(Lnet/minecraft/network/ClientConnection;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/server/network/ConnectedClientData;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:PlayerManagerMixin from mod fabric-message-api-v1->@Inject::onSendChatMessage(Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/server/network/ServerPlayerEntity;Lnet/minecraft/network/message/MessageType$Parameters;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:PlayerManagerMixin from mod fabric-message-api-v1->@Inject::onSendGameMessage(Lnet/minecraft/text/Text;Ljava/util/function/Function;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-message-api-v1.mixins.json:PlayerManagerMixin from mod fabric-message-api-v1->@Inject::onSendCommandMessage(Lnet/minecraft/network/message/SignedMessage;Lnet/minecraft/server/command/ServerCommandSource;Lnet/minecraft/network/message/MessageType$Parameters;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing BrewingRecipeRegistryBuilderMixin from fabric-content-registries-v0.mixins.json into net.minecraft.recipe.BrewingRecipeRegistry$Builder
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:BrewingRecipeRegistryBuilderMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:BrewingRecipeRegistryBuilderMixin from mod fabric-content-registries-v0->@Inject::build(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:BrewingRecipeRegistryBuilderMixin from mod fabric-content-registries-v0->@Inject::build(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:10:54] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:BrewingRecipeRegistryBuilderMixin from mod fabric-content-registries-v0->@Inject::build(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:10:54] [Render thread/INFO] (net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl) Applied 0 biome modifications to 0 of 64 new biomes in 1.343 ms
[19:10:54] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Starting integrated minecraft server version 1.21.1
[19:10:54] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Generating keypair
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkGeneratingMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.world.chunk.ChunkGenerating
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ChunkGeneratingMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ChunkGeneratingMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkLoad(Lnet/minecraft/world/chunk/Chunk;Lnet/minecraft/world/chunk/ChunkGenerationContext;Lnet/minecraft/world/chunk/AbstractChunkHolder;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ServerWorldServerEntityHandlerMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.world.ServerWorld$ServerEntityHandler
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldServerEntityHandlerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldServerEntityHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeEntityLoadEvent(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerWorldServerEntityHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeEntityUnloadEvent(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing PersistentStateManagerMixin from fabric-object-builder-v1.mixins.json into net.minecraft.world.PersistentStateManager
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.mixins.json:PersistentStateManagerMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ServerChunkLoadingManagerMixin from fabric-lifecycle-events-v1.mixins.json into net.minecraft.server.world.ServerChunkLoadingManager
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerChunkLoadingManagerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.ServerChunkLoadingManagerAccessor from fabric-networking-api-v1.mixins.json into net.minecraft.server.world.ServerChunkLoadingManager
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:accessor.ServerChunkLoadingManagerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerChunkLoadingManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/server/world/ChunkHolder;JLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerChunkLoadingManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/server/world/ChunkHolder;JLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.mixins.json:ServerChunkLoadingManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/server/world/ChunkHolder;JLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing NoiseConfigMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.gen.noise.NoiseConfig
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:NoiseConfigMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:NoiseConfigMixin from mod fabric-biome-api-v1->@Inject::init(Lnet/minecraft/world/gen/chunk/ChunkGeneratorSettings;Lnet/minecraft/registry/RegistryEntryLookup;JLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing MultiNoiseUtilMultiNoiseSamplerMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.biome.source.util.MultiNoiseUtil$MultiNoiseSampler
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:MultiNoiseUtilMultiNoiseSamplerMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkSectionMixin from fabric-block-api-v1.mixins.json into net.minecraft.world.chunk.ChunkSection
[19:10:54] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-block-api-v1.mixins.json:ChunkSectionMixin from mod fabric-block-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) Mixing ChunkNoiseSamplerMixin from fabric-biome-api-v1.mixins.json into net.minecraft.world.gen.chunk.ChunkNoiseSampler
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:ChunkNoiseSamplerMixin from mod fabric-biome-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:ChunkNoiseSamplerMixin from mod fabric-biome-api-v1->@Inject::init(ILnet/minecraft/world/gen/noise/NoiseConfig;IILnet/minecraft/world/gen/chunk/GenerationShapeConfig;Lnet/minecraft/world/gen/densityfunction/DensityFunctionTypes$Beardifying;Lnet/minecraft/world/gen/chunk/ChunkGeneratorSettings;Lnet/minecraft/world/gen/chunk/AquiferSampler$FluidLevelSampler;Lnet/minecraft/world/gen/chunk/Blender;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:ChunkNoiseSamplerMixin from mod fabric-biome-api-v1->@Inject::init(ILnet/minecraft/world/gen/noise/NoiseConfig;IILnet/minecraft/world/gen/chunk/GenerationShapeConfig;Lnet/minecraft/world/gen/densityfunction/DensityFunctionTypes$Beardifying;Lnet/minecraft/world/gen/chunk/ChunkGeneratorSettings;Lnet/minecraft/world/gen/chunk/AquiferSampler$FluidLevelSampler;Lnet/minecraft/world/gen/chunk/Blender;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:ChunkNoiseSamplerMixin from mod fabric-biome-api-v1->@Inject::init(ILnet/minecraft/world/gen/noise/NoiseConfig;IILnet/minecraft/world/gen/chunk/GenerationShapeConfig;Lnet/minecraft/world/gen/densityfunction/DensityFunctionTypes$Beardifying;Lnet/minecraft/world/gen/chunk/ChunkGeneratorSettings;Lnet/minecraft/world/gen/chunk/AquiferSampler$FluidLevelSampler;Lnet/minecraft/world/gen/chunk/Blender;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:55] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-biome-api-v1.mixins.json:ChunkNoiseSamplerMixin from mod fabric-biome-api-v1->@Inject::createMultiNoiseSampler(Lnet/minecraft/world/gen/noise/NoiseRouter;Ljava/util/List;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:56] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing WrapperProtoChunkMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.chunk.WrapperProtoChunk
[19:10:56] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:WrapperProtoChunkMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:56] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Preparing start region for dimension minecraft:overworld
[19:10:56] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：2%
[19:10:57] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：2%
[19:10:57] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：18%
[19:10:57] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) Mixing LandPathNodeMakerMixin from fabric-content-registries-v0.mixins.json into net.minecraft.entity.ai.pathing.LandPathNodeMaker
[19:10:57] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:LandPathNodeMakerMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:57] [Worker-Main-12/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:LandPathNodeMakerMixin from mod fabric-content-registries-v0->@Inject::getCommonNodeType(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:58] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：51%
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing accessor.EntityTrackerAccessor from fabric-networking-api-v1.mixins.json into net.minecraft.server.world.ServerChunkLoadingManager$EntityTracker
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:accessor.EntityTrackerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing EntityTrackerEntryMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.EntityTrackerEntry
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStartTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStartTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStartTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStopTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStopTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:EntityTrackerEntryMixin from mod fabric-networking-api-v1->@Inject::onStopTracking(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:58] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) Time elapsed: 1753 ms
[19:10:58] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Changing view distance to 12, from 10
[19:10:58] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Changing simulation distance to 12, from 0
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkSerializerMixin from fabric-data-attachment-api-v1.mixins.json into net.minecraft.world.ChunkSerializer
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ChunkSerializerMixin from mod fabric-data-attachment-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkSerializerMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.world.ChunkSerializer
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:ChunkSerializerMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:58] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-data-attachment-api-v1.mixins.json:ChunkSerializerMixin from mod fabric-data-attachment-api-v1->@Inject::writeChunkAttachments(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/world/chunk/Chunk;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:58] [Render thread/DEBUG] (io.netty.channel.MultithreadEventLoopGroup) -Dio.netty.eventLoopThreads: 48
[19:10:58] [Render thread/DEBUG] (io.netty.util.concurrent.GlobalEventExecutor) -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.InternalThreadLocalMap) -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.InternalThreadLocalMap) -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) -Dio.netty.noUnsafe: false
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) Java version: 21
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) sun.misc.Unsafe.theUnsafe: available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) sun.misc.Unsafe.copyMemory: available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) sun.misc.Unsafe.storeFence: available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) java.nio.Buffer.address: available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) direct buffer constructor: unavailable: Reflective setAccessible(true) disabled
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) java.nio.Bits.unaligned: available, true
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable: class io.netty.util.internal.PlatformDependent0$7 cannot access class jdk.internal.misc.Unsafe (in module java.base) because module java.base does not export jdk.internal.misc to unnamed module @158a8276
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent0) java.nio.DirectByteBuffer.<init>(long, {int,long}): unavailable
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) sun.misc.Unsafe: available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) maxDirectMemory: 8422162432 bytes (maybe)
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) -Dio.netty.tmpdir: C:\Users\hyper\AppData\Local\Temp (java.io.tmpdir)
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) -Dio.netty.bitMode: 64 (sun.arch.data.model)
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) Platform: Windows
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) -Dio.netty.maxDirectMemory: -1 bytes
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) -Dio.netty.uninitializedArrayAllocationThreshold: -1
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.CleanerJava9) java.nio.ByteBuffer.cleaner(): available
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) -Dio.netty.noPreferDirect: false
[19:10:58] [Render thread/DEBUG] (io.netty.channel.nio.NioEventLoop) -Dio.netty.noKeySetOptimization: false
[19:10:58] [Render thread/DEBUG] (io.netty.channel.nio.NioEventLoop) -Dio.netty.selectorAutoRebuildThreshold: 512
[19:10:58] [Render thread/DEBUG] (io.netty.util.internal.PlatformDependent) org.jctools-core.MpscChunkedArrayQueue: available
[19:10:58] [Render thread/DEBUG] (io.netty.channel.DefaultChannelId) -Dio.netty.processId: 47336 (auto-detected)
[19:10:58] [Render thread/DEBUG] (io.netty.util.NetUtil) -Djava.net.preferIPv4Stack: false
[19:10:58] [Render thread/DEBUG] (io.netty.util.NetUtil) -Djava.net.preferIPv6Addresses: false
[19:10:58] [Render thread/DEBUG] (io.netty.util.NetUtilInitializations) Loopback interface: loopback_0 (Software Loopback Interface 1, 0:0:0:0:0:0:0:1)
[19:10:58] [Render thread/DEBUG] (io.netty.util.NetUtil) Failed to get SOMAXCONN from sysctl and file \proc\sys\net\core\somaxconn. Default: 200
[19:10:58] [Render thread/DEBUG] (io.netty.channel.DefaultChannelId) -Dio.netty.machineId: bc:fc:e7:ff:fe:e2:5a:42 (auto-detected)
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.numHeapArenas: 48
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.numDirectArenas: 48
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.pageSize: 8192
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.maxOrder: 9
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.chunkSize: 4194304
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.smallCacheSize: 256
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.normalCacheSize: 64
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.maxCachedBufferCapacity: 32768
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.cacheTrimInterval: 8192
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.cacheTrimIntervalMillis: 0
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.useCacheForAllThreads: false
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.PooledByteBufAllocator) -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.ByteBufUtil) -Dio.netty.allocator.type: pooled
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.ByteBufUtil) -Dio.netty.threadLocalDirectBufferSize: 0
[19:10:59] [Render thread/DEBUG] (io.netty.buffer.ByteBufUtil) -Dio.netty.maxThreadLocalCharBufferSize: 16384
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ingredient.EncoderHandlerMixin from fabric-recipe-api-v1.mixins.json into net.minecraft.network.handler.EncoderHandler
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::capturePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::capturePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::capturePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-recipe-api-v1.mixins.json:ingredient.EncoderHandlerMixin from mod fabric-recipe-api-v1->@Inject::releasePacketEncoder(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;Lio/netty/buffer/ByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing PacketCodecDispatcherMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.handler.PacketCodecDispatcher
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PacketCodecDispatcherMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PacketCodecDispatcherMixin from mod fabric-networking-api-v1->@Inject::encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PacketCodecDispatcherMixin from mod fabric-networking-api-v1->@Inject::encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:PacketCodecDispatcherMixin from mod fabric-networking-api-v1->@Inject::encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LoginQueryResponseC2SPacketMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.c2s.login.LoginQueryResponseC2SPacket
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:LoginQueryResponseC2SPacketMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:LoginQueryResponseC2SPacketMixin from mod fabric-networking-api-v1->@Inject::readResponse(ILnet/minecraft/network/PacketByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing LoginQueryRequestS2CPacketMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:LoginQueryRequestS2CPacketMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:LoginQueryRequestS2CPacketMixin from mod fabric-networking-api-v1->@Inject::readPayload(Lnet/minecraft/util/Identifier;Lnet/minecraft/network/PacketByteBuf;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (io.netty.util.Recycler) -Dio.netty.recycler.maxCapacityPerThread: 4096
[19:10:59] [Render thread/DEBUG] (io.netty.util.Recycler) -Dio.netty.recycler.ratio: 8
[19:10:59] [Render thread/DEBUG] (io.netty.util.Recycler) -Dio.netty.recycler.chunkSize: 32
[19:10:59] [Render thread/DEBUG] (io.netty.util.Recycler) -Dio.netty.recycler.blocking: false
[19:10:59] [Render thread/DEBUG] (io.netty.util.Recycler) -Dio.netty.recycler.batchFastThreadLocalOnly: true
[19:10:59] [Netty Local Client IO #0/DEBUG] (io.netty.buffer.AbstractByteBuf) -Dio.netty.buffer.checkAccessible: true
[19:10:59] [Netty Local Client IO #0/DEBUG] (io.netty.buffer.AbstractByteBuf) -Dio.netty.buffer.checkBounds: true
[19:10:59] [Netty Local Client IO #0/DEBUG] (io.netty.util.ResourceLeakDetectorFactory) Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@64a0e48
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) Mixing ServerLoginNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerLoginNetworkHandler
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerLoginNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) Mixing accessor.ServerLoginNetworkHandlerAccessor from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerLoginNetworkHandler
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:accessor.ServerLoginNetworkHandlerAccessor from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerLoginNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleCustomPayloadReceivedAsync(Lnet/minecraft/network/packet/c2s/login/LoginQueryResponseC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadC2SPacketMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CustomPayloadC2SPacketMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$wrapCodec$0(Lnet/minecraft/network/PacketByteBuf;Lnet/minecraft/util/Identifier;)Lnet/minecraft/network/packet/CustomPayload$Type; to md263364$fabric-networking-api-v1$lambda$wrapCodec$0$0 in fabric-networking-api-v1.mixins.json:CustomPayloadC2SPacketMixin from mod fabric-networking-api-v1
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadPacketCodecMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.CustomPayload$1
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CustomPayloadPacketCodecMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Mixing SelectKnownPacksC2SPacketMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.network.packet.c2s.config.SelectKnownPacksC2SPacket
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SelectKnownPacksC2SPacketMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Mixing CustomPayloadS2CPacketMixin from fabric-networking-api-v1.mixins.json into net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:CustomPayloadS2CPacketMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$wrapConfigCodec$1(Lnet/minecraft/network/PacketByteBuf;Lnet/minecraft/util/Identifier;)Lnet/minecraft/network/packet/CustomPayload$Type; to md263364$fabric-networking-api-v1$lambda$wrapConfigCodec$1$0 in fabric-networking-api-v1.mixins.json:CustomPayloadS2CPacketMixin from mod fabric-networking-api-v1
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$wrapPlayCodec$0(Lnet/minecraft/network/RegistryByteBuf;Lnet/minecraft/util/Identifier;)Lnet/minecraft/network/packet/CustomPayload$Type; to md263364$fabric-networking-api-v1$lambda$wrapPlayCodec$0$1 in fabric-networking-api-v1.mixins.json:CustomPayloadS2CPacketMixin from mod fabric-networking-api-v1
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) Mixing SerializableRegistriesMixin from fabric-registry-sync-v0.mixins.json into net.minecraft.registry.SerializableRegistries
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SerializableRegistriesMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SerializableRegistriesMixin from mod fabric-registry-sync-v0->@Inject::filterNonSyncedEntries(Lnet/minecraft/registry/DynamicRegistryManager$Entry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Netty Local Client IO #0/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.mixins.json:SerializableRegistriesMixin from mod fabric-registry-sync-v0->@Inject::filterNonSyncedEntriesAgain(Ljava/util/Set;Lnet/minecraft/registry/RegistryLoader$Entry;Lcom/mojang/serialization/DynamicOps;Ljava/util/function/BiConsumer;Lnet/minecraft/registry/Registry;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:register"
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:register"
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) Mixing SynchronizeRegistriesTaskMixin from fabric-resource-loader-v0.mixins.json into net.minecraft.server.network.SynchronizeRegistriesTask
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0->@Inject::onSelectKnownPacks(Ljava/util/List;Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0->@Inject::syncRegistryAndTags(Ljava/util/function/Consumer;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0->@Inject::syncRegistryAndTags(Ljava/util/function/Consumer;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0->@Inject::syncRegistryAndTags(Ljava/util/function/Consumer;Ljava/util/Set;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Netty Server IO #1/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.mixins.json:SynchronizeRegistriesTaskMixin from mod fabric-resource-loader-v0->@Inject::sendPacket(Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "fabric:custom_ingredient_sync"
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "fabric:custom_ingredient_sync"
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "c:version"
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Negotiated common packet version 1
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "c:version"
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Negotiated common packet version 1
[19:10:59] [Netty Local Client IO #0/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "c:register"
[19:10:59] [Netty Local Client IO #0/DEBUG] (fabric-networking-api-v1) Received accepted channels from the server
[19:10:59] [Netty Server IO #1/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "c:register"
[19:10:59] [Netty Server IO #1/DEBUG] (fabric-networking-api-v1) Received accepted channels from the client for play phase
[19:10:59] [Render thread/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientDataPackManagerMixin from fabric-resource-loader-v0.client.mixins.json into net.minecraft.client.resource.ClientDataPackManager
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-resource-loader-v0.client.mixins.json:ClientDataPackManagerMixin from mod fabric-resource-loader-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: []
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: []
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: []
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:59] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:10:59] [Server thread/DEBUG] (SynchronizeRegistriesTaskMixin) Synchronizing registries with common known packs: [minecraft:core:1.21.1, fabric:fabric-convention-tags-v2:2.6.0+605f22ad6a, fabric:fabric-gametest-api-v1:2.0.4+6fc22b996a]
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientRegistriesDynamicRegistriesMixin from fabric-registry-sync-v0.client.mixins.json into net.minecraft.client.network.ClientRegistries$DynamicRegistries
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-registry-sync-v0.client.mixins.json:ClientRegistriesDynamicRegistriesMixin from mod fabric-registry-sync-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$skipEmptyRegistries$0(Lnet/minecraft/registry/RegistryLoader$Entry;)Z to md263364$fabric-registry-sync-v0$lambda$skipEmptyRegistries$0$0 in fabric-registry-sync-v0.client.mixins.json:ClientRegistriesDynamicRegistriesMixin from mod fabric-registry-sync-v0
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientTagLoaderMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.network.ClientTagLoader
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientTagLoaderMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientTagLoaderMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/registry/DynamicRegistryManager;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientTagLoaderMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/registry/DynamicRegistryManager;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientTagLoaderMixin from mod fabric-lifecycle-events-v1->@Inject::invokeTagsLoaded(Lnet/minecraft/registry/DynamicRegistryManager;ZLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientCommandSourceMixin from fabric-command-api-v2.client.mixins.json into net.minecraft.client.network.ClientCommandSource
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-command-api-v2.client.mixins.json:ClientCommandSourceMixin from mod fabric-command-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing PlayerAdvancementTrackerMixin from fabric-events-interaction-v0.mixins.json into net.minecraft.advancement.PlayerAdvancementTracker
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:PlayerAdvancementTrackerMixin from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:PlayerAdvancementTrackerMixin from mod fabric-events-interaction-v0->@Inject::preventOwnerOverride(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.mixins.json:PlayerAdvancementTrackerMixin from mod fabric-events-interaction-v0->@Inject::preventGrantCriterion(Lnet/minecraft/advancement/AdvancementEntry;Ljava/lang/String;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Server thread/INFO] (net.minecraft.server.PlayerManager) Player421[local:E:025b32f7] logged in with entity id 7 at (179.5, 117.0, 375.5)
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing ServerPlayNetworkHandlerMixin from fabric-networking-api-v1.mixins.json into net.minecraft.server.network.ServerPlayNetworkHandler
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::initAddon(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-networking-api-v1.mixins.json:ServerPlayNetworkHandlerMixin from mod fabric-networking-api-v1->@Inject::handleCustomPayloadReceivedAsync(Lnet/minecraft/network/packet/c2s/common/CustomPayloadC2SPacket;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayerInteractionManagerMixin from fabric-item-api-v1.client.mixins.json into net.minecraft.client.network.ClientPlayerInteractionManager
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientPlayerInteractionManagerMixin from fabric-events-interaction-v0.client.mixins.json into net.minecraft.client.network.ClientPlayerInteractionManager
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$interactItem$2(Lnet/minecraft/util/Hand;Lnet/minecraft/entity/player/PlayerEntity;I)Lnet/minecraft/network/packet/Packet; to md263364$fabric-events-interaction-v0$lambda$interactItem$2$0 in fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$interactBlock$1(Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;I)Lnet/minecraft/network/packet/Packet; to md263364$fabric-events-interaction-v0$lambda$interactBlock$1$1 in fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$fabric_fireAttackBlockCallback$0(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;I)Lnet/minecraft/network/packet/Packet; to md263364$fabric-events-interaction-v0$lambda$fabric_fireAttackBlockCallback$0$2 in fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::attackBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::method_2902(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::fabric$onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;)V doesn't use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::fabric$onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::fabric$onBlockBroken(Lnet/minecraft/util/math/BlockPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;)V won't be passed a CallbackInfoReturnable as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::interactBlock(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::interactItem(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-events-interaction-v0.client.mixins.json:ClientPlayerInteractionManagerMixin from mod fabric-events-interaction-v0->@Inject::attackEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientChunkManagerMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.world.ClientChunkManager
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkLoad(IILnet/minecraft/network/PacketByteBuf;Lnet/minecraft/nbt/NbtCompound;Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(IILnet/minecraft/network/PacketByteBuf;Lnet/minecraft/nbt/NbtCompound;Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V doesn't use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(IILnet/minecraft/network/PacketByteBuf;Lnet/minecraft/nbt/NbtCompound;Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(IILnet/minecraft/network/PacketByteBuf;Lnet/minecraft/nbt/NbtCompound;Ljava/util/function/Consumer;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V won't be passed a CallbackInfoReturnable as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ILnet/minecraft/world/chunk/WorldChunk;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ILnet/minecraft/world/chunk/WorldChunk;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onChunkUnload(Lnet/minecraft/util/math/ChunkPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;ILnet/minecraft/world/chunk/WorldChunk;)V won't be passed a CallbackInfo as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onUpdateLoadDistance(ILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;IILnet/minecraft/client/world/ClientChunkManager$ClientChunkMap;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onUpdateLoadDistance(ILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;IILnet/minecraft/client/world/ClientChunkManager$ClientChunkMap;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientChunkManagerMixin from mod fabric-lifecycle-events-v1->@Inject::onUpdateLoadDistance(ILorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;IILnet/minecraft/client/world/ClientChunkManager$ClientChunkMap;ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/util/math/ChunkPos;)V won't be passed a CallbackInfo as a result
[19:10:59] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Player421加入了游戏
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ClientWorldClientEntityHandlerMixin from fabric-lifecycle-events-v1.client.mixins.json into net.minecraft.client.world.ClientWorld$ClientEntityHandler
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldClientEntityHandlerMixin from mod fabric-lifecycle-events-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldClientEntityHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeLoadEntity(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-lifecycle-events-v1.client.mixins.json:ClientWorldClientEntityHandlerMixin from mod fabric-lifecycle-events-v1->@Inject::invokeUnloadEntity(Lnet/minecraft/entity/Entity;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing DimensionEffectsAccessor from fabric-rendering-v1.mixins.json into net.minecraft.client.render.DimensionEffects
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-v1.mixins.json:DimensionEffectsAccessor from mod fabric-rendering-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Accessor method getIdentifierMap()Lit/unimi/dsi/fastutil/objects/Object2ObjectMap; to getIdentifierMap$fabric-rendering-v1_$md$263364$0 in fabric-rendering-v1.mixins.json:DimensionEffectsAccessor from mod fabric-rendering-v1
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing SectionBuilderMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.chunk.SectionBuilder
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hookBuild$0(Ljava/util/Map;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/BufferBuilder; to md263364$fabric-renderer-indigo$lambda$hookBuild$0$0 in fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuild(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuild(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuild(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuildReturn(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuildReturn(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-renderer-indigo.mixins.json:SectionBuilderMixin from mod fabric-renderer-indigo->@Inject::hookBuildReturn(Lnet/minecraft/util/math/ChunkSectionPos;Lnet/minecraft/client/render/chunk/ChunkRendererRegion;Lcom/mojang/blaze3d/systems/VertexSorter;Lnet/minecraft/client/render/chunk/BlockBufferAllocatorStorage;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing RenderLayersMixin from fabric-blockrenderlayer-v1.mixins.json into net.minecraft.client.render.RenderLayers
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-blockrenderlayer-v1.mixins.json:RenderLayersMixin from mod fabric-blockrenderlayer-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-blockrenderlayer-v1.mixins.json:RenderLayersMixin from mod fabric-blockrenderlayer-v1->@Inject::onInitialize(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing EnchantmentHelperMixin from fabric-item-api-v1.mixins.json into net.minecraft.enchantment.EnchantmentHelper
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-item-api-v1.mixins.json:EnchantmentHelperMixin from mod fabric-item-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing HangingSignEditScreenMixin from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.gui.screen.ingame.HangingSignEditScreen
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:HangingSignEditScreenMixin from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$init$0(Ljava/lang/String;)Ljava/lang/String; to md263364$fabric-object-builder-api-v1$lambda$init$0$0 in fabric-object-builder-v1.client.mixins.json:HangingSignEditScreenMixin from mod fabric-object-builder-api-v1
[19:10:59] [Netty Server IO #1/DEBUG] (ServerPlayNetworkAddon for literal{Player421}[style={clickEvent=ClickEvent{action=SUGGEST_COMMAND, value='/tell Player421 '},hoverEvent=EventData[action=<action show_entity>, value=net.minecraft.text.HoverEvent$EntityContent@af194ee5],insertion=Player421}]) Handling inbound packet from channel with name "minecraft:register"
[19:10:59] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 2 advancements
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) Mixing PathContextMixin from fabric-content-registries-v0.mixins.json into net.minecraft.entity.ai.pathing.PathContext
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:PathContextMixin from mod fabric-content-registries-v0: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Server thread/DEBUG] (FabricLoader/Mixin) fabric-content-registries-v0.mixins.json:PathContextMixin from mod fabric-content-registries-v0->@Inject::onGetNodeType(IIILorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkRendererRegionBuilderMixin from fabric-block-view-api-v2.client.mixins.json into net.minecraft.client.render.chunk.ChunkRendererRegionBuilder
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionBuilderMixin from mod fabric-block-view-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionBuilderMixin from mod fabric-block-view-api-v2->@Inject::copyDataForChunk(Lnet/minecraft/world/World;Lnet/minecraft/util/math/ChunkSectionPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V doesn't use it's CallbackInfoReturnable
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionBuilderMixin from mod fabric-block-view-api-v2->@Inject::copyDataForChunk(Lnet/minecraft/world/World;Lnet/minecraft/util/math/ChunkSectionPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V has 0 override(s) in child classes
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionBuilderMixin from mod fabric-block-view-api-v2->@Inject::copyDataForChunk(Lnet/minecraft/world/World;Lnet/minecraft/util/math/ChunkSectionPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V won't be passed a CallbackInfoReturnable as a result
[19:10:59] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionBuilderMixin from mod fabric-block-view-api-v2->@Inject::createDataMap(Lnet/minecraft/world/World;Lnet/minecraft/util/math/ChunkSectionPos;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:11:00] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 0, new limit 144.
[19:11:00] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkRendererRegionMixin from fabric-block-view-api-v2.client.mixins.json into net.minecraft.client.render.chunk.ChunkRendererRegion
[19:11:00] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-block-view-api-v2.client.mixins.json:ChunkRendererRegionMixin from mod fabric-block-view-api-v2: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:11:00] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkRendererRegionMixin from fabric-renderer-indigo.mixins.json into net.minecraft.client.render.chunk.ChunkRendererRegion
[19:11:00] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ChunkRendererRegionMixin from fabric-rendering-data-attachment-v1.client.mixins.json into net.minecraft.client.render.chunk.ChunkRendererRegion
[19:11:00] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-rendering-data-attachment-v1.client.mixins.json:ChunkRendererRegionMixin from mod fabric-rendering-data-attachment-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:11:00] [Render thread/DEBUG] (com.mojang.blaze3d.systems.RenderSystem) Growing IndexBuffer: Old limit 9360, new limit 20652.
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ModelPredicateProviderRegistryAccessor from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.item.ModelPredicateProviderRegistry
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:ModelPredicateProviderRegistryAccessor from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callRegister(Lnet/minecraft/util/Identifier;Lnet/minecraft/client/item/ClampedModelPredicateProvider;)Lnet/minecraft/client/item/ClampedModelPredicateProvider; to callRegister$fabric-object-builder-api-v1_$md$263364$0 in fabric-object-builder-v1.client.mixins.json:ModelPredicateProviderRegistryAccessor from mod fabric-object-builder-api-v1
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing ModelPredicateProviderRegistrySpecificAccessor from fabric-object-builder-v1.client.mixins.json into net.minecraft.client.item.ModelPredicateProviderRegistry
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-object-builder-v1.client.mixins.json:ModelPredicateProviderRegistrySpecificAccessor from mod fabric-object-builder-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:11:02] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming @Invoker method callRegister(Lnet/minecraft/item/Item;Lnet/minecraft/util/Identifier;Lnet/minecraft/client/item/ClampedModelPredicateProvider;)V to callRegister$fabric-object-builder-api-v1_$md$263364$1 in fabric-object-builder-v1.client.mixins.json:ModelPredicateProviderRegistrySpecificAccessor from mod fabric-object-builder-api-v1
[19:11:04] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Saving and pausing game...
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:04] [Server thread/INFO] (net.minecraft.server.network.ServerPlayNetworkHandler) Player421 lost connection: 连接中断
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Player421退出了游戏
[19:11:04] [Server thread/INFO] (net.minecraft.server.network.ServerCommonNetworkHandler) Stopping singleplayer server as player logged out
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Stopping server
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving players
[19:11:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving worlds
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (新的世界): All chunks are saved
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (DIM1): All chunks are saved
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (DIM-1): All chunks are saved
[19:11:05] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage: All dimensions are saved
[19:11:10] [Render thread/INFO] (net.minecraft.world.level.storage.LevelStorage) Deleting level 新的世界
[19:11:10] [Render thread/INFO] (net.minecraft.world.level.storage.LevelStorage) Attempt 1...
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:10] [Render thread/INFO] (net.minecraft.recipe.RecipeManager) Loaded 1290 recipes
[19:11:10] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 1399 advancements
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:11] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:12] [Render thread/INFO] (net.minecraft.recipe.RecipeManager) Loaded 1290 recipes
[19:11:12] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 1399 advancements
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [fabric]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [fabric, fabric-convention-tags-v2]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-convention-tags-v2, currently enabled: [vanilla, fabric, fabric-convention-tags-v2]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] cur @ fabric, auto-enabled fabric-gametest-api-v1, currently enabled: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:18] [Render thread/INFO] (net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl) Applied 0 biome modifications to 0 of 64 new biomes in 169.5 μs
[19:11:18] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Starting integrated minecraft server version 1.21.1
[19:11:18] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Generating keypair
[19:11:19] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Preparing start region for dimension minecraft:overworld
[19:11:19] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：2%
[19:11:20] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) 准备生成区域中：51%
[19:11:20] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Changing view distance to 12, from 10
[19:11:20] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Changing simulation distance to 12, from 0
[19:11:20] [Render thread/INFO] (net.minecraft.server.WorldGenerationProgressLogger) Time elapsed: 820 ms
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:register"
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:register"
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "fabric:custom_ingredient_sync"
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "fabric:custom_ingredient_sync"
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "c:version"
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Negotiated common packet version 1
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "c:version"
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Negotiated common packet version 1
[19:11:20] [Netty Local Client IO #1/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "c:register"
[19:11:20] [Netty Local Client IO #1/DEBUG] (fabric-networking-api-v1) Received accepted channels from the server
[19:11:20] [Netty Server IO #3/DEBUG] (ServerConfigurationNetworkAddon for Player421) Handling inbound packet from channel with name "c:register"
[19:11:20] [Netty Server IO #3/DEBUG] (fabric-networking-api-v1) Received accepted channels from the client for play phase
[19:11:20] [Render thread/DEBUG] (ClientPlayNetworkAddon for Player421) Handling inbound packet from channel with name "minecraft:brand"
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: []
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: []
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: []
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Starting internal pack sorting with: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Removed all internal packs, result: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:20] [Render thread/DEBUG] (net.fabricmc.fabric.impl.resource.loader.ModResourcePackUtil) [Fabric] Final sorting result: [vanilla, fabric-convention-tags-v2, fabric-gametest-api-v1]
[19:11:20] [Server thread/DEBUG] (SynchronizeRegistriesTaskMixin) Synchronizing registries with common known packs: [minecraft:core:1.21.1, fabric:fabric-convention-tags-v2:2.6.0+605f22ad6a, fabric:fabric-gametest-api-v1:2.0.4+6fc22b996a]
[19:11:20] [Server thread/INFO] (net.minecraft.server.PlayerManager) Player421[local:E:a707993b] logged in with entity id 356 at (-366.5, 66.0, -631.5)
[19:11:20] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Player421加入了游戏
[19:11:20] [Netty Server IO #3/DEBUG] (ServerPlayNetworkAddon for literal{Player421}[style={clickEvent=ClickEvent{action=SUGGEST_COMMAND, value='/tell Player421 '},hoverEvent=EventData[action=<action show_entity>, value=net.minecraft.text.HoverEvent$EntityContent@af194ee5],insertion=Player421}]) Handling inbound packet from channel with name "minecraft:register"
[19:11:20] [Render thread/INFO] (net.minecraft.advancement.AdvancementManager) Loaded 2 advancements
[19:11:20] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Saving and pausing game...
[19:11:20] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:21] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:21] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Mixing CreativeInventoryScreenMixin from fabric-item-group-api-v1.client.mixins.json into net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1: Class version 65 required is higher than the class version supported by the current version of Mixin (JAVA_17 supports class version 61)
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getItemGroupsOnPage$3(Lnet/minecraft/item/ItemGroup;Lnet/minecraft/item/ItemGroup;)I to md263364$fabric-item-group-api-v1$lambda$getItemGroupsOnPage$3$0 in fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$getItemGroupsOnPage$2(ILnet/minecraft/item/ItemGroup;)Z to md263364$fabric-item-group-api-v1$lambda$getItemGroupsOnPage$2$1 in fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$hasGroupForPage$1(ILnet/minecraft/item/ItemGroup;)Z to md263364$fabric-item-group-api-v1$lambda$hasGroupForPage$1$2 in fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Renaming synthetic method lambda$updateSelection$0(Lnet/minecraft/item/ItemGroup;Lnet/minecraft/item/ItemGroup;)I to md263364$fabric-item-group-api-v1$lambda$updateSelection$0$3 in fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V doesn't use it's CallbackInfo
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V has 0 override(s) in child classes
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::init(Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V won't be passed a CallbackInfo as a result
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::setSelectedTab(Lnet/minecraft/item/ItemGroup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::renderTabTooltipIfHovered(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/item/ItemGroup;IILorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::isClickInTab(Lnet/minecraft/item/ItemGroup;DDLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V does use it's CallbackInfoReturnable
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) fabric-item-group-api-v1.client.mixins.json:CreativeInventoryScreenMixin from mod fabric-item-group-api-v1->@Inject::renderTabIcon(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/item/ItemGroup;Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V does use it's CallbackInfo
[19:11:26] [Render thread/DEBUG] (FabricLoader/Mixin) Generating mapped inner class net/minecraft/item/ItemGroups$1ItemGroupPosition$6d9d666dffaf4b7b830112cc599fe8f2 (originally net/fabricmc/fabric/mixin/itemgroup/ItemGroupsMixin$1ItemGroupPosition)
[19:11:33] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Saving and pausing game...
[19:11:33] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:33] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:33] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:13:42] [Render thread/DEBUG] (net.fabricmc.fabric.impl.command.client.ClientCommandInternals) Syntax exception for client-sided command 'words'
com.mojang.brigadier.exceptions.CommandSyntaxException: 未知或不完整的命令。错误见下 at position 0: <--[HERE]
[19:13:42] [Render thread/INFO] (net.minecraft.client.gui.hud.ChatHud) [System] [CHAT] 未知或不完整的命令。错误见下
[19:13:42] [Render thread/INFO] (net.minecraft.client.gui.hud.ChatHud) [System] [CHAT] words<--[此处]
[19:13:43] [Server thread/INFO] (net.minecraft.server.integrated.IntegratedServer) Saving and pausing game...
[19:13:43] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:13:43] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:13:43] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:14:02] [Server thread/INFO] (net.minecraft.server.network.ServerPlayNetworkHandler) Player421 lost connection: 连接中断
[19:14:02] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Player421退出了游戏
[19:14:02] [Server thread/INFO] (net.minecraft.server.network.ServerCommonNetworkHandler) Stopping singleplayer server as player logged out
[19:14:02] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Stopping server
[19:14:02] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving players
[19:14:02] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving worlds
[19:14:03] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:14:03] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:14:03] [Server thread/INFO] (net.minecraft.server.MinecraftServer) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:14:03] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (新的世界): All chunks are saved
[19:14:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (DIM1): All chunks are saved
[19:14:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage (DIM-1): All chunks are saved
[19:14:04] [Server thread/INFO] (net.minecraft.server.MinecraftServer) ThreadedAnvilChunkStorage: All dimensions are saved
[19:14:04] [Render thread/INFO] (net.minecraft.client.MinecraftClient) Stopping!

```

---

## File: run\logs\latest.log

```log
[19:09:34] [main/INFO] (FabricLoader/GameProvider) Loading Minecraft 1.21.1 with Fabric Loader 0.16.5
[19:09:34] [main/INFO] (FabricLoader) Loading 55 mods:
	- fabric-api 0.102.1+1.21.1
	- fabric-api-base 0.4.42+6573ed8c6a
	- fabric-api-lookup-api-v1 1.6.68+b55973446a
	- fabric-biome-api-v1 13.0.29+5bd9f1bc6a
	- fabric-block-api-v1 1.0.22+0af3f5a76a
	- fabric-block-view-api-v2 1.0.10+6573ed8c6a
	- fabric-blockrenderlayer-v1 1.1.52+0af3f5a76a
	- fabric-client-tags-api-v1 1.1.15+6573ed8c6a
	- fabric-command-api-v1 1.2.49+f71b366f6a
	- fabric-command-api-v2 2.2.28+6ced4dd96a
	- fabric-commands-v0 0.2.66+df3654b36a
	- fabric-content-registries-v0 8.0.16+b55973446a
	- fabric-convention-tags-v1 2.0.20+7f945d5b6a
	- fabric-convention-tags-v2 2.6.0+605f22ad6a
	- fabric-crash-report-info-v1 0.2.29+0af3f5a76a
	- fabric-data-attachment-api-v1 1.1.27+1daea2156a
	- fabric-data-generation-api-v1 20.2.17+16c4ae256a
	- fabric-dimensions-v1 4.0.0+6fc22b996a
	- fabric-entity-events-v1 1.6.12+6fc22b996a
	- fabric-events-interaction-v0 0.7.12+ba9dae066a
	- fabric-game-rule-api-v1 1.0.53+6ced4dd96a
	- fabric-gametest-api-v1 2.0.4+6fc22b996a
	- fabric-item-api-v1 11.0.0+afdfc9216a
	- fabric-item-group-api-v1 4.1.4+780172706a
	- fabric-key-binding-api-v1 1.0.47+0af3f5a76a
	- fabric-keybindings-v0 0.2.45+df3654b36a
	- fabric-lifecycle-events-v1 2.3.12+6c1df3606a
	- fabric-loot-api-v2 3.0.14+3f89f5a56a
	- fabric-loot-api-v3 1.0.2+3f89f5a56a
	- fabric-message-api-v1 6.0.13+6573ed8c6a
	- fabric-model-loading-api-v1 2.0.0+fe474d6b6a
	- fabric-networking-api-v1 4.2.2+60c3209b6a
	- fabric-object-builder-api-v1 15.2.0+40875a936a
	- fabric-particles-v1 4.0.2+6573ed8c6a
	- fabric-recipe-api-v1 5.0.12+650897126a
	- fabric-registry-sync-v0 5.1.2+60c3209b6a
	- fabric-renderer-api-v1 3.4.0+c705a49c6a
	- fabric-renderer-indigo 1.7.0+c705a49c6a
	- fabric-renderer-registries-v1 3.2.68+df3654b36a
	- fabric-rendering-data-attachment-v1 0.3.48+73761d2e6a
	- fabric-rendering-fluids-v1 3.1.6+1daea2156a
	- fabric-rendering-v0 1.1.71+df3654b36a
	- fabric-rendering-v1 5.0.5+df16efd06a
	- fabric-resource-conditions-api-v1 4.3.0+8dc279b16a
	- fabric-resource-loader-v0 1.3.0+565991296a
	- fabric-screen-api-v1 2.0.25+8b68f1c76a
	- fabric-screen-handler-api-v1 1.3.86+b55973446a
	- fabric-sound-api-v1 1.0.23+6573ed8c6a
	- fabric-transfer-api-v1 5.1.17+1db1cc1f6a
	- fabric-transitive-access-wideners-v1 6.1.0+1daea2156a
	- fabricloader 0.16.5
	- java 21
	- minecraft 1.21.1
	- mixinextras 0.4.1
	- words 1.0.0
[19:09:34] [main/INFO] (FabricLoader/Mixin) SpongePowered MIXIN Subsystem Version=0.8.7 Source=file:/C:/Users/hyper/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.15.3+mixin.0.8.7/51ee0a44ab05f6fddd66b09e66b3a16904f9c55d/sponge-mixin-0.15.3+mixin.0.8.7.jar Service=Knot/Fabric Env=CLIENT
[19:09:34] [main/INFO] (FabricLoader/Mixin) Loaded Fabric development mappings for mixin remapper!
[19:09:34] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_17
[19:09:34] [main/INFO] (FabricLoader/Mixin) Compatibility level set to JAVA_21
[19:09:36] [main/INFO] (FabricLoader/MixinExtras|Service) Initializing MixinExtras via com.llamalad7.mixinextras.service.MixinExtrasServiceImpl(version=0.4.1).
[19:09:37] [Datafixer Bootstrap/INFO] (Minecraft) 226 Datafixer optimizations took 451 milliseconds
[19:09:37] [main/WARN] (Minecraft) Failed retrieving info for group graphics
com.sun.jna.platform.win32.Win32Exception: 系统找不到指定的文件。
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:769) ~[jna-platform-5.14.0.jar:?]
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:744) ~[jna-platform-5.14.0.jar:?]
	at com.sun.jna.platform.win32.Advapi32Util.registryGetStringValue(Advapi32Util.java:718) ~[jna-platform-5.14.0.jar:?]
	at oshi.hardware.platform.windows.WindowsGraphicsCard.getGraphicsCards(WindowsGraphicsCard.java:83) ~[oshi-core-6.4.10.jar:?]
	at oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer.getGraphicsCards(WindowsHardwareAbstractionLayer.java:87) ~[oshi-core-6.4.10.jar:?]
	at net.minecraft.util.SystemDetails.method_37140(SystemDetails.java:80) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.tryAddGroup(SystemDetails.java:87) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.addHardwareGroup(SystemDetails.java:80) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.method_37143(SystemDetails.java:56) ~[minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.tryAddGroup(SystemDetails.java:87) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.SystemDetails.<init>(SystemDetails.java:56) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.crash.CrashReport.<init>(CrashReport.java:35) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.util.crash.CrashReport.initCrashReport(CrashReport.java:234) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.minecraft.client.main.Main.main(Main.java:125) [minecraft-merged-c453a9ae23-1.21.1-net.fabricmc.yarn.1_21_1.1.21.1+build.1-v2.jar:?]
	at net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider.launch(MinecraftGameProvider.java:480) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.loader.impl.launch.knot.Knot.launch(Knot.java:74) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.loader.impl.launch.knot.KnotClient.main(KnotClient.java:23) [fabric-loader-0.16.5.jar:?]
	at net.fabricmc.devlaunchinjector.Main.main(Main.java:86) [dev-launch-injector-0.2.1+build.8.jar:?]
[19:09:43] [Render thread/INFO] (Minecraft) Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[19:09:43] [Render thread/INFO] (Minecraft) Setting user: Player421
[19:09:43] [Render thread/INFO] (words) Initializing Words Mod for 1.21.1!
[19:09:43] [Render thread/INFO] (words) Initializing Words Mod Client for 1.21.1!
[19:09:43] [Render thread/INFO] (Indigo) [Indigo] Registering Indigo renderer!
[19:09:43] [Render thread/INFO] (Minecraft) Backend library: LWJGL version 3.3.3-snapshot
[19:09:45] [Render thread/INFO] (Minecraft) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words
[19:09:45] [Worker-Main-13/INFO] (Minecraft) Found unifont_all_no_pua-15.1.05.hex, loading
[19:09:45] [Worker-Main-12/INFO] (Minecraft) Found unifont_jp_patch-15.1.05.hex, loading
[19:09:46] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:item.goat_horn.play
[19:09:46] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[19:09:46] [Render thread/INFO] (Minecraft) OpenAL initialized on device OpenAL Soft on 扬声器 (SIMGOT GEW1)
[19:09:46] [Render thread/INFO] (Minecraft) Sound engine started
[19:09:47] [Render thread/INFO] (Minecraft) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[19:09:47] [Render thread/INFO] (Minecraft) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[19:09:47] [Render thread/WARN] (Minecraft) Shader rendertype_entity_translucent_emissive could not find sampler named Sampler2 in the specified shader program.
[19:10:03] [Render thread/INFO] (Minecraft) Reloading ResourceManager: vanilla, fabric, fabric-api, fabric-api-base, fabric-api-lookup-api-v1, fabric-biome-api-v1, fabric-block-api-v1, fabric-block-view-api-v2, fabric-blockrenderlayer-v1, fabric-client-tags-api-v1, fabric-command-api-v1, fabric-command-api-v2, fabric-commands-v0, fabric-content-registries-v0, fabric-convention-tags-v1, fabric-convention-tags-v2, fabric-crash-report-info-v1, fabric-data-attachment-api-v1, fabric-data-generation-api-v1, fabric-dimensions-v1, fabric-entity-events-v1, fabric-events-interaction-v0, fabric-game-rule-api-v1, fabric-gametest-api-v1, fabric-item-api-v1, fabric-item-group-api-v1, fabric-key-binding-api-v1, fabric-keybindings-v0, fabric-lifecycle-events-v1, fabric-loot-api-v2, fabric-loot-api-v3, fabric-message-api-v1, fabric-model-loading-api-v1, fabric-networking-api-v1, fabric-object-builder-api-v1, fabric-particles-v1, fabric-recipe-api-v1, fabric-registry-sync-v0, fabric-renderer-api-v1, fabric-renderer-indigo, fabric-renderer-registries-v1, fabric-rendering-data-attachment-v1, fabric-rendering-fluids-v1, fabric-rendering-v0, fabric-rendering-v1, fabric-resource-conditions-api-v1, fabric-resource-loader-v0, fabric-screen-api-v1, fabric-screen-handler-api-v1, fabric-sound-api-v1, fabric-transfer-api-v1, fabric-transitive-access-wideners-v1, fabricloader, words
[19:10:03] [Worker-Main-13/INFO] (Minecraft) Found unifont_all_no_pua-15.1.05.hex, loading
[19:10:03] [Worker-Main-17/INFO] (Minecraft) Found unifont_jp_patch-15.1.05.hex, loading
[19:10:04] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:item.goat_horn.play
[19:10:04] [Render thread/WARN] (Minecraft) Missing sound for event: minecraft:entity.goat.screaming.horn_break
[19:10:04] [Render thread/INFO] (Minecraft) OpenAL initialized on device OpenAL Soft on 扬声器 (SIMGOT GEW1)
[19:10:04] [Render thread/INFO] (Minecraft) Sound engine started
[19:10:04] [Render thread/INFO] (Minecraft) Created: 1024x512x4 minecraft:textures/atlas/blocks.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/signs.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/shield_patterns.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x512x4 minecraft:textures/atlas/banner_patterns.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 1024x1024x4 minecraft:textures/atlas/armor_trims.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 128x64x4 minecraft:textures/atlas/decorated_pot.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 256x256x4 minecraft:textures/atlas/chest.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/beds.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x256x4 minecraft:textures/atlas/shulker_boxes.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/particles.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 512x256x0 minecraft:textures/atlas/paintings.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 256x128x0 minecraft:textures/atlas/mob_effects.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 64x64x0 minecraft:textures/atlas/map_decorations.png-atlas
[19:10:04] [Render thread/INFO] (Minecraft) Created: 1024x512x0 minecraft:textures/atlas/gui.png-atlas
[19:10:04] [Render thread/WARN] (Minecraft) Shader rendertype_entity_translucent_emissive could not find sampler named Sampler2 in the specified shader program.
[19:10:17] [Render thread/INFO] (Minecraft) Loaded 1290 recipes
[19:10:17] [Render thread/INFO] (Minecraft) Loaded 1399 advancements
[19:10:24] [Render thread/INFO] (Minecraft) Loaded 1290 recipes
[19:10:24] [Render thread/INFO] (Minecraft) Loaded 1399 advancements
[19:10:50] [Render thread/INFO] (Minecraft) Loaded 1290 recipes
[19:10:50] [Render thread/INFO] (Minecraft) Loaded 1399 advancements
[19:10:54] [Render thread/INFO] (BiomeModificationImpl) Applied 0 biome modifications to 0 of 64 new biomes in 1.343 ms
[19:10:54] [Server thread/INFO] (Minecraft) Starting integrated minecraft server version 1.21.1
[19:10:54] [Server thread/INFO] (Minecraft) Generating keypair
[19:10:56] [Server thread/INFO] (Minecraft) Preparing start region for dimension minecraft:overworld
[19:10:56] [Render thread/INFO] (Minecraft) 准备生成区域中：2%
[19:10:57] [Render thread/INFO] (Minecraft) 准备生成区域中：2%
[19:10:57] [Render thread/INFO] (Minecraft) 准备生成区域中：18%
[19:10:58] [Render thread/INFO] (Minecraft) 准备生成区域中：51%
[19:10:58] [Render thread/INFO] (Minecraft) Time elapsed: 1753 ms
[19:10:58] [Server thread/INFO] (Minecraft) Changing view distance to 12, from 10
[19:10:58] [Server thread/INFO] (Minecraft) Changing simulation distance to 12, from 0
[19:10:59] [Server thread/INFO] (Minecraft) Player421[local:E:025b32f7] logged in with entity id 7 at (179.5, 117.0, 375.5)
[19:10:59] [Server thread/INFO] (Minecraft) Player421加入了游戏
[19:10:59] [Render thread/INFO] (Minecraft) Loaded 2 advancements
[19:11:04] [Server thread/INFO] (Minecraft) Saving and pausing game...
[19:11:04] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:04] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:04] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:04] [Server thread/INFO] (Minecraft) Player421 lost connection: 连接中断
[19:11:04] [Server thread/INFO] (Minecraft) Player421退出了游戏
[19:11:04] [Server thread/INFO] (Minecraft) Stopping singleplayer server as player logged out
[19:11:04] [Server thread/INFO] (Minecraft) Stopping server
[19:11:04] [Server thread/INFO] (Minecraft) Saving players
[19:11:04] [Server thread/INFO] (Minecraft) Saving worlds
[19:11:05] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:05] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:05] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:05] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (新的世界): All chunks are saved
[19:11:05] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (DIM1): All chunks are saved
[19:11:05] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (DIM-1): All chunks are saved
[19:11:05] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage: All dimensions are saved
[19:11:10] [Render thread/INFO] (Minecraft) Deleting level 新的世界
[19:11:10] [Render thread/INFO] (Minecraft) Attempt 1...
[19:11:10] [Render thread/INFO] (Minecraft) Loaded 1290 recipes
[19:11:10] [Render thread/INFO] (Minecraft) Loaded 1399 advancements
[19:11:12] [Render thread/INFO] (Minecraft) Loaded 1290 recipes
[19:11:12] [Render thread/INFO] (Minecraft) Loaded 1399 advancements
[19:11:18] [Render thread/INFO] (BiomeModificationImpl) Applied 0 biome modifications to 0 of 64 new biomes in 169.5 μs
[19:11:18] [Server thread/INFO] (Minecraft) Starting integrated minecraft server version 1.21.1
[19:11:18] [Server thread/INFO] (Minecraft) Generating keypair
[19:11:19] [Server thread/INFO] (Minecraft) Preparing start region for dimension minecraft:overworld
[19:11:19] [Render thread/INFO] (Minecraft) 准备生成区域中：2%
[19:11:20] [Render thread/INFO] (Minecraft) 准备生成区域中：51%
[19:11:20] [Server thread/INFO] (Minecraft) Changing view distance to 12, from 10
[19:11:20] [Server thread/INFO] (Minecraft) Changing simulation distance to 12, from 0
[19:11:20] [Render thread/INFO] (Minecraft) Time elapsed: 820 ms
[19:11:20] [Server thread/INFO] (Minecraft) Player421[local:E:a707993b] logged in with entity id 356 at (-366.5, 66.0, -631.5)
[19:11:20] [Server thread/INFO] (Minecraft) Player421加入了游戏
[19:11:20] [Render thread/INFO] (Minecraft) Loaded 2 advancements
[19:11:20] [Server thread/INFO] (Minecraft) Saving and pausing game...
[19:11:20] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:21] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:21] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:11:33] [Server thread/INFO] (Minecraft) Saving and pausing game...
[19:11:33] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:11:33] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:11:33] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:13:42] [Render thread/INFO] (Minecraft) [System] [CHAT] 未知或不完整的命令。错误见下
[19:13:42] [Render thread/INFO] (Minecraft) [System] [CHAT] words<--[此处]
[19:13:43] [Server thread/INFO] (Minecraft) Saving and pausing game...
[19:13:43] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:13:43] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:13:43] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:14:02] [Server thread/INFO] (Minecraft) Player421 lost connection: 连接中断
[19:14:02] [Server thread/INFO] (Minecraft) Player421退出了游戏
[19:14:02] [Server thread/INFO] (Minecraft) Stopping singleplayer server as player logged out
[19:14:02] [Server thread/INFO] (Minecraft) Stopping server
[19:14:02] [Server thread/INFO] (Minecraft) Saving players
[19:14:02] [Server thread/INFO] (Minecraft) Saving worlds
[19:14:03] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:overworld
[19:14:03] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_end
[19:14:03] [Server thread/INFO] (Minecraft) Saving chunks for level 'ServerLevel[新的世界]'/minecraft:the_nether
[19:14:03] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (新的世界): All chunks are saved
[19:14:04] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (DIM1): All chunks are saved
[19:14:04] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage (DIM-1): All chunks are saved
[19:14:04] [Server thread/INFO] (Minecraft) ThreadedAnvilChunkStorage: All dimensions are saved
[19:14:04] [Render thread/INFO] (Minecraft) Stopping!

```

---

## File: run\options.txt

```txt
version:3955
ao:true
biomeBlendRadius:2
enableVsync:true
entityDistanceScaling:1.0
entityShadows:true
forceUnicodeFont:false
japaneseGlyphVariants:false
fov:0.0
fovEffectScale:1.0
darknessEffectScale:1.0
glintSpeed:0.5
glintStrength:0.75
prioritizeChunkUpdates:0
fullscreen:false
gamma:0.5
graphicsMode:1
guiScale:0
maxFps:120
mipmapLevels:4
narrator:0
particles:0
reducedDebugInfo:false
renderClouds:"true"
renderDistance:12
simulationDistance:12
screenEffectScale:1.0
soundDevice:""
autoJump:false
operatorItemsTab:false
autoSuggestions:true
chatColors:true
chatLinks:true
chatLinksPrompt:true
discrete_mouse_scroll:false
invertYMouse:false
realmsNotifications:true
showSubtitles:false
directionalAudio:false
touchscreen:false
bobView:true
toggleCrouch:false
toggleSprint:false
darkMojangStudiosBackground:false
hideLightningFlashes:false
hideSplashTexts:false
mouseSensitivity:0.5
damageTiltStrength:1.0
highContrast:false
narratorHotkey:true
resourcePacks:["fabric"]
incompatibleResourcePacks:[]
lastServer:
lang:zh_cn
chatVisibility:0
chatOpacity:1.0
chatLineSpacing:0.0
textBackgroundOpacity:0.5
backgroundForChatOnly:true
hideServerAddress:false
advancedItemTooltips:false
pauseOnLostFocus:true
overrideWidth:0
overrideHeight:0
chatHeightFocused:1.0
chatDelay:0.0
chatHeightUnfocused:0.4375
chatScale:1.0
chatWidth:1.0
notificationDisplayTime:1.0
useNativeTransport:true
mainHand:"right"
attackIndicator:1
tutorialStep:none
mouseWheelSensitivity:1.0
rawMouseInput:true
glDebugVerbosity:1
skipMultiplayerWarning:true
hideMatchedNames:true
joinedFirstServer:false
hideBundleTutorial:false
syncChunkWrites:true
showAutosaveIndicator:true
allowServerListing:true
onlyShowSecureChat:false
panoramaScrollSpeed:1.0
telemetryOptInExtra:false
onboardAccessibility:false
menuBackgroundBlurriness:5
key_key.attack:key.mouse.left
key_key.use:key.mouse.right
key_key.forward:key.keyboard.w
key_key.left:key.keyboard.a
key_key.back:key.keyboard.s
key_key.right:key.keyboard.d
key_key.jump:key.keyboard.space
key_key.sneak:key.keyboard.left.shift
key_key.sprint:key.keyboard.left.control
key_key.drop:key.keyboard.q
key_key.inventory:key.keyboard.e
key_key.chat:key.keyboard.t
key_key.playerlist:key.keyboard.tab
key_key.pickItem:key.mouse.middle
key_key.command:key.keyboard.slash
key_key.socialInteractions:key.keyboard.p
key_key.screenshot:key.keyboard.f2
key_key.togglePerspective:key.keyboard.f5
key_key.smoothCamera:key.keyboard.unknown
key_key.fullscreen:key.keyboard.f11
key_key.spectatorOutlines:key.keyboard.unknown
key_key.swapOffhand:key.keyboard.f
key_key.saveToolbarActivator:key.keyboard.c
key_key.loadToolbarActivator:key.keyboard.x
key_key.advancements:key.keyboard.l
key_key.hotbar.1:key.keyboard.1
key_key.hotbar.2:key.keyboard.2
key_key.hotbar.3:key.keyboard.3
key_key.hotbar.4:key.keyboard.4
key_key.hotbar.5:key.keyboard.5
key_key.hotbar.6:key.keyboard.6
key_key.hotbar.7:key.keyboard.7
key_key.hotbar.8:key.keyboard.8
key_key.hotbar.9:key.keyboard.9
soundCategory_master:0.5066225165562914
soundCategory_music:0.0
soundCategory_record:1.0
soundCategory_weather:1.0
soundCategory_block:1.0
soundCategory_hostile:1.0
soundCategory_neutral:1.0
soundCategory_player:1.0
soundCategory_ambient:1.0
soundCategory_voice:1.0
modelPart_cape:true
modelPart_jacket:true
modelPart_left_sleeve:true
modelPart_right_sleeve:true
modelPart_left_pants_leg:true
modelPart_right_pants_leg:true
modelPart_hat:true

```

---

## File: run\saves\新的世界\advancements\17b67947-156d-3518-9500-f7e04df5e64d.json

```json
{
  "minecraft:recipes/decorations/crafting_table": {
    "criteria": {
      "unlock_right_away": "2026-02-20 19:11:20 +0800"
    },
    "done": true
  },
  "minecraft:adventure/adventuring_time": {
    "criteria": {
      "minecraft:beach": "2026-02-20 19:11:26 +0800"
    },
    "done": false
  },
  "DataVersion": 3955
}
```

---

## File: run\saves\新的世界\session.lock

```lock
☃
```

---

## File: run\saves\新的世界\stats\17b67947-156d-3518-9500-f7e04df5e64d.json

```json
{"stats":{"minecraft:custom":{"minecraft:jump":1,"minecraft:time_since_rest":577,"minecraft:leave_game":1,"minecraft:play_time":577,"minecraft:time_since_death":577,"minecraft:sneak_time":3,"minecraft:total_world_time":3237,"minecraft:fly_one_cm":1012}},"DataVersion":3955}
```

---

## File: run\usercache.json

```json
[{"name":"Player421","uuid":"17b67947-156d-3518-9500-f7e04df5e64d","expiresOn":"2026-03-20 19:11:20 +0800"}]
```

---

## File: settings.gradle

```gradle
pluginManagement {
	repositories {
		maven {
			name = 'Fabric'
			url = 'https://maven.fabricmc.net/'
		}
		mavenCentral()
		gradlePluginPortal()
	}
}
```

---

## File: src\client\java\com\hyper\WordsClient.java

```java
package com.hyper;

import net.fabricmc.api.ClientModInitializer;

public class WordsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Words.LOGGER.info("Initializing Words Mod Client!");
    }
}
```

---

## File: src\main\java\com\hyper\Words.java

```java
package com.hyper;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Words implements ModInitializer {
    // 模组ID（必须和 fabric.mod.json 中的 id 一致）
    public static final String MOD_ID = "words";
    // 日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // 主初始化日志
        LOGGER.info("Initializing Words Mod for 1.21.1!");
        
        // 注册方块/物品等逻辑可后续添加，先保证能启动
        // ModBlocks.registerModBlocks();
    }
}
```

---

## File: src\main\java\com\hyper\WordsClient.java

```java
package com.hyper;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordsClient implements ClientModInitializer {
    // 日志对象（和主类保持一致）
    public static final Logger LOGGER = LoggerFactory.getLogger(Words.MOD_ID);

    @Override
    public void onInitializeClient() {
        // 客户端初始化日志（验证加载）
        LOGGER.info("Initializing Words Mod Client for 1.21.1!");
        
        // 暂时无其他逻辑，先保证能启动
    }
}
```

---

## File: src\main\java\com\hyper\block\WritingBlock.java

```java
package com.hyper.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class WritingBlock extends Block {
    public WritingBlock(Settings settings) {
        super(settings);
    }
}
```

---

## File: src\main\resources\assets\words\zh_cn.json

```json
{
    "block.words.writing_block": "写字方块"
}
```

---

## File: src\main\resources\fabric.mod.json

```json
{
  "schemaVersion": 1,
  "id": "words",
  "version": "${version}",
  "name": "Words Mod",
  "description": "Fabric mod for Minecraft 1.21.1 (no mixin)",
  "authors": ["hyper"],
  "license": "MIT",
  "environment": "*",
  "entrypoints": {
    "main": ["com.hyper.Words"],
    "client": ["com.hyper.WordsClient"]
  },
  "depends": {
    "fabricloader": ">=0.16.0",
    "minecraft": "~1.21.1",
    "java": ">=21",
    "fabric-api": ">=0.102.1+1.21.1"
  }
}
```

---

## File: src\main\resources\words.mixins.json

```json
{
  "required": true,
  "minVersion": "0.8",
  "package": "com.hyper.mixin",
  "compatibilityLevel": "JAVA_17",
  "mixins": [
    "ExampleMixin"
  ],
  "client": [
    "client.ExampleClientMixin"
  ],
  "injectors": {
    "defaultRequire": 1
  }
}
```

---

