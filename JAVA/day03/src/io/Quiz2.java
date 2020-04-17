package io;

import java.util.Scanner;

public class Quiz2 {
		// 이름, 이니셜, 나이, 키, 하고싶은말
	// Scanner로 입력받아서 출력하는 코드를 작성하세요
	// 입력 다 받은 이후 출력하기
	public static void main(String[] args) {
		String name, comment, init;
		char c1, c2, c3;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");			name = sc.nextLine();
		System.out.print("이니셜 차례대로 입력 : ");	init = sc.nextLine();
		
		c1 = init.toCharArray()[0];	// 문자열을 char의 배열로 변환
		c2 = init.toCharArray()[1];
		c3 = init.toCharArray()[2];
		
		System.out.print("나이 입력 : ");			age = Integer.parseInt(sc.nextLine());
		System.out.print("키 입력 : ");			height = Double.parseDouble(sc.nextLine());
		System.out.print("하고싶은 말 입력 : ");		comment = sc.nextLine();
		System.out.println();
		
		String format = "이름 : %s\n이니셜 : %c, %c, %c\n나이 : %d살\n키 : %.2fcm\n하고싶은 말 : %s\n";
		System.out.printf(format, name, c1, c2, c3, age, height, comment);
		sc.close();
	}
}

