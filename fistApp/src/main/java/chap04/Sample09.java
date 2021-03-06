package chap04;

public class Sample09 {
	public static void main(String[] args) {
		int a = 60; 	//0000 0000 0000 0000 0000 0000 0011 1100
		int b = -10; 	//1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println("* OR");
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(a), 32,"0" ), a);
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(b), 32,"0" ), b);
		System.out.println("====================================");
		System.out.printf("[%32s] %d\n", lpad(Integer.toBinaryString(a | b), 32, "0"), a | b);
		}
	
	public static String lpad(String context, int len, String ch) {
		String str = context;
		if(context.length() < len) {
			for(int i = 0 ; i < len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
	}
}
