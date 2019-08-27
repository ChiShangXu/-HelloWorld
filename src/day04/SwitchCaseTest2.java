/*
编写程序： 从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。



*/
package day04;

import java.util.Scanner;

public class SwitchCaseTest2 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入2019年的month： ");
		int month = scan.nextInt();
		System.out.println("请输入2019年的day");
		int day = scan.nextInt();
		
		//定义一个变量来保存总天数
		int sumDay = 0;
		switch(month) {
		case 12:
			sumDay += 31;
		case 11:
			sumDay += 30;
		case 10:
			sumDay += 31;
		case 9:
			sumDay += 30;
		case 8:
			sumDay += 31;
		case 7:
			sumDay += 31;
		case 6:
			sumDay += 30;
		case 5:
			sumDay += 31;
		case 4:
			sumDay += 30;
		case 3:
			sumDay += 31;
		case 2:
			sumDay += 28;
		case 1:
			sumDay += day;
		}
		System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDay + "天");
	
	}

}
