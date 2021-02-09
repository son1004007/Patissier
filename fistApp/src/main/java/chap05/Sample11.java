package chap05;

import java.util.Arrays;

public class Sample11 {
	public static void main(String[] args) {
		int[] correct = {1,2,3,4,1,4,3,2,1,3};
		int[][] answers = {
				{2,2,2,2,2,2,2,2,2,2},
				{3,2,3,1,2,3,1,2,1,2},
				{1,2,3,4,1,4,3,2,1,3},
				{4,2,3,4,1,4,3,2,1,3},
				{1,2,4,4,2,1,2,2,4,3}
		};
		
		int no = 0;
		for(int[] answer : answers) {
			no++;
			if(Arrays.equals(correct, answer)) {
				System.out.printf("%d번 학생은 만점자 입니다.\n", no);
			}
			else {
				System.out.printf("%d번 학생은 만점자가 아닙니다.\n", no);
			}
		}
		
	}
}
