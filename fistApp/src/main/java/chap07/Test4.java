package chap07;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//전기세를 계산하는 프로그램을 작성하세요.
		//201~400kwh 이하
		// 1~200 : 93.3원
		// 201~400 : 187.9원
		// 사용량은 키보드로부터 입력받아서 계산한다.
		// 소수점 이하 절사 방법 : Math.floor(93.3);
		// 소수점 이하 반올림 : Math.round(93.3)
		
		System.out.println("사용량을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int basic = 1600;
		double sum1 =0, sum2=0, sum3=0, bu=0, kikum=0;
		if (e< 0) {
			System.out.println("음수로 잘못 입력하셨습니다.");
		}
		else if(e <201) {
			sum1 = e*93.3;
		}
		else if(e <= 400){
			sum1 = e*187.9;
		}
		else {
			System.out.println("사용량이 400을 초과했습니다. 400 이하로 작성해주세요.");
		}
		sum2=sum1+basic;
		System.out.println("사용량 : "+e+"kWh는 기본료(1600원) +"+sum1+"원 ="+sum2+"원");
		System.out.println("부가가치세 : "+(int)(bu=Math.round(sum2*0.1)));
		System.out.println("전력산업기반기금 : "+(int)(kikum=Math.floor(sum2*0.037)));
		System.out.println("청산금액 : "+(int)sum2+" "+(int)bu+" "+(int)kikum+" "+(int)Math.floor(sum2+bu+kikum));
	}
}
