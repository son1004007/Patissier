package chap07;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 입력 받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요");
		int a = sc.nextInt();
		
		if(a<0) {
			System.out.println("음수 입니다.");
		}
		else if(a==0){
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("양수 입니다.");
		}
	}
}
