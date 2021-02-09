package chap04;

import java.util.Scanner;

public class Test1 { // 3항 연산자 3개 조건
	public static void main(String[] args) {
		// 1. 두개의 값을 입력받아서 큰 수를 출력하세요. (단 같으면 0으로 출력)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 띄어쓰기하여 입력해주세요. :\t ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("입력한 값중 큰수 : \t "+ ((a > b) ? a : ((a == b) ? 0 : b)));
		
		sc.close();
	}
}
