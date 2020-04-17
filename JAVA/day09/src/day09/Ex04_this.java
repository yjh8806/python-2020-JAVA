package day09;

class Member {
	
	Member(){	// 기본 생성자가 국가를 대한민국으로 설정
		country = "대한민국";
		System.out.println("기본 생성자 호출 !!");
	}
	Member(String name) {	// 문자열을 받으면 이름으로 설정
		this();		// this 키워드로 함수형식을 지정하면 생성자 호출코드이다
		this.name = name;
	}// Constructor call must be the first statement in a constructor
	
	String country, name; 
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("국가 : " + country);
		System.out.println();
	}
}

public class Ex04_this {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("이지은");
		m1.show();
		m2.show();
	}
}