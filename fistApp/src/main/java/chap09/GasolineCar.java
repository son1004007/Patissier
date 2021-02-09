package chap09;

import lombok.AllArgsConstructor;

/** 9.1.1 추상 클래스의 이해
 * @author son10
 */
@AllArgsConstructor
public class GasolineCar {
	private String color;			//색
	private String manufacturer;	//제조사
	
	/** ElectricCar와 GasolineCar와 동일한 printInfo 메소드.
	 * 추상 클래스인 부모 클래스 Car를 생성하여 다시 구현한다.
	 * @since 1.0
	 */
	public void printInfo() {
		System.out.println("이 차 색은 : " + this.color);
		System.out.println("이 차는 : "+fillUp());
		System.out.println("이 차는 : "+this.manufacturer +"에서 생산합니다.");
	}
	
	/** ElectricCar와 GasolineCar와 다른 fillUp 메소드.
	 * @since 1.0
	 */
	public String fillUp() {
		return "휘발유를 충전합니다.";
	}

}
