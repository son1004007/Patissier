package chap08.Sample02;

public class Sample02 {

	public static void main(String[] args) {
		//인스턴스 변수를 사용하기 전에는 꼭 new 키워드로 인스턴스를 생성해야 합니다.
		VO vo = new VO();
		vo.name = "기석";
		vo.age = 34; //인스턴스 변수
		//인스턴스는 일반적으로 실행 중인 임의의 프로세스, 클래스의 현재 생성된 오브젝트를 가리킨다.
		System.out.printf("%s는 %d살\n", vo.name, vo.age); 
		//인스턴스 변수 
		System.out.printf("%d + %d = %d", vo.ONE, vo.TWO, vo.THREE);
		// 클래스 변수
	}
}
