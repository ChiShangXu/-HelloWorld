/*
break和continue关键字的使用
				使用范围				循环中使用的作用(不同点)			相同点
break:			switch-case										
				循环结构中				结束当前循环					关键字后面不能声明执行语句

continue		循环结构中				结束当次循环					关键字后面不能声明执行语句

*/
package day5;

public class BreakContinueTest {

	public static void main(String[] args) {
/*
		for(int i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				break;//结果输出为： 123
				//continue;结果输出为： 123567910
				//System.out.println("你快乐吗?");//关键字后面不能声明执行语句
			}
			System.out.print(i);
		}
		*/
		labl:for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j % 4 == 0) {
					//break;//默认跳出包裹此关键字最近的一层循环。
					//continue;
					//break labl;//结束指定标识的一层循环结构
					continue labl;//结束指定标识的一层循环结构
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
