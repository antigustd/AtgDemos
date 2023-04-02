//使用带标签的continue的实现
class PrimeNumberTest2 {
	public static void main(String[] args) {

		l:for(int i = 2;i <= 100;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){//优化二：临界值改为Math.sqrt(i)
				
				if(i % j == 0){
					continue l;
				}

			}
			
			System.out.println(i);

		}

	}
}
