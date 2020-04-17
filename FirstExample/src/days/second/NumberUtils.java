package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 */
public class NumberUtils {
	public static double getCorrectNumber(Scanner scanner) {
		while(true) {
			try {
				double number = scanner.nextDouble();
				return number;
			} catch(InputMismatchException ex) {
				System.out.println("Ivedete bloga skaiciu pakartokite");
				scanner.nextLine();
			}
		}
	}
}
