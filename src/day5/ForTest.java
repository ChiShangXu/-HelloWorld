/*
For循环结构的使用
一、循环结构的4个要素
①初始化条件
②循环条件--->时boolean类型
③循环体
④迭代条件

说明：
通常情况下，循环结束都是因为②中循环条件返回false了
二、for循环的结构

for(①;②;④){
	③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
*/
package day5;
public class ForTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		for(int i = 1; i <= 3; i++) {
			System.out.print("你好");
		}
		
		//练习
		int i1 = 1;
		for(System.out.print('a'); i1 <= 3; System.out.print('c'),i1++) {
			System.out.print('b');
		}
		
		//例题：遍历100以内的偶数，输出所有偶数的和，输出所有偶数的个数。
		int sum = 0;//记录偶数的和
		int count = 0;//记录偶数的个数
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {//取奇数: ==换为!=.
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("总和为： " + sum);
		System.out.println("个数为： " + count);
		
		
		
	}

}
