package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FirstTask {
	public static void main(String[] args) {
		//read input from console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite skaiciu:");
		int number = scanner.nextInt();

		if(number % 2 == 0) {
			System.out.println(String.format("Skaicius %d yra lyginis", number));
		}
		else {
			System.out.println(String.format("Skaicius %d yra nelyginis", number));
		}
	}
}
