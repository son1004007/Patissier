package chap02;

public class Sample06 {

	public static void main(String[] args) {
		int a = 32767;	//short 최댓값
		short b = 40;
		
//		b = a;			//묵시적 형 변환 오류 발생
		b = (short) a;	//명시적 형 변환
		System.out.println(b);
		
		int c = 32768;	//short 최대값 초과
		b = (short) c;	//short 최대값 초과값을 명시적 형변환
		System.out.println(b);	
		// short 최대값 초과 출력 양수 32767의 다음 수 : -32768
	}

}
