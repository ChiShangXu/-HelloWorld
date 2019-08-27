/*
do-while循环结构的使用

一、循环结构的4个要素
①初始化条件
②循环条件--->时boolean类型
③循环体
④迭代条件

二、do-while循环的结构

①
do{
	③；
	④
}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ② ... ②

说明：
1.do-while循环至少会执行一次循环体!
2.开发中，使用for和while更多一些。较少使用do-while。

*/
package day5;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		int count = 0;
		do {
			if(num % 2 ==0) {
				System.out.println(num);
				sum += num;
				count++;
			}
			
			num++;
			
		}while(num <=100);
		
		System.out.println("总和为： " + sum);
		System.out.println("个数为： " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
