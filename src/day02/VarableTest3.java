/*
强制类型转换：自动类型提升运算的逆运算；
1.需要使用强转符；
2.注意点：强制类型转换，可能导致精度损失；

*/
package day02;

public class VarableTest3 {

	public static void main(String[] args) {

		double b1 = 12.1;
		int i1 = (int)b1;//结果为：12。截断操作（只取整数部分）;
		System.out.println(i1);
		
		//没有精度损失；举例1.
		long l1 = 110;
		short s1 = (short)l1;
		System.out.println(l1);
		
		//精度损失；举例2
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
	}

}
