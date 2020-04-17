package abstractClass;
// 추상 클래스? 서로 다른 클래스의 공통점(기능, 메서드)만 추출하여 정의한 부모클래스
// 추상 클래스는 추상 메서드를 포함하는 클래스이다
// 추상 메서드는 기능의 형식은 정의되어 있으나, 기능의 내용은 정의되어 있지 않다
// 예) 대부분의 '동물'은 '소리를 낸다' 라는 기능이 있으나, 실제 결과는 서로 다르다

// 추상 클래스는 추상적은 개념(실제 내용이 명시되지 않은)이므로, 현실화(객체화)할 수 없다
// -> 추상 클래스는 객체를 생성할 수 없다
// 강아지, 고양이는 동물의 카테고리에 속하니까 동물이라고 부르지만
// '동물' 그 자체를 객체화 할 수는 없다

abstract class Animal {	// 추상 클래스 : 추상 클래스만 추상 메서드를 포함할 수 있다
	// The type Animal must be an abstract class to define abstract methods
	
	String name;					// 필드
	public Animal(String name) {	// 생성자
		this.name = name;
	}
	public void show() {			// 메서드
		System.out.println(this.getClass().getSimpleName() + " : " + name);
	}
	abstract public void sound();	// 추상 메서드
	// Abstract methods do not specify a body
}
class Dog extends Animal {
	// Implicit super constructor Animal() is undefined for 
	// default constructor. Must define an explicit constructor
	// 상위 클래스에 기본 생성자가 없다.
	public Dog(String name) { super(name); }
	
	// The type Dog must implement the 
	// inherited abstract method Animal.sound()
	// 메서드의 구체적인 내용이 없으니, 오버라이딩(재정의)해서 내용을 만들어주면 된다
	@Override
	public void sound() {
		System.out.println(name + " : " + "멍멍");
	}
}
class Cat extends Animal {
	public Cat(String name) { super(name); }
	@Override
	public void sound() {
		System.out.println(name + " : 야옹");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Dog ob1 = new Dog("뽀삐");
		Cat ob2 = new Cat("나비");
//		Animal ob3 = new Animal("뻐꾸기");
		// Cannot instantiate the type Animal : Animal을 객체화 할 수 없다(추상클래스)
		
		Animal ob3 = new Animal("뻐꾸기") {
			@Override
			public void sound() {
				System.out.println(name + " : 뻐꾹");
			}
		};
		
		ob1.sound();
		ob2.sound();
		ob3.sound();
		
		Animal ob4 = ob1;	// 업캐스팅 된 상태에서도
		ob4.sound();		// 오버라이딩이므로, 하위클래스의 메서드 내용이 실행된다
		
		System.out.println("==========================");
		Animal [] arr = new Animal[] { ob1, ob2, ob3 };
		for(Animal a : arr) {
			a.sound();
		}
		System.out.println("==========================");
		for(Animal a : arr) {
			animalSound(a);
		}
		
	}
	
	public static void animalSound(Animal a) {
		a.sound();
	}	
}