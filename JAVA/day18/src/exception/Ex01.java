package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 예외 (Exception) :코드의 진행에 따라서, 제어가 가능한 문제점 ( != error )
		
		Scanner sc = new Scanner(System.in);
		
		try {		//try 영역의 코드를 진행해라
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			System.out.println("입력받은 점수 : " +score);
		
		} catch (InputMismatchException e) {
// try 내의 코드 진행중 InputMismatchException이 발생하면아래 코드를 진행해라
// 예외처리가 없는 경우에는, 예외가 발생하면 프로그램의 실행이 중단되지만
// catch로 적절히 처리하면 프로그램이 끝까지 진행될 수 있다
			System.out.println("발생한 예외 : " +e);
			System.out.println("점수가 올바르게 입력되지 않았습니다");
		} finally {
			sc.close();
			// 예외 발생 여부에 상관없이 반드시 실행해야 하는 코
		}
		
		System.out.println("프로그램 종료");
	}
}