package chap05;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		//3. 구입할 물건의 목록과 구입한 물건의 목록이 보기와 같이 있을때 구입하지 않은 물건을 출력하세요.
		
		String[] wishList = new String[] {
			"냉장고","선풍기", "TV", "노트북", "세탁기", "에어컨"	
		};
		
		String[] purchasedList = new String[] {
				"노트북", "TV", "에어컨"
		};
		
		System.out.println("구입하지 못한 물건");
		Arrays.sort(purchasedList);
		System.out.println(Arrays.binarySearch(purchasedList, wishList[0]) < 0 ? wishList[0] : "");
		System.out.println(Arrays.binarySearch(purchasedList, wishList[1]) < 0 ? wishList[1] : "");
		System.out.println(Arrays.binarySearch(purchasedList, wishList[2]) < 0 ? wishList[2] : "");
		System.out.println(Arrays.binarySearch(purchasedList, wishList[3]) < 0 ? wishList[3] : "");
		System.out.println(Arrays.binarySearch(purchasedList, wishList[4]) < 0 ? wishList[4] : "");
		System.out.println(Arrays.binarySearch(purchasedList, wishList[5]) < 0 ? wishList[5] : "");
	}
}
