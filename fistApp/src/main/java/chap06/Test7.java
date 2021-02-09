package chap06;

public class Test7 {

	public static void main(String[] args) {
		int[][] array = new int[8][9];
		for(int i =2 ; i<=9 ; i++) {
			for(int j = 1; j <=9 ; j++) {
				array[i-2][j-1] = i*j;
			}
		}
		for(int i =2 ; i<=9 ; i++) {
			for(int j = 1; j <=9 ; j++) {
				System.out.print(array[i-2][j-1]+"\t");
			}
			System.out.println();
		}
	}
}
