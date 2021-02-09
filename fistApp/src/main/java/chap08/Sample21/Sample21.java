package chap08.Sample21;

//import chap08.Sample21.service.DataServiceImpl; 
// DataServiceImpl을 public에서 default로 변경하여 다른 클래스에서 접근 불가
import chap08.Sample21.service.PrintServiceImpl;

public class Sample21 {

//	public static DataServiceImpl data = new DataServiceImpl();
// DataServiceImpl을 public에서 default로 변경하여 다른 클래스에서 접근 불가
	
	public static PrintServiceImpl print = new PrintServiceImpl();
	
	public static void main(String[] args) {
//		String name;
		
//		name = data.getName();
		
//		print.pringMessage(name);
		
		print.pringMessage();
		
	}
}
 