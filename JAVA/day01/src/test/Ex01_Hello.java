package test;

// import java.lang.*;		// 생략 가능
  
public class Ex01_Hello {
	/*
	 * 	Project : 하나의 자바프로그램을 구성하는 큰 폴더구조, 내부에 여러 패키지를 포함할 수 있다
	 * 	Package : 하위에 여러 자바 소스파일을 포함하는 폴더구조. 용도에 따라 소스파일을 분류하는 목적이다
	 *  Source  : 자바 문법에 의해 작성된 .java 파일 
	 *   - Java Class 파일의 생성 규칙
	 *   - 첫 글자는 반드시 대문자로 지정한다
	 *   - _를 제외한 특수문자가 첫 글자가 될 수 없으며, 숫자도 올 수 없다 
	 *   - public class의 이름과 소스파일의 이름은 항상 일치해야한다
	 *   - public class는 소스파일 당 최대 하나만 존재한다
	 *   
	 *  
	 *  ByteCode: 소스 파일에 의해 생성된 .class 파일
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, world !!");
		System.out.println("반갑구나, 세상아 !!");
		// 저장 : Ctrl + S
		// 실행 : Ctrl + F11
		// 자동완성 : Ctrl + Space
		// 한글 깨짐 방지 설정 : Menu - Window - Preferences - General - Workspace - UTF-8
	}
}

