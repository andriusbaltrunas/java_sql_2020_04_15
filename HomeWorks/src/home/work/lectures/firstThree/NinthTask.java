package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class NinthTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite skaiciu");
		int number = scanner.nextInt();

		if(number > 0) {
			System.out.println("Teigiamo skaiciaus rezultatas " + (2 * number + 8));
		}else {
			System.out.println("Neigiamo skaiciaus rezultatas " + (21 - 7 * number));
		}
	}
}
