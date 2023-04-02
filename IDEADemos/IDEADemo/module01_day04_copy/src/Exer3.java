/*
拓展1：见Exer3.java
已知2020年1月1日是星期三，从键盘输入2020年的任意一天，请判断它是星期几
*/
import java.util.Scanner;
class Exer3 {
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

		String info;
		switch(sumDays % 7 ){
		case 0:
			info = "星期二";
			break;
		case 1:
			info = "星期三";
			break;
		case 2:
			info = "星期四";
			break;
		case 3:
			info = "星期五";
			break;
		case 4:
			info = "星期六";
			break;
		case 5:
			info = "星期日";
			break;
		case 6:
			info = "星期一";
			break;
		default:
			info = "";
		}
		System.out.println(month + "月" + day + "日是2020年的" + info);
	}
}
