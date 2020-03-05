plugins {
    `java-library`
    groovy
}

tasks.withType<GroovyCompile> {
    options.isIncremental = true
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.0")

    api(platform(project(":platform")))

    api(project(":data"))

    testImplementation(testFixtures(project(":data")))

    testImplementation("org.spockframework:spock-core:2.0-M2-groovy-3.0")
}
