package chap04;

public class Sample16 {
	public static void main(String[] args) {
		//3항 연산자
		int number = 6;
		String result = ((number % 2) == 0 ? "event" : "odd");
		System.out.println(result + " number");
	}
}
