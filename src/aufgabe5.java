
public class aufgabe5 {

	public static void main(String[] args) {

		int spielerPunkte = 0;
		int computerPunkte = 0;
		int spielrunde = 1;
		
		
		
		while (spielerPunkte != 10 || computerPunkte != 10) {
			
			System.out.println("Spielrunde: " + spielrunde);
			System.out.println("Geben Sie ein Symbol ein (Schere(0), Stein(1), Papier(2), Brunnen(3)");
			
			System.out.print("Spieler wählt: ");
			int s = spielerWahl();
			
			System.out.print("Computer wählt: " );
			int c = computerWahl();
			
			
			if(s==c) {
				System.out.println("Unentschieden! Nächste Runde!");
				spielrunde++;
			}else if (     (s==0&&(c==1||c==3)) || (s==1&&(c==2||c==3))  || (s==2&&(c==0)) || (s==3&&(c==2)))      {
				System.out.println("Computer gewinnt");
				spielrunde++;
				computerPunkte++;
			}else if (     (c==0&&(s==1||s==3)) || (c==1&&(s==2||s==3))  || (c==2&&(s==0)) ||  (c==2&&(s==3)))      {
				System.out.println("Spieler gewinnt");
				spielrunde++;
				spielerPunkte++;
			}
			
		}System.out.println("Spiel ist zuende!");
		System.out.println("Endstand: Computer: " + computerPunkte + "  Spieler: "+spielerPunkte);
		if(computerPunkte>spielerPunkte) {
			System.out.println("Computer hat gewonnen!");
		}else if(computerPunkte<spielerPunkte) {
			System.out.println("Spieler hat gewonnen!");
		}

	}
	
	
	
	
	
//__________________________METHODEN________________________________________
	public static int spielerWahl() {
		int a =IO.readInt();
		if (a == 0) {
			System.out.println("Schere");
			return 0;
		} else if (a == 1) {
			System.out.println("Stein");
			return 1;
		} else if (a == 2) {
			System.out.println("Papier");
			return 2;
		} else {
			System.out.println("Brunnen");
			return 3;
		
		}
				
	}
	
	
	public static int computerWahl() {
		int a = getRandomNumber(3);
		if (a == 0) {
			System.out.println("Schere");
			return 0;
		} else if (a == 1) {
			System.out.println("Stein");
			return 1;
		} else if (a == 2) {
			System.out.println("Papier");
			return 2;
		} else {
			System.out.println("Brunnen");
			return 3;
		
		}

	}

	// liefert eine Zufallszahl zwischen 0 und max (einschließlich)
	static int getRandomNumber(int max) {
		return new java.util.Random().nextInt(max + 1);
	}

}
