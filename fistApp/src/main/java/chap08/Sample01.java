package chap08;

//import lombok.var;

public class Sample01 {

	/* 필드 영역 시작 */
	String name = "멤버 변수"; // 접근제어자가 생략된 멤버 변수
	
	private int age_chap08; // 접근 제어자(private)가 있는 변수
	
	int age = 10; 			// 지역 변수인 타입 추론 변수는 사용할 수 없음
	
	/* 필드 영역 끝*/
	
	/* 메서드 영역 시작 */
	public void sayHello() {
		/*var*/ String friend = "친구야"; 	//메서드 내의 변수를 지역변수라고 함
		System.out.println("안녕");
	}
	
	public void sayHello(String friend) {
		System.out.println("안녕");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* 메서드 영역 끝 */
	
	/* 생성자 영역 시작*/
	public Sample01() {
		
	}
	/* 생성자 영역 끝*/
}
