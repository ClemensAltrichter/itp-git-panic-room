# Regenwerk für Namesvergebung, Commits,...
## Branches
### Namensvergebung
- Hauptbranch - Main
- Nebenbranch - '***/...'
- Features - 'feature/...'
- Bugs - 'Bugfix/...'

*** soll die File/Hauptaufgabe oÄ sein,

. . . soll eine kurze Beschreibung der jetzigen Aufgabe sein

### Grundsätzliches
 - nicht auf Main-Branch arbeiten, um Konflikte zu vermeiden
 - Ein neuer Branch wird für jede Unterseite, und für etwas größere 'Hauptfeatures', Bugfixes, etc. erstellt, um Struktur zu bewahren
 - Ein Branch wird erst nach der kompletten fertigstellung der Umgebungsdatei
 gelöscht, um im ernstfall noch darauf zurück gegriffen werden kann

## Commit Regeln
 - Commits müssen mehr als ein Wort sein
 - immer kurz beschreiben was gemacht wurde (nicht einfach 'stuff added', 'updated smth', ...)
 - Commitmessage immer auf Englisch formulieren

## Merge Regeln
 - Mergen erst, sobald man mit der Funktion, die man erreichen möchte, ins Main übertragen möchte - ```einzige Ausnahme```: Zum Synchronisieren um Hilfe von den anderen zu bekommen
 - Jeder darf Merge requests senden
 - Nur Projektadmin darf diese Bearbeiten/Überprüfen und anschließend Akzeptieren/Ablehnen

 ### Was ist .gitignore Zusammenfassung
 Eine .gitignore-Datei legt fest, welche Dateien und Ordner von Git ignoriert werden sollen. Diese Dateien werden nicht zum Repository hinzugefügt und nicht committet. Sie wird verwendet, um automatisch erzeugte, lokale oder unnötige Dateien wie Logfiles, Build-Ordner oder IDE-Konfigurationen vom Versionskontrollsystem auszuschließen. Die .gitignore liegt im Hauptverzeichnis des Projekts und enthält Regeln wie Dateiendungen oder Ordnernamen. Bereits commitete Dateien werden von .gitignore nicht entfernt und müssen manuell aus dem Repository gelöscht werden.