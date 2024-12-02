package data4;

public class step4 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7 * i; i++ ) {	//공백이 하나씩 줄어듬
			for(int j = 0; j < 7 - i; j ++) {
				System.out.print(" ");
			}
			//별모양은 홀수로 늘어난다
			for (int k = 0; k < (2*i) + 1; k++) {
				System.out.print("*");
			}
			
			//줄바꿈
			System.out.println();
		}
		
	}
	
	
}
