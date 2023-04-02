/*
例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

说明：如果多个case结构的执行语句相同，则可以考虑合并执行语句。
*/
class SwitchCaseTest1 {
	public static void main(String[] args) {

		int score = 78;
		/*
		if(score >= 60){
			System.out.println("合格");

		}else{
			System.out.println("不合格");
		}
		*/
		/*
		
		switch(score){
		case 0:
			System.out.println("不合格");
			break;
		case 1:
			//...
		}
		*/

		//方式一：
		switch(score / 10){ //0 - 10
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不合格");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("合格");
			break;
		}

		//方式二：
		switch(score / 60){
		case 0:
			System.out.println("不合格");
			break;
		case 1:
			System.out.println("合格");
			break;
		}
	}
}
