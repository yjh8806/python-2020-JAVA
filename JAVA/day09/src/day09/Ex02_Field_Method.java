package day09;

class Student {
	// 필드
	String name;
	int age;
	
	// 메서드
	void Show() {
		System.out.println("저는 " + name + "이고, " + age + "살 입니다");
	}
}

public class Ex02_Field_Method {
	// 멤버 필드 : 데이터를 저장할 수 있는 클래스 내부 변수, 초기화 가능
	// 멤버 메서드 : 특정 기능을 수행할 수 있는 클래스 내부 함수, 멤버 필드 참조 가능
	public static void main(String[] args) {
		
		Student st1 = new Student();	// 객체를 생성하는 기본 코드
		Student st2 = new Student();	// 클래스 이름 뒤에 함수를 의미하는 ()가 붙으면 생성자	
		
//		Student st3 = { "이름", 25 };	// C++과 달리 오직 생성자를 통해서만 객체를 생성한다
//		Student* st = (Student*)malloc(sizeof(Student));	// C Lang	
		
		st1.name = "이지은";		// 필드(변수)에 직접 값을 대입하기
		st1.age = 28;			// 일반 변수와 마찬가지로 자료형에 맞는 값만 대입한다
		
		st2.name = "이순재";		// 내부 요소에 접근할 때는 [객체.멤버] 의 형식으로 작성한다
		st2.age = 86;
		
		st1.Show();		// 멤버 메서드 호출
		st2.Show();		// 코드는 같으나, 저장된 데이터가 달라서, 서로 다른 결과를 출력한다	
	}	
}