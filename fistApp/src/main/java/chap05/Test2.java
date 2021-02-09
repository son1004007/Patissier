package chap05;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		//2. 5행과 5열로 이루어진 2차원배열을 아래와 같이 데이터를 넣고 출력하세요.
		// 빈공간은 null 입니다. 숫자형인 경우는 0이 됩니다.
		// Arrays.toString 사용
		/*
		 * 00006
		 * 00056
		 * 00456
		 * 03456
		 * 23456
		 */
		
		int[][] array = new int[5][5];
		
		array[0][4] = 6;
		array[1][3]=5;
		array[1][4]=6;
		array[2][2]=4;
		array[2][3]=5;
		array[2][4]=6;
		array[3][1]=3;
		array[3][2]=4;
		array[3][3]=5;
		array[3][4]=6;
		array[4][0]=2;
		array[4][1]=3;
		array[4][2]=4;
		array[4][3]=5;
		array[4][4]=6;
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		System.out.println(Arrays.toString(array[3]));
		System.out.println(Arrays.toString(array[4]));
		System.out.println(Arrays.toString(array[5]));
		
	}
}
