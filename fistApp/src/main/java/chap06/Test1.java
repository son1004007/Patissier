package chap06;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int a = scr.nextInt();
		int[] array = new int[a];
		for(int i =0 ; i < array.length ; i++) {
			array[i] = (i+1);
		}
		for(int i = 0 ; i < a ; i++) {
			 System.out.println(array[i]);
		}
		scr.close();
	}
}
