### Izveštaj: Neformalni pregled koda i statička analiza

### Fajl: `Calculator.java`
- **Linija 3** – Preporučuje se dodavanje komentara o svrsi `import Scanner` klase, kako bi se olakšalo razumevanje načina na koji se koristi unos korisnika.
- **Linija 10** – Nedostaje Javadoc komentar za klasu `Calculator`. Preporučuje se dodavanje opisa o funkcionalnosti klase.
- **Linija 15** – Promenljive `num1` i `num2` nisu inicijalizovane. Preporučuje se inicijalizacija kako bi se sprečile greške.
- **Linija 20** – Preporučuje se prebacivanje `System.out.println` u posebnu metodu radi bolje organizacije koda.
- **Linija 30** – Nedostaju komentari iznad `case` u `switch` strukturi koji bi objasnili svrhu operatora.

**SonarLint zapažanja**:
- Move this file to a named package.
- Add a private constructor to hide the implicit public one.
- Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object".
- Rename method names to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
- Immediately return this expression instead of assigning it to the temporary variable "textResult".
- Remove this redundant jump.

---

### Fajl: `Start.java`
- **Linija 5** – Nedostaje Javadoc komentar za klasu `Start`. Preporučuje se dodavanje opisa o funkcionalnosti klase.
- **Linija 12** – Funkcija `main` nema komentare koji objašnjavaju parametre i povratnu vrednost. Preporučuje se dodavanje komentara za bolju čitljivost.

**SonarLint zapažanja**:
- Move this file to a named package.
- Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
- Replace this use of System.out by a logger.

