package home.work.lectures.firstThree;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class TenTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Iveskite zodi");
		int count = countLetters(sc.nextLine(), 'a');

		System.out.println("Rasta raidziu zodyje " + count);
	}

	private static int countLetters(String word, char letter) {
		if(word == null || word.length() == 0) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(letter == word.charAt(i)) {
				count++;
			}
		}

		return count;
	}
}
