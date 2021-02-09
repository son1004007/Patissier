package chap08;

public class Sample05 {

	public static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 : %d\n", sum(1,2,3));
		System.out.printf("결과 : %d\n", sum(1,2,3,4,5,6,7,8,9,10));
		
	}
	public static int sum(int ...a) {
//		for(int i : a) {
//			total += i;
//		}
		int[] var4 = a;
		int var3 = a.length;
		for(int var2 = 0; var2 < var3; ++var2) {
			int i = var4[var2];
			total +=i;
		}
		return total;
	}
}
