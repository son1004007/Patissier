package chap08.Sample15;

/**
 * 정적 중첩 클래스 
 * @author son10
 *
 */
class Student {		//외부 클래스
	static String name;	// 정적 내부 클래스는 static 멤버 변수만 접근이 가능
	
	public Student(String name) {
		this.name = name;
	}
	
	public static class Score{		//내부 클래스
		int eng;
		int mat;
		
		public Score(String name) { 
			Student.name = name; 
			// 내부 클래스의 this는 내부 클래스를 참조하기 때문에 Student를 직접 참조
		}
		
		public void showInfo() {	
			System.out.println("이름 : "+name); // 외부 클래스 자원에 쉽게 접근
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+mat);
		}
	}

}
// 컴파일 경로 확인은 Project > Properties > Java Build Path > Source > Default output folder
// 경로 확인 후 Navigator에서 class 확인
