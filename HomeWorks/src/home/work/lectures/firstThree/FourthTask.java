package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FourthTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite 5 skaicius");

		int[] mas = new int[5];
		for(int i = 0; i < mas.length; i++) {
			System.out.println(String.format("Iveskite %d skaiciu", i + 1));
			mas[i] = scanner.nextInt();
		}

		int sum = 0;
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
			sum += mas[i];
		}

		System.out.println(String.format("\nSkaiciu suma %d", sum));
	}
}
