package test;

class Animal {
	private String name;

	public Animal(String name) {
		this.setName(name);
	}
	public void Voice() {
		System.out.println("동물의 울음 소리 테스트 : ???" + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	public void Voice() {
		System.out.println(getName() + " : 멍멍");
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	public void Voice() {
		System.out.println(getName() + " : 야옹");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Animal a1 = new Animal("테스트");
		Dog d1 = new Dog("초코");
		Cat c1 = new Cat("나비");
		
		a1.Voice();
		d1.Voice();
		c1.Voice();
	}
}