package chap09.abstract_class;


/** 9.1.1 추상 클래스의 이해. Car를 상속받는 GasolineCar
 * @author son10
 */
public class GasolineCar extends Car {
	public GasolineCar(String color, String manufacturer) {
		super(color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public String fillUp() {
		return "휘발유를 충전합니다.";
	}

}
