/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20最大公约数时4，最小公倍数时60。

说明：break关键字的使用。




*/
package day5;

import java.util.Scanner;

public class ForTest2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个正整数：");
		int m = scan.nextInt();
		
		System.out.println("请输入第二个正整数：");
		int n = scan.nextInt();
		
		//获取最大公约数
		//获取两个数中的较小值
		int min = (m <= n)? m : n;
		//遍历
		for(int i = min; i >= 1; i--) {
			if(m % i == 0 && n % i == 0) {
				System.out.println("最大公约数为： " + i);
				break;//一旦在循环中执行到break，就跳出循环。
			}			
		}	
		//获取最大公约数
		//获取两个数中的较大值
		int max = (m >= n)? m : n;
		//遍历
		for(int i = max; i <= m * n; i++) {
			if(i % m == 0 && i % n == 0) {
				System.out.println("最小公倍数为： " + i);
				break;//一旦在循环中执行到break，就跳出循环。
			}
		}	
	}
}
