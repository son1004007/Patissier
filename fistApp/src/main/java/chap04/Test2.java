package chap04;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * 100점 만점의 학점을 입력받아서 
		 * 90점 이상이면, A
		 * 80점 이상이면, B
		 * 70점 이상이면, C
		 * 60점 이상이면, D
		 * 60점 미만이면, F를 구하는 프로그램을 작성하세요.
		 * (입력받는 점수는 0점에서 100점 사이의 값만 넣어야 함)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		String answer ="";
		answer = (score > 100) ? "100점 이하의 점수를 입력하세요" : 
			(score >= 90) ? "학점은 A 입니다." : 
				(score >= 80) ? "학점은 B 입니다." :
					(score >=70) ? "학점은 C 입니다." :
						(score >= 60) ? "학점은 D 입니다." :
							(score > 0) ? "학점은 F 입니다." : "0점 이상의 점수를 입력하세요" ;
		
		System.out.println(answer);
		sc.close();
	}
}
