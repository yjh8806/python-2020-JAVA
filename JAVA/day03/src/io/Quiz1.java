package io;

public class Quiz1 {
	public static void main(String[] args) {
		String name = "이지은";
		int age = 28;
		char i1 = 'L', i2 = 'J', i3 = 'E';
		double height = 164.82;
		String comment = "\"나는 개발이 하고 싶어요\"";
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("이니셜 : %c, %c, %c\n", i1, i2, i3);
		System.out.printf("키 : %.2fcm\n", height);
		System.out.printf("하고 싶은 말 : %s\n", comment);
		System.out.println();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이니셜 : " + i1 + ", " + i2 + ", " + i3);
		System.out.println("키 : " + height + "cm");
		System.out.println("하고 싶은 말 : " + comment);		
	}
}