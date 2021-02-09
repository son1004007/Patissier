package chap08.Sample21.service;

public class PrintServiceImpl {
	public static DataServiceImpl data = new DataServiceImpl();
	
//	public void pringMessage(String name) { 
// DataServiceImpl을 호출 하여 사용하기 위한 매개변수 삭제 
	public void pringMessage() {
//		System.out.println("Hello "+name);
		System.out.println("Hello "+data.getName()); // DataServiceImpl을 호출하여 출력
	}
}
