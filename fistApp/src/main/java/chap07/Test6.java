package chap07;
import java.util.Random;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("컴퓨터가 생각하는 수를 알아보세요. 1~5 사이");
		
		Random rd = new Random();
		int b = rd.nextInt(5)+1; // int b = Math.random()*5+1
		
		int c = 0;
		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		
		do {
			c++;
			if(a > 5 && a < 1) {
				System.out.println("다시 입력하세요");
				
			}
			System.out.println(b+" 정답!!");
			
		}while(a==b);
			
		
		

		
	}
}
