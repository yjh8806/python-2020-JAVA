package day09;

class Pos {
	
	int x, y;		// 필드
	
	void ShowPos() {// 메서드
		System.out.println("x : " + x + ", y : " + y);
	}
	
	Pos() {			// 생성자
		System.out.println("생성자 호출 !!");
	}
	
	Pos(int x, int y) {	// 생성자도 함수이므로, 지역변수를 우선 참조한다
		System.out.println("오버로딩 생성자 호출 !!");
		this.x = x;
		this.y = y;
	}
}

public class Ex03_Constructor {
	// 생성자 : 객체 생성 및 생성 시 초기 작동을 수행하는 메서드
	// 클래스의 이름과 같고, 반환형이 존재하지 않는 특수한 함수이다
	
	public static void main(String[] args) {
		
		Pos ob1 = new Pos();
		ob1.x = 3;
		ob1.y = 4;
		ob1.ShowPos();
		
		Pos ob2 = new Pos(7, 8);
		ob2.ShowPos();		
	}
}