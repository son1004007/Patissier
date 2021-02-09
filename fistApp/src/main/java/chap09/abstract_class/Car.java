package chap09.abstract_class;

import lombok.AllArgsConstructor;

/**부모 클래스
 * @author son10
 *
 */
@AllArgsConstructor
public abstract class Car {
	protected String color;			
	//색 private > protected로 상속 받은 자식 클래스에서도 접근 할 수 있도록 변경
	protected String manufacturer;	
	//제조사 private > protected로 상속 받은 자식 클래스에서도 접근 할 수 있도록 변경
	
	public abstract String fillUp();//휘발유|등유|전기를 넣습니다.
	// 문자열로 반환 받을 수 있도록 선언
	public void printInfo() {
		System.out.println("이 차의 색 : "+ this.color);
		System.out.println("이 차는 : "+ fillUp());
		System.out.println("이 차는 : "+ this.manufacturer +"에서 생산합니다.");
	}
	
	public String getColor() {
		return color;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

}
