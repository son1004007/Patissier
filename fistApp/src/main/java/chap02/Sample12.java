package chap02;

import java.util.Scanner;

public class Sample12 {
	public static void main(String[] args) {
		// 자료형별 값
		// next() 		: 공백 이전까지 문자열을 반환
		// nextByte() 	: 공백 이전까지의 byte 형을 반환
		// nextShort() 	: 공백 이전까지의 short 형을 반환
		// nextInt() 	: 공백 이전까지의 int 형을 반환
		// nextLong() 	: 공백 이전까지의 long 형을 반환
		// nextFloat() 	: 공백 이전까지의 float 형을 반환 
		// nextDouble()	: 공백 이전까지의 Double 형을 반환
		// nextLine()	: 입력 받은 문자열 전체를 반환
		// hasNextInt()	: 다음 가져올 자료형이 int형인지 확인합니다. 맞으면 true 틀리면 false 를 반환
		Scanner sc = new Scanner(System.in);
		
		System.out.println("int 자료형을 입력하세요");
		int a = sc.nextInt();
		
		System.out.println("char  자료형을 입력하세요");
		char b = sc.next().charAt(0); // 문자열의 첫번째 문자만 가져온다.
		
		System.out.println("long 자료형을 입력하세요");
		long c = sc.nextLong();
		
		System.out.println("double 자료형을 입력하세요");
		double d = sc.nextDouble();
		
		System.out.println("String 자료형을 입력하세요");
		String e = sc.next();
		String g = sc.nextLine(); //다음줄 입력값을 갖고오기 때문에, 개행 문자가 입력되고 끝난다.
		
//		System.out.println();
		System.out.println("int : "+a);
		System.out.println("char : "+b);
		System.out.println("long : "+c);
		System.out.println("double : "+d);
		System.out.println("String : "+e);
		System.out.println("g : "+g);
		sc.close();
		
	}
}
