package training;
	
	// 2. 슈퍼클래스의 [메서드]는 서브클래스에서 똑같이 호출할 수 있다

class Super2 {
	
	void method1() {
		System.out.println("method1");
	}
}
class Sub2 extends Super2 {
	
	// 슈퍼클래스의 메서드를 같은 형식으로 재정의하면, 
	// 슈퍼클래스로 참조되어도 서브클래스내용이 호출된다
	@Override
	void method1() {
		System.out.println("Sub클래스의 method1");
	}
	
	// 서브클래스의 고유메서드는 참조변수가 서브클래스인 상태에서만 호출할 수 있다
	void method2() {
		System.out.println("Sub클래스의 고유 메서드");
	}
}

public class Ex04_Method {
	public static void main(String[] args) {
		Sub2 ob2 = new Sub2();
		ob2.method1();
		
		Super2 ob3 = ob2;	// 서브 객체를 슈퍼 클래스로 참조하기
		System.out.println("ob2 : " + ob2);
		System.out.println("ob3 : " + ob3);
		
		ob2.method1();	// 서브클래스 객체
		ob3.method1();	// 슈퍼클래스 객체
		
		ob2.method2();	// 서브클래스만 고유 메서드 호출 가능
//		ob3.method2();	// 슈퍼클래스는 고유 메서드 호출 불가
		
	}
}