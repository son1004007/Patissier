package chap06;

public class Test4 {

	public static void main(String[] args) {
		//1부터 100까지 수 중에서 소수만 출력하세요
		for(int i = 2; i<=100; i++) { 		// 1부터 100까지
			boolean f = true; // f는 참이다. 	// 초기화
			for(int j = 2; j < i ; j++) { 	// 나누기 반복
				if((i%j)==0) {
					f = false; 
					// i가 자기 자신 이외 수로 나눠지면 거짓
				}
			}
			if(f) System.out.println(i); 	// 참이면 출력
		}
		
		
//		int count =0;
//		for (int i = 2; i<=100; i++) {
//			count =0;
//			
//			for(int j= 2; j <= i; j++) {
//				if (i%j == 0) {
//					count ++;
//				}
//			}
//
//			if (count==1) {
//				System.out.println(i);
//			}
//			
//		}
	}
}
