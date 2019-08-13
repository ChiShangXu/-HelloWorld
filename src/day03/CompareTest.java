/*
运算符之三：比较运算符
==  !=  >  <  >=  <=  instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 == 和 = 

*/
package day03;

public class CompareTest {

	public static void main(String[] args) {

		int i1 = 10;
		int n1 = 20;
		
		System.out.println(i1 == n1);//false
		System.out.println(i1 = n1);//20
		
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);//false
		System.out.println(b2 = b1);//true
		
		
		
		
	}

}
