package data3;

import java.util.Scanner;

public class step6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 클래스
		System.out.println("나이를 입력하시오");
		
		int age = sc.nextInt(); //정수형 변수
		
		if(age > 19) {	//if else 조건문
			System.out.println("성인입니다"); //19보다 크면 성인입니다 출력
		}else {
			System.out.println("미성년자입니다");
		}
			
			
			
	}
}
