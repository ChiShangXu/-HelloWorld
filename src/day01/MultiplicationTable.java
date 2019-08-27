package day01;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a ; b++) {
				System.out.print(a + "×" + b + "=" + (b * a) + "\t");
			}
			System.out.println();
		}

		
	}

}
