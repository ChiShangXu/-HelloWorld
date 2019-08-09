/*
练习：随意给出一个三位数的整数，打印显示个位数，十位数，百位数的值；
格式如下：
数字XXX情况如下
个位数：
十位数：
百位数

例如：
个位数：4
十位数：5
百位数：1

*/
package day03;
public class AriExer {
	public static void main(String[] args) {
		
		//qewqwq
		int number = 154;
		int bai = number / 100;
		int shi = number % 100 / 10;
		int ge  = number % 10;
		System.out.println("百位数 =" + bai);
		System.out.println("十位数 =" + shi);
		System.out.println("个位数 =" +  ge);

	}

}
