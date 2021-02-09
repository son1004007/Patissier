package chap04;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		//4. 정수의 값을 입력받은 값이 양의 정수이면 출력하고, 음의 정수이면 양의 정수로 변환하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		System.out.printf("정수 : %d", (a > 0) ? a : (a * -1));
		
		sc.close();
		
	}
}
