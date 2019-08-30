/*
100000以内所有质数的输出:实现方式一
质数：素数，只能被1和它本身整除的自然数，-->从2开始，到这个数-1为止，都不能被这个数本身整除

最小的质数是: 2

对PrimeNumberTest.java文件中质数输出问题的优化
*/
package day5;
public class PrimeNumberTest {
	public static void main(String[] args) {

		//方法一
		boolean isFlag = true;//标识i是否被j除尽。一旦除尽，修改其值		
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start = System.currentTimeMillis();
		for(int i = 2; i <= 100000; i++) {//遍历100以内的自然数
			for(int j = 2; j < i; j++) {//j: 被i整除
				if(i % j == 0) {//i 被  j除尽
					isFlag = false;
					break;//优化一：只对本身非质数的自然数是有效的。
				}
			}
			if(isFlag == true) {
				
				System.out.println(i);
			}
			//重置isFlag
			isFlag = true;
		}	
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long end = System.currentTimeMillis();
		System.out.println("所花费的时间为: " + (end - start));
		
		
		/*
		
		//***************优化一*******************
		@SuppressWarnings("unused")
		boolean isFlag2 = true;//标识i是否被j除尽。一旦除尽，修改其值
		
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		@SuppressWarnings("unused")
		long start2 = System.currentTimeMillis();
		for(int i = 2; i <= 100000; i++) {//遍历100以内的自然数
			for(int j = 2; j < i; j++) {//j: 被i整除
				if(i % j == 0) {//i 被  j除尽
					isFlag = false;
					break;//优化一：只对本身非质数的自然数是有效的。
				}
			}
			if(isFlag == true) {
				
				System.out.println(i);
			}
			//重置isFlag
			isFlag = true;
		}	
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long end1 = System.currentTimeMillis();
		System.out.println("所花费的时间为: " + (end1 - start));
		
		
		

		//************优化二*****************
		boolean isFlag1 = true;//标识i是否被j除尽。一旦除尽，修改其值
		int count = 0;//记录次数
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start1 = System.currentTimeMillis();
		for(int i = 2; i <= 100000; i++) {//遍历100以内的自然数
			
			//优化二：只对本身非质数的自然数是有效的。
			for(int j = 2; j <= Math.sqrt(i); j++) {//j: 被i整除
				if(i % j == 0) {//i 被  j除尽
					isFlag1 = false;
					//break;
				}
			}
			if(isFlag1 == true) {
				count++;
				//System.out.println(i);
			}
			//重置isFlag
			isFlag1 = true;
		}	
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long end2 = System.currentTimeMillis();
		System.out.println("所花费的时间为: " + (end2 - start1));
		System.out.println("质数的个数为： " + count);
	*/
	}

}
