package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Integer [] arr = new Integer[3];
		Scanner sc = new Scanner(System.in);
		try {
			arr[0] = 7;
			
			System.out.print("arr[1] 정수 입력 : ");
			arr[1] = Integer.parseInt(sc.nextLine());
			
			System.out.print("arr[2] 정수 입력 : ");
			arr[2] = Integer.parseInt(sc.nextLine());
			
//			System.out.print("arr[3] 정수 입력 : ");
//			arr[3] = Integer.parseInt(sc.nextLine());

			
			System.out.println("arr[0] : " + arr[0]);
			System.out.println("arr[1] : " + arr[1]);
			System.out.println("arr[2] : " + arr[2]);
			
			int result = arr[0] + arr[1] / arr[2];
			System.out.println("결과 : " + result);
	
//		} catch (NumberFormatException e) {
//			System.out.println("정수를 입력해야 합니다 : " + e);
//			
//		} catch (NullPointerException e) {
//			System.out.println("값이 아직 입력되지 않았습니다");
//			e.printStackTrace(); // 예외 발생 스택을 출력하는 메서드
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 범위를 벗어났습니다");
//			
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다");
			
		} catch (Exception e) {	// Exception : 모든 예외의 최상위 슈퍼 클래스
			System.out.println("예외 발생 : " + e.toString());
			
		}
		
		System.out.println("프로그램 종료 !!");
	}
}