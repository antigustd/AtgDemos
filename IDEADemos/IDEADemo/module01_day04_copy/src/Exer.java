class Exer{

	public static void main(String[] args){
		int a = 10;
		int b = 35;
		int c = 45;
		
		int max;
		if(a >= b){
			if(a >= c){
				max = a;
			}else{
				max = c;
			}

		}else{
			if(b >= c){
				max = b;
			}else{
				max = c;
			}
		}
		System.out.println(max);
		//#####################
		int max1;
		if(a >= b && a >= c){
			max1 = a;
		}else if(b >= a && b >= c){
			max1 = b;
		}else{
			max1 = c;
		}
	}

}