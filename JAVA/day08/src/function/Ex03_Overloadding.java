package function;

public class Ex03_Overloadding {
	
	static int plus(int n1, int n2) { return n1 + n2; }
	static String plus(String n1, int n2) { return n1 + n2; }
	static String plus(int n1, String n2) { return n1 + n2; }

//	static double plus(double n1, double n2) { return n1 + n2; }
	static int plus(double n1, double n2) { return (int) (n1 + n2); }
	// Duplicate method plus(double, double) in type Ex03_Overloadding

	static double plus(double n1, double n2, double n3) { return n1 + n2 + n3; }
	
	public static void main(String[] args) {
		/*
		 * 	자바의 메서드는 이름이 같아도, 매개변수의 자료형이나 개수에 따라 구분 가능하다
		 *  하나의 함수 이름에 여러 정의를 중복해서 선언하는 것을 메서드 오버로딩이라고 한다
		 *  (함수 중복 정의)
		 */
		
		// 1. 메서드 오버로딩은 객체 지향에서 생성자 오버로딩의 형태로 많이 사용한다 (직접 만들기)
		// 2. 메서드 오버로딩은 다양한 라이브러리에서 이미 활용되어 있으므로, 이해하고 활용해야 한다
		
		System.out.println("Hello, world !!".substring(7, 15));
		System.out.println("Hello, world !!".substring(7));	
	}
}