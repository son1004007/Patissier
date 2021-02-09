package chap06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//비트 연산을 활용해 5문제 답이 맞으면 1 틀리면 0 으로 연속해서 입력받습니다.
		// 그리고 정답을 2진수로 갖고 있으며, 비교하여 맞으면 o 틀리면 x를 연속으로 출력하는 프로그램을 작성하시요.
		// ox 문제 답안 맞추기
		// 답 입력 :	10110 
		// 정 답 		11001
		// 결과		0xxxx
		
		System.out.print("입력 : \t");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		int[] dap = {1,1,0,0,1};
		System.out.print("정답 : \t");
		for(int n : dap) {
			System.out.println(n);
		}
//		for(int n = 0 ; n < dap.length ; n++) {
//			System.out.print(dap[n]);
//		}
		System.out.println();
		System.out.print("결과 : \t");
		
		int targetLoc = 0;
		for(char c : in.toCharArray()) {
			System.out.print((c & dap[targetLoc++])==1 ?"o":"x");
		}
		sc.close();
	}
}
