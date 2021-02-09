package chap09.abstract_class;

public class Sample02 {

	public static void main(String[] args) {
		Car car = new ElectricCar("Aa", "Bb");
		car.printInfo();
//		car.setColor("Cc");		//자식 클래스에서 정의된 메서드는 사용할 수 없다.
//		car.printInfo();
	}
}
