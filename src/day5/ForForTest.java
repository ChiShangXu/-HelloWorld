/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环

2.
外层循环:循环结构B
内层循环:循环结构A

3.说明
① 内层循环遍历一遍，只相当于外层循环体执行一次
② 假设外层循环需要执行m此，能蹭虚幻需要执行n次，此时内层循环的循环体一共执行了m * n次。

4.技巧
外层循环控制行数，内层循环控制列数
*/
package day5;

public class ForForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 6; i++) {
			System.out.print("*");
		}
		System.out.println("\n");
		
		
		for(int j = 1; j <= 4; j++) {
			for(int i = 1; i <= 6; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		/*				j(行号)		k(*的个数)
		*				1			1
		**				2			2
		***				3			3
		****			4			4
		*****			5			5
		*/
		
		for (int j = 1; j <= 5;j++) {//控制行数
			for(int k = 1; k <= j; k++) {//控制列数
				System.out.print("*");
			}
			System.out.println();
		}
		/*				j(行号)		k(*的个数)	规律：j + k = 5  换句话说：k = 5 - j;
		****			1			4
		***				2			3
		**				3			2
		*				4			1
		*/
		
		for (int j = 1; j <= 4;j++) {//控制行数
			for(int k = 1; k <= 5 - j; k++) {//控制列数
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
