package days.fourth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Andrius Baltrunas
 */
public class CollectionExample {
	public static void main(String[] args) {
		//listExample();
		//setExample();
		//mapExample();

		User user = new User("andrius", "Baltrunas");
		System.out.println(user.getName() + " " + user.getSurname());
	}

	private static void mapExample(){
		Map<Integer, String> cars = new HashMap<>();

		cars.put(1999, "audi");
		cars.put(2000, "bwm");
		cars.put(1999, "volvo");

		cars.keySet().forEach(k -> System.out.println("key " + k + " value " + cars.get(k)));
		System.out.println(cars.size());
		System.out.println(cars.containsValue("bwm"));
	}

	private static void setExample(){
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(9);
		numbers.add(5);
		numbers.add(2);
		numbers.add(9);

		numbers.forEach(System.out::println);

		for(Integer numb : numbers){
			System.out.println(numb);
		}
	}

	private static void listExample() {
		List<String> names = new ArrayList<>();

		names.add("Andrius");
		names.add("Petras");
		names.add("Jonas");
		names.add("Andrius");

		System.out.println(names.size());
		System.out.println(names.get(2));
		names.forEach(System.out::println);
		System.out.println(names.contains("Jonas"));
	}
}
