package reference;

import java.util.Scanner;

class Keyboard {
	Scanner sc;
	Monitor mo;
	
	Keyboard(){
		sc = new Scanner(System.in);	// 멤버필드 참조변수의 초기값 설정
	}
	void setMo(Monitor mo) {// 문자열을 전달할 모니터 객체 참조 변수에 값을 세팅
		this.mo = mo;
	}
	void Input() {
		System.out.print("문자열 입력하세요 : ");
		String str = sc.nextLine(); 
		mo.setStr(str);		// 문자열을 mo 객체에 전달
		mo.Output();		// mo 객체의 출력 함수를 호출
	}
}

class Monitor {
	String str;
	
	void setStr(String str) {
		this.str = str;
	}
	void Output() {	// 객체 자신의 클래스를 간단한 이름으로 출력하기
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Monitor) 전달받은 결과 : " + str);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Keyboard key = new Keyboard();
		Monitor mo = new Monitor();
		
		key.setMo(mo);
		key.Input();
	}
}