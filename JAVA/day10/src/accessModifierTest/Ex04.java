package accessModifierTest;

class Student {
	private String name;
	private int age;
	private boolean attendance;
	
	// getter, setter 의 이름은 camel 표기법을 따른다
	// camel 표기법 : 첫글자는 소문자, 단어와 단어의 합성어인 경우 합성어의 첫글자를 대문자
	// 낙타 등 처럼 생겼다고 저런 이름이 붙었다
	
	public String getName() {	// getter
		return name;
	}
	public void setName(String name) {	// setter
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAttendance() {
		return attendance;
	}
	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
	

}

public class Ex04 {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
//		st1.name = "이지은";
		st1.setName("이지은");
		
		Student [] arr = new Student[5];	// 배열 생성 : 공간만 제공할 뿐 객체는 없다
//		nullPointerException 주의하기
		
		arr[0] = new Student();	// 배열의 참조변수에 객체를 생성해서 
		arr[0].setName("홍진호");	// setter를 활용해서 값을 넣어주고
		arr[0].setAge(38);
		arr[0].setAttendance(true);
		
		// getter로 멤버필드의 값을 참조하여 출력한다
		System.out.println("arr[0].name : " + arr[0].getName());
		System.out.println("arr[0].age : " + arr[0].getAge());
		System.out.printf("%s 학생 출석 : %s\n",
				arr[0].getName(), arr[0].isAttendance() ? "출석" : "결석");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Student();
				
			}
		}		
	}
}