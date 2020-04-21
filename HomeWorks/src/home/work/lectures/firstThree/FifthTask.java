package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FifthTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite 5 zodzius");

		String[] mas = new String[5];
		for(int i = 0; i < mas.length; i++) {
			System.out.println(String.format("Iveskite %d zodi", i + 1));
			mas[i] = scanner.nextLine();
		}

		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
