package chap08;

public class Sample18 {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("빵형1", 21, 1);
		students[1] = new Student("빵형2", 22, 2);
		students[2] = new Student("빵형3", 23, 3);
		
		for(Student student : students) {
			System.out.println(student.toString());
		}
				
	}
}
