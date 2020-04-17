package operator1;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 사용자에게 이름과 주민등록번호를 입력받으세요
		// 연산자 및 제어문을 활용하고, 아래의 결과를 출력하세요
		// "ooo님은 2001년 2월 3일 출생한 남성/여성 입니다"
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("주민등록번호를 입력하세요");
		String idnum = sc.nextLine();
		String [] arr = idnum.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		===============================================
		
		int year, month, date, gender;
		String result = "";
		
		int birth = Integer.parseInt(arr[0]);
		date = birth % 100;
		birth /= 100;
		month = birth % 100;
		year = birth / 100;
		year += (year < 20) ? 2000 : 1900;
		
		gender = Integer.parseInt(arr[1]) % 1000000;
		
		result += name + "님은 ";
		result += year + "년 " + month + "월 " + date + "일 출생한 ";
		result += gender % 2 == 0 ? "여성" : "남성";
		result += "입니다";
		
		System.out.println();
		System.out.println(result);		
	}
}