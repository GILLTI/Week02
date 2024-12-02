package data4;

public class step2 {
	public static void main(String[] args) {
		
		
		
		
	int sum = 0;	//합을 저장할 변수
	
	for(int i =1; i <=100; i++) { //for(초기화식; 조건식; 증감식)
		if(i % 2 == 0) {	//2로 나누어 떨어지면 짝수
			sum += i; //실행문
		}
		
	}
	System.out.println("합 :" + sum);
	
	
	}
	
	
}
