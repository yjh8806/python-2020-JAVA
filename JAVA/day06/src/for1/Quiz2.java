package for1;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1) 알파벳 A 부터 Z 까지 출력하세요
		// 각 알파벳은 대문자로 출력하고, 한줄에 출력하되 알파벳과 알파벳 사이는 ', ' 로 구분합니다
		// 마지막 글자 뒤에는 ,를 출력하지 않고 줄을 바꿉니다
		System.out.println("1) 알파벳 출력");
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			if(ch != 'Z') 	System.out.print(", ");
			else 			System.out.println("\n");
		}
		
		// 2) 사용자에게 2에서 9사이의 정수를 입력받아서
		// 해당 숫자의 구구단을 세로로 출력하세요
		// (만약 사용자가 범위를 벗어나는 숫자를 입력하면 while을 이용하여 다시 입력하도록 유도하세요)
		Scanner sc = new Scanner(System.in);
		System.out.print("2) 구구단 정수 입력 : ");
		int dan;
		while(true) {
			dan = Integer.parseInt(sc.nextLine());
			if(2 <= dan && dan <= 9)	// 범위에 맞는 숫자를 입력해야
				break;					// 반복을 탈출한다
			System.out.print("범위를 벗어났습니다. 다시 입력 : ");
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
		
		
		
		int [] arr = {55, 27, 96, 72, 88, 46, 17, 92, 76, 79};
		// 3) 주어진 배열에서 절반 이후의 값만 합산하여 출력하세요(순번, 인덱스 기준)
		
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i >= arr.length / 2)
				sum1 += arr[i];
		}
		System.out.println("3) 배열에서 후반부의 값만 합산하기 : " + sum1);
		
		
		// 4) arr 에서 홀수만 합산하여 출력하세요
		int sum2 = 0;
		for(int num : arr) {	// arr 내부의 멤버 각각을 num이라고 할 때
			if(num % 2 != 0)	// num이 홀수이면
				sum2 += num;	// sum2 에 누적시켜라
		}
		System.out.println("4) 홀수만 합산하여 출력 : " + sum2);		
	}
}