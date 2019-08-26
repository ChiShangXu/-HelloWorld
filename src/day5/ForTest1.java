/*
编写程序从1循环到150，并每行打印一个值
要求：
在每个3的倍数行上打印出“foo”。
在每个5的倍数行上打印出“biz”。
在每个7的倍数行上打印出“baz”。


*/
package day5;

public class ForTest1 {

	public static void main(String[] args) {

		
		for(int i = 1; i <= 150; i++) {
			System.out.print(i + " ");
			
			if(i % 3 == 0) {
				System.out.print("foo ");
			}
			if(i % 5 == 0) {
				System.out.print("biz ");
			}
			if(i % 7 == 0) {
				System.out.print("baz ");
			}//换行
			System.out.println();
		}
	}

}
