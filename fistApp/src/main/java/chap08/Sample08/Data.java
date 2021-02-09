package chap08.Sample08;

public class Data {
	String	name;
	int		age;
	
	public Data() {
		System.out.println("Data를 초기화합니다.");
		this.name = "기석";
		this.age = 234;
		
	}
	/*
	 * 생성자는 1개 이상 만들수 있습니다.
	 */
	
	public Data(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * 초기화된 내용을 출력하기 위한 메서드
	 * 
	 */
	public String toString() {
		return "Data [name = "+name+", age = "+age+"]";
	}
}
