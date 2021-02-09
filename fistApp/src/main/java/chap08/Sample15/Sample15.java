package chap08.Sample15;

public class Sample15 {

	public static void main(String[] args) {
//		Student student = new Student("기석");	// 외부클래스 생성자
		Student.Score studentScore = new Student.Score("기석");
		// 내부 클래스 생성자
		studentScore.eng = 23;
		studentScore.mat = 21;
		studentScore.showInfo();
	}
}
