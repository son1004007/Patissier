package chap06;

public class Test3 {

	public static void main(String[] args) {
		//공백 4 별1 / 공백 3 별3 /공백 2 별5 /공백 1 별7 /공백 0 별9 
		for(int i = 1 ; i <= 5 ; i++) {
			for(int k = 1 ; k <= 5-i ; k++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j < i*2 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
