/*
��д���򣺴Ӽ���������2020��ġ�month���͡�day����Ҫ��ͨ������������������Ϊ2020��ĵڼ��졣

˵������switch-case�ṹ�в�һ��ʹ��break��

��չ1����Exer3.java
��֪2020��1��1�������������Ӽ�������2020�������һ�죬���ж��������ڼ�

��չ2����SwitchCaseTest.java
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
 
   ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
	��
       2�����Ա�400����

*/
import java.util.Scanner;
class Exer2 {
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

		

	}
}
