package function;

import java.util.Scanner;

public class Ex02 {
	
	// This method must return a result of type int
	// 자바의 함수는 반환형을 설정하면 반드시 해당 자료형의 값을 반환하도록 코드를 작성해야 한다
	static int getPay(int t, int h) {	// 인자값과 매개변수는 이름이 같을 필요가 없다
		return t * h; 			// 간단한 수식은 곧바로 return 뒤에 적을 수 있다
	}
	
	static String addComma(int num) {
		return String.format("%,d", num);
	}
	
	public static void main(String[] args) {
		// 함수의 반환형, 함수간의 연계
		
		Scanner sc = new Scanner(System.in);
		int time, perHour = 8590;
		System.out.print("근무 시간을 입력하세요 : ");
		time = Integer.parseInt(sc.nextLine());
		
		int pay = getPay(time, perHour);
		String result = addComma(pay);
		System.out.println(result);
		
		System.out.println();
		System.out.println(addComma(getPay(time, perHour)));		
	}
}