package collectionFramework;

public class Human {
	protected String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println();
	}

	public int getAge() {
		return age;
	}
}