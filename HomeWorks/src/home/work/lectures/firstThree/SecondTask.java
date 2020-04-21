package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class SecondTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite kiek ketinate ivesti skaiciu");

		int length = scanner.nextInt();

		int[] mas = new int[length];

		for(int i = 0; i < mas.length; i++) {
			System.out.println(String.format("Iveskite %d elementa", i + 1));
			mas[i] = scanner.nextInt();
		}

		for(int i = 0; i <mas.length; i++) {
			if(mas[i] > 100){
				System.out.println(mas[i]);
			}
		}
	}
}
