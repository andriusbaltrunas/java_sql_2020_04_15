package days.third;

import days.second.NumberUtils;

import java.util.Scanner;

/**
 * @author Andrius Baltrunas
 *
 *
 * 6.  	Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
 * a.       Sumos
 * b.      Skirtumo
 * c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
 * d.      Daugybos
 * e.       Kėlimas laipsniu
 * Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje.
 * Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
 * Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
 */
public class ThirdTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite du skaicius ir veiksma tarp ju pvz: 12 - 10");

		String line = scanner.nextLine();
		String[] items = line.split(" ");

		int firstNumber = (int) NumberUtils.getCorrectNumber(scanner, items[0]);
		int secondNumber = (int)NumberUtils.getCorrectNumber(scanner, items[2]);

		callRequiredAction(items[1], firstNumber, secondNumber, scanner);
	}

	private static void callRequiredAction(String action, int firstNumber, int secondNumber, Scanner scanner) {
		Calculator calculator = new Calculator(firstNumber, secondNumber);
		switch(action){
			case "+":
				System.out.println("Suma yra " + calculator.sum());
				break;
			case "-":
				System.out.println("Skirtumas yra " + calculator.minus());
				break;
			case "*":
				System.out.println("Daugtbos rezultatas yra " + calculator.multiply());
				break;
			case "/":
				System.out.println("Dalybos rezultatas yra " + calculator.division(scanner));
				break;
			case  "^":
				System.out.println("Laipsnio pakelimas " + calculator.pow());
			default:
				System.out.println("Tokio veiksmo nera");
				break;
		}
	}
}
