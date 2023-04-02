/*
嵌套循环的使用

1. 理解：在一个循环结构A的循环体中，又出现了另一个循环结构B。则构成嵌套循环。
   其中，循环结构A称为外层循环；循环结构B称为内层循环

2. 外层循环每执行一次，内层循环就需要完成的遍历一遍所有的数据。

3. 外层循环遍历m次，内层循环遍历n次，则内层循环的循环体一共需要执行m * n次

4. 技巧：外层循环控制行数，内层循环控制列数
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

		for(int i = 1;i <= 5;i++){//外层循环
			for(int j = 1;j <= 8;j++){//内层循环
				System.out.print("*");
			}
			System.out.println();

		}

		/*			i		j(*的个数)   j == i
	
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
						i		j(*的个数)		i + j = 5  ->  j = 5 - i
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
		//上半部分
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
