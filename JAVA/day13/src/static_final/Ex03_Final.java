package static_final;

class Test {
	// final : 값을 변경할 수 없게 하는 키워드 (c++ const : 변수를 상수화)
	
	int n1;
	static int n2;
	final int n3;
	static final int n4 = 4;	// static final은 생성자로 초기화하지 않고, 직접 값을 할당
	
	Test(){	// 객체 생성 시 작동
		n3 = 3;	// 초기값을 결정해주어야 final 필드를 사용할 수 있다
	}
	
}

public class Ex03_Final {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.n1 = 1;
		Test.n2 = 2;
//		t1.n3 = 3;		// The final field Test.n3 cannot be assigned
//		Test.n4 = 4;	// final 필드 Test.n3는 할당할 수 없습니다
		
		System.out.println(t1.n1);
		System.out.println(Test.n2);
		System.out.println(t1.n3);
		System.out.println(Test.n4);		
	}
}