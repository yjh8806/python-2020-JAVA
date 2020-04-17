package reference;

class Kid {
	Kid(String name) { this.name = name; }
	
	String name;
	Ball b;		// Ball 타입의 객체를 참조할 수 있는 참조변수 b(초기값 : null)
	
	void setBall(Ball b) {
		this.b = b;
		System.out.println(name + "가 공을 가지고 있다 !!\n");	
	}
	void throwBall(Kid other) {	// Kid 타입을 참조할 수 있는 매개변수 other
		System.out.println(name + "가 " + other.name + "에게 공을 던졌다");
	other.setBall(b);
	this.b = null;
	}
}

class Ball {} // 생성자가 없으면, 기본 생성자를 자동으로 만들어주기 때문에 객체 생성에 문제가 없

public class Ex01 {
	public static void main(String[] args) {
		Kid minho = new Kid("민호");
		Kid chanhyuk = new Kid("찬혁이");
	Ball b = new Ball();
	
	minho.setBall(b);
	minho.throwBall(chanhyuk);
	chanhyuk.throwBall(minho);
	}
}
