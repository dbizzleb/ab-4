
public class aufgabe2e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bei diesem Spiel sollen Sie eine Zahl zwischen 1 "
				+ "und 100 in möglichst wenigen Versuchen erraten");
		
		zahlenRaten();

	}
//________________Methoden________________________________________
	public static void zahlenRaten() {
		int zufallsZahl = (int) (Math.random() * 100 + 1);
		int eingabe = 0;
		int versuche = 0;

		while (eingabe != 100) {
			System.out.println("Zahleneingabe:");
			eingabe = IO.readInt();

			if (eingabe < 1 || eingabe > 100) {
				System.out.println("Ungültige Eingabe.Achten Sie auf den vorgegebenen Zahlenintervall zwischen 1 und 100.");
			}

			else if (eingabe < zufallsZahl) {
				System.out.println("Die zu erratende Zahl ist größer.");
				versuche++;
			}

			else if (eingabe > zufallsZahl) {
				System.out.println("Die zu erratende Zahl ist kleiner.");
				versuche++;
			}

			else if (eingabe == zufallsZahl) {
				System.out.println("Sie haben die gesuchte Zahl in " + versuche + " Versuchen gefunden");

			}
		}
	}
}
