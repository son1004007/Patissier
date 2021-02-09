package chap08;

interface Bow{

	public String sayHello();
	
	public String sayBye();
}

/**<p> 익명 내부 클래스 : 추상클래스명 또는 인터페이스명 객체명 = new 생성자(){대체할 내용 구현}; </p> 
 * @author son10
 *
 */
public class Sample14 {

	/**
	 * <p> Bow 인터페이스 호출. main에서 단축키, 필드에서 작성</p>
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		String name = "빵형";
		Bow bow = new Bow() {
			/**Bow 인터페이스 호출. 생성자 안에서 작성
			 *
			 */
			@Override
			public String sayHello() {
				return name +" 안녕!";
			}
			
			@Override
			public String sayBye() {
				System.out.println(this.sayHello());
				return name + " 잘가";
			}
		};
		
		System.out.println(bow.sayBye());	
	}
	
}

