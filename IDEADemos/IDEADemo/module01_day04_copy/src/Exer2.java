/*
编写程序：从键盘上输入2020年的“month”和“day”，要求通过程序输出输入的日期为2020年的第几天。

说明：在switch-case结构中不一定使用break。

拓展1：见Exer3.java
已知2020年1月1日是星期三，从键盘输入2020年的任意一天，请判断它是星期几

拓展2：见SwitchCaseTest.java
从键盘分别输入年、月、日，判断这一天是当年的第几天
 
   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
	或
       2）可以被400整除

*/
import java.util.Scanner;
class Exer2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份：（1-12）");
        int month = scan.nextInt();
		System.out.println("请输入日：（1-31）");
		int day = scan.nextInt();

		int sumDays = 0;//记录总天数

		switch (month){
		case 12:
			sumDays +=30;
		case 11:
			sumDays +=31;
		case 10:
			sumDays +=30;
		case 9:
			sumDays +=31;
		case 8:
			sumDays +=31;
		case 7:
			sumDays +=30;
		case 6:
			sumDays +=31;
		case 5:
			sumDays +=30;
		case 4:
			sumDays +=31;
		case 3:
			sumDays +=29;
		case 2:
			sumDays +=31;
		case 1:
			sumDays += day;
		}

		

	}
}
