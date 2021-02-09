package chap02;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// ctrl+shift+o 로 Organize Imports 를 활성화 java.utl.Scanner 선택
		System.out.println("문자를 입력하세요.");
		String in = sc.nextLine(); // in 문자열에 입력값을 저장한다.
		System.out.printf("입력한 값 : [%s]\n글자 수 : %d\n", 
				in.toUpperCase().trim(), in.toUpperCase().trim().length());
		// 문자열을 대문자로 변환: 변수명.toUpperCase()
		// 문자열의 공백을 제거 : 변수명.trim()
		// 문자열의 길이를 확인 : 변수명.length()
		

		sc.close();
		
		
	}
}
