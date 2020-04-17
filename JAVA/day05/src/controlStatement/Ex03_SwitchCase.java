package controlStatement;

public class Ex03_SwitchCase {
	public static void main(String[] args) {
		
		// 특정 값에 대한 여러 조건을 나열하려면 if보다 switch~case가 더 간편할 수 있다
		
		int num = 1;
		
		if(num == 1)
			System.out.println("1");
		else if(num == 2)
			System.out.println("2");
		else if(num == 3)
			System.out.println("3");
		else
			System.out.println("1, 2, 3이 아님");
		
		switch(num) {
		case 1: //System.out.println("1"); break;
		case 3: System.out.println("1, 3"); break;
		case 2: System.out.println("2"); break;	
		default: System.out.println("1, 2, 3이 아님");
		}
		
		// 자바는 switch 변수에 문자열이 올 수 있다 (equals() 함수를 쓴것 처럼 내용을 비교해준다)
		
		String str = "Apple";
		switch(str) {
		case "Apple": System.out.println("사과"); break;
		case "Banana": System.out.println("바나나"); break;
		}		
	}
}