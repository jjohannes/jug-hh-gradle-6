# Gradle 6 – Dependency-Management reloaded

Slides and demo of [Java User Group Hamburg talk](https://www.meetup.com/de-DE/jug-hamburg/events/268613960/).

**Demo Project**: [demos/hello-gradle-6](demos/hello-gradle-6) 

Die Verwaltung von Abhängigkeiten (Dependencies) in Java-, Groovy-, Kotlin- oder Scala-Projekte ist ein wichtiges Feature aller bekannten Build-Tools im JVM-Ökosystem.
Allerdings haben die Tools mit Einschränkungen zu kämpfen, die das modellieren vieler Anwendungsfälle in diesem Bereich schwierig oder unmöglich machen – beispielsweise mit der Annahmen, dass jedes Modul im Prinzip aus einer JAR-Datei besteht.
Dies wird nicht zuletzt von den Limitierungen des POM-Formats, welches sich als Standard-Format für Metadaten von Java-Bibliotheken durchgesetzt hat, untermauert.

Das Entwicklerteam des modernen Build-Tools Gradle hat in den letzten Jahren nach Lösungen für die Probleme gesucht und kontinuierlich neue innovative Features entwickelt.
Mit dem Release von Gradle 6 wurden die letzten größeren Lücken in dieser Entwicklung geschlossen.
Damit bietet Gradle 6 viele neue Funktionalitäten zur Projektstrukturierung und Verwaltung von Abhängigkeiten.
Insbesondere ist es nun möglich diese Funktionalitäten über Projekt- und Modulgrenzen hinweg zu nutzen, was durch die Einführung eines neuen Metadatenformats (Gradle Module Metadata) ermöglicht wird.

Die neuen Funktionalitäten im Kern von Gradle ermöglichen eine Vielzahl von Anwendungsfällen.
In diesem Vortrag werde ich einige der interessantesten Anwendungen in JVM-Projekten an einem Beispielprojekt vorstellen, um zu demonstrieren wie Gradle 6 zur Modularisierung von Projekten und zur Entwicklung wiederverwendbarer Module genutzt werden kann.
Unter anderem werde ich über die Trennung von Laufzeit- und Compilezeit-Abhängigkeiten, Wiederverwendung von Testfixtures, Entwicklung optionaler Features und das Verwalten von Abhängigkeitsversionen sprechen.