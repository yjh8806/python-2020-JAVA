package exception;

import java.util.Scanner;

class MyException2 extends Exception {
	private String errmsg;
	
	public MyException2(String msg) {
		super(msg);
		errmsg = msg;
	}
	
	@Override public String toString() { return errmsg; }
}

public class Quiz {
	public static void main(String[] args) {
		String today;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘 날짜를 yyyy/MM/dd 의 형식으로 입력 : ");
		today = sc.nextLine();
		
		String [] split = today.split("/");
		
		int year = 0, month = 0, day = 0;
		
		try {
			
			for (int i = 0; i < 3; i++) {
				switch(i) {
					case 0: year = Integer.parseInt(split[i]); break;
					case 1: month = Integer.parseInt(split[i]); break;
					case 2: day = Integer.parseInt(split[i]); break;
				}
			}
			if(month < 1 || month > 12) {
				throw new MyException2("월은 1에서 12 사이로 입력해야 합니다");
			}
			
		} catch (NumberFormatException e) {
			System.err.println("날짜는 정수로 입력해야 합니다");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("연/월/일 형식으로 입력해야 합니다");
			System.err.println(e);
			return;
		} catch (MyException2 e) {
			System.err.println(e); 	// 내가 생성자에 전달한 문자열이 출력된다
		}
		
		System.out.printf("오늘은 %4d년 %02d월 %02d일 입니다\n", year, month, day);
	}
}