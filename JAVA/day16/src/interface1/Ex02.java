package interface1;
// 인터페이스 : 추상 클래스의 한 종류, 자바에서 다중상속을 허용하는 형태

interface Test1 {
	
	String f1 = "테스트1";
	// The blank final field f1 may not have been initialized
	// 인터페이스의 필드는 자동으로 static final 속성을 가진다
	
	void m1();
	// Abstract methods do not specify a body
	// 인터페이스의 메서드는 자동으로 public abstract 속성을 가진다
}

interface Test2 {}

class Test3 extends Object implements Test1, Test2 {

	@Override
	public void m1() {
		System.out.println("Test1의 m1을 구현한 Test3의 메서드");
	}
	// 클래스를 상속받는 extends는 하나의 클래스만 지정할 수 있다
	// 인터페이스를 상속받는(구현하는) implements 는 여러 인터페이스를 지정할 수 있다
}

public class Ex02 {
	public static void main(String[] args) {
//		Test1 t1 = new Test1();
//		Cannot instantiate the type Test1
//		인터페이스는 객체를 생성할 수 없다
		
		Test3 t3 = new Test3();
		System.out.println("t3.f1 : " + Test3.f1);
		t3.m1();
	}
}