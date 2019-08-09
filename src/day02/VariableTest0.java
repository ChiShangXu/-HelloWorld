/*
变量的使用
1.java定义变量的格式: 数据类型   = 变量型；
2.说明；
> 变量必须先声明，后使用；
> 变量都定义在其作用域内，在作用域内，它是有效的；出了作用域，就失效了；
> 同一个作用域内不能声明两个同名变量名；
*/
package day02;

public class VariableTest0 {

	public static void main(String[] args) {
		//变量的定义
		int myAge = 11;
		//变量的使用
		System.out.println(myAge);
		
		//变量的声明
		int myNumber;
		//变量的赋值
		myNumber = 100;
		System.out.println(myNumber);
	}

}
