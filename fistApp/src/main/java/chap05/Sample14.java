package chap05;

import java.util.Arrays;

public class Sample14 {
	public static void main(String[] args) {
		var students = new String[] {
			"스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아더", "한스"	
		};
		
		//레드슈즈 주인공 '스노우 화이트'를 검색
		var sortedStudents = Arrays.copyOf(students, students.length); // 배열 students를 sortedStudents로 모두 복사
		Arrays.sort(sortedStudents); // 이진 탐색을 위해 오름 차순 정렬
		
		int idx = Arrays.binarySearch(sortedStudents, "스노우 화이트"); // sortedStudents에서 스노우화이트를 찾아 idx에 배열 인덱스를 저장
		System.out.println(Arrays.toString(sortedStudents));
		System.out.printf("%d 번째에 [%s]가 위치합니다.", (idx+1), sortedStudents[idx]);
		
		
	}
}
