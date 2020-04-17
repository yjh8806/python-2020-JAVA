package io;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		double db;
		String str;
		
		System.out.print("1. 정수 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.print("2. 실수 입력 : ");
		db = Double.parseDouble(sc.nextLine());
		
		System.out.print("3. 문자열 입력 : ");
		str = sc.nextLine();
		
		System.out.print("4. 단일 문자 입력 : ");
		char ch = sc.nextLine().charAt(0);	// 문자열에서 첫번째 글자만 추출하기
		
		System.out.printf("%d, %.2f, %s, %c\n", num, db, str, ch);
		sc.close();
	}
}