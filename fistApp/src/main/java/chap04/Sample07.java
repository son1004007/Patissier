package chap04;

public class Sample07 {
	public static void main(String[] args) {
		// 논리곱
		System.out.println("논리곱 & : 둘다 참이여야 참"); // 1개 거짓이면 무조건 거짓
		System.out.println(1==1 & 2==3); 
		System.out.println(1==1 && 2==3); 
		System.out.println(1 > 2 & 4 < 2); 	// 1 > 2(거짓) 와 4 < 2를 모두 확인 
		System.out.println(1 > 2 && 4 < 2);	// 1 > 2(거짓) 만 확인
		System.out.println(1 < 2 & 4 > 2);
		
		System.out.println("논리합 | : 둘중 하나만 참이여도 참");
		System.out.println(1==1 | 2==3);
		System.out.println(1 > 2 | 4 < 2);
		System.out.println(1 < 2 | 4 > 2);
		
		System.out.println("베타 논리합 ^ : 둘이 다르면 참, 같으면 거짓");
		System.out.println(1==1 ^ 2==3);
		System.out.println(1 > 2 ^ 4 < 2);
		System.out.println(1 < 2 ^ 4 > 2);
		
		System.out.println("논리 부정 ! : 참이면 거짓, 거짓이면 참"
				+ "");
		System.out.println(! (1==1));
		System.out.println(! (1 > 2));

		
	}
}
