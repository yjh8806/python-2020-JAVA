package exception;

import java.util.Scanner;

class MyException extends Exception {
	
	@Override
	public String toString() {
		return "점수가 0 ~ 100 범위를 벗어났습니다";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		try {
			System.out.print("점수 입력 : ");
			score = Integer.parseInt(sc.nextLine());
			
			if (0 > score || score > 100)
				throw new MyException();
				// 예외 객체를 생성하여 catch가 받을 수 있도록 던진다
			
		} catch (NumberFormatException e) {
			System.err.println("점수를 정수 형태로 입력해야 합니다");
			
		} catch (MyException e) {
			System.out.println("점수 범위 벗어남 : " + e);
			e.printStackTrace();
			score = 0;
			
		} finally {
			System.out.println("점수 : " + score);
			sc.close();
		}		
	}
}