/*

һ���κ�һ��ѭ���ṹ���������µ�4��Ҫ�أ�
�� ��ʼ������
�� ѭ������  --->boolean����
�� ѭ����
�� ��������

����do-whileѭ���Ľṹ

��
do{
	��
	��
}while(��);

ִ�й��̣��� - �� - �� - �� - �� - �� - �� - ... - ��

˵����do-whileѭ����ѭ��������ִ��һ�Σ�

������ʹ��for��while�Ӷࡣ
*/
class DoWhileTest {
	public static void main(String[] args) {
		
		//����100���ڵ�ż��
		int i = 1;
		do{
			if(i % 2 == 0){
				System.out.println(i);
			}

			i++;

		}while(i <= 100);

		//########���ԣ�do-while���ٻ�ִ��һ��################
		int num = 10;
		do{
			System.out.println("hello,do-while!");
			
			num--;

		}while(num > 10);

		//#################
		int num1 = 10;
		while(num1 > 10){
			System.out.println("hello,while!");
			
			num1--;
		}


	}
}
