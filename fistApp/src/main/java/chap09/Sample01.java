package chap09;

public class Sample01 {

	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("none_abstract_color", "none_abstract_manufacturer");
		car1.printInfo();
		System.out.println("============");
		GasolineCar car2 = new GasolineCar("none_abstract_color_Gasoline", "none_abstract_manufacturer_Gasoline");
		car2.printInfo();
	}
}
