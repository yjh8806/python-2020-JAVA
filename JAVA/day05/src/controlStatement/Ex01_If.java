package controlStatement;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		
		int num = 5;
		boolean condition = num % 2 == 0;
		String result;
		
		if (condition)	// 조건식을 boolean 으로 처리할 수 있다
			result = "짝수입니다";
		else {
			result = "홀수입니다";
			System.out.println("condition : " + condition);
		}
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "포인터";
		String quiz = "포인터, 클래스, 인터페이스 중 Java에서 사용하지 않는 요소는 무엇인가?";
		System.out.println(quiz);
		String user = sc.nextLine();
		
//		if(answer == user) {		// 서로 다른 두 참조변수가 같은 대상을 바라보는가
		if(answer.equals(user)) {	// 서로 다른 두 참조변수의 대상이 같은 내용인가
			System.out.println("정답입니다");
			System.out.println("answer와 user의 내용이 같은가 : " + answer.equals(user));
		}
		else {
			System.out.println("틀렸습니다");
			System.out.println(answer == user);	// answer와 user가 같은 곳을 바라보는가
			System.out.println(user == "포인터");
			System.out.println(answer == "포인터");
		}		
	}
}