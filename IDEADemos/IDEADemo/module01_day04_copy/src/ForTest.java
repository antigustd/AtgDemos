/*
һ���κ�һ��ѭ���ṹ���������µ�4��Ҫ�أ�
�� ��ʼ������
�� ѭ������  --->boolean����
�� ѭ����
�� ��������

����java�й涨�����µ�����ѭ���ṹ
for;while;do-while


����forѭ����ʹ��

for(��;��;��){
	��		
}

ִ�й��̣��� - �� - �� - �� - �� - �� - �� - �� - �� - �� - .... - ��
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
		//��ʱ����forѭ���ṹ�����Դ�ʱ��i�����á�
		//System.out.println(i);
		
		//��ϰ
		int i = 1;
		for(System.out.print('a');i <= 3;System.out.print('c'),i++){
			System.out.print('b');
		}
		//��������abcbcbc
		System.out.println();
		//��ϰ������100���ڵ�ż��,������ż���ĺͣ�ż���ĸ���
		//��᣺�ۼӵ�˼��
		int sum = 0;//��¼ż���ĺ�
		int count = 0;//��¼ż���ĸ���
		for(int j = 1;j <= 100;j++){
			
			if(j % 2 == 0){
				System.out.println(j);
				sum += j;
				count++;
			}
			
		}
		System.out.println("ż���ܺ�Ϊ��" + sum);
		System.out.println("ż������Ϊ��" + count);
	}
}
