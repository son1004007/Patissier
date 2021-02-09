package chap09.abstract_class;

public class Sample01 {

	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("red", "hyundai");
		car1.printInfo();
		System.out.println("============");
		GasolineCar car2 = new GasolineCar("black", "kia");
		car2.printInfo();
	}
}
