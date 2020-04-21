package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class EleventhTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Iveskite zodi");
		int count = countLetters(sc.nextLine(), "ab");

		System.out.println("Rasta raidziu zodyje " + count);
	}

	private static int countLetters(String word, String letters) {

		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(letters.charAt(0) == word.charAt(i) && word.length() >= i + 1 && word.charAt(i + 1) == letters.charAt(1)) {
				count++;
			}
		}

		return count;
	}
}
