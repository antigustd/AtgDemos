/*
100以内的所有质数

质数（素数）：只能被1和它本身整除的自然数。 --> 从2开始到这个数-1为止，没有任何一个自然数是这个数本身的约数。

比如：2 3 5 7 11 ....    8 (2-7)
*/
class PrimeNumberTest {
	public static void main(String[] args) {
		/*
		方式一：

		for(int i = 2;i <= 100;i++){
			int count = 0;
			for(int j = 2;j < i;j++){
				
				if(i % j != 0){
					count++;
				}

			}

			if(count == i - 2){
				System.out.println(i);
			}

			
		}
		*/
		//方式二
		boolean flag = true;
		for(int i = 2;i <= 100;i++){
			
			for(int j = 2;j < i;j++){
				
				if(i % j == 0){
					flag = false;
				}

			}

			if(flag){//if(flag == true){
				System.out.println(i);
			}
			
			flag = true;

		}

	}
}
