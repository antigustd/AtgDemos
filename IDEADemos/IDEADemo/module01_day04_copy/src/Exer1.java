/*
��д�����ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������
*/
import java.util.Scanner;
class Exer1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�������һ������num1��");
		int num1 = scan.nextInt();

		System.out.println("������ڶ�������num2��");
		int num2 = scan.nextInt();

		System.out.println("���������������num3��");
		int num3 = scan.nextInt();


		if(num1 >= num2 && num1 >= num3){
			if(num2 > num3){
				System.out.println("��С��������Ϊ" + num3 +"-" + num2 + "-" + num1);
			}else{
				System.out.println("��С��������Ϊ" + num2 + "-" + num3 + "-" + num1);
			}
		}else if(num1 <= num2 && num3 <= num2){
			if(num1 > num3){
				System.out.println("��С��������Ϊ" + num3 + "-" + num1 + "-" + num2);
			}else{
				System.out.println("��С��������Ϊ" + num1 + "-" + num3 + "-" + num2);
			}
		}else if(num3 >= num1 && num3 >= num2){
			if(num1 > num2){
				System.out.println("��С��������Ϊ" + num2 + "-" + num1 + "-" + num3);
			}else{
				System.out.println("��С��������Ϊ" + num1 + "-" + num2 + "-" + num3);
			}
		}
		
		//#####################
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = scan.nextInt();
		System.out.println("������ڶ�������");
		int num2 = scan.nextInt();
		System.out.println("���������������");
		int num3 = scan.nextInt();


		int temp = 0;
		if(num1 > num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if(num1 > num3){
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		if(num2 > num3){
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		System.out.println("��С���������" + num1 + " "+ num2 + " " + num3);
		*/
		//########�Ƽ�#############
//		Scanner scan = new Scanner(System.in);
//		System.out.println("����������������");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//
//		if(num1 > num2 ){
//			if(num2 > num3){
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num3 + "," + num2 + "," + num1);
//			}else if(num3 > num1){
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num2 + "," + num1 + "," + num3);
//			}else{
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num2 + "," + num3 + "," + num1);
//			}
//		}else{
//			if(num2 < num3){
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num1 + "," + num2 + "," + num3);
//			}else if(num3 < num1){
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num3 + "," + num1 + "," + num2);
//			}else{
//				System.out.println(num1 + "," + num2 + "��" + num3 +"�Ĵ�С�����˳��Ϊ��" + num1 + "," + num3 + "," + num2);
//			}
//		}
	}

}
