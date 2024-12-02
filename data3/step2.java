package data3;

import java.util.Scanner;

public class step2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력클래스
		System.out.println("나이를 입력하시오 :");
		
		int age = sc.nextInt(); //변수
		if( age > 19) {
			System.out.println("성인입니다");
		}
		System.out.println("프로그램을 종료합니다"); //조건에 맞으면 프로그램 종료
		
		
	}
}
