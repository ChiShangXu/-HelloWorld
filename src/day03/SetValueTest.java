/*
运算符之二：赋值运算符
=  +=  -+  /=  %=  


*/
package day03;

public class SetValueTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//赋值符号：=
		int i1 = 10;
		int a1 = 10;
		
		int i2 , a2;
		//连续赋值
		i2 = a2 = 10;
		
		int i3 = 10, j3 = 20;
		
		//*****************
		
		int num1 = 10;
		num1 += 2;//num1 = num2 + 2
		System.out.println(num1);//结果：12
		
		int num2 = 12;
		num2 %= 5;//num2 = num2 % 5
		System.out.println(num2);//结果：2
		
		short s1 = 10;
		//s1 = s1 + 2;//编译失败，除非用强转符。结果输出为int型
		s1 += 2;//不会改变变量本身数据类型
		System.out.println(s1);//结果：12
		
		//在开发中，如果希望变量实现+2的操作，有几种方法？（前提；int num = 10; ）；
		
		//方法一
		int num = 10;
		num = num + 2;
		System.out.println(num);
		
		//推荐使用以下这钟方法（方法二）；
		//方法二
		int num4 = 10;
		num4 += 2;
		System.out.println(num4);
		
		//在开发中，如果希望变量实现+1的操作，有几种方法？（前提；int num = 10; ）；
		
		//推荐使用以下这钟方法（方法一）；
		//方法一
		int i4 = 10;
		i4++;
		System.out.println(i4);
		
		//方法二
		int i5 = 10;
		i5 += 1;
		System.out.println(i5);
		
		//方法三
		int i6 = 10;
		i6 = i6 + 1; 
		System.out.println(i6);
		
		
	}

}
