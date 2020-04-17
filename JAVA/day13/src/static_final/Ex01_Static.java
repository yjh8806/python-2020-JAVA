package static_final;

// 클래스를 알아야 객체를 생성할 수 있다
// 1. 클래스 정보를 메모리에 로드 (이 때, static 속성을 갖는 필드 생성, 메서드 정의)
// 2. 준비된 클래스를 통해서 객체를 생성 (객체 생성 시, 생성자가 객체 필드의 값을 지정)
// 3. static 속성은 클래스를 통해서 참조하고, non-static은 객체를 통해서 참조한다
// 4. static 은 non-static을 참조할 수 없다 (static 생성 시점에서는 non-static이 아직 만들어지기 전)
// 5. non-static은 static을 참조할 수 있다

class Human {
	private static int eyeCount = 2;
	// static 속성이 명시된 필드는 클래스필드/스태틱필드 라고 한다
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getEyeCount() {
//		System.out.println("name : " + name);
		// Cannot make a static reference to the non-static field name
		// static이 non-static 필드 name을 참조할 수 없습니다
		return eyeCount;
	}
}

public class Ex01_Static {
	// java의 메인함수는 왜 항상 static인가?
	// public class가 객체를 생성하기 전에 곧바로 실행 가능해야 하기 때문에
	public static void main(String[] args) {
		
		System.out.println("Human 클래스의 눈은 몇 개 : " + Human.getEyeCount());
		
//		System.out.println("Human 클래스의 이름은 무엇 : " + Human.getName());
		// getName() 은 static 속성이 아니므로, 클래스를 통해서 참조할 수 없다
		
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setName("이지은");
		h2.setName("홍진호");
		System.out.println("h1 객체의 이름은 무엇 : " + h1.getName());
		System.out.println("h2 객체의 이름은 무엇 : " + h2.getName());
		System.out.println("h1 객체는 눈 몇개 : " + h1.getEyeCount());
		System.out.println("h2 객체는 눈 몇개 : " + h2.getEyeCount());		
	}
}