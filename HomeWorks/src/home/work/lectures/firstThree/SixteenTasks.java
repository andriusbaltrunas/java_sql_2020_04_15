package home.work.lectures.firstThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrius Baltrunas
 */
public class SixteenTasks {
	public static void main(String[] args) {
		List<String> names = readNames();
		printNames(names);
	}

	private static List<String> readNames() {
		List<String> names = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader("users.txt"))) {
			String line;
			while((line = bf.readLine()) != null) {
				names.add(line);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return names;
	}

	private static void printNames(List<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
}
