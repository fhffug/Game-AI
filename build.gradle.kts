plugins {
    id("java")
    id("idea")
}

subprojects {
    apply {
        plugin("java")
        plugin("idea")
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(23))
        }
    }

    idea {
        module {
            isDownloadJavadoc = true
            isDownloadSources = true
        }
    }

    group = "com.ai"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        //  lombok
        compileOnly("org.projectlombok:lombok:1.18.36")
        annotationProcessor("org.projectlombok:lombok:1.18.36")
        compileOnly("org.projectlombok:lombok.ast:0.2")
        annotationProcessor("org.projectlombok:lombok.ast:0.2")
        //  SLF4j
        implementation("org.slf4j:slf4j-api:2.1.0-alpha1")
        implementation("org.slf4j:slf4j-migrator:2.1.0-alpha1")
        implementation("org.slf4j:log4j-over-slf4j:2.1.0-alpha1")
        implementation("ch.qos.logback:logback-core:1.5.16")
        implementation("ch.qos.logback:logback-classic:1.5.16")
        //  DL4J
        implementation("org.deeplearning4j:deeplearning4j-core:1.0.0-M2.1")
        implementation("org.nd4j:nd4j-native-platform:1.0.0-M2.1")
    }


    tasks.test {
        useJUnitPlatform()
    }
}