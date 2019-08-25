/*
条件:
高：178cm以上； 富： 一千万元以上，  帅：是
如果三个条件同事满足，则: “我一定要嫁给他!!!”
如果三个天剑有为真的情况: "嫁吧!比上不足，比下有余。"
如果三个条件都不满足，则: “不嫁!!!”

*/
package day04;

import java.util.Scanner;

public class IfExer2 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的身高：(cm)");
		int height = scan.nextInt();
		System.out.println("请输入你的财富：(万)");
		double wealth = scan.nextDouble();
		System.out.println("请输入你是否帅：(true / false)");
		boolean isHandsome = scan.nextBoolean();
		
		if(height >= 180 && wealth >= 1000 && isHandsome) {
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || wealth >= 1000 || isHandsome) {
			System.out.println("嫁吧!比上不足，比下有余。");
		}else {
			System.out.println("不嫁!!!");
		}
	}

}
