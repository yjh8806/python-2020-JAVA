package quiz;

public class TV {
	// 내가 생성할 객체의 [속성]은 필드로 표현
	boolean power;
	
	// 내가 생성할 객체의 [기능]은 메서드로 표현
	void Power() {
		power = !power;
		show();
	}
	
	void show() {
		System.out.println("┌──────┐");
		System.out.printf("│ %4s │\n", power ? "on" : "off");
		System.out.println("└──────┘");
	}
	
	// 만약 초기 작동 / 초기값이 필요하면 생성자 활용	
}