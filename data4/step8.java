package data4;

import java.util.Scanner;

public class step8 {
	public static void main(String[] args) {
		
		int magicNumber = (int)(Math.random() * 50) + 1; //강제 형변환
		Scanner scan = new Scanner(System.in); // 입력 클래스
		boolean isMatched = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("찾는 숫자를 입력 >>");
			int guess = scan.nextInt();
			
			if(guess == magicNumber) {
				System.out.println((i+1) + "번째에 맞췄습니다!");
				isMatched = true;
				break; //정답이라 종료
			}else if ( guess > magicNumber ) {
				System.out.println("맞춰야할 숫자가 더 작습니다");
			}else if (guess < magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
						
		
		}
		
		if (!isMatched) {//반대값
			System.out.println("정답을 맞추지 못했습니다");
		}
		
		
	}
	
	
}