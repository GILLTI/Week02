package data3;

import java.util.Scanner;

public class step9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 클래스
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt(); //정수 변수
		if(age > 19) {	//if else if 조건문
			System.out.println("성인입니다");
		}else if(age > 13) {
			System.out.println("청소년입니다");
		}else if (age > 6) {
			System.out.println("어린입니다");
		}else {
			System.out.println("유아입니다");
		}
		
		
	}
}
