package chap08.Sample22;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//2. alt + shift + s 눌러서 getter setter 선언한 것을 생략함.
//2. toString을 생략
public class Car {
	private String 	color;			// 차량 색상
	private int 	doors;		 	// 문 수
	private String	manufacturer; 	// 제조사
//	//1. alt + shift + s 눌러서 getter setter
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public int getDoors() {
//		return doors;
//	}
//	public void setDoors(int doors) {
//		this.doors = doors;
//	}
//	public String getManufacturer() {
//		return manufacturer;
//	}
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//	//1. toString 정형화된 코드
//	@Override
//	public String toString() {
//		return "Car [color ="+color+", doors="+doors+", manufacturer="+manufacturer+"]";
//	}
	
}
