package chap06;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력하세요 :\t");
		//단어 입력
		String str = sc.next();
		
		//암호화 시작 : encapsulation, decapsulation
		String ec="", dc="";
		for(char c : str.toCharArray()) {
			ec += ""+ (char) (c-3);
		}
		System.out.print("암호화 된 단어 :\t"+ec);
		
		
		//복호화 시작
		for(char c : ec.toCharArray()) {
			dc += ""+ (char) (c+3);
		}
		System.out.println();
		System.out.print("복호화 된 단어 :\t"+dc);
		
		
	}
}
