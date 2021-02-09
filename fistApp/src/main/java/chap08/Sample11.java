package chap08;

public class Sample11 {

	void localMethod() {
		int age = 23;
		
		class LocalClass {
			public void howOldAreYou() {
				System.out.printf("빵형은 %d살", age);
			}
		}
		LocalClass innerClass = new LocalClass(); // 생성자
		innerClass.howOldAreYou(); // 오버로딩 
	}
	
	public static void main(String[] args) {
		Sample11 outer = new Sample11();
		outer.localMethod();
	}
}
