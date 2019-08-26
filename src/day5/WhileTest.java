/*
While循环结构的使用

一、循环结构的4个要素
①初始化条件
②循环条件--->时boolean类型
③循环体
④迭代条件

二、While循环的结构

①
while(②){
	③；
	④；
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.写while循环千万小心不要丢了迭代条件，一旦丢了，就可能导致死循环，
2.写程序，要避免出现死循环，
3.for循环和while循环是可以相互转换的!



*/
package day5;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while(i <= 100) {
			if(i % 2 == 0) {
			System.out.println(i);	
			}
			i++;
		}
	}

}
