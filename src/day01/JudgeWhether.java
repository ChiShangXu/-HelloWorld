package day01;

public class JudgeWhether {

	public static void main(String[] args) {

		for (int b = 1945; b < 2020; b++) {
			if (b % 4 == 0 || b % 400 == 0) {
				System.out.println(b + "年是閏年");
			} else {
				System.out.println(b + "年是平年");

			}

		}
	}

}
