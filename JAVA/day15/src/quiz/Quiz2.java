package quiz;

class Room {
	private People [] arr = new People[3];
	
	public void addPeople(People p) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = p;
				System.out.println(p.getName() + " 입장 !!");
				return;
			}
		}
		System.out.println("빈 자리가 없습니다");
	}
	public void showAll() {
		for(People p : arr) {
			if (p != null) {
				p.show();	// 이름과 직업을 출력하도록 (공통, 오버라이딩)
				// 만약 p가 Singer 이면 자신의 대표곡을 하나 출력하도록 (고유 메서드)
				
//				if (p instanceof Singer) {
//				if (p.getClass().equals(Singer.class)) {
				if (p.getClass().getSimpleName().equals("Singer")) {
					System.out.println("대표곡 : " + ((Singer)p).song);
				}
			}
		}
	}
}
class People {
	String name;
	public People(String name) { this.name = name; }
	public String getName()    { return this.name; }
	public void show() {
		System.out.println("이름 : " + getName());
		System.out.println("직업 : " + this.getClass().getSimpleName());
		System.out.println();
	}
}
class Student extends People {
	public Student(String name) {
		super(name);
	}
}
class Singer extends People {
	String song;
	public Singer(String name) {
		super(name);
		switch(name) {
		case "이지은": song = "좋은 날"; 	break;
		case "윤종신": song = "좋니";		break;
		}
	}
}


public class Quiz2 {
	public static void main(String[] args) {
		Student s1 = new Student("김민아");
		Student s2 = new Student("홍진호");
		Singer s3 = new Singer("이지은");
		Singer s4 = new Singer("윤종신");
		
		Room room = new Room();
		
		room.addPeople(s1);
		room.addPeople(s2);
		room.addPeople(s3);
		room.addPeople(s4);
		
		room.showAll();
	}
}