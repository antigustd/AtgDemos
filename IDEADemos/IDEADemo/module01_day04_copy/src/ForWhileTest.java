/*
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

1. ѭ���ṹ������������Ǿ���һ����ѭ����
2. �����У�Ҫ���������ѭ����
3. ��ν���һ��ѭ���ṹ�أ�
    > ��ʽһ��ѭ����������false
	> ��ʽ����ѭ������ִ��break

4. while(true) �� for(;;)��ʹ��
*/
import java.util.Scanner;
class ForWhileTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int positiveNumber = 0;//��¼�����ĸ���
		int negativeNumber = 0;//��¼�����ĸ���

		for(;;){//while(true){
			System.out.println("������һ�����������˳�������0��");
			int num = scan.nextInt();
			
			if(num == 0){
				break;
			}else if(num > 0){//����
				positiveNumber++;
			}else{//����
				negativeNumber++;
			}


		}

		System.out.println("�����ĸ���Ϊ��" + positiveNumber);
		System.out.println("�����ĸ���Ϊ��" + negativeNumber);
	}
}
