package chap07;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
	
		// 아스키표를 보고 Internet of Things를 카멜표기법으로 출력하는 코드를 작성하세요
		// 입력값 Internet of Things
		// 출력값 internetOfThings
		// 모든 단어는 소문자, 공백 다음에 오는 문자는 대문자, 공백 제거
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문장을 입력하세요");
		String s = sc.next();

		System.out.println(s);
	}
}
