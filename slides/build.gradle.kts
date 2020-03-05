plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("jjohannes")
    githubRepoName.set("jug-hh-gradle-6")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}