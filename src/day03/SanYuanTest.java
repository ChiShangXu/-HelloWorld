/*
运算符之六：三元运算符
1. 结构：（条件表达式）？表达式1：表达式2；
2. 说明
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2；
      如果表达式为true，则执行表达式1，
      如果表达式为false，则执行表达式2，
③ 表达式1 和表达式2 要求是一致的；
④ 三元运算符可以嵌套使用；
3. 凡是可以使用三元运算符的地方，都可以改写if-else；反之：不成立
4. 如果程序既可以使用三元运算符，又可以使用if-else结构	，那么优先选择三元运算符。原因：简洁、执行效率高。



*/
package day03;

public class SanYuanTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//获取两个整数的较大值
		int i = 11;
		int n = 12;
		
		int max3 = (i > n)? i : n;
		System.out.println(max3);
			
		n = 12;
		String maxStr = (i > n)? "i大" : ((i == n)? "i和n相等" : "n大");
		System.out.println(maxStr);
		
		//获取三个数的最大值
		int i1 = 10;   
		int i2 = 20;
		int i3 = 8;
		int max1 = (i1 > i2)? i1 : i2;
		int max2 = (max1 > i3)? max1 : i3;
		System.out.println("三个数中的最大值为： " + max2);
		
		//改写为if-else
		int n1 = 12;
		int n2 = 13;
		if(n1 > n2) {
			System.out.println("最大值为： " + n1);
		}else{
			System.out.println("最大值为： " + n2);
		}
			
		int num1 = 12;
		int num2 = 30;
		int num3 = -10;
		int max;
		if(num1 >= num2 && num1 >= num3) {
			max = num1;
		}else if(num2 >= num1 && num2 >= num3) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println("三个数中的最大数为： " + max);
		
	}

}
