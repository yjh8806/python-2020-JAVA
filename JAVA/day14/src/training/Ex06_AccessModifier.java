package training;

	// 메서드 오버라이딩 시에 슈퍼클래스 메서드의 접근제한자보다 더 좁게 설정할 수 없다

class Super4 {
	public void method4() {
		System.out.println("슈퍼 클래스 메서드 4");
	}
	protected void method5() {
		System.out.println("슈퍼 클래스 메서드 5");
	}
	private void method6() {
		System.out.println("슈퍼 클래스 메서드 6");
	}
}
class Sub4 extends Super4 {
	// Cannot reduce the visibility of the inherited method from Super4
//	@Override
//	protected void method4() {
//		System.out.println("서브 클래스 메서드 4");
//	}
	@Override
	public void method5() {
		System.out.println("서브 클래스 메서드 5");
	}
	// The method method6() of type Sub4 must override or implement a supertype method
}

public class Ex06_AccessModifier {
	public static void main(String[] args) {
		Sub4 ob = new Sub4();		
	}
}