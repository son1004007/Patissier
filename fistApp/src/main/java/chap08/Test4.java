package chap08;

import java.util.Arrays;

import lombok.Builder;
import lombok.ToString;

@ToString
class Member{
	String name;
	int age;
	
	@Builder
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class Test4 {
	
	public static void main(String[] args) {
		Member[] mem = new Member[3];
		
		mem[0] = new Member("A", 1);
		mem[1] = new Member("B", 2);
		mem[2] = new Member("C", 3);
		
		System.out.println(Arrays.deepToString(mem));
	}
}
