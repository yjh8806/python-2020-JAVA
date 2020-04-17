package accessModifierTest;

import accessModifier.Test;		// 외부 패키지의 클래스에서 참조하려면 public
// The type accessModifier.Test is not visible

public class Ex03 {
	public static void main(String[] args) {
		Test ob3 = new Test();
//		ob3.pri = 5; // private은 외부의 어떤 곳에서도 참조 불가(내부만 가능)
//		ob3.pac = 5; // package는 같은 패키지(폴더) 내에서만 참조가 가능
//		ob3.pro = 5; // 같은 동네가 아니여도 되지만, 상속 관계가 성립해야 가능
		ob3.pub = 5; // 누구나 어디서나 참조 가능
		
		ob3.ShowField();
		
//		일반적으로 필드는 private 으로 설정한다
//		메서드는 public으로 설정한다
		
	}
}

