/*
100���ڵ���������

�Ż��Ĳ���

��κ���һ���㷨�����ӣ�
> ʱ�临�Ӷȣ�����ע��
> �ռ临�Ӷ�


*/
class PrimeNumberTest1 {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();//��ʼʱ��
		int count = 0;//��¼�����ĸ���
		boolean flag = true;
		for(int i = 2;i <= 100000;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){//�Ż������ٽ�ֵ��ΪMath.sqrt(i)
				
				if(i % j == 0){
					flag = false;
					break;//�Ż�һ������ڷ�����
				}

			}

			if(flag){//if(flag == true){
				//System.out.println(i);
				count++;
			}
			
			flag = true;

		}

		long end = System.currentTimeMillis();//����ʱ��
		
		System.out.println("���ѵ�ʱ��Ϊ��" + (end - start));//14943 - 1675  - 543
		System.out.println(count);//9592
	}
}
