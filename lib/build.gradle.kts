plugins {
    `java-library`
}

group = "org.example.cross.repo"
version = "0.1.0"

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

tasks.named<Test>("test") {
    useJUnitPlatform()
}
