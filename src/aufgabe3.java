import java.util.Random;

public class aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Achtung: Start!");

		

		int trie = getRandomNumber(10);
		int versuch = trie - getRandomNumber(5);
		int warteZeit = getRandomNumber(5);
		if (warteZeit < 2) {
			warteZeit = warteZeit * 2;
		}
		wait(warteZeit);

		long schnellste = -1;
		long langsamste = -1;
		long durchschnitt = 0;
		int fehlVersuch = 0;
		int anschläge = 0;

		
		while (versuch != 0) {
			
			char f = zufallsBuchstabe();
			System.out.println(f);
			long timeNow = getMilliSeconds();
			char einleseBuchstabe = IO.readChar();

			if (f != einleseBuchstabe) {
				fehlVersuch++;
				versuch--;
				anschläge++;
			} else if (f == einleseBuchstabe) {
				versuch--;
				anschläge++;
				long timeThen = getMilliSeconds();
				long reaction = timeThen - timeNow;
				durchschnitt= reaction + durchschnitt;
				if (schnellste == -1 || schnellste > reaction) {
					schnellste=reaction;}
				if (langsamste==-1 ||langsamste < reaction ) {
					langsamste = reaction;} 
				}
			}
		System.out.println("Geschafft: Ende!");
		System.out.println("Fehlversuche: " + fehlVersuch + " von " + anschläge);
		System.out.println("Reaktionszeit-Mittelwert: "+ (durchschnitt / anschläge) + " Millisekunden");
		System.out.println("Langsamster Versuch: " + langsamste + " Millisekunden");
		System.out.println("Schnellster Versuch: " + schnellste + " Millisekunden");
		}
	
	

//__________________________Methoden_____________________________________________

	// liefert eine Zahl, die die aktuelle Zeit in Millisek repräsentiert
	static long getMilliSeconds() {
		return new java.util.Date().getTime();
	}

	// liefert eine Zufallszahl zwischen 0 und max (einschließlich)
	static int getRandomNumber(int max) {
		return new java.util.Random().nextInt(max + 1);
	}

	// hält das Programm seconds Sekunden an
	static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception exc) {
		}
	}

	// liefert den größt-möglichen long-Wert
	static long getMaxLongNumber() {
		return Long.MAX_VALUE;
	}
//-------------------------------------------------------------------------------------------------

	public static char zufallsBuchstabe() {

		Random r = new Random();
		char c = (char) ('a' + r.nextInt(27));
		return c;

	}

}
