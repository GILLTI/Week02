package data3;

import java.util.Scanner;

public class step11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 클래스
		System.out.println("원하는 숫자를 입력하세요 1 ~5 :");
		
		int num = sc.nextInt(); // 정수형 변수
		switch(num) {
		case 5 : 	// 해당하는 case에 적용할때 까지 가동 
			System.out.println("5를 입력");
			break; // 해당 case 가 맞으면 스위치문 탈출
		case 4 : 	// 해당하는 case에 적용할때 까지 가동 
			System.out.println("4를 입력");
			break; // 해당 case 가 맞으면 스위치문 탈출
		case 3 : 	// 해당하는 case에 적용할때 까지 가동 
			System.out.println("3을 입력");
			break; // 해당 case 가 맞으면 스위치문 탈출
		case 2 : 	// 해당하는 case에 적용할때 까지 가동 
			System.out.println("2를 입력");
			break; // 해당 case 가 맞으면 스위치문 탈출	
		case 1 : 	// 해당하는 case에 적용할때 까지 가동 
			System.out.println("1을 입력");
			break; // 해당 case 가 맞으면 스위치문 탈출	
		default :
			System.out.println("1부터 5까지의 숫자를 입력하세요");
		}
		
		
		
		
	}
}
