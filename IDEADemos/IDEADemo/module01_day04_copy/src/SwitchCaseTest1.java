/*
���⣺��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�

˵����������case�ṹ��ִ�������ͬ������Կ��Ǻϲ�ִ����䡣
*/
class SwitchCaseTest1 {
	public static void main(String[] args) {

		int score = 78;
		/*
		if(score >= 60){
			System.out.println("�ϸ�");

		}else{
			System.out.println("���ϸ�");
		}
		*/
		/*
		
		switch(score){
		case 0:
			System.out.println("���ϸ�");
			break;
		case 1:
			//...
		}
		*/

		//��ʽһ��
		switch(score / 10){ //0 - 10
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("���ϸ�");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("�ϸ�");
			break;
		}

		//��ʽ����
		switch(score / 60){
		case 0:
			System.out.println("���ϸ�");
			break;
		case 1:
			System.out.println("�ϸ�");
			break;
		}
	}
}
