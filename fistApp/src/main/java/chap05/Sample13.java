package chap05;

import java.util.Arrays;

public class Sample13 {
	public static void main(String[] args) {
		String[] han1 = new String[]
				{"라면","미역국","떡볶이","수제비","갈비탕","순대국"};
		System.out.println("정렬 전 : "+Arrays.toString(han1));
		
		String[] han2 = Arrays.copyOf(han1, han1.length); // 전체 정렬
		String[] han3 = Arrays.copyOf(han1, han1.length); // 범위 정렬
		
		Arrays.sort(han2); // han2 오름차순 정렬
		Arrays.sort(han3, 2, 5); //han3을 인덱스2(3번째)부터 인덱스5(6번째)까지 오름차순 정렬
		System.out.println("전체정렬 : "+Arrays.toString(han2));
		System.out.println("범위정렬 : "+Arrays.toString(han3));
	}
}
