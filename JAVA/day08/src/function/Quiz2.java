package function;

import java.util.Scanner;

public class Quiz2 {
	
	static String applyCardNumFormat(String input) {
		String result = "";
		int cnt = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(i % 4 == 0) {
				result += input.substring(i, i + 4);
				result += cnt < 3 ? "-" : "";
				cnt++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String test = "Hello, world !!".substring(7, 12);
		System.out.println(test);
		System.out.println("문자열의 길이 : " + test.length());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카드 번호 16자리를 숫자만 입력하세요 : ");
		String input = sc.nextLine();
		
		System.out.print("입력한 번호는 ");
		System.out.println(applyCardNumFormat(input) + " 입니다");
		
		sc.close();
	}
}