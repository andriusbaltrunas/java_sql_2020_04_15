package days.second;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FirstTask
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		FirstTask firstTask = new FirstTask();

		int selection = 0;
		while(selection != 5)
		{
			System.out.println("1. Staciojo trikampio platas\n2. Staciakampio plotas\n3. Kvadratos plotas\n4. Apskirtimo plotas\n5. Baigti");
			selection = (int) firstTask.getCorrectNumber(scanner);
			switch(selection) {
				case 1:
					firstTask.countTriangle(scanner);
					break;
				case 2:
					//TODO add method
					break;
				case 3:
					//TODO add method
					break;
				case 4:
					firstTask.countCircle(scanner);
					break;
				case 5:
					System.out.println("Viso gero");
					break;
				default:
					System.out.println("Tokio veiksmo nera");
			}
		}
	}

	private void countTriangle(Scanner scanner){
		System.out.println("Iveskite pirma statini:");
		int a = (int) getCorrectNumber(scanner);
		System.out.println("Iveskite antra statini:");
		int b = (int) getCorrectNumber(scanner);

		System.out.println("Trikampio plotas yra " + a * b / 2);
	}

	private void countCircle(Scanner scanner) {
		System.out.println("Iveskite spinduli");
		double r = getCorrectNumber(scanner);
		DecimalFormat df = new DecimalFormat("0.00");
		double pi = 3.1415;
		System.out.println("Apskirtimo plotas " + df.format(Math.pow(r, 2) * pi));
	}

	private double getCorrectNumber(Scanner scanner) {
		while(true) {
			try {
				double number = scanner.nextDouble();
				return number;
			} catch(InputMismatchException ex) {
				System.out.println("Ivedete bloga skaiciu pakartokite");
				scanner.nextLine();
			}
		}
	}
}
