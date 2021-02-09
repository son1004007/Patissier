package chap09;

/**9.2.1 인터페이스 사용법
 * @author son10
 *
 */
public class Sample05 {

	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(30);
		System.out.println("아파트의 면적은 "+area+" 제곱미터 입니다.");
		
		float area2 = a.toPyung(99);
		System.out.println("아파트 면적은 "+area2+" 평 입니다.");
		
	}
}

class Apartment implements ICompute{
	
	@Override
	public float compute(int area) {
		// 평을 제곱으로 환산
//		pyung++;	// 에러 : The final field ICompute.pyung cannot be assigned
		return area * pyung;
	}
	
	public float toPyung(int area) { // 2-1. 자식 클래스에 메서드 추가
		return area / pyung;
	}
}
abstract interface ICompute{	// 인터페이스임을 구분하기 위해 I를 붙임
	float pyung = 3.3f;			// 인터페이스 멤버 변수는 static final로 컴파일 됨
	float compute(int area);	// abstract float compute(int area); 추상메서드로 컴파일
	abstract float toPyung(int area2); 
	// 2. 새로운 메서드 추가하면 자식 클래스에 추가해야 에러가 나지 않는다.
}


