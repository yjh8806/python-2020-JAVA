package io;

import java.util.Scanner;

public class Ex04_Score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("세 점수를 차례로 입력하세요 : ");
		String input = sc.nextLine();	// "100 99 87"
		
		String [] arr = input.split(" ");	// delimiter(구분자)를 기준으로 분리해서 배열의 형태로 반환
											// { "100", "99", "87" }
		kor = Integer.parseInt(arr[0]);		// 100
		eng = Integer.parseInt(arr[1]);		// 99
		mat = Integer.parseInt(arr[2]);		// 87
		sum = kor + eng + mat;
		avg = sum / 3.0;	// 정수와 정수가 연산하면 정수가 나온다. 한쪽을 실수로 변환
		
		System.out.printf("%s님의 합계는 %d점이고, 평균은 %.2f점입니다\n",
				name, sum, avg);
		
		
		
		
		
		sc.close();
	}
}

