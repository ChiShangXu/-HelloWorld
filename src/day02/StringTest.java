/*
1.String类型属于引用数据类型；
2.声明使用String类型变量时，使用一对"";
3.String可以和8中基本数据类型变量做运算，且只能时连接运算：+；
4.运算结果任然是String类型；
5.
*/
package day02;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = "a";
		System.out.println(s2);
		
		//*********************
		int number = 1002;
		String numberStr = "学号:";
		String info = numberStr + number;//+:连接运算
		boolean b1 = true;
		String info1 = info + b1;//连接运算
		System.out.println(info1);
		
		//练习1
		char c1 = 'a'; //A:65
		int num = 10;
		String str = "Hello";
		System.out.println(c1 + num + str);//107Hello
		System.out.println(c1+ str + num);//aHello10
		System.out.println(c1 + (num + str));//a10Hello
		System.out.println((str + num) + c1);//Hello10a
		
		//练习2
		//输出：*	 *
		System.out.println('*' + "\t" + '*');//String类型
		
	}

}
