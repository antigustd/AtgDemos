/*
100���ڵ���������

��������������ֻ�ܱ�1����������������Ȼ���� --> ��2��ʼ�������-1Ϊֹ��û���κ�һ����Ȼ��������������Լ����

���磺2 3 5 7 11 ....    8 (2-7)
*/
class PrimeNumberTest {
	public static void main(String[] args) {
		/*
		��ʽһ��

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
		//��ʽ��
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
