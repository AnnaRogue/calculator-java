### Izveštaj: Neformalni pregled koda i statička analiza

#### Fajl: Calculator.java
- **Linija 3** – Import `Scanner` klase, ali bez objašnjenja ili komentara o svrsi. Preporuka je da se doda komentar o tome kako se koristi unos korisnika.
- **Linija 10** – Nedostaje Javadoc komentar koji objašnjava svrhu klase `Calculator`.
- **Linija 15** – Promenljive `num1` i `num2` nisu inicijalizovane, što može dovesti do grešaka. Preporučuje se inicijalizacija.
- **Linija 20** – `System.out.println` može se prebaciti u posebnu metodu za bolju organizaciju koda.
- **Linija 30** – Nedostaju komentari iznad svakog `case` u `switch` strukturi koji bi objasnili svrhu operatora.

#### Fajl: Operation.java
- **Linija 5** – Nedostaje Javadoc komentar za klasu `Operation`.
- **Linija 12** – Funkcija `add` nema objašnjenje za parametre i povratnu vrednost. Preporučuje se dodavanje Javadoc komentara.
- **Linija 25** – Funkcija `subtract` nema komentare koji objašnjavaju parametre i povratnu vrednost. Preporučuje se dodavanje komentara za bolju čitljivost.
