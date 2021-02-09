package chap09;

/**9.2.2 디폴트 메서드(Default Method)
 * @author son10
 *
 */
public class Sample06 {

	public static void main(String[] args) {
		Villa a = new Villa();
		float area = a.compute(30); //30평
		System.out.println("아파트의 면적은 "+area+" 제곱미터 입니다.");
		
		area = a.toPyung(area);
		System.out.println("아파트 면적은 "+area+" 평 입니다.");
		
	}
}

class Villa implements IExcute{
	
	@Override
	public float compute(int area) {
		// 평을 제곱으로 환산
//		pyung++;	// 에러 : The final field ICompute.pyung cannot be assigned
		return area * pyung;
	}
	
}
abstract interface IExcute{	// 인터페이스임을 구분하기 위해 I를 붙임
	float pyung = 3.3f;			// 인터페이스 멤버 변수는 static final로 컴파일 됨
	float compute(int area);	// abstract float compute(int area); 추상메서드로 컴파일
	default float toPyung(float area) { // default 메서드 추가 하여, 매개변수에 구현체를 작성함
		return area/pyung;		// 구현체
	}
	// 2. 새로운 메서드 추가하면 자식 클래스에 추가해야 에러가 나지 않는다.
}


