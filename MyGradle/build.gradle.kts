

plugins {
    id("java")
    id("maven-publish")
    id 'org.springframework.boot' version '2.7.14'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
}

sourceCompatibility = '11'

group = "org.example"
version = "1.1-SNAPSHOT"

var jUnitVersion = "5.9.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:${jUnitVersion}"))
    testImplementation("org.junit.jupiter:junit-jupiter:${jUnitVersion}")

    // https://mvnrepository.com/artifact/com.google.guava/guava
    implementation ("com.google.guava:guava:32.1.2-jre")

    // https://mvnrepository.com/artifact/org.mapstruct/mapstruct
    implementation ("org.mapstruct:mapstruct:1.5.5.Final")

    // https://mvnrepository.com/artifact/org.mapstruct/mapstruct-processor
    annotationProcessor ("org.mapstruct:mapstruct-processor:1.5.5.Final")

    // JDBC
    implementation ("mysql:mysql-connector-java:8.0.27")

}

tasks.test {
    useJUnitPlatform()
}
