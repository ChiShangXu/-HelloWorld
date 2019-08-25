/*
1.对学生的成绩 大于60分的输出“合格”，低于60分的输出“不合格”，
2.如果switch-case结构中的执行语句


*/
package day04;

public class SwitchCaseTset1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//方法一
		int score = 78;
		switch(score / 10) {
		case 0:
			System.out.println("不及格");
			break;
		case 1:
			System.out.println("不及格");
			break;
		case 2:
			System.out.println("不及格");
			break;
		case 3:
			System.out.println("不及格");
			break;
		case 4:
			System.out.println("不及格");
			break;
		case 5:
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("及格");
			break;
		case 8:
			System.out.println("及格");
			break;
		case 9:
			System.out.println("及格");
			break;
		case 10:
			System.out.println("及格");
			break;
		}
		
		//方法二
		int score2 = 78;
		switch(score2 / 10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("及格");
			break;
		}
		
		//方法三：更优的解决方案
		int score3 = 78;
		switch(score3 / 60) {
		case 0:
			System.out.println("不及格");
			break;
		case 1:
			System.out.println("及格");
			break;
		}
			
	}

}
