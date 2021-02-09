package chap07;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//가위 바위 보 게임
		// 랜덤값과 비교
		// 승리 여부를 출력
		// 입력 받는 값은 1자리 숫자로 가위를 1 바위를 2 보를 3으로 입력 받음
		// 0을 입력하기 전까지 무한 반복 처리 0을 입력 받으면 종료
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("가위1 / 바위2 / 보3 / 종료0 입력하세요");
			n = sc.nextInt();
			int m=(int)(Math.random()*3)+1;
			
			if(n==1) {
				if(m==1) {
					System.out.println("가위 vs 가위 비겼습니다.");
				}
				else if(m==2) {
					System.out.println("가위 vs 바위 졌습니다.");
				}
				else {
					System.out.println("가위 vs 보 이겼습니다.");
				}
			}
			else if(n==2) {
				if(m==1) {
					System.out.println("바위 vs 가위 이겼습니다.");
				}
				else if(m==2) {
					System.out.println("바위 vs 바위 비겼습니다.");
				}
				else {
					System.out.println("바위 vs 보 졌습니다.");
				}
			}
			else if(n==3){
				if(m==1) {
					System.out.println("보 vs 가위 졌습니다.");
				}
				else if(m==2) {
					System.out.println("보 vs 바위 이겼습니다.");
				}
				else {
					System.out.println("보 vs 보 비겼습니다.");
				}
			}
			else if(n==0){
				System.out.println("종료됩니다.");
				break;
				
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		sc.close();
	}
}
