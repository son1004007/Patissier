package chap08.Sample03;

public class Data {

	int value; // (필드에) 멤버 변수
	
//	void setValue(int value) { // 매개 변수. Setter
//		this.value = value; // 매개변수 value을 멤버 변수 value에 대입
//		// 
//	}
	// 보다 나은 코드로 작성
	void setValue(int val) {
		value = val; // 매개 변수 val을 멤버 변수 value에 대입. this를 사용하지 않음.
		// 멤버 변수와 매개 변수의 이름이 같은 것보다 다른 것이 좋은 코드다.
	}
	
	int getValue() { // Getter
		return value;
	}
	 
}
