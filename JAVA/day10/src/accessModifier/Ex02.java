package accessModifier;

public class Ex02 {
	public static void main(String[] args) {
		Test ob2 = new Test();
//		ob2.pri = 5;
		ob2.pac = 5;	// 같은 패키지 내의 파일은 참조가 가능하다 (package)
		ob2.pro = 5;
		ob2.pub = 5;
		ob2.ShowField();
	}
}

