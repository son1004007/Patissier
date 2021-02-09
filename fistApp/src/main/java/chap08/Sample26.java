package chap08;

import lombok.RequiredArgsConstructor;

public class Sample26 {

	public static void main(String[] args) {
		Person per1 = new Person(1);
		Person per2 = new Person(2, "Mary");
		Person per3 = new Person(3, "Peter", "010-1234-1234"); // 생성자를 또 추가함
	}
}

@RequiredArgsConstructor
class Person{
	private final int no;
	private String name;
	private String phone;
	
//	Person(int no){	
//	 // RequiredArgsConstructor 에 의해 자동으로 만들어지며, 해당 생성자를 사용하지 않는다.
//		this.no = no;
//		System.out.println(no);
//	}
	Person(int no, String name){
		this.no = no;
		this.name = name;
		System.out.println(no+""+name);
	}
	Person(int no, String name, String phone){
		this.no = no;
		this.name = name;
		this.phone = phone;
		System.out.println(no+""+name+""+phone);
	}
	
}