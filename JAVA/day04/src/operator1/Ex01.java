package operator1;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산 : +, -, *, /, %
		// 1. 문자열이 덧셈에 포함되면 이어붙이기를 한다
		System.out.println(1 + 2);	// 정수 + 정수
		System.out.println(1 + '2');// int + char(아스키 코드값)
		System.out.println(1 + "2");// int + String
		System.out.println();
		
		System.out.println(5 / 3);
		System.out.println(5 / 3.0);
		System.out.println();
		
		// - % 연산의 사용 예시
		// 1) 홀짝을 구분한다 (배수약수관계를 찾아낸다)
		int n1 = 3;
		System.out.println("n1이 홀수인가 : " + (n1 % 2 != 0));
		System.out.println("n1이 짝수인가 : " + (n1 % 2 == 0));
		System.out.println();
		
		// 2) 자릿수 구분 : 10의 n승수로 나누었을때 나머지는 0의 개수만큼의 뒷자리수이다
		int n2 = 20200121;
		int date = n2 % 100;	// 21
		n2 = n2 / 100;			// 20200121 -> 202001
		int month = n2 % 100;	// 01
		int year = n2 / 100;	// 2020
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		
		// 3) 난수(랜덤)의 범위를 제한하는 용도로 사용한다
		Random ran = new Random();
		int n3 = ran.nextInt();
		System.out.println("n3 : " + n3);
		int n4 = n3 % 6 + 1;
		System.out.println("n4 : " + n4);		
	}
}