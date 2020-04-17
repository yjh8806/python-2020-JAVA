package array;

import java.util.Scanner;

public class Quiz4 {
	// 2. 정수 대신, 문자열을 입력받아서 1번과 똑같이 작동하는 배열 만들기
	// (사용자가 그냥 엔터를 입력하면 종료되는 코드)
	// 오후 4시까지 어제 문제 마무리해주세요
	
	public static void main(String[] args) {
		int size = 1;
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[size];
		String[] tmp;
		
		WHILE : while (true) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {	// 비어있는 곳만 입력받기
					System.out.printf("문자열 입력 (길이 : %d) : ", arr.length);
					arr[i] = sc.nextLine();
				}
				if("".equals(arr[i]))	// 아무 문자열도 입력하지 않으면 종료
					break WHILE;
			}
			
			System.out.printf("arr[%d] : ", arr.length);	// 현재까지의 배열 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				System.out.print(i == arr.length - 1 ? "\n" : ", ");
			}
			
			if (arr[arr.length - 1] != null) {	// 마지막 번째가 null이 아니다 == 모든 멤버변수가 꽉 찼다
				tmp = new String[arr.length + size];	// 기존배열길이 + 지정사이즈만큼의 새 배열 생성
				for (int i = 0; i < arr.length; i++) {  // 기존 값을 복사한다음
					tmp[i] = arr[i];		
				}
				arr = tmp;	// 새 배열을 arr가 가리키도록
			}
		}
		System.out.println("입력된 문자열이 없어서 종료합니다");
	}
}