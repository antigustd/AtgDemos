//ʹ�ô���ǩ��continue��ʵ��
class PrimeNumberTest2 {
	public static void main(String[] args) {

		l:for(int i = 2;i <= 100;i++){
			
			for(int j = 2;j <= Math.sqrt(i);j++){//�Ż������ٽ�ֵ��ΪMath.sqrt(i)
				
				if(i % j == 0){
					continue l;
				}

			}
			
			System.out.println(i);

		}

	}
}
