package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class FourteenthTasks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite zodi");
		String word = scanner.nextLine();
		if(isHaveWantedWord(word, "labas")) {
			System.out.println("Zodis labas yra");
		} else {
			System.out.println("Zodis labas nerastas");
		}
	}

	private static boolean isHaveWantedWord(String word, String wantedWord) {
		return word.contains(wantedWord);
	}
}
