package day04;

public class IfExer {

	public static void main(String[] args) {

		
		//练习：测算狗的年龄
		//狗的前两岁一岁相当于人类的10.5岁，之后的每一年就增加4岁 ，那么5岁的狗相当于人类的多少年龄？
		
		double dogAge = 2.5;
		if(dogAge >= 0 && dogAge <= 2 ) {
			System.out.println("相当于人的年龄：" + dogAge * 10.5);
		}else if(dogAge > 2) {
			System.out.println("相当于人的年龄：" + (2 * 10.5 + (dogAge - 2) * 4));
		}else {
			System.out.println("狗狗还没出生呢？ ");
		}
		
		int value = (int)(Math.random() * 90 + 10);
		System.out.println(value);
		//公式：[a,b] : (int)(Math.random() * (b - a + 1) + a;
	}

}
