/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3,对它们进行排序(使用 If-else  If-else),并且从小到大输出。







*/
package day04;

import java.util.Scanner;

public class IfTest2 {

	static Scanner scanner = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("请输入第一个整数: ");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数: ");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数: ");
		int num3 = scanner.nextInt();

		if (num1 >= num2) {
			if (num3 >= num1) {
				System.out.println(num2 + "<" + num1 + "<" + num3);
			} else if (num3 <= num2) {
				System.out.println(num3 + "<" + num2 + "<" + num1);
			} else {
				System.out.println(num2 + "<" + num3 + "<" + num1);
			}
		} else {
			if (num3 >= num2) {
				System.out.println(num1 + "<" + num2 + "<" + num3);
			} else {
				System.out.println(num1 + "<" + num3 + "<" + num2);
			}
		}
	}

}
