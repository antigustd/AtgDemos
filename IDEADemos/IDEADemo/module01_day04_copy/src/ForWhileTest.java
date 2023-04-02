/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

1. 循环结构如果不结束，那就是一个死循环！
2. 开发中，要避免出现死循环！
3. 如何结束一个循环结构呢？
    > 方式一：循环条件返回false
	> 方式二：循环体中执行break

4. while(true) 或 for(;;)的使用
*/
import java.util.Scanner;
class ForWhileTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int positiveNumber = 0;//记录正数的个数
		int negativeNumber = 0;//记录负数的个数

		for(;;){//while(true){
			System.out.println("请输入一个整数。（退出请输入0）");
			int num = scan.nextInt();
			
			if(num == 0){
				break;
			}else if(num > 0){//正数
				positiveNumber++;
			}else{//负数
				negativeNumber++;
			}


		}

		System.out.println("正数的个数为：" + positiveNumber);
		System.out.println("负数的个数为：" + negativeNumber);
	}
}
