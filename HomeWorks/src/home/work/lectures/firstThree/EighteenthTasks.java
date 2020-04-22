package home.work.lectures.firstThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrius Baltrunas
 */

class UserHelper {
	private String fileName;

	public UserHelper(String fileName){
		this.fileName = fileName;
	}

	public List<String> readNames() {
		List<String> names = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = bf.readLine()) != null) {
				names.add(line);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return names;
	}

	public void printNames(List<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
}
public class EighteenthTasks {
	public static void main(String[] args) {
		UserHelper userHelper = new UserHelper("users.txt");
		List<String> names = userHelper.readNames();
		userHelper.printNames(names);
	}
}
