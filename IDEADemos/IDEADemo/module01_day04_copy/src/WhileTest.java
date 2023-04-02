/*
一、任何一个循环结构都包含如下的4个要素：
① 初始化条件
② 循环条件  --->boolean类型
③ 循环体
④ 迭代部分

二、while循环的结构
①
while(②){
	③
	④
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1. for循环和while循环是可以相互转换的
2. while循环结束后，初始化条件中如果定义了变量，还可以继续使用。而for循环不可以。

*/
class WhileTest {
	public static void main(String[] args) {
		
		//遍历100以内的偶数
		int i = 1;
		while(i <= 100){
			
			if(i % 2 == 0){
				System.out.println(i);
			}
			//一定不要忘了迭代条件！
			i++;
		}
		//
		System.out.println(i);//101

	}
}
