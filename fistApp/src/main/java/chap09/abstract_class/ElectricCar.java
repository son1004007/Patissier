package chap09.abstract_class;

/** 9.1.1 추상 클래스의 이해. Car를 상속 받는 Electric Car
 * @author son10
 *
 */
public class ElectricCar extends Car {
	public ElectricCar(String Color, String manufacturer) {
		super(Color, manufacturer);
	}
	@Override
	public String fillUp() {
		return "전기를 충전합니다.";
	}
	public void setColor(String color) {
		this.color = color;
	}

}
