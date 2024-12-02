package data4;

public class step6 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {		//do 이후의 조건식이 true면 수행함
				sum += i;
				i++;
		}while(i <= 10);
		
		
		
		
		System.out.println("합 : " + sum);
		
	}
	
	
}
