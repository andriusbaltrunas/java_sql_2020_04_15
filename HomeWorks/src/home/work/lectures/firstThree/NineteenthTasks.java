package home.work.lectures.firstThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrius Baltrunas
 */

class HelperClass {
	private String fileName;

	public HelperClass(String fileName) {
		this.fileName = fileName;
	}

	public List<Integer> readNumbers() {
		List<Integer> numbers = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = bf.readLine()) != null) {
				numbers.add(Integer.valueOf(line));
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		return numbers;
	}

	public void printNumbers(List<Integer> numbers) {
		for(Integer numb: numbers) {
			System.out.println(numb);
		}
	}

	public void sumAllNumbers(List<Integer> numbers){
		int sum = 0;
		for(Integer numb : numbers) {
			sum += numb;
		}
		System.out.println("Suma yra " + sum);
	}
}

public class NineteenthTasks {
	public static void main(String[] args) {

		HelperClass helperClass = new HelperClass("numbers.txt");
		List<Integer> numbers = helperClass.readNumbers();
		helperClass.printNumbers(numbers);
		helperClass.sumAllNumbers(numbers);
	}
}
