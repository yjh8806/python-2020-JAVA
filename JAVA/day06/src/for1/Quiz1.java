package for1;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1) 1에서 50 사이의 숫자 중에서 
		// 3의 배수이거나 5의 배수이면 출력하고, 3과 5의 공배수는 출력하지마세요
		System.out.println("1) 3의 배수이거나, 5의 배수인 경우 출력\n");
		
		for (int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 == 0)		// 공배수를 먼저 처리하고
				System.out.print("");			
			else if(i % 3 == 0 || i % 5 == 0)	// 각자의 배수에만 해당되는 경우 숫자를 출력
				System.out.print(i + " ");
		}
		System.out.println("\n\n");

		// 2) 전체 길이가 3분 30초인 음악파일이 있다
		// 사용자에게 현재 재생중인 시간을 초(sec) 단위로 입력받아서
		// 전체 시간 중 현재 시간이 몇 % 진행율인지 출력하는 코드를 작성하세요
		// [■■■■■■■■■■■ 67 % ■■■        ]	(ㅁ 한자키 특수문자)
		
		Scanner sc = new Scanner(System.in);
		double allTime = 210;
		double nowTime;
		double playRate;
		
		System.out.print("2) 전체 3분 30초 중 원하는 구간을 입력하세요 (초) : ");
		nowTime = Integer.parseInt(sc.nextLine());
		playRate = (nowTime / allTime) * 100;
		
		for (int i = 0; i < 50; i++) {
			if(i == 0) 					System.out.print("[");
			else if (i == 49) 			System.out.print("]");
			else if (i == 24)			System.out.printf(" %.0f %% ", playRate);
			else if (i < playRate / 2)	System.out.print("■");
			else if (i >= playRate / 2) System.out.print(" ");
		}
		System.out.println();
		sc.close();		
	}
}