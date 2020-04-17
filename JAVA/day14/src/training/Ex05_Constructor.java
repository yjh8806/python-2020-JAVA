package training;

	// 3. 서브클래스의 기본 생성자는 슈퍼클래스의 기본생성자를 자동으로 호출한다 : super()

class Super3 {
	String name;
	Super3(){
		System.out.println("Super3 기본 생성자 호출 !!");
	}
//	Super3(String name) {
//		
//	}
}
class Sub3 extends Super3 {
	// 3-1. 생성자를 정의하지 않으면 기본생성자를 만들어준다 (주석처리 해도 안해도 동일한 결과)
	Sub3() {
		super();
	}
	int num;	// 서브클래스의 필드
	
	Sub3(String name) {
		this.name = name;	// 물려받아서 내가 가지고 있으니 this로 접근 가능
		super.name = name;	// 원래 슈퍼클래스의 field이므로 super로 접근 가능
		this.num = 1;
//		super.num = 2;		// 슈퍼클래스에는 num이 없으므로 this로만 접근 가능
	}
}

public class Ex05_Constructor {
	public static void main(String[] args) {
		Sub3 ob = new Sub3();
		Sub3 ob2 = new Sub3("ob2");
		System.out.println("ob2.name : " + ob2.name);
	}
}