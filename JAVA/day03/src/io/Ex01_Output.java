package io;

public class Ex01_Output {
	public static void main(String[] args) {
		// 자바의 일반 출력 함수
		System.out.println("1. 자동 줄 바꿈");
		System.out.print("2. 줄 바꿈 없음");
		
		// 자바 1.5 이후 추가된 함수, 서식문자를 적용할 수 있다
		System.out.printf("%d. %s\n", 3, "서식 문자 적용 가능");
		
		// print(), println() 은 여러 값을 출력 할 때, + 연산자 사용
		// printf()는 여러 서식문자를 배치하고 값을 ,로 구분하여 지정
		
		String city = "부산";
		String county = "해운대구";
		String district = "우동";
		
		System.out.println(4 + ". " + city + " " + county + " " + district);
		
		System.out.printf("%d. %s %s %s\n", 5, city, county, district);
		System.out.println("==================================\n");
		
		// System.out.printf() 의 서식 문자
		/*
		 * 	문자열 	: %s	%10s - 10칸을 확보하고 그 안에서 글자를 출력
		 * 	문자 		: %c
		 * 	10진수	: %d	%,d - 정수를 10진수로 출력하면서, 천단위 구분기호 , 를 찍어서 표기
		 * 	실수		: %f	%.2f - 소수점 이하 지정한 숫자만큼만 출력
		 * 
		 * 	%o, %x, %b, 	%tH, %tM, %tS
		 * 8진, 16진, 논리,   시,   분,   초
		 */
		
		// Quiz1.java 를 생성하고, 이름(문자열), 나이(정수), 이니셜 세 글자(문자), 키(실수)
		// 4종류의 데이터를 printf() 함수를 이용하여 출력하세요
		// 단, 실수는 소수점 이하 둘째자리까지 출력하기 // 이니셜은 각 글자를 ,로 구분하기
		
//		이름 : 이지은
//		나이 : 28
//		이니셜 : L, J, E
//		키 : 164.82 cm
//		하고 싶은 말 : "나는 개발이 하고 싶어요"		
		
		
		
		
		
		
		
	}
}

