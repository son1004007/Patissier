package chap05;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 1. 어느 고등학교의 학생 수만큼의 정수 자료형으로 배열을 만들어 보세요.
		 * 1학년은 1반부터 3반까지 12명 12명 12명
		 * 2학년은 1반부터 3반까지 9명 12명 10명
		 * 3학년은 1반부터 3반까지 7명 12명 11명
		 */
		
		int[][][] students = new int[3][3][12];
		
		students[1][0] = new int[9];
		students[1][2] = new int[10];
		students[2][0] = new int[7];
		students[2][2] = new int[11];
		
		System.out.println("1학년 1반 "+students[0][0].length+"명");
	}
}
