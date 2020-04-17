package reference;

import java.util.Scanner;

	// 필드, 메서드, 생성자, 접근제한자를 활용해서 메인함수의 코드가 작동하게 하세요
	// 서로 다른 두 전화기 객체가 문자메시지를 주고받을 수 있도록 구현하세요
	// 문자메시지의 내용은 Scanner 객체를 이용해서 입력받도록 구현하세요
	// 문자 메시지를 받은 쪽에서는 보내는 사람의 [이름]과 문자메시지의 [내용]을 출력하도록 작성하세요
	
class Phone {
	private String name;
	private Scanner sc;
	
	public Phone(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	public void sendMsg(Phone other) {	// 매개변수에 클래스 타입의 객체를 받을 수 있다
		System.out.printf("%s에게 보낼 메시지 입력 : ", other.getName());
		String msg = sc.nextLine();
		other.showMsg(this, msg);	// this 단독으로 자신의 객체 참조 주소를 전달
	}
	private void showMsg(Phone sender, String msg) {
		System.out.printf("발신인 : %s) %s\n\n", sender.getName(), msg);
	}
	public String getName() {
		return name;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 메인 함수는 아래 내용으로 고정
		Phone p1 = new Phone("이지은");
		Phone p2 = new Phone("홍진호");
		
		p1.sendMsg(p2);
		p2.sendMsg(p1);
	}
}

