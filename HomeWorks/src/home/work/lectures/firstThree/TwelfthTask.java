package home.work.lectures.firstThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Andrius Baltrunas
 */
public class TwelfthTask {
	public static void main(String[] args) {

		//Buffered read file
		try(BufferedReader bf = new BufferedReader(new FileReader("users.txt"))) {
			String line;
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
