package day09;

class Human {
	private String name;			// 멤버 필드
	
	public Human(String name) {		
		this.name = name;
	}
	public String getName() {		// 멤버 메서드
		return this.name;
	}
}

class Reporter extends Human {

	private String context;
	
	public Reporter(String name) {
		super(name);
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getContext() {
		return context;
	}
}

class Citizen extends Human {
	private String opinion = "올 겨울은 그다지 춥지 않은것 같아요";
	
	public Citizen(String name) {
		super(name);
	}
	
	public String getOpinion() {
		return opinion;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Reporter r1 = new Reporter("김민아");
		Citizen c1 = new Citizen("손흥민");
		
		System.out.printf("안녕하세요. 리포터 %s 입니다\n", r1.getName());
		System.out.println("성함이 어떻게 되십니까?");
		System.out.println();
		
		System.out.println("제 이름은 " + c1.getName() + "입니다");
		System.out.println();
		
		System.out.println(r1.getName() + " : 올 겨울 날씨 어떻게 생각하세요?");
		System.out.println();
		
		System.out.println(c1.getName() + " : " + c1.getOpinion());		
	}
}