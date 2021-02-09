package chap08.Sample10;

public class Sample10 {

	public static void main(String[] args) {
		Student student = new Student("기석");	// 외부클래스 생성자
		Student.Score studentScore = student.new Score();
		// 내부 클래스 생성자
		studentScore.eng = 23;
		studentScore.mat = 21;
		studentScore.showInfo();
	}
}
