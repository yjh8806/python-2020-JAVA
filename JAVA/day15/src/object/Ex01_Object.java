package object;

class Drink /* extends Object */ {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// Object 클래스의 toStrig() 메서드 오버라이딩 하기
	@Override
	public String toString() {
		return name + " / " + price;
	}
}
public class Ex01_Object {
	public static void main(String[] args) {
		Drink ob1 = new Drink();
		Drink ob2 = new Drink();
		Drink ob3 = new Drink();
		
		ob1.setName("코카콜라");
		ob1.setPrice(800);
		
		ob2.setName("핫식스");
		ob2.setPrice(1000);
		
		ob3.setName("핫식스");
		ob3.setPrice(1000);
		
		System.out.println("음료수의 이름 : " + ob1.getName());
		System.out.println("음료수의 가격 : " + ob1.getPrice());
		System.out.println("음료수 : " + ob1);
		System.out.println("음료수 : " + ob1.toString());
		
		System.out.println("ob1과 ob2는 같은 음료수인가 : " + ob1.equals(ob2));
		System.out.println("ob3과 ob2는 같은 음료수인가 : " + ob3.equals(ob2));
		System.out.println("ob2과 ob2는 같은 음료수인가 : " + ob2.equals(ob2));
		
		System.out.println(ob2.hashCode() + " / " + ob3.hashCode());
		
		String str1 = new String("Hello, world !!");
		String str2 = new String("Hello, world !!");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));		
	}
}