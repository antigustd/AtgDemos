/*
break��continue�ؼ��ֵ�ʹ��


			ʹ�÷�Χ				��ѭ���ṹ�б�ʾ����˼			��ͬ��
break:		switch-case
			ѭ���ṹ				������ǰѭ��					�ڹؼ��ֵĺ��治�ܱ�дִ�����

continue:	ѭ���ṹ				��������ѭ��					�ڹؼ��ֵĺ��治�ܱ�дִ�����


�˽����ǩ��break��continue��ʹ��
*/
class BreakContinueTest {
	public static void main(String[] args) {
		
		for(int i = 1;i <= 10;i++){
			
			if(i % 4 == 0){
				//break;
				continue;
				//���ܱ�дִ�����
				//System.out.println("��������Ȱ����ҳԷ�����");
			}

			System.out.print(i);

		}
		System.out.println("#######################");
		//##############################
		label:for(int i = 1;i <= 5;i++){
			
			for(int j = 1;j <= 10;j++){
				
				if(j % 4 == 0){
					//break;//Ĭ�ϣ���������break�ؼ��ֵ������һ��ѭ����
					//continue;//Ĭ�ϣ���������continue�ؼ��ֵ������һ��ѭ����
					
					//�˽����ǩ��break��continue��ʹ��
					//break label;
					continue label;
				}

				System.out.print(j);

			}

		
			System.out.println();
		}

	}
}
