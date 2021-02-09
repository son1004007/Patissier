package chap08.Sample07;

public class Data {
	String 	name;
	int 	age;
	
	public Data() {
		System.out.println("Data 초기화 합니다.");
		this.name 	= "손기석";
		this.age 	= 34;
	}
	/*
	 * 초기화된 내용을 출력하기 위한 메소드
	 */
	public String toString() {
		return "Data [name =" + name + ", age =" +age+ "]";
	}
}
