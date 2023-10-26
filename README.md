# Inhaltsverzeichnis
1. [Einführung](#introduction)
    1. [Einleitung](#subparagraph1)
    2. [Ziele](#subparagraph2)
    3. [Randbedingungen](#subparagraph3)
2. [Build-Anleitung](#paragraph1)
3. [Kurze Bedienungsanleitung](#paragraph2)
4. [User Stories](#paragraph3)
5. [Releaseplan mit den Ausbaustufen](#paragraph4)
6. [Dokumentation Sprint 1](#paragraph5)
    1. [Taskliste für die Umsetzung der User Story (Schätzung in Stunden)](#subparagraph4)
    2. [Anreicherung der User Stories für die Umsetzung](#subparagraph5)
    3. [UML Package, Klassen- und Sequenzdiagramm](#subparagraph6)
    4. [Dokumentation wichtiger Code Snippets](#subparagraph7)
    5. [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#subparagraph8)
7. [Dokumentation Sprint 2](#paragraph6)
    1. [Taskliste für die Umsetzung der User Story (Schätzung in Stunden)](#subparagraph9)
    2. [Anreicherung der User Stories für die Umsetzung](#subparagraph10)
    3. [UML Package, Klassen- und Sequenzdiagramm](#subparagraph11)
    4. [Dokumentation wichtiger Code Snippets](#subparagraph12)
    5. [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#subparagraph13)

---

# 1.) Einführung <a name="introduction"></a>
## 1.1) Einleitung <a name="subparagraph1"></a>
Im Rahmen unserer kombinierten Projektarbeit der Fächer Softwareengineering und Informatik im 3. Semester haben wir uns entschieden ein Übungstool zu programmieren, mit welchem man seine Fähigkeiten im 10 Fingersystem verbessern kann zu programmieren.
## 1.2) Ziele <a name="subparagraph2"></a>
Das Ziel unseres Projekts ist es, ein Tool zu entwickeln um seine Fähigkeiten mit dem 10 Fingersystem zu verbessern. In einer ersten Phase soll man mit einem Übungsmodus seine Fähigkeiten verbessern können. Falls noch genügend Kapazität vorhanden ist, können auch noch Erweiterungen wie ein Spielmodus, Bestenlisten etc. erstellt werden. 
## 1.3) Randbedingungen <a name="subparagraph3"></a>
- Die Programmierung der Anwendung erfolgt in Java.
- Das Projekt ist auf GitHub öffentlich einsehbar.
- Das Projekt wurde getestet.
- Die Build-Automatisierung erfolgt mittels Gradle.
- Das Projekt wurde mit der SCRUM Methode durchgeführt.
- Dies beinhaltet Userstories und einen Releaseplan.

---

# 2.) Build-Anleitung <a name="paragraph1"></a>
Um das Java-Projekt "Menstrualender" zu builden und auszuführen, müssen folgendende Schritte ausgeführt werden:

- Stellen Sie sicher, dass Sie Java und Maven auf Ihrem System installiert haben. Sie können prüfen, ob Java installiert ist, indem Sie java -version in der Befehlszeile ausführen, Maven indem Sie mvn --version ausführen. Um Maven zu installieren, können Sie den Installationsanweisungen auf der Maven-Website folgen: https://maven.apache.org/install.html
- Erstellen Sie ein neues leeres Verzeichnis
- Navigieren Sie mittels der Kommandozeile in das neue Verzeichnis mithilfe des "Change Directory" Befehles cd
- Klonen Sie das Repository von GitHub mittels folgendem Befehl:
```
git clone https://github.com/Rhenania95/10-Finger-System.git
```
- Um das project von der Kommandozeile auszuführen geben Sie (im Verzeichnis des Projekts) folgenden Befehl ein:
```
mvn clean compile javafx:run
```
- Um ein custom image herzustellen, führen Sie folgenden Befehl aus:
```
mvn clean compile javafx:jlink
```
- Das custom image lässt sich mit folgendem Befehl ausführen:
```
target/app/bin/java -m com.example.10-Finger-System/com.example.10-Finger-System.Application
```

Alternativ kann das Programm auch von einer IDE ausgeführt werden: navigieren hierzu in den Ordner src/main/java und ins Package com.example.10-Finger-System und führen Sie die Klasse MensApplication aus

---

# 3.) Kurze Bedienungsanleitung <a name="paragraph2"></a>


---

# 4.) User Storys <a name="paragraph3"></a>

---

# 5) Releaseplan mit den Ausbaustufen <a name="paragraph4"></a>

---

# 6) Dokumentation Sprint 1 <a name="paragraph5"></a>

## 6.1) Taskliste für die Umsetzung der User Story Sprint 1 <a name="subparagraph4"></a>

## 6.2) Anreicherung der User Stories für die Umsetzung <a name="subparagraph5"></a>

## 6.3) UML Package, Klassen- und Sequenzdiagramm <a name="subparagraph6"></a>

## 6.4) Dokumentation wichtiger Code Snippets <a name="subparagraph7"></a>

## 6.5) Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories <a name="subparagraph8"></a>

---

# 7) Dokumentation Sprint 2 <a name="paragraph6"></a>

## 7.1) Taskliste für die Umsetzung der User Story Sprint 1 <a name="subparagraph9"></a>

## 7.2) Anreicherung der User Stories für die Umsetzung <a name="subparagraph10"></a>

## 7.3) UML Package, Klassen- und Sequenzdiagramm <a name="subparagraph11"></a>

## 7.4) Dokumentation wichtiger Code Snippets <a name="subparagraph12"></a>

## 7.5) Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories <a name="subparagraph13"></a>

