package classBasic2;
//4번
public class StudentMain {
		public static void main(String[] args) {
			
			Student st1 = new Student();
			st1.name = "짱구";
			st1.age = 5;
			st1.gpa = 4.5;
			
			// stack메모리 -> heap 메모리에 st1객체가 생성
			System.out.println("이름 :" + st1.name);
			System.out.println("나이 :" + st1.age);
			System.out.println("학점 :" + st1.gpa);
			
		}
	
	
	
	
}
