package chap02;

public class CastingSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("byte-short-int-long");
		System.out.println("단위 바이트 : 1-2-4-8");
		int a = 65;
		byte b = (byte)a;	//정수를 byte로 명시적 형 변환
		System.out.println(b+"\t byte b에 정수 a 65를 byte로 형변환하여 저장");
		
		b = (byte)(a+1);	//a+1 정수 연산 후 byte로 명시적 형 변환
		System.out.println(b+"\t byte b에 정수 a 65를 1더한 후 byte로 형변환하여 저장");

		a = b;				// byte b를 더 큰 범위를 갖는 int a에 자동 형변환
		System.out.println(a+"\t 정수 a에 byte b 66를 저장");
		
		b = (byte)a;		// int a를 byte의 작은 범위인 byte로 명시적 형 변환
		System.out.println(b+"\t byte b에 정수 a 66를 byte로 형변환하여 저장");
	}

}
