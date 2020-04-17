package collectionFramework;

public class Student extends Human {

	String schoolName;
	
	// 생성자를 작성하여 슈퍼클래스 Human의 생성자에게 필요한 만큼을 전달하세요
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	// 학생은 show()를 실행하면 이름, 나이, 학교이름을 출력하도록 설정하세요
	@Override
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + getAge());
		System.out.println("학교 : " + schoolName);
		System.out.println();
	}
	
	// Ex04.java 를 새로 작성하여, ArrayList 객체에 Human 2, Student 2를 추가
	
	// index를 활용한 for문으로 한번 출력하세요
	
	// foreach 문으로 출력하세요
}