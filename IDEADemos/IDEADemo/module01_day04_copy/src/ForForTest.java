/*
Ƕ��ѭ����ʹ��

1. ��⣺��һ��ѭ���ṹA��ѭ�����У��ֳ�������һ��ѭ���ṹB���򹹳�Ƕ��ѭ����
   ���У�ѭ���ṹA��Ϊ���ѭ����ѭ���ṹB��Ϊ�ڲ�ѭ��

2. ���ѭ��ÿִ��һ�Σ��ڲ�ѭ������Ҫ��ɵı���һ�����е����ݡ�

3. ���ѭ������m�Σ��ڲ�ѭ������n�Σ����ڲ�ѭ����ѭ����һ����Ҫִ��m * n��

4. ���ɣ����ѭ�������������ڲ�ѭ����������
*/
class ForForTest {
	public static void main(String[] args) {
		
		//********
		for(int i = 1;i <= 8;i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
		/*
		********
		********
		********
		********
		********
		*/

		for(int i = 1;i <= 5;i++){//���ѭ��
			for(int j = 1;j <= 8;j++){//�ڲ�ѭ��
				System.out.print("*");
			}
			System.out.println();

		}

		/*			i		j(*�ĸ���)   j == i
	
		*			1		1		
		**			2		2
		***			3		3
		****		4		4
		*****		5		5

		*/
		for(int i = 1;i <= 5;i++){
			for(int j = 1;j <= i;j++){
				
				System.out.print("*");
			}
			System.out.println();

		}
		/*
						i		j(*�ĸ���)		i + j = 5  ->  j = 5 - i
		****			1		4
		***				2		3
		**				3		2
		*				4		1

		*/	
		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= 5 - i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
/*

----* 
---* * 
--* * * 
-* * * * 
* * * * * 


-* * * * 
--* * * 
---* * 
----* 

*/		
		//�ϰ벿��
		for(int i = 1;i <= 5;i++){
			//-
			for(int j = 1;j <= 5 - i;j++){
				System.out.print(" ");
			}
			//*
			for(int j = 1;j <= i;j++){
				
				System.out.print("* ");
			}
			System.out.println();

		}

	}
}
