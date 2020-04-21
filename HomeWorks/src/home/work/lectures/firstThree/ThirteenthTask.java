package home.work.lectures.firstThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Andrius Baltrunas
 */
public class ThirteenthTask {
	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new FileReader("users.txt"))) {
			String line;
			while((line = bf.readLine()) != null) {
				if(line.startsWith("A")) {
					System.out.println(line);
				}
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
