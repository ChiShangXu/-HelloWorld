package day04;
/*
分支结构之二 : switch-case

1.格式
switch(表达式){
case 常量1:
	执行语句1;
	//break;

case 常量2:
	执行语句1;
	//break;  
	 
...
defaule:
	执行语句n;
	//break;
	 * 
}

2.说明：
①根据switch中表达式的值，依次匹配各个case中的常量。一单匹配成功，则进入相应case结构中，调用其执行语句。
    当调用完执行语句以后，则任然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构
    末尾结束为止。

②break，可以使用在switch-case结构中，表示一旦执行到关键字，就跳出switch-case结构。

③switch结构中的表达式，只能是如下六种数据类型之一:
	byte  short  char  int  枚举类型(JDK5.0新增)  String类型(JDK7.0新增)

④case 之后只能声明常量，不能声明范围。

⑤break关键字是可选的。

⑥default：相当于if-else结构中的else。
 default结构是可选的。而且位置是灵活的
   


*/
public class SwitchCaseTset {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 3;
		switch(number){
			
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("othree");
			
		}
		
		String season = "summer";
		switch(season) {
		case "spring":
			System.out.println("春暖花开");
			break;
		case "summer":
			System.out.println("夏日炎炎");
			break;
		case "aumtumn":
			System.out.println("秋风瑟瑟");
			break;
		case "winter":
			System.out.println("冬雪皑皑");
			break;
		default:
			System.out.println("你输入有误");
						
		}
			
	}

}
