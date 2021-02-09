package chap02;

/**
 * <p>char 자료형을 printf를 이용하여 출력합니다.</p>
 * <p>첫 번째 p tag만 discription에 보여집니다.
 * @author son10
 *
 */

public class Sample02 {
	/**
	 * <p>생성자의 설명을 적습니다.</p>
	 * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다.</p>
	 */
	public Sample02() {	}
	/**
	 * <p>뭔가를 처리합니다.</p>
	 * <p>반환값은 없습니다.</p>
	 * @since 1.0
	 */
	public void dosomething() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char J = 74;
		char a = 97;
		char v = 118;
		System.out.printf("%c%c%c%c", J,a,v,a);

	}

}
