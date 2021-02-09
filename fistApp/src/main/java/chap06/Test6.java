package chap06;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int a[] = {4,6,8,2};
		
		Scanner sc = new Scanner(System.in);
//		var sc = new Scanner(System.in);
		
		System.out.print("검색할 값을 입력하세요 : ");
		int s = sc.nextInt();
		
		int count =0;
		for(int i = 0 ; i < a.length ; i++) {
			count ++;
			if(a[i]==s) {
				System.out.println(count+"번 검색하여 값을 찾았습니다.");
				break;
			}
		}
		System.out.println("찾을 수 없는 값입니다.");
	}
	
}
