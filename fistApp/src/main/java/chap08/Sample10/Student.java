package chap08.Sample10;

public class Student {		//외부 클래스
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public class Score{		//내부 클래스
		int eng;
		int mat;
		public void showInfo() {	
			System.out.println("이름 : "+name); // 외부 클래스 자원에 쉽게 접근
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+mat);
		}
	}

}
// 컴파일 경로 확인은 Project > Properties > Java Build Path > Source > Default output folder
// 경로 확인 후 Navigator에서 class 확인
