/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

比如：12和20的最大公约数是4，最小公倍数是60。

说明：使用在循环中，表示一旦执行break，就跳出循环结构

*/
class ForTest2 {
	public static void main(String[] args) {
		int m,n;
		m = 12;
		n = 20;
		
		//获取m和n的较小值
		int min = (m < n)? m : n;

		for(int i = min;i >= 1;i--){

			if(m % i == 0 && n % i == 0){
				System.out.println("最大公约数为：" + i);
				break;//使用在循环中，表示一旦执行break，就跳出循环结构
			}
		}

		
		//获取m和n的较大值
		int max = (m > n)? m : n;

		for(int i = max;i <= m * n;i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("最小公倍数为：" + i);
				break;
			}
		}

	}
}
