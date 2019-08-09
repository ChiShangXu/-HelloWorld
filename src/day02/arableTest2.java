/*
 基本数据类型之间的运算规则：
 
 前提：这里讨论只是7种基本数据类型变量间的运算，不包含boolean类型的；
 
 1.自动类型提升：
 	结论：当容量小的数据类型的变量与容量大的数据类型做运算时，结果自动提升为容量大的数据类型；
 	byte、char、 short --> int --> long --> float --> double
 	
 	特别的：当byte、char、 short三种类型的变量做运算时，结果为int型；
 	
 
2.强制类型转换：见VarableTest3.java

 	
 说明：此时的容量大小是指，表示数的范围的大和小。比如：float的容量要大于long；
 */
 package day02;

public class arableTest2 {

	public static void main(String[] args) {
			
		byte b1 = 2;
		int i1 = 12;
		int i2 = b1 + i1;
		System.out.println(i2);
		
		short s1 = 123;
		double b2 = s1;
		System.out.println(b2);//结果123.0
		
		//*************************
		char c1 = 'a';//a = 97
		int i4 = 10;
		int i5 = i4 + c1;
		System.out.println(i5);
		
		
		
	}

}
