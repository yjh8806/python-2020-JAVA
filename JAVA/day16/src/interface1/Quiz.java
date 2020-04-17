package interface1;

class Human {
	String name;
	String feed;
	Human(String name) { this.name = name; }
	
	// 중복 정의 (overloading)
//	void give(Cat c) { System.out.printf("%s이 %s에게 먹이를 주었다\n", name, c.name);}
//	void give(Dog d) { System.out.printf("%s이 %s에게 먹이를 주었다\n", name, d.name);}
	
	// 매개변수의 자료형을 공통 상위 클래스로 변경하기
	void give(Companion a) { 
//		String feed;
//		if(a instanceof Cat) 		feed = "생선";
//		else if(a instanceof Dog) 	feed = "개껌";
//		else 						feed = "먹이";
//		System.out.printf("%s이 %s에게 %s을 주었다\n", name, a.name, feed); 
		
//		System.out.printf("%s이 %s에게 %s을 주었다\n", name, a.name, a.feed);
		System.out.printf("%s이 %s에게 %s을 주었다\n", name, a.getName(), a.getFeed());
	}
	
}
interface Companion {
	String getName();
	String getFeed();
}
abstract class Animal {
	String name;
	String feed;
	Animal(String name) { 
		this.name = name;
	}
}
class Cat extends Animal implements Companion {
	Cat(String name) 		{ super(name); feed = "생선"; }
	public String getName() { return this.name; }
	public String getFeed() { return this.feed; } 
}
class Dog extends Animal implements Companion {
	Dog(String name) 		{ super(name); feed = "개껌"; }
	public String getName() { return this.name; }
	public String getFeed() { return this.feed; }
}
class Friend extends Human implements Companion {
	Friend(String name) 	{ super(name); feed = "몽쉘"; }
	public String getName() { return this.name; }
	public String getFeed() { return this.feed; }
}

public class Quiz {
	public static void main(String[] args) {
		
		Human h1 = new Human("이지은");
		Cat c1 = new Cat("나비");
		Dog d1 = new Dog("초코");
		
		h1.give(c1);
		h1.give(d1);
		
//		1. 	이지은이 나비에게 먹이를 주었다
//			이지은이 초코에게 먹이를 주었다		라고 출력될 수 있도록 코드를 작성하세요
		
//		2. 	이지은이 나비에게 생선을 주었다
//			이지은이 초코에게 개껌을 주었다		라고 변경하세요
		
//		3.	이지은이 유인나에게 몽쉘을 주었다	라고 출력할 수 있도록 코드를 수정하세요
//		(Cat, Dog는 Animal의 하위클래스 / Friend는 Human의 하위클래스)
//		(인터페이스를 활용하세요)
		
		Friend f1 = new Friend("유인나");
		h1.give(f1);
		
//		4.  이지은이 나비에게 생선을 던져 주었다
//			이지은이 초코에게 개껌을 던져 주었다
//			이지은이 유인나에게 몽쉘을 건네 주었다	라고 출력하게 코드를 수정하세요
	}
}