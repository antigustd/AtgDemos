/*
一、任何一个循环结构都包含如下的4个要素：
① 初始化条件
② 循环条件  --->boolean类型
③ 循环体
④ 迭代部分

二、java中规定了如下的三种循环结构
for;while;do-while


三、for循环的使用

for(①;②;④){
	③		
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - .... - ②
*/
class ForTest {
	
	public static void main(String[] args) {
		/*
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		*/
	
		for(int i = 1;i <= 5;i++){//
			System.out.println("Hello World!");
		}
		//此时出了for循环结构，所以此时的i不可用。
		//System.out.println(i);
		
		//练习
		int i = 1;
		for(System.out.print('a');i <= 3;System.out.print('c'),i++){
			System.out.print('b');
		}
		//输出结果：abcbcbc
		System.out.println();
		//练习：遍历100以内的偶数,并计算偶数的和，偶数的个数
		//体会：累加的思想
		int sum = 0;//记录偶数的和
		int count = 0;//记录偶数的个数
		for(int j = 1;j <= 100;j++){
			
			if(j % 2 == 0){
				System.out.println(j);
				sum += j;
				count++;
			}
			
		}
		System.out.println("偶数总和为：" + sum);
		System.out.println("偶数个数为：" + count);
	}
}
