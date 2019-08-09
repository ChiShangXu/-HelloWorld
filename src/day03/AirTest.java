/*
运算符之一：算术运算符
+ 、 - 、 + 、 - 、 * 、  / 、 % 、 （前）++ 、 （后）++、（ 前）-- 、 （后）-- 

//（前）++：先自增1，再运算
//（后）++：先运算，再自增1
//结论：自增1不会改变本身变量的数据类型；

//(前)--：先自减1，再运算
//(后)--：先运算，再自减1

*/
package day03;

public class AirTest {

	public static void main(String[] args) {

		
		//除号：/
		int i1 = 12;
		int i2 = 5;
		int result1 = i1 / i2;
		System.out.println(result1);//结果：2
		
		int result2 = i1 / i2 * i2;
		System.out.println(result2);//结果：10
		
		double result3 = i1 / i2;
		System.out.println(result3);//结果：2.0
		
		double result4 = i1 / i2 + 0.0;
		System.out.println(result4);//结果：2.0
		
		double result5 = i1 / (i2 + 0.0);
		System.out.println(result5);//结果：2.4
		
		double result6 = (double)(i1 / i2);
		System.out.println(result6);//结果：2.0
		
		double result7 = (double)i1 / i2;
		System.out.println(result7);//结果：2.4
		
		//取余运算：%
		//结果的符号与被模数的符号相同；
		int n1 = 12;
		int t1 = 5;
		System.out.println("n1 % t1 =" + n1 % t1);//结果：2
		
		int n2 = -12;
		int t2 = 5;
		System.out.println("n2 % t2 =" + n2 % t2);//结果：-2
		
		int n3 = 12;
		int t3 = -5;
		System.out.println("n3 % t3 =" + n3 % t3);//结果：2
		
		int n4 = -12;
		int t4 = -5;
		System.out.println("n4 % t4 =" + n4 % t4);//结果：-2
		
		
		//（前）++：先自增1，再运算
		//（后）++：先运算，再自增1
		//结论：自增1不会改变本身变量的数据类型；
		 int b1 = 10;
		 int a1 = ++b1;
		 System.out.println("b1 = " + b1 + ",a1 = " + a1 );
		 
		 int b2 = 10;
		 int a2 = b1++;
		 System.out.println("b1 = " + b2 + ",a1 = " + a2 );
		
		
		//(前)--：先自减1，再运算
		//(后)--：先运算，再自减1
		int a3 = 10;
		int b3 = --a3;
		System.out.println("a3 = " + a3 + ",b3 = " + b3);

	}
	
}
