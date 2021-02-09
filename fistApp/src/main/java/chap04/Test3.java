package chap04;

public class Test3 {
	public static void main(String[] args) {
		//3. 다음 소스코드만 보고 값을 예측해서 실행된 값과 비교해보세요.
		int a = 10;
		int b = 20;
		
		int r1 = ++a + ++b; // a 11 b 21 r1 32
		int r2 = a++ + b++; // a 11(12) b 21(22) r2 32
		int r3 = b++ + --a; // b22(23) a11 r3 33
		int r4 = --a + a--; // a10 a10(9) r4 20
		int r5 = b+=++a; // b23 a10 r5 33
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
