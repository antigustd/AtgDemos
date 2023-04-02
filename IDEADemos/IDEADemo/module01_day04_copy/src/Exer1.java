/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出。
*/
import java.util.Scanner;
class Exer1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入第一个整数num1：");
		int num1 = scan.nextInt();

		System.out.println("请输入第二个整数num2：");
		int num2 = scan.nextInt();

		System.out.println("请输入第三个整数num3：");
		int num3 = scan.nextInt();


		if(num1 >= num2 && num1 >= num3){
			if(num2 > num3){
				System.out.println("从小到大排列为" + num3 +"-" + num2 + "-" + num1);
			}else{
				System.out.println("从小到大排列为" + num2 + "-" + num3 + "-" + num1);
			}
		}else if(num1 <= num2 && num3 <= num2){
			if(num1 > num3){
				System.out.println("从小到大排列为" + num3 + "-" + num1 + "-" + num2);
			}else{
				System.out.println("从小到大排列为" + num1 + "-" + num3 + "-" + num2);
			}
		}else if(num3 >= num1 && num3 >= num2){
			if(num1 > num2){
				System.out.println("从小到大排列为" + num2 + "-" + num1 + "-" + num3);
			}else{
				System.out.println("从小到大排列为" + num1 + "-" + num2 + "-" + num3);
			}
		}
		
		//#####################
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = scan.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = scan.nextInt();
		System.out.println("请输入第三个数字");
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
		System.out.println("从小到大输出：" + num1 + " "+ num2 + " " + num3);
		*/
		//########推荐#############
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入三个整数：");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//
//		if(num1 > num2 ){
//			if(num2 > num3){
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num3 + "," + num2 + "," + num1);
//			}else if(num3 > num1){
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num2 + "," + num1 + "," + num3);
//			}else{
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num2 + "," + num3 + "," + num1);
//			}
//		}else{
//			if(num2 < num3){
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num1 + "," + num2 + "," + num3);
//			}else if(num3 < num1){
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num3 + "," + num1 + "," + num2);
//			}else{
//				System.out.println(num1 + "," + num2 + "和" + num3 +"的从小到大的顺序为：" + num1 + "," + num3 + "," + num2);
//			}
//		}
	}

}
