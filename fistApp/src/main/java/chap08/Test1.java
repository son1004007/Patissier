package chap08;
// 100  이하의 정수를 입력받아서 for문을 사용하지 않고(do while를 사용하라), 메서드만 이용하여
// 1부터 입력받은 수까지의 합을 구하는 코드를 작성하세요.
// 단 0을 입력하면 종료합니다.

import java.util.Scanner;


public class Test1 {
	
	static int num1, sum, count;
	
	public static void main(String[] args) {
		System.out.println("100 이하의 정수를 입력하세요");
		System.out.println("단, 0을 입력하면 종료됩니다.");
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		do {
			if(num1 == 0) {
				System.out.println("종료합니다.");
				break;
			}
			else if(num1>100) {
				System.out.println("100보다 큰값을 입력했습니다. 다시 입력하세요");
				num1=sc.nextInt();
				continue;
			}
			
//			sum += count;
//			count++;
			total(num1); // total을 메서드로 생성
			
		}while(num1 >= count);
		
		System.out.println("총합 : "+sum);
		sc.close();
	}

	static int total(int num1){
		if(num1 > 0) {
			sum += count;
			count++;
		}
		return sum;
	}
	
}
