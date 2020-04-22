package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class SeventeenthTasks {
	public static void main(String[] args) {
		SeventeenthTasks seventeenthTasks = new SeventeenthTasks();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite pirma skaicius");
		int numb = scanner.nextInt();
		System.out.println("Iveskite antra skaicius");
		int secondNumb = scanner.nextInt();

		System.out.println("Suma " + seventeenthTasks.sum(numb, secondNumb));
		System.out.println("Skirtumas " + seventeenthTasks.minus(numb, secondNumb));
		System.out.println("Daugyba " + seventeenthTasks.multiply(numb, secondNumb));
	}

	private int sum(int numb, int secondNumb) {
		return numb + secondNumb;
	}

	private int minus(int numb, int secondNumb) {
		return numb - secondNumb;
	}

	private int multiply(int numb, int secondNumb) {
		return numb * secondNumb;
	}
}
