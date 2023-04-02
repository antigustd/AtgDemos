/*

一、任何一个循环结构都包含如下的4个要素：
① 初始化条件
② 循环条件  --->boolean类型
③ 循环体
④ 迭代部分

二、do-while循环的结构

①
do{
	③
	④
}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ② - ... - ②

说明：do-while循环的循环体至少执行一次！

开发中使用for和while居多。
*/
class DoWhileTest {
	public static void main(String[] args) {
		
		//遍历100以内的偶数
		int i = 1;
		do{
			if(i % 2 == 0){
				System.out.println(i);
			}

			i++;

		}while(i <= 100);

		//########测试：do-while至少会执行一次################
		int num = 10;
		do{
			System.out.println("hello,do-while!");
			
			num--;

		}while(num > 10);

		//#################
		int num1 = 10;
		while(num1 > 10){
			System.out.println("hello,while!");
			
			num1--;
		}


	}
}
