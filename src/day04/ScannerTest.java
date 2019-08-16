/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体步骤：
1.导包：import java.util.Scanner
2.Scanner的实例化


*/
package day04;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		if(num > 18 ) {
			System.out.println("可以看小电影了： ");
		}else 
			System.out.println("小心警察； ");
		System.out.println(num);
	}

}
