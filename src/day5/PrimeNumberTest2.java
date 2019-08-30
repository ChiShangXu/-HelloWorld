/*
100000以内所有质数的输出:实现方式二
质数：素数，只能被1和它本身整除的自然数，-->从2开始，到这个数-1为止，都不能被这个数本身整除

对PrimeNumberTest.java文件中质数输出问题的优化

*/
package day5;
public class PrimeNumberTest2 {
	public static void main(String[] args) {
		
		int count = 0;//记录次数
		
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start1 = System.currentTimeMillis();
		
		label: for(int i = 2; i <= 100000; i++) {//遍历100以内的自然数
			
			for(int j = 2; j <= Math.sqrt(i); j++) {//j: 被i整除
				
				if(i % j == 0) {//i 被  j除尽					
					continue label;
				}
			}
			//能执行到此步骤的，都是质数
			count++;				
		}				

		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long end2 = System.currentTimeMillis();
		System.out.println("所花费的时间为: " + (end2 - start1));
		System.out.println("质数的个数为： " + count);
	}

}
		
		
		