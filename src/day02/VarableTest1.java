/*
java定义的数据类型
一、变量按照数据类型来分；
> 基本数据类型：
			整型：byte \ short \ int \ long；
			浮点型：float \ double；
			字符型：char；
			布尔型：boolean；
 > 引用数据类型：
 			类：class；
 			接口：interface；
 			数组：array；
 			
 二、变量在类中声明的位置
 			成员变量    vs  局部变量
 
 */
package day02;

public class VarableTest1 {

	public static void main(String[] args) {
		//整型：byte(1字节=8bit) \ short（2字节） \ int（4字节） \ long（8字节）；
		//①byte范围：-128 ~ 127；
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);
		
		//②声明long型必须以"L"或"l"结尾；
		//③通常，定义整型变量时，使用int型；
		short s = 128;
		int i = 1234;
		long l = 123456789L;
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		//浮点型：float（4字节） \ double（8字节）；
		//①浮点型，表示小数点的数值；
		//②float表示数值范围比long还大；
		
		double d1 = 123.1;
		System.out.println(d1 + 1);
		//③定义float类型变量时，变量要以"F"或"f"结尾；
		float f1 = 12.3F;
		System.out.println(f1);
		//④通常，定义浮点型变量时，使用double；
		
		//字符型：char（1字符=2字节）；
		//①定义char型变量通常使用一对（''）;
		char c1 = '哎';
		c1 = '啊';
		System.out.println(c1);
			
		//②表示方式：1.声明一个字符，2.转义字符，3.直接使用 Unicode 值来表示字符型常量；
		char c2 = '\n';//换行符
		c2 = '\t';//制表符
		System.out.print("hello" + c2);
		System.out.println("world");
		
		char c3 ='\u0043';
		System.out.println(c3);
		
		
		//布尔型：boolean；
		//①只能取两个值之一：true 、 false
		boolean bb1 = true;
		//②常常在条件判断、循环结构中使用；
		System.out.println(bb1);
		
		
		boolean isMarried = true;
		if(isMarried) {
			System.out.println("你不能参加单身party了！很遗憾");
		}else {
			System.out.println("你可以多谈谈女朋友！");
		}
		
	}

}










