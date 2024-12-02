package data;

public class Step22 {
	public static void main(String[] args) {
		
				
	double d1 = 1.0e100;	//1.0x(10의100승)(float의 최대 범위를 넘음)
	float f1 = (float)d1;
	System.out.println(f1);
	
	double d2 = 1.0e-100;	//1.0x(10의-100승)(float의 최소 범위를 넘음)
	float f2 = (float)d2;
	System.out.println(f2);
		
	}
}