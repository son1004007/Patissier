package chap06;

public class Sample06 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <=9 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				break;
			}
			System.out.println();
		}
	}
}
