
public class aufgabe4 {

	public static void main(String[] args) {

		int z�hler = 0;
		System.out.println("Start des Mathetrainers");
		while (z�hler != 10) {

			int zahl1 = generiereZahl();
			int zahl2 = generiereZahl();
			char zeichen = generiereOperator();
			int ergebnisMult;
			int ergebnisDiv;

			System.out.print(zahl1 + " " + zeichen + " " + zahl2 + " = ");
			int a = ergebnis();

			if (zeichen == '/') {
				while (zahl1 == 0) {
					zahl1 = generiereZahl();
				}
				while (zahl2 == 0) {
					zahl2 = generiereZahl();
				}
				ergebnisDiv = zahl1 / zahl2;

				if (ergebnisDiv == a) {
					System.out.println("Ergebnis korrekt!");
					z�hler++;
					System.out.println("Richtige Antworten: " + z�hler);
				} else {
					System.out.println("Falsch. Das Ergebnis ist " + ergebnisDiv);
				}
			}
			if (zeichen == '*') {
				ergebnisMult = zahl1 * zahl2;
				if (ergebnisMult == a) {
					System.out.println("Ergebnis korrekt!");
					z�hler++;
					System.out.println("Richtige Antworten: " + z�hler);
				} else {
					System.out.println("Falsch. Das Ergebnis ist " + ergebnisMult);
				}
			}

		}

		System.out.println("Mathetest beendet");
		System.out.println("Korrekte Antworten: " + z�hler);
		
	}
	// _____________________________________________________________________________________

	public static int generiereZahl() {
		int a = (int) (Math.random() * 10);
		return a;
	}

	public static int ergebnis() {
		int a;
		a = IO.readInt();
		return a;
	}

	public static char generiereOperator() {
		char div = '/';
		char mul = '*';
		int a = (int) (Math.random() * 10);
		if (a < 5) {
			return div;
		} else
			return mul;

	}
}
