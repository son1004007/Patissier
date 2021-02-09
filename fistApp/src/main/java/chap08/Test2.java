package chap08;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

// 이름 나이 연락처 정보를 담는 객체를 만들어서 여러명의 정보를 등록한 뒤에 
// 이름을 검색하는 기능을 구현하여, 검색된 정보를 출력하는 코드를 작성하세요.
// 단 이름은 키보드로 입력받은 값으로 검색하고, 이름에 0을 입력하면 프로그램을 종료합니다.

public class Test2 { // 실패

	public static void main(String[] args) {
//		String name;
//		int age;
//		String phone;
//		String search;
//		Scanner sc = new Scanner(System.in);
//		int arrayMax=1;
//		Friend[] friends = new Friend[arrayMax];
//		
//		for(int i =0 ; i < friends.length; i++) {
//			System.out.println("이름을 입력하세요");
//			name = sc.next();
//			if(name.equals("0")) {
//				System.out.println("이름에 0을 입력하셧습니다.");
//				name = sc.nextLine();
//				break;
//			}
//			
//			System.out.println("나이를 입력하세요");
//			age = sc.nextInt();
//			System.out.println("전화번호를 입력하세요");
//			phone = sc.next();
//			++arrayMax;
//		}
//
//		for(Friend friend : friends) {
//			System.out.println(friends.getName()); // 전체 출력
//		}
//		for(int i =0 ; i < friends.length; i++) {
//			System.out.println("검색할 이름을 입력하세요");
//			search = sc.next();
//			if(friends[i].toString() == search) {
//				System.out.println(friends[i].toString());
//			}
//			System.out.println("검색된 이름이 없습니다.");
//			System.out.println(f1[i]); // 전체 출력
//		}
				
		Scanner sc = new Scanner(System.in);
		
		int idx = 0;
		Friend[] friends = new Friend[5];
		friends[idx++] = new Friend("A", 1, "123-123-123");
		friends[idx++] = new Friend("B", 2, "123-123-123");
		friends[idx++] = new Friend("C", 3, "123-123-123");
		friends[idx++] = new Friend("D", 4, "123-123-123");
		friends[idx++] = new Friend("E", 5, "123-123-123");
		
		
		System.out.println("List");
		for(Friend friend : friends) {
			System.out.println(friend.getName());
		}
		System.out.println();
		
		
		do {
			System.out.print("검색 이름 :");
			String in = sc.next();
			if("0".equals(in)) {
				System.out.println("종료");
				break;
			}
			else {
				for(Friend friend : friends) {
					if(friend.getName().equals(in)) {
						System.out.println(friend.toString()+"\n");
					}
				}
			}
				
		}while(true);
	}
}

@Data
@AllArgsConstructor
class Friend{
	private String name; private int age; private String phone;
//	@Builder
//	
//	Friend(String name) {
//		this.name = name;
//	}
//	
//	Friend(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	Friend(String name, int age, String phone) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//	}
}