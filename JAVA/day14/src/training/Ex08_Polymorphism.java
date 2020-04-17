package training;

class Human {
	String name;
	Human(String name) { this.name = name; }
	
	public void show() {
		System.out.println("클래스 : " + this.getClass().getSimpleName());
		System.out.println("이름 : " + name);
	}
}

class Doctor extends Human {
	Doctor(String name) { super(name); }
	void firstAid() {
		System.out.println("응급처치 수행 중...");
	}
}
class Singer extends Human {
	Singer(String name) { super(name); }
}
class Actor extends Human {
	Actor(String name) { super(name); }
}

public class Ex08_Polymorphism {
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("김사부");
		Singer s1 = new Singer("이지은");
		Actor a1 = new Actor("이병헌");		// 객체를 생성할 때 서브 클래스로 생성
		
		a1.show(); s1.show(); d1.show();
		System.out.println();
		
		Human [] arr = new Human[5];	// 사람이면 입장 가능한 배열, 빈 공간만 만들어져 있음
		
		d1.firstAid(); 	// 의사가 응급처치
		
		arr[0] = d1;		// 서브 클래스의 자료형을 슈퍼 클래스의 참조변수에 대입하는 과정에서 형 변환 발생
		arr[1] = s1;		// 서브 클래스의 자료형이 슈퍼 클래스의 자료형으로 변경되었다
		arr[2] = a1;		// up-casting 되었다
		
//		arr[0].firstAid();
		
		for (int i = 0; i < arr.length; i++) {
			// Class : 객체의 자료형
			// object : 클래스를 이용하여 생성한 객체				 
			// instance : 특정 자료형의 객체를 가리킬 때 주로 사용		 
			if(arr[i] != null && arr[i] instanceof Doctor) {
				Doctor tmp = (Doctor) arr[i];	
				// up-casting 된 객체를 (자료형 확인 이후) 강제 형변환해서 다시 원래 클래스로 참조시키기
				// down-casting 되었다
				
				tmp.show();
				tmp.firstAid();
				System.out.println();
			}
		}
		
		// 하나의 객체가 슈퍼 클래스로도 참조될 수 있고, 서브 클래스로도 참조될 수 있는 특징을
		// 객체가 다형성을 지닌다 라고 말한다
		
		// 캡슐화, 상속, 다형성, (추상화)		
	}
}