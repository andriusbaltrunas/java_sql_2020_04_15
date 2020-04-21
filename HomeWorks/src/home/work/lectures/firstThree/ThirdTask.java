package home.work.lectures.firstThree;

import home.work.lectures.utils.NumberUtils;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class ThirdTask {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Skaiciuosime ivestu skaiciu suma, 0 baigs skaiciavima");
		int number = -1, sum = 0;

		while(number != 0) {
			number = (int) NumberUtils.getCorrectNumber(scanner);
			sum = sum(sum, number);
		}

		System.out.println("Ivestu skaiciu suma yra " + sum);
	}

	private static int sum(int sum, int newNumber) {
		return sum + newNumber;
	}
}
