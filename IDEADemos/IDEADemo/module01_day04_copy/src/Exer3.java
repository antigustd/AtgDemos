/*
��չ1����Exer3.java
��֪2020��1��1�������������Ӽ�������2020�������һ�죬���ж��������ڼ�
*/
import java.util.Scanner;
class Exer3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·ݣ���1-12��");
        int month = scan.nextInt();
		System.out.println("�������գ���1-31��");
		int day = scan.nextInt();

		int sumDays = 0;//��¼������

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
			info = "���ڶ�";
			break;
		case 1:
			info = "������";
			break;
		case 2:
			info = "������";
			break;
		case 3:
			info = "������";
			break;
		case 4:
			info = "������";
			break;
		case 5:
			info = "������";
			break;
		case 6:
			info = "����һ";
			break;
		default:
			info = "";
		}
		System.out.println(month + "��" + day + "����2020���" + info);
	}
}
