package constructor;

public class Snack2 {//클래스 선언
	int price;
	
	Snack2(int p) {	//직접 선언한 생성자
		price = p;	//매개변수로 받은 값을 필드price에 대입
	
	}
	
	void info() {
		System.out.println("과자의 가격은" + price + "원입니다.");
	}
	
	
}