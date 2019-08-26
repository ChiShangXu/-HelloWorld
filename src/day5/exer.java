package day5;

public class  exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long beginTime = System.currentTimeMillis();
		int Sum = 0;
		for(int i = 1; i <= 100000; i++) {
			if(i % 2 != 0) {
				Sum += i;		
			}
		}
		System.out.println("100以内所有奇数的和为： " + Sum);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - beginTime + "ms");
		
		long beginTime1 = System.currentTimeMillis();
		int Sum1 = 0;
		for(int i = 1; i <= 50; i++) {
				Sum1 += i * 2 - 1;		
		}
		System.out.println("100以内所有奇数的和为： " + Sum1);
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1 - beginTime1 + "ms");
		
	}

}
