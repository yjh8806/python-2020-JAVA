package quiz;

class Animal{
	private String name;
	
	public Animal(String name) 	{ this.name = name; }
	public void Voice() 		{ System.out.println(name + " : ...");	}
	public String getName() 	{ return name;	}
}
class Dog extends Animal{
	public Dog(String name) {	super(name); 	}
	public void Voice() 	{ 	System.out.println(getName() + " : 멍멍");	}
}
class Cat extends Animal{

	public Cat(String name) {
		//this.name = name;
		super(name);
	}
	@Override 
	public void Voice() { 	System.out.println(getName() + " : 야옹");	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Cat c1 = new Cat("나비");
		Dog d1 = new Dog("초코");
		c1.Voice();		// 야옹
		d1.Voice();		// 멍멍
		
		Animal [] animals = new Animal[] { c1, d1 };
		System.out.println("\nforeach");
		for(Animal a : animals) {
			a.Voice();
		}		
	}
}