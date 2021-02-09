package chap02;

import java.util.Random;

public class Sample16 {
	/**
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		
		Random random= new Random();
		int num = random.nextInt(3)+1; // (0~3미만 정수) +1 : 1~3까지 출력
		System.out.printf("난수 : %d",num);
		
		
	}
}
