/*
��Ŀ����������������m��n���������Լ������С��������

���磺12��20�����Լ����4����С��������60��

˵����ʹ����ѭ���У���ʾһ��ִ��break��������ѭ���ṹ

*/
class ForTest2 {
	public static void main(String[] args) {
		int m,n;
		m = 12;
		n = 20;
		
		//��ȡm��n�Ľ�Сֵ
		int min = (m < n)? m : n;

		for(int i = min;i >= 1;i--){

			if(m % i == 0 && n % i == 0){
				System.out.println("���Լ��Ϊ��" + i);
				break;//ʹ����ѭ���У���ʾһ��ִ��break��������ѭ���ṹ
			}
		}

		
		//��ȡm��n�Ľϴ�ֵ
		int max = (m > n)? m : n;

		for(int i = max;i <= m * n;i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("��С������Ϊ��" + i);
				break;
			}
		}

	}
}
