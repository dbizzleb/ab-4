
public class aufgabe2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		statistiken();

	}

	public static void statistiken() {
		double a = 0;
		double aver = 0;
		double max = 0;
		double min = 0;
		double counter = 0;
		double sum = 0;
		while (a != -1) {
			System.out.println("geben sie eine zhal ein");
			a = IO.readDouble();
			if (a == -1) {
				break;
			}
			if (a < -100 || a > 100) {
				System.out.println("eingabe ungültig");
			} else {
				counter++;
				sum = a + sum;

				aver = sum / counter;

			}
			if (a < min || counter == 1) {
				min = a;
			}

			if (a > max || counter == 1) {
				max = a;
			}

			System.out.println(aver + " " + min + " " + max);
		}
		System.out.println(aver + " " + min + " " + max);

	}
}
