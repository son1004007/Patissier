package chap07;

public class Sample07 {

	public static void main(String[] args) {
		int in=6;
		switch(in) {
		case 1, 3, 5, 7, 9: 
			// multi-label case문은 java 14에서 작업 가능, maven 업데이트 후 가능해짐
			System.out.println("홀수");
		break;
		case 2, 4, 6, 8, 10: 
			// multi-label case문은 java 14에서 작업 가능, maven 업데이트 후 가능해짐
			System.out.println("짝수");
		break;
		default:
			System.out.println("1부터 10까지수가 아님");
		}
	}
	
}
