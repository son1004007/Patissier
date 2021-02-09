package chap09.Sample04;

public class Cat extends Pet {
	public Cat(boolean wing, int legCount) {
		//생성자 내용(wing, legcount)을 부모 클래스로 넘겨서 객체를 생성한다.
		super(wing, legCount);
	}

	@Override
	public void run(String name) {
		System.out.println(name+"는 소리 없이 조용하게 뜁니다.");
	}
}
