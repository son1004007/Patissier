package chap04;

public class Sample13 {
	public static void main(String[] args) {
		int a = 60; 	//0000 0000 0000 0000 0000 0000 0011 1100
		int b = -10; 	//1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println("* >>");
		System.out.printf("[%32s] >> 4\t= %d\n"
				, Integer.toBinaryString(a), a);
		System.out.printf("[%32s] \t= %d\n"
				, Integer.toBinaryString(a >> 4), a >> 4);
		
		System.out.printf("[%32s] >> 4\t= %d\n"
				, Integer.toBinaryString(b), b);
		System.out.printf("[%32s] \t= %d\n"
				, Integer.toBinaryString(b >> 4), b >> 4);
	}
	
	
}
