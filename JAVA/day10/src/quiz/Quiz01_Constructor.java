package quiz;

import java.util.Scanner;

class Circle {
	
	Scanner sc = new Scanner(System.in);
	
	double radius;
	double pi = 3.1415926535;
	double round, area;
	
	Circle() {
		sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		radius = Double.parseDouble(sc.nextLine());
		System.out.println();
		area = radius * radius * pi;
		round = 2 * radius * pi;
	}
	
	Circle(int radius) {
		this.radius = radius;
		area = radius * radius * pi;
		round = 2 * radius * pi;
	}
	Circle(double radius) {
		this.radius = radius;
		area = radius * radius * pi;
		round = 2 * radius * pi;
	}
	
	void Show() {
		System.out.printf("원의 반지름 : %.2f\n", radius);
		System.out.printf("원의 둘레 : %.2f\n", round);
		System.out.printf("원의 넓이 : %.2f\n", area);
	}
}



public class Quiz01_Constructor {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(2.4);
		
		c1.Show(); c2.Show(); c3.Show();
	}

}
