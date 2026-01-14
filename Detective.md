# 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: Clemens Altrichter 




## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 

- der Commit wo stuff als message steht
- Der Commit wo update als message steht


## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)
- 50da5b1, Update, Begründung: tag v2-tests-broken weist auf einen fehler hin ( git log)


## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

- mit git diff: die divide Funktion in Calculator wurde geändert und funktioniert nicht mehr, weil durch 0 dividiert wird.

## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

- Calculator.java ist am wichtigsten weil in dem Commit wo etwas kaputt gegangen ist nur diese Datei geändert wurde.
- mit git show 50da5b1 herausgefunden
- Änderung : 
```
public static int divide(int a, int b) {
-        return a / b;
-    }
+    // BUG: falscher Divisor -> Division durch 0
+    return a / 0;
+}
+
```
- diese Stelle ist wichtig weil hier der Code geändert wurde, der zu problemen führt

## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

- git diff
- Änderung : 
```
public static int divide(int a, int b) {
-        return a / b;
-    }
+    // BUG: falscher Divisor -> Division durch 0
+    return a / 0;
+}
+
```
