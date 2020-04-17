package controlStatement;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 주민등록번호 7번째 숫자 (성별) 만 입력받아서
		// 출생연대와 성별을 출력하는 코드를 switch ~ case를 활용하여 작성하기
		
		/*	홀수 : 남성, 짝수 : 여성
		 * 	9, 0 : 1800년대 출생
		 * 	1, 2 : 1900년대 출생
		 * 	3, 4 : 2000년대 출생
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 7번째 숫자를 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		int century = 0;
		String gender = "여성";
		
		switch(num) {
			case 9: gender = "남성";
			case 0: century = 1800; break;
			case 1: gender = "남성";
			case 2: century = 1900; break;
			case 3: gender = "남성";
			case 4: century = 2000; break;
		}
		System.out.printf("%d년대 출생자이고, %s입니다", century, gender);
	}
}