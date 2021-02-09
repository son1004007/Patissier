package chap07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		//임의 숫자 1~45까지 중 6개를 추첨하여, 당첨번호를 구한다.
		//중복 숫자는 있으면 안된다.
		// 총 45개의 정수 배열에서 무작위로 6개 선택. 선택 값을 출력
		// 기능 추가1. 특정 번호 사전 선택. 최소0개부터 최대 5개까지 
		Random random = new Random();
		int[] l = new int[6];
		for(int i =0; i<l.length; i++) {
			int num = random.nextInt(45)+1;
			l[i]=num;
			
			for(int j=0; j<i ;j++) {
				if(l[j]==l[i]) {
					System.out.println("중복 발생");
					i--;
				}
			}
			System.out.println("뽑힌 숫자 "+num);
		}
		

		System.out.println("내림 차순 정렬");
//		Arrays.sort(l); // 또는 아래처럼
		
		int tmp=0;
		for(int i=0; i<l.length; i++) {
			for(int j=i+1; j<l.length; j++) {
				if(l[i] > l[j]) {
					tmp = l[i];
					l[i]= l[j];
					l[j]=tmp;
				}
			}
		}
		
		System.out.println("로또 결과");
		for(int i =0; i<l.length; i++) {
			System.out.print(l[i]+"\t");
		}
	}
}
