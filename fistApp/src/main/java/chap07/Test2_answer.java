package chap07;

import java.util.Random;
import java.util.Scanner;

public class Test2_answer {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		while(sc.hasNextInt()) {
			int you = sc.nextInt();
			if(you == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int com = random.nextInt(3)+1;
			
			System.out.println("컴퓨터 : "+com);
			
			String result = (you -com)==0? "비김":(you -com)==-1?"패":"승";
			
			System.out.println("결과 : "+result);
			System.out.println("숫자를 입력하세요 : ");
			
		}
	}
}
