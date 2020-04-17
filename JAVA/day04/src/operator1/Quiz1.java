package operator1;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 삼항 연산자를 활용하여, 나이를 입력받고 성인/미성년자를 판별하는 코드 작성
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이를 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
//		if (age >= 20) 	System.out.println("성인입니다");
//		else 			System.out.println("미성년자입니다");
		
		System.out.println((age >= 20) ? "성인입니다" : "미성년자입니다");		
	}
}