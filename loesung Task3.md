# Panic Room – Finale Zusammenfassung

##  Team

- **Teamname:**
 Einsamer Wolf??
- **Mitglieder:**
  - Tobias Payreder
  - Clemens Altrichter




## Überblick – Unsere Learnings (Zusammengefasst durch ChatGPT)

- Sauberes Debugging spart langfristig Zeit
- Aussagekräftige Commit-Messages sind essenziell für Teamarbeit
- Git ermöglicht das gezielte Wiederherstellen einzelner Dateien
- Tests helfen, Fehler früh zu erkennen und Regressionen zu vermeiden



## Dokumentation der Problemlösungen
### 1.
- mvn test um den Test auszuführen. 
- Dann die division durch 0 beheben. 
- Einene Weiteren Test hinzufügen
- (ich hab noch ein Exeption handling hinzugefügt)

### 2. 
 | Schlechte Commit-Message | Verbesserte Version |
|------------------------|---------------------|
| `stuff` | `Debug info added` |
| `update` | `Updated calculator syntax` |
| `update more` | `Important files added` |

---

### 3.

- `debug.log` war unnötig
- Die Datei ist entfernt worden

---

### 4.

- Es stellte sich heraus, dass `debug.log` doch wichtig war
- Vorgehensweise:

```
git log
git checkout f58dc085f86d5cf87fd448f94b294a1665db9fc9 -- debug.log
git add debug.log
git commit -m "Restore debug.log"
```