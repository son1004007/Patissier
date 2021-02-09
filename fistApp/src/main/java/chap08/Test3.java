package chap08;

import java.util.Scanner;

// concat() 메서드에 문자열로 넘어오는 다수의 인자를 붙여서 한줄로 출력하는 메서드를 완성하세요.

public class Test3 {

	public static void main(String[] args) {

		System.out.println(concat("A","B"));
		System.out.println(concat("A","B","C","D"));
	}
	public static String concat(String... words) {
		String result ="";
		for(String w : words) {
			result +=w;
		}
		return result;
	}
}
