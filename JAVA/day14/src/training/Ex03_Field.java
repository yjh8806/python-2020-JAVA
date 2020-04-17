package training;

	// 1. 슈퍼클래스의 [필드]는 서브클래스에 자동으로 생성된다

class Super1 {
	private String str;
	protected int num;
}
class Sub1 extends Super1{
	// Sub1에는 별도로 선언한 필드가 없다
}

public class Ex03_Field {
	public static void main(String[] args) {
		Sub1 ob1 = new Sub1();
//		ob1.str = "Hello, world !!";	
		ob1.num = 7;
		System.out.println("ob1의 자료형 : " + ob1.getClass().getSimpleName());
//		System.out.println(ob1.str);	// private 은 접근 불가
		System.out.println(ob1.num);	// protected 는 접근 가능
	}
}