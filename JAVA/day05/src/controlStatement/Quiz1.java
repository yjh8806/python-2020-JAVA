package controlStatement;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1. 세 정수를 입력받아서 가장 작은 수를 출력하는 코드를 작성하기
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, minValue;
		System.out.print("첫번째 정수 입력 : "); n1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 정수 입력 : "); n2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 정수 입력 : "); n3 = Integer.parseInt(sc.nextLine());
		
		minValue = n1;
		if(n2 < minValue)	minValue = n2;
		if(n3 < minValue)	minValue = n3;
		System.out.printf("%d, %d, %d 중 가장 작은 값은 %d\n\n", n1, n2, n3, minValue);
		
		
		
		// 2. 정수를 입력받아서 절대값을 출력하기
		System.out.print("양의 정수 혹은 음의 정수를 입력하세요 : ");
		int n4 = Integer.parseInt(sc.nextLine());
		int abso = 0;
		
		if(n4 < 0) 	abso = -n4;
		else 		abso = n4;
		
		System.out.printf("%d의 절댓값은 %d이다\n\n", n4, abso);
		
		
	
		
		
		// 3. 구간당 3분이 걸리는 지하철의 이동 구간수를 입력받아서 걸린 시간 출력하기
		// (걸린 시간이 60분 이하이면 분만 표기하고, 시간이 60분 초과하면 x시간 x분 형식으로 표기)
		
		int perStation = 3;
		int station = 0;
		int time;
		String format;
		
		System.out.print("이동 구간 수를 입력하세요 : ");
		station = Integer.parseInt(sc.nextLine());
		
		time = station * perStation;
		
		if (time <= 60)
			format = String.format("%d분", time);
		else
			format = String.format("%d시간 %d분", time / 60, time % 60);
		
		System.out.println("걸린 시간은 " + format + "입니다\n");		
	}
}