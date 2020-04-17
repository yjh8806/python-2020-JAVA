package array;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 1. 사용자가 0을 입력할 때 까지 무한대로 입력받아서, 배열에 입력하는 코드를 작성하기
		// (기존에 입력한 값이 그대로 유지되어야 합니다)
		int size = 3;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[size];
		int[] tmp;
		
		WHILE : while (true) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {	// 비어있는 곳만 입력받기
					System.out.printf("정수 입력 (길이 : %d) : ", arr.length);
					arr[i] = Integer.parseInt(sc.nextLine());
				}   
				if(arr[i] == 0)	// 입력받아도 0이면 종료
					break WHILE;
			}
			
			System.out.printf("arr[%d] : ", arr.length);	// 현재까지의 배열 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}System.out.println("\n");
			
			if (arr[arr.length - 1] != 0) {	// 마지막 번째가 0이 아니다 == 모든 멤버변수가 꽉 찼다
				tmp = new int[arr.length + size];	// 기존배열길이 + 지정사이즈만큼의 새 배열 생성 
				for(int i=0;i<arr.length;i++) {		// 기존 값을 복사한다음
					tmp[i] = arr[i];		
				}
				arr = tmp;	// 새 배열을 arr가 가리키도록
			}
		}
		System.out.println("0을 입력받아서 종료합니다"); 
		
		
		
		
		// 2. 정수 대신, 문자열을 입력받아서 1번과 똑같이 작동하는 배열 만들기
		// (사용자가 그냥 엔터를 입력하면 종료되는 코드)		
	}
}