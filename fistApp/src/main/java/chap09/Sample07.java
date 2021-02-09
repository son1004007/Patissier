package chap09;

public class Sample07 {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.study();
		Person2 p2 = new Person2();
		p2.teacher();
		Person3 p3 = new Person3();
		p3.study();
		p3.teacher();
	}
}
interface Student {
	void study();
}
interface Teacher {
	void teach();
}

class Person1 implements Student {
	
	@Override
	public void study(){
		System.out.println("학생. Person1이 공부한다.");
	}
}
class Person2 implements Teacher{
	public void 
}
