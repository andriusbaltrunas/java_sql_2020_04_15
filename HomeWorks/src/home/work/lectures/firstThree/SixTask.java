package home.work.lectures.firstThree;

/**
 * @author Andrius Baltrunas
 */
public class SixTask {
	public static void main(String[] args) {
		int[] numberMas = {1,2,3,4};
		String[] stringMas = {"a","b","c","d"};
		String[] mas = combineMas(numberMas, stringMas);

		for(int i = 0; i < mas.length; i ++){
			System.out.print(mas[i] + " ");
		}
	}

	private static String[] combineMas(int[] numberMas, String[] stringMas) {
		String[] resultMas = new String[numberMas.length + stringMas.length];

		int j = 0;
		for(int i = 0; i < numberMas.length; i++) {
			resultMas[j++] = String.valueOf(numberMas[i]);
			resultMas[j++] = stringMas[i];
		}

		return resultMas;
	}
}
