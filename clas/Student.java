package clas;

public class Student {//클래스 선언
		static String schoolName = "코리아 고등학교";	//정적 멤버 선언
		String studentName;
		
		static void goToSchool() { //정적 메서드 선언
			System.out.println("학교에 갑니다.");
		}
		
		void hello() { //인스턴스 메서드 호출
			System.out.println("안녕하세요, 제 이름은" + studentName + "입니다.");
		}
	}
	
	
	
	