package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FifteenthTask {
	public static void main(String[] args) {
		System.out.println("Iveskite zodius, programa suskaiciuos kiek ju yra");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		System.out.println("Ivesta zodziu skaicius yra: " + countWords(line));
	}

	private static int countWords(String line) {
		String[] words = line.split(" ");
		return words.length;
	}
}
