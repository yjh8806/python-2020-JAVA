package training;

	// 4. 객체의 자료형은 어떤 생성자를 호출하는지에 따라 결정된다

class Super5 {
	
}
class Sub5 extends Super5 {
	void test() {
		System.out.println("자식클래스의 test");
	}
}

public class Ex07_ObjectType {
	public static void main(String[] args) {
		Super5 ob1 = new Super5();
		Super5 ob2 = new Sub5();
		Sub5 ob3 = new Sub5();
//		Sub5 ob4 = new Super5();	// 모든 사람이 의사는 아니다 !!
		
		System.out.println("ob1의 자료형 : " + ob1.getClass().getSimpleName());
		System.out.println("ob2의 자료형 : " + ob2.getClass().getSimpleName());
		System.out.println("ob3의 자료형 : " + ob3.getClass().getSimpleName());
		
//		ob1.test();		// Super형태의 객체는 test() 메서드가 정의되어 있지 않다
		
//		ob2.test();		// test()메서드는 정의되어 있으나, 참조형태가 Super라서 호출할 수 없다
		
		((Sub5)ob2).test(); // 객체의 자료형만 변경해주면 test()를 호출할 수 있다
		
		ob3.test(); 	// 참조형태가 Sub이므로 메서드 호출 가능, 객체가 Sub이므로 메서드 정의되어 있음		
	}
}