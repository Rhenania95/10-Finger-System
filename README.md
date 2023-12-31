# Inhaltsverzeichnis

1. [Einführung](#introduction)
    1. [Einleitung](#subparagraph1)
    2. [Ziele](#subparagraph2)
    3. [Randbedingungen](#subparagraph3)
2. [Build-Anleitung](#paragraph1)
3. [Kurze Bedienungsanleitung](#paragraph2)
4. [User Stories](#paragraph3)
5. [Releaseplan mit den Ausbaustufen](#paragraph4)
6. [UML Package, Klassen- und Sequenzdiagramm](#subparagraph6)
7. [Dokumentation Sprint 1](#paragraph5)
    1. [Taskliste für die Umsetzung der User Story (Schätzung in Stunden)](#subparagraph4)
    2. [Dokumentation wichtiger Code Snippets](#subparagraph7)
    3. [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#subparagraph8)
8. [Dokumentation Sprint 2](#paragraph6)
    1. [Taskliste für die Umsetzung der User Story (Schätzung in Stunden)](#subparagraph9)
    2. [Dokumentation wichtiger Code Snippets](#subparagraph12)
    3. [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#subparagraph13)

---

# 1.) Einführung <a name="introduction"></a>

## 1.1) Einleitung <a name="subparagraph1"></a>

Im Rahmen unserer kombinierten Projektarbeit der Fächer Softwareengineering und Informatik im 3. Semester haben wir uns
entschieden ein Übungstool zu programmieren, mit welchem man seine Fähigkeiten im 10 Fingersystem verbessern kann zu
programmieren.

## 1.2) Ziele <a name="subparagraph2"></a>

Das Ziel unseres Projekts ist es, ein Tool zu entwickeln um seine Fähigkeiten mit dem 10 Fingersystem zu verbessern. In
einer ersten Phase soll man mit einem Übungsmodus seine Fähigkeiten verbessern können. Falls noch genügend Kapazität
vorhanden ist, können auch noch Erweiterungen wie ein Spielmodus, Bestenlisten etc. erstellt werden.

## 1.3) Randbedingungen <a name="subparagraph3"></a>

- Die Programmierung der Anwendung erfolgt in Java.
- Das Projekt ist auf GitHub öffentlich einsehbar.
- Das Projekt wurde getestet.
- Die Build-Automatisierung erfolgt mittels Gradle.
- Das Projekt wurde mit der SCRUM Methode durchgeführt.
- Dies beinhaltet Userstories und einen Releaseplan.

---

# 2.) Build-Anleitung <a name="paragraph1"></a>

Um das Java-Projekt "10 Fingersystem" zu builden und auszuführen, müssen folgendende Schritte ausgeführt werden:

- Stellen Sie sicher, dass Sie Java und Maven auf Ihrem System installiert haben. Sie können prüfen, ob Java installiert
  ist, indem Sie java -version in der Befehlszeile ausführen, Maven indem Sie mvn --version ausführen. Um Maven zu
  installieren, können Sie den Installationsanweisungen auf der Maven-Website
  folgen: https://maven.apache.org/install.html
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

Alternativ kann das Programm auch von einer IDE ausgeführt werden: navigieren hierzu in den Ordner src/main/java und ins
Package com.example.10-Finger-System und führen Sie die Klasse Programmstart aus

---

# 3.) Kurze Bedienungsanleitung <a name="paragraph2"></a>

## Startseite

Auf der Startseite kann man zwischen den verschiedenen Bereichen navigieren. Man kann zum einen den Übungs- Test oder
Spielmodus aufrufen, wo man seine Fertigkeiten verbessern kann. Ausserdem kann man in den Statistikbereich navigieren.
Im Einstellungsbereich kann man grundsätzliche Einstellungen am Programm vornehmen. Zum Beispiel die Sprache oder die
Tastatur ändern. Im Abschnitt Credits werden die Ersteller des Projekts erwähnt. Und mit beenden kann man die Anwendung
beenden.

## Übungsmodus + Timer einstellen

In diesem Bildschirm kann man auswählen welche Buchstaben man trainieren möchte. Auf der linken Seite steht, welche
Buchstaben in der jeweiligen Übung drannkommen. Wenn man auf lernen drückt, kommen nur die links erwähnten Zeichen dran.
Wenn man auf trainieren drückt, kommen sämtliche Zeichen, auch solche aus vorherigen Übungen dran. Wenn man sich für
eine Übung und einen Modus entschieden hat, kann man einstellen wie lange die Übung gehen soll. Wenn man erwas anderes
als ganze Zahlen eingibt, erscheint eine Fehlermeldung. Ausserdem erhält man im oberen Bildschirm eine Anleitung wie man
die Finger zu positionieren hat und welche Farbe welche Bedeutung hat.

## Lektion und Auswertung

Wenn man die Zeit eingestellt hat, kann man mit der Übung beginnen. Im unteren Bildschirmteil sieht man mit welchen
Fingern man die in dieser Übung erlernten Tasten betätigen soll. Mit Knopfdrücken beginnt die Übung. Oben auf der linken
Seite wird angezeigt, welche Lektion man bearbeitet und in welchem Modus man sich befindet. Auf der rechten Seite
befindet sich der Timer, ein Anschläge- und ein Fehlerzähle. Wenn die Zeit abgelaufen ist wird man automatisch ins
Auswertungsmenu geleitet. Wenn man den Abbruchbutton drückt, wird ein Alert ausgegeben ob man die Übung wirklich beenden
will. Wenn man das bestätigt, wird man ebenfalls in den Auswertungsscreen geleitet. Dort sieht man zu oberst, wie lange
man gelernt hat, darunter sieht man die getippten Zeichen und die daraus berechneten Anschläge pro Minute. Ausserdem
werden die Fehler angezeigt und daraus wird die Fehlerquote berechnet.

---

# 4.) User Storys <a name="paragraph3"></a>

| Userstory: |             Name:             |                                                                                                                                                                                                        Beschreibung: | Priorität: | Storypoints: |                                                                                                                                                                                                                                  Akzeptanzkriterien: |
|------------|:-----------------------------:|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|-----------:|-------------:|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| Story 1    |          Textausgabe          |                                                                                                                                                   Als Entwickler möchte ich Text auf dem Bildschirm ausgeben können. |          1 |            1 |                                                                                                                                                                                              Im oberen Bildschirmbereich soll eine Textausgabe sein. |
| Story 2    |          Texteingabe          |                                                                                                                      Als Entwickler möchte ich Eingaben einlesen können um zu sehen was der Benutzer eingegeben hat. |          1 |            2 |                                                                                                                                                                                                          Es sollen zeichen eingegeben werden können. |
| Story 3    |          Überprüfung          |                                                                                                                          Als Benutzer möchte ich, dass das Programm meine Fehler direkt nach der Eingabe korrigiert. |          1 |            1 |                                                                                                      Es gibt einen Fehler aus, wenn ein falscher Buchstabe eingegeben wurde. Nur wenn der richtige Buchstabe eingegeben wird, kann ich zum nächsten. |
| Story 4    |      Verschiedene Levels      |                                                                                                                                                             Als Benutzer möchte ich die Schwierigkeit wählen können. |          3 |            1 |                                                                                                                                                       Es soll mindestens 5 Level geben. Level 1 enthält nur asdf jklö. Level 5 enthält alle Zeichen. |
| Story 5    |      Spielerisch lernen       |                                                                                                                                                     Als Benutzer möchte ich lernen und gleichzeitig Spaß haben kann. |          5 |            5 |                                                                                                                                                                               Es soll ein Spiel geben, bei dem mein 10 Fingersystem verbessert wird. |
| Story 6    |        Tastaturauswahl        |                                                                                                               Als Benutzer möchte ich die Möglichkeit haben, die Tastatur auszuwählen, die zu meinem Computer passt. |          5 |            5 |                                                                                                                                                                        Ich kann verschiedene Tastaturen auswählen und erhalte passende Übungen dazu. |
| Story 7    |       Dauer der Lektion       |                                                                          Als Benutzer möchte ich vor dem Start der Übungslektion auswählen können, wie lange die Lektion gehen soll um meine Zeit optimal zu nutzen. |          3 |            2 |                                                                                                                                           Vor dem Start der Übung kann die Zeit eingestellt werden. Und die Lektion dauert so lange wie eingestellt. |
| Story 8    |           Hauptmenu           |                                                                                                                          Als Benutzer möchte ich ein Hauptmenü sehen um verschiedene Funktionen auswählen zu können. |          1 |            2 |                                                                                                                                                                          Es wird ein Hauptmenu angezeigt, bei dem ich wählen kann wie es weitergeht. |
| Story 9    |         Sprachauswahl         |                                                                                   Als Benutzer möchte ich die Sprache der Textausgabe einstellen können um mich in meiner Muttersprache durch die App zu navigieren. |          5 |            2 |                                                                                                                                                           Es soll die Sprache ausgewählt werden und die App wechselt danach in die gewählte Sprache. |
| Story 10   |           Rangliste           |         Es soll eine Rangliste angezeigt werden, bei der alle Benutzer die einen Test absolviert haben angezeigt werden. Es kann nach % oder Zeichen sortiert werden. Ausserdem wird das Datum und die Zeit erfasst. |          4 |            3 |                                                                                                                                                       Als Benutzer möchte ich meine bisherigen Spielstände und damit meine Entwicklung sehen können. |
| Story 11   | Fehler und Anschläge anzeigen |                                                                                                     Als Entwickler möchte ich, dass das Programm Fehler zählt und speichert, ebenso wie die Anschläge des Benutzers. |          2 |            2 |                                                                       Während dem Level gibt es ein Feld in dem die beiden Werte in Echtzeit ausgegeben werden. Ausserdem soll ein Timer starten, sobald das erste Zeichen korrekt eingegeben wurde. |
| Story 12   |      Graphische Tastatur      |                                                                                                                                         Als Benutzer möchte ich eine Tastatur mit Fingerbelegung angezeigt bekommen. |          5 |            5 |                                                                                         Während dem Level wird eine Tastatur angezeigt. Je nachdem mit welchem Finger ein Buchstabe eingegeben werden soll wird er mit einer anderen Farbe markiert. |
| Story 13   |   Zufällige Levels erzeugen   |                                                                                        Als Entwickler möchte ich eine Methode, die zufällige Buchstabenreihen bestehend aus einer Auswahl von Buchstaben zurückgibt. |          2 |            3 |                                                                                                                                                                                                             Das Programm gibt zufällige Zeichen aus. |
| Story 14   |         Namenseingabe         |                                                                                           Als Benutzer möchte ich beim Start des Programmes meinen Namen eingeben können, um ein personifiziertes Erlebnis zu haben. |          4 |            5 |                              Wenn das Programm startet gibt es einen Login Screen. Wenn ich einen neuen Namen eingebe, erstellt er einen neuen Benutzer, wenn ich einen bestehenden Benutzernamen eingebe, logt er mich als bestehenden Benutzer ein |
| Story 15   |           Ausloggen           |                                                                                                               Als Benutzer will ich mich auloggen können, damit ich mich als anderer Benutzer wieder einloggen kann. |          4 |            3 |                                                                                                                                                                     Es soll eine abmeldefunktion geben, beim abmelden soll alles gespeichert werden. |
| Story 16   |          Auswertung           |                                                                                                   Als Benutzer möchte ich am Ende der Lektion ein Feedback erhalten um meine Fehler und meinen Fortschritt zu sehen. |          3 |            2 |                                                 Am Ende der Lektion soll der ausgegebene und der Eingegebene Text ausgegeben werden. Alle Fehler sollen rot markiert sein. Ausserdem soll die Anschläge pro Minute und die Fehler ausgegeben werden. |
| Story 17   |            Abbruch            |                                                      Als Benutzer möchte ich während der Lektion abbrechen können, am Ende möchte ich aber trotzdem meine Fehler und Anschläge einsehen können um Motiviert zu sein. |          2 |            1 |                                                                                                               Während der Übung soll es eine Schaltfläche geben, mit der ich die Lektion abbrechen kann. Danach wird man auf den Endscreen geleitet. |
| Story 18   |        Eingabeanzeige         |                                                                                                           Als Benutzer möchte ich den Text sehen den ich eingegeben habe um allfällige Fehler korrigieren zu können. |          4 |            4 |                                                                                                            Es soll der eingegebene Text ausgegeben werden. Mit der löschen Taste soll Text gelöscht werden und mit den Pfeiltasten navigiert werden. |
| Story 19   |          Dauer Test           |                                                                                                     Als Aussenstehender will ich, dass jeder Test gleich lang geht um möglichst vergleichbare Resultate zu erhalten. |          5 |            1 |                                                                                                                                                                                                                     Jeder Test soll 3 Minuten gehen. |
| Story 20   |        Auswertung Test        |                                                                                                                         Als Benutzer möchte ich am Ende der Lektion eine Rückmeldung erhalten um mich zu verbessern. |          5 |            1 | Am Ende der Lektion soll der ausgegebene und der Eingegebene Text ausgegeben werden. Alle Fehler sollen rot markiert sein. Ausserdem sollen die Zeichen pro Minute sowie die Fehlerquote also wie viel % des Textes falsch waren ausgegebene werden. |
| Story 21   |         Abbruch Test          | Als Benutzer möchte ich während der Lektion abbrechen können, am Ende möchte ich aber trotzdem meine Fehler und Anschläge einsehen können um Motiviert zu sein. Das Resultat zählt allerdings nicht für die Wertung. |          4 |            1 |                                                  Während dem Test soll es eine Schaltfläche geben, mit der man den Test abbrechen kann. Vor dem abbrechen wird ein Pop-up angezeigt, das man wirklich abbrechen will und die Resultate nicht zählen. |
| Story 22   |       Vorgegebene Texte       |                                                                                                                                     Als Benutzer möchte ich vorgegebene Texte haben, um realitätsnah üben zu können. |          5 |            3 |                                                                                                                                     Es gibt 5 Lektionen, bei denen man existierende Texte abschreibt. Wenn der Text fertig ist beginnt er von vorne. |
| Story 23   |      Leistungsdiagramme       |                                                                                                                    Als Benutzer möchte ich meinen Fortschritt bei den Übungen sehen können, um motiviert zu bleiben. |          5 |            5 |                                                                                                                               Es soll ein Diagramm für jede Übung erstellt werden, bei der die Anschläge pro Minute und die Fehler angezeigt werden. |
| Story 24   |   Testmodus implementieren    |                                                                Als Entwickler möchte ich die Texteingabe, die Textausgabe, die zufällige Levelgenerierung, sowie die verschiedenen Tests vom Übungsmodus übernehmen. |          4 |            3 |                                                                                                                               Die Text ein- und ausgabe, die Levelgenerierung und die verschiedenen Levels sollen vom Übungsmodus übernommen werden. |

---

# 5) Releaseplan mit den Ausbaustufen <a name="paragraph4"></a>

| Sprint 1 | Sprint 2 |
|----------|:--------:|
| Story 1  | Story 4  |
| Story 2  | Story 7  |
| Story 3  | Story 8  |
| Story 11 | Story 16 |
| Story 13 |          |
| Story 17 |          |

---

# 6.)UML Package, Klassen- und Sequenzdiagramm<a name="subparagraph6"></a>

# Packagediagramm

Mit dem Packagediagramm wird die Package Struktur dargestellt.
![Untitled 3](https://github.com/Rhenania95/10-Finger-System/assets/147594404/4592b41f-3581-4ccc-8217-2a11f9e085f8)

# Klasseniagramm

Im Klassendiagramm werden die Beziehungen von Klassen untereinander modelliert:

![klassen-diagramm](https://github.com/Rhenania95/10-Finger-System/assets/147594404/6d391a06-abd7-444c-9165-f8fb80447550)

# Sequenzdiagramm

Das Sequenzdiagramm stellt den Ablauf des Programms dar. Erstellte Objekte sowie deren Lebensdauer werden verdeutlicht.
Die Anwendung "Tipp Dich Fitt" verwendet verschiedene Klassen, die in einem sequentiellen Ablauf interagieren. Hier ist
eine Übersicht über die wichtigsten Interaktionen zwischen den Klassen:

![diagramm1](https://github.com/Rhenania95/10-Finger-System/assets/147594404/25bce62e-a52c-4f9e-bf06-ec434c4a95ef)

## Klassenbeschreibungen

### TimerauswahlController:

- Generiert eine Übung, wenn der Benutzer auf "Bestätigen" drückt.
- Gibt die erstellte Übung an den UebungsmodusController weiter.

### UebungsmodusController:

- Holt Übungsdaten aus der Uebung-Klasse.
- Verarbeitet die Benutzereingaben während der Übung.
- Gibt die benötigten Daten an den ResultatscreenController weiter, nachdem die Übung abgeschlossen ist.

### ResultatscreenController:

- Zeigt die Ergebnisse der abgeschlossenen Übung an.
- Ermöglicht dem Benutzer, zum Hauptmenü zurückzukehren.

## Anwendung starten

Um die Anwendung auszuführen, führen Sie die `Programmstart`-Klasse aus. Diese startet die gesamte Anwendung und steuert
den Ablauf zwischen den verschiedenen Controllern und Ansichten.

## Benutzerinteraktion

- Im Hauptmenü kann der Benutzer Übungen auswählen.
- Im Timerauswahl-Fenster kann der Benutzer die Timer-Einstellungen vornehmen.
- Im Übungsmodus gibt der Benutzer die entsprechenden Zeichen ein.
- Nach Abschluss einer Übung werden die Ergebnisse im Resultatscreen angezeigt.

# 7) Dokumentation Sprint 1 <a name="paragraph5"></a>

## 7.1) Taskliste für die Umsetzung der User Story Sprint 1 <a name="subparagraph4"></a>

### User Story 1 - Textausgabe und Eingabe (1h 15')

| Task                            | Beschreibung                                                | Aufwandschätzung |
|---------------------------------|-------------------------------------------------------------|------------------|
| Textausgabe implementieren      | Code schreiben, um Text auf dem Bildschirm auszugeben       | 30'              |
| Eingabeimplementierung umsetzen | Code schreiben, um Benutzereingaben einzulesen und anzeigen | 45'              |

### User Story 2 - Fehler- und Anschlagzählung (1h)

| Task                                                  | Beschreibung                                                    | Aufwandschätzung |
|-------------------------------------------------------|-----------------------------------------------------------------|------------------|
| Funktionen zur Fehler- und Anschlagzählung hinzufügen | Code schreiben, um Fehler und Anschläge zu zählen und speichern | 1h               |

### User Story 3 - Abbruchfunktion (1h 30')

| Task                                                     | Beschreibung                                                     | Aufwandschätzung |
|----------------------------------------------------------|------------------------------------------------------------------|------------------|
| Fehlerkorrekturfunktion implementieren                   | Code schreiben, um Fehler direkt nach der Eingabe zu korrigieren | 30'              |
| Abbruchfunktion in die Benutzerschnittstelle integrieren | Schaltfläche zum Abbrechen hinzufügen                            | 1h               |

### User Story 4 - Überprüfung (1h15)

| Task                                                 | Beschreibung                                                                                                     | Aufwandschätzung |
|------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|------------------|
| Fehlermeldung bei falschem Buchstaben implementieren | Code schreiben, um eine Fehlermeldung auszugeben, wenn ein falscher Buchstabe eingegeben wurde                   | 30'              |
| Logik für den Fortschritt implementieren             | Überprüfen, ob der richtige Buchstabe eingegeben wurde, bevor der Benutzer zum nächsten Buchstaben gelangen kann | 45'              |

### User Story  5 - Zufällige Levels erzeugen (1h)

| Task                                                             | Beschreibung                                                                                   | Aufwandschätzung |
|------------------------------------------------------------------|------------------------------------------------------------------------------------------------|------------------|
| Methode zur Erzeugung zufälliger Buchstabenreihen implementieren | Funktion schreiben, um zufällige Buchstabenreihen aus einer vorgegebenen Auswahl zu generieren | 1h               |

## 7.2) Dokumentation wichtiger Code Snippets <a name="subparagraph7"></a>

Ein Punkt der uns in unserem Projekt besonders Mühe bereitete war die Weitergabe von Informationen unter den
verschiedenen Klassen.

```
private HauptmenuController hauptmenuController;
private AuswahluebungenController auswahluebungenController;
protected static TimerauswahlController timerauswahlController;
protected static UebungsmodusController uebungsmodusController;
protected static ResultatfensterController resultatfensterController;
protected Uebungsmodus uebungsmodus;
```

Der Codesnippet für Sprint 1 ist dementsprechend auch nicht sehr komplex oder schwierig. Aber er ist sehr wichtig für
unser Programm. Der Snippet bedindet sich in der Programmstartfunktion und wird abgearbeitet sobald das Programm
startet. Das wichtige an diesem Snippet ist vorallem, dass wir für jede fxml Datei einen eigenen Controller erstellt
haben. Da alle diese Controller am Anfang erstellt werden, wurde der Informationsaustausch viel einfacher. So können wir
zum Beispiel auf die Funktionen der anderen Controller zugreifen. Ausserdem haben wir eine Variable für den Uebungsmodus
erstellt, da wir diese in mehreren Klassen benötigen.

---

# 8) Dokumentation Sprint 2 <a name="paragraph6"></a>

## 8.1) Taskliste für die Umsetzung der User Story Sprint 2 <a name="subparagraph9"></a>

### User Story 6 - Hauptmenü (45')

| Task                                          | Beschreibung                                                          | Aufwandschätzung |
|-----------------------------------------------|-----------------------------------------------------------------------|------------------|
| Benutzerschnittstelle für Hauptmenü erstellen | Menü erstellen, damit Benutzer verschiedene Funktionen auswählen kann | 45'              |

### User Story 7 - Verschiedene Levels (1h)

| Task                                                   | Beschreibung                                                                                | Aufwandschätzung |
|--------------------------------------------------------|---------------------------------------------------------------------------------------------|------------------|
| Benutzerschnittstelle für Schwierigkeitsgrad erstellen | Dropdown-Menü oder Schieberegler erstellen, damit Benutzer die Schwierigkeit auswählen kann | 1h               |

### User Story 8 - Auswertung (1h 30')

| Task                                                             | Beschreibung                                                                                   | Aufwandschätzung |
|------------------------------------------------------------------|------------------------------------------------------------------------------------------------|------------------|
| Funktion zur Anzeige von Feedback und Fortschritt implementieren | Code schreiben, um dem Benutzer ein Feedback über seine Fehler und seinen Fortschritt zu geben | 1h               |
| Benutzerschnittstelle für Auswertung erstellen                   | Fenster oder Popup erstellen, um dem Benutzer am Ende der Lektion das Feedback anzuzeigen      | 30'              |

### User Story 9 - Dauer der Lektion (1h)

| Task                                              | Beschreibung                                                                              | Aufwandschätzung |
|---------------------------------------------------|-------------------------------------------------------------------------------------------|------------------|
| Benutzerschnittstelle für Lektionsdauer erstellen | Eingabefeld oder Dropdown-Menü erstellen, damit Benutzer die Lektionsdauer auswählen kann | 1h               |

## 8.2) Dokumentation wichtiger Code Snippets <a name="subparagraph12"></a>

Ein wichtiger Punkt in unserem Projekt war die Implementierung des Timers. Dieser sollte die Zeit anzeigen und nach
Ablauf der Zeit die Übung beenden. Doe grosse schwierigkeit war, dass während die Übung läuft der zähler laufen soll und
gleichzeitig soll aber das restliche Programm normal laufen. Der Timer wurde in der Klasse UebungsmodusController
implementiert. Der Timer wird mit der Funktion startTimer gestartet. Diese Funktion wird aus dem Programmstart
aufgerufen, sobald die erste Taste betätigt wird. Der Timer wird mit der Klasse Timeline implementiert. Die Klasse
Timeline ist eine Klasse von JavaFX und wird verwendet um Animationen zu erstellen. Die Klasse Timeline hat eine
Funktion namens KeyFrame. Diese Funktion wird in einem bestimmten Intervall aufgerufen. In unserem Fall wird die
Funktion jede Sekunde aufgerufen. In der Funktion wird die Zeit hochgezählt und die Zeit wird in einem Label angezeigt.
Somit kann zwischen zwei Aufrufen der Funktion (Also während einer Sekunde das restliche Programm laufen). Wenn die Zeit
abgelaufen ist, oder der Abbruchbutton betätigt wird die Funktion reset aufgerufen. In dieser Funktion wird die Übung
beendet, zurückgesetzt und das Resultatfenster wird angezeigt.

```
Duration duration = Duration.seconds(1);
KeyFrame keyFrame = new KeyFrame(duration, new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
zeiteiner++;
if (zeiteiner == 10) {
zeiteiner = 0;
zeitzener++;
}
if (zeitzener == 6) {
zeitzener = 0;
zeitminuten++;
}
if (zeitminuten == timerauswahlController.getDauer() && zeiteiner == 0) {
reset();
}
zeit = String.valueOf(zeitminuten) + ":" + String.valueOf(zeitzener) + String.valueOf(zeiteiner);
zeitausgabe.setText(zeit);
}
});
timeline.getKeyFrames().add(keyFrame);
timeline.setCycleCount(Timeline.INDEFINITE);
timeline.play();
```

# 9) Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories  <a name="paragraph6"></a>

| Testfall | Methode  | Klasse                 | Ablauf                                                                 | Ergebniss   |
|----------|----------|------------------------|------------------------------------------------------------------------|-------------|
| 1        | getDauer | TimerauswahlController | Den benutzerdefinierten Wert ist als Dauerwert benutzt und gespeichert | erfolgreich |
| 2        | main     | Programmstart          | Der Programm wurde gestartet                                           | erfolgreich |
