package data3;

public class step5 {
	public static void main(String[] args) {
		
		int a = 4;	//변수 할당
		int b = 10;
		int max = 0;
		
		
		if( a > b) {	//if else 조건문
			max = a;	//ㅈ정수 2개를 비교하여 더 큰수를 찾아냄	
		}else {
			max = b;
		}
		System.out.println(a + "와" + b + "중에 큰 수는" + max + "입니다");
	}
}
