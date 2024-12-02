package data4;

public class step7 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) { //i의 값이 100이 될때까지 
			if( i % 2 != 0) {
				continue; // 이번차수를 종료하고 다음 반복 실행
			}
			sum += i;
		}
		System.out.println("짝수 합 :" + sum);
		
	}
	
	
}
