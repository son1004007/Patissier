package chap08.Sample02;

public class VO {	// Value Object
	String name;
	int age;
	
	static final int ONE ;//= 1; // static 정적 : 클래스 변수를 의미. 
	// ONE이라는 별도의 클래스를 생성하지 않고 바로 사용할 수 있는 멤버 변수
	static final int TWO ;//= 2; // final 마지막 : 상수(변수x)를 의미
	static final int THREE ;//= 3;
	
	static {
		System.out.println("static block 호출");
		ONE = 1;
		TWO = 2;
		THREE = 3;
	}
}
