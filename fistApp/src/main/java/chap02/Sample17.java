package chap02;

public class Sample17 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*3 +1);	//JDK 1.8 이상부터
		// (0~1미만 *3 =0~3 미만)+1
		System.out.printf("난수 : %d", num);
	}
}
