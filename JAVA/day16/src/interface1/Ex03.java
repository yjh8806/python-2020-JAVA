package interface1;
// 인터페이스의 사용 예시

class Computer {
	public void connect(USB u) {	// USB 기기를 연결하면
		u.startup();		// 해당 기기의 초기 작동을 호출한다
	}
}
interface USB {
	/* public abstract */ void startup();
}
class MemoryStick implements USB {
	@Override public void startup() {
		System.out.println("USB 연결됨. 64GB");
	}
}
class DataCable implements USB  {
	@Override public void startup() {
		System.out.println("모바일 기기 연결됨.");
	}
}
class PowerCable implements USB  {
	@Override public void startup() {
		System.out.println("소형 선풍기 연결됨. 전원 공급 시작");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Computer pc = new Computer();
		
		DataCable ob1 = new DataCable();
		PowerCable ob2 = new PowerCable();
		MemoryStick ob3 = new MemoryStick();
		// 서로 다른 클래스이지만 인터페이스로 묶어진 형태
		
		pc.connect(ob1);
		pc.connect(ob2);
		pc.connect(ob3);
		
		// Java 8 부터는 람다식을 활용해서 인터페이스로 객체를 생성한다
		
		// 1. 익명 내부 클래스를 이용하여 만들기
		USB ob4 = new USB() {
			@Override
			public void startup() {
				System.out.println("106키 호환 키보드 연결됨...");
			}
		};
		pc.connect(ob4);
		
		// 2. 람다식을 활용한 생성
		USB ob5 = () -> System.out.println("USB 마우스 연결됨...");
		pc.connect(ob5);
		
		// 인터페이스 중에서도 하나의 추상메서드만 포함하는 형태를 함수형 인터페이스라고 한다
		// 함수형 인터페이스는 단 하나의 메서드 내용만 구현하면 되므로
		// () -> 뒤에 메서드의 내용을 적어주면 된다
		// 메서드의 내용이 길면 { } 를 이용해서 블럭을 명시한다
		// 매개변수를 받는 형태이면 () 내부에 매개변수를 선언한다		
	}
}