/*
break和continue关键字的使用


			使用范围				在循环结构中表示的意思			共同点
break:		switch-case
			循环结构				跳出当前循环					在关键字的后面不能编写执行语句

continue:	循环结构				跳出当次循环					在关键字的后面不能编写执行语句


了解带标签的break和continue的使用
*/
class BreakContinueTest {
	public static void main(String[] args) {
		
		for(int i = 1;i <= 10;i++){
			
			if(i % 4 == 0){
				//break;
				continue;
				//不能编写执行语句
				//System.out.println("今晚迪丽热巴请我吃饭！！");
			}

			System.out.print(i);

		}
		System.out.println("#######################");
		//##############################
		label:for(int i = 1;i <= 5;i++){
			
			for(int j = 1;j <= 10;j++){
				
				if(j % 4 == 0){
					//break;//默认：结束包裹break关键字的最近的一层循环。
					//continue;//默认：结束包裹continue关键字的最近的一次循环。
					
					//了解带标签的break和continue的使用
					//break label;
					continue label;
				}

				System.out.print(j);

			}

		
			System.out.println();
		}

	}
}
