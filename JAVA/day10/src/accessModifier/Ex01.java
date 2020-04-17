package accessModifier;

// 접근 제한자 : 클래스 내부에 선언된 필드나 메서드에 대해서, 외부 접근 범위를 결정하는 키워드

// The public type Test must be defined in its own file
// 소스 파일 하나당 최대 하나의 public class 만 만들 수 있다 !!

//public class Test { 
//	// 필드
//	private int pri = 1;
//	int pac = 2;
//	protected int pro = 3;
//	public int pub = 4;
//	
//	// 메서드
//	void ShowField() {
//		System.out.println("pri : " + pri);
//		System.out.println("pac : " + pac);
//		System.out.println("pro : " + pro);
//		System.out.println("pub : " + pub);
//	}
//}

public class Ex01 {
	public static void main(String[] args) {
		
		Test ob1 = new Test();
		ob1.ShowField();
//		ob1.pri = 5;	// The field Test.pri is not visible
		ob1.pac = 5;
		ob1.pro = 5;
		ob1.pub = 5;
		
		ob1.ShowField();		
	}
}