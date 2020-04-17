package static_final;

class Member {
	String name;
	int age;
	static int all;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " 객체 생성 !!");
		all += 1;
	}
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살\n");
	}
	public static void printAll() {
		System.out.println("생성된 총 객체 수 : " + all + "\n");
	}
}

public class Ex02_Static {
	public static void main(String[] args) {
		Member.printAll();
		
		Member ob1 = new Member("이지은", 28);
		Member ob2 = new Member("민경훈", 35);
		System.out.println();
		
		ob1.showInfo();
		ob2.showInfo();
		
		Member.printAll();
		
//		The static method printAll() from the type Member should be accessed in a static way
//		스태틱 메서드에 대해서는 스태틱의 방식으로 접근하는게 더 낫습니다(클래스.메서드)
		ob1.printAll();
		ob2.printAll();		
	}
}