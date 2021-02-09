package chap08.Sample03;

public class Sample03 {

	public static void main(String[] args) {
		Data data = new Data(); // 인스턴스
		data.setValue(10); // 인자로 10을 넘김.  setter로 10을 설정
		System.out.println(data.getValue()); // getter로 10을 출력
		
		Compute cmpt = new Compute();
		cmpt.setValue(4);
		System.out.println(cmpt.getValue());
		cmpt.setValue(10,2);
		System.out.println(cmpt.getValue());
	}
}
