package arrayObject;

import java.util.Scanner;

class Human{
	String name;
	Human(String name){
		this.name = name;
	}
}

class Taxi {
	Human[] seat = new Human[5];
	
	Taxi(){
		seat[0] = new Human("운전기사");
	}
	
	void Entrance(Human human) {
		for(int i=0;i<seat.length;i++) {
			if(seat[i] == null) {
				seat[i] = human;
				return;
			}
		}
		System.err.println("빈 자리가 없어요 !!");
	}
	
	void ShowStatus() {
		for(int i=0;i<seat.length;i++) {
			if(seat[i] != null) 
				System.out.println("탑승자 : " + seat[i].name);
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Taxi taxi = new Taxi();
		
		while(true) {
			System.out.println("======================");
			taxi.ShowStatus();
			System.out.println("======================");
			System.out.println("1. 택시 탑승");
			System.out.println("2. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("탑승자의 이름 입력 : ");
				String name = sc.nextLine();
				Human human = new Human(name);
				taxi.Entrance(human);
				break;
			case 2:
				return;
			}
		}
		
	}
}