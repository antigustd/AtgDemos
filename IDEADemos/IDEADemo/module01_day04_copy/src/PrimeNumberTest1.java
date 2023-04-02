/*
100以内的所有质数

优化的操作

如何衡量一个算法的优劣？
> 时间复杂度（更关注）
> 空间复杂度


*/
class PrimeNumberTest1 {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();//开始时间
		int count = 0;//记录质数的个数
		boolean flag = true;
		for(int i = 2;i <= 100000;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){//优化二：临界值改为Math.sqrt(i)
				
				if(i % j == 0){
					flag = false;
					break;//优化一：针对于非质数
				}

			}

			if(flag){//if(flag == true){
				//System.out.println(i);
				count++;
			}
			
			flag = true;

		}

		long end = System.currentTimeMillis();//结束时间
		
		System.out.println("花费的时间为：" + (end - start));//14943 - 1675  - 543
		System.out.println(count);//9592
	}
}
