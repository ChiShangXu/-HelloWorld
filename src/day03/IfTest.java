/*
分支结构中的If-else(条件判断结构)

一、三种结构

第一种：
If(条件表达式){

}

第二种：二选一
If(条件表达式){
 	执行表达式1
}else{
 	执行表达式2
}

第三种：n选一
If(条件表达式){
	执行表达式1
}else if(条件表达式){
	执行表达式2
}else if(条件表达式){
	执行表达式3
}
......
else{
	执行表达式n
}


*/
package day03;

public class IfTest {

	public static void main(String[] args) {

		//举例1
		int heartBeats = 80;
		if(heartBeats < 60 || heartBeats > 100) {
			System.out.println("需要进一步检查");
		}
		System.out.println("检查结束");
		
		//举例2
		int age = 23;
		if(age < 18) {
			System.out.println("还可以看动画片");
		}else {
			System.out.println("你可以看成人电影了");
		}
		
		//举例3
		if(age < 15) {
			System.out.println("你已涉嫌违法");
		}else if (age < 18){
			System.out.println("年龄未达到");
		}else if (age < 35) {
			System.out.println("注意节制");
		}else if (age < 60) {
			System.out.println("别撸了，伤身体");
		}else if (age < 80) {
			System.out.println("你真牛~");
		}else {
			System.out.println("老当益壮");
		}
		
		
		
	}

}
