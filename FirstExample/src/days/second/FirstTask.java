package days.second;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FirstTask
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FirstTask firstTask = new FirstTask();

		System.out.println("1. Staciojo trikampio platas\n2. Staciakampio plotas\n3. Kvadratos plotas\n4. Apskirtimo plotas\n5. Baigti");

		int selection = scanner.nextInt();

		switch(selection) {
			case 1:
				firstTask.countTriangle(scanner);
				break;
			default:
				System.out.println("Tokio veiksmo nera");
		}
	}

	private void countTriangle(Scanner scanner) {
		System.out.println("Iveskite pirma statini:");
		int a = scanner.nextInt();
		System.out.println("Iveskite antra statini:");
		int b = scanner.nextInt();

		System.out.println("Trikampio plotas yra " + a * b / 2);
	}


}
