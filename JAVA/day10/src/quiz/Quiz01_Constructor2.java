package quiz;

import java.util.Scanner;

class Circle2 {
	Scanner sc = new Scanner(System.in);
	double radius, pi, length, area;
	
	Circle2(){
		this(0.0);
	}
	Circle2(int radius){
		this((double)radius);
	}
	Circle2(double radius){
		sc = new Scanner(System.in);
		if(radius == 0.0) {
			System.out.print("반지름 입력 : ");
			radius = Double.parseDouble(sc.nextLine());
			System.out.println();
		}
		this.radius = radius; 
		this.pi = 3.1415926535;
		area = radius * radius * pi;
		length = 2 * radius * pi;
	}
	
	void Show() {
		System.out.printf("원의 반지름 : %.2f\n", radius);
		System.out.printf("원의 둘레 : %.2f\n", length);
		System.out.printf("원의 넓이 : %.2f\n\n", area);
	}
}

public class Quiz01_Constructor2 {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		Circle2 c2 = new Circle2(2);
		Circle2 c3 = new Circle2(2.4);
		
		c1.Show();	c2.Show(); 	c3.Show();
		
	}
}

