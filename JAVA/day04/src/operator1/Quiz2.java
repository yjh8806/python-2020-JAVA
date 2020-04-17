package operator1;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 1. 한 글자를 입력받아서, 연산자인지 아닌지 판별하는 코드
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자를 입력하세요 : ");
		ch = sc.nextLine().charAt(0);
		
		boolean flagQ1 = 
				ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
		
		System.out.println(flagQ1 ? "연산자입니다" : "연산자가 아닙니다");
		System.out.println();
		
		// 2. 두 수와 연산자를 입력받아서, 답을 출력하는 코드
		
		System.out.println("두 숫자의 연산식을 입력하세요 : ");
		Integer n1 = null, n2 = null, answer = null;
		Character oper = null;
		
		String str = sc.nextLine();		// 12 + 7
		String [] arr = str.split(" ");
		if(arr.length != 3) 
			System.out.println("연산식을 식별할 수 없습니다");
		
		else {
			n1 = Integer.parseInt(arr[0]);
			oper = arr[1].charAt(0);
			n2 = Integer.parseInt(arr[2]);
			answer = oper == '+' ? n1 + n2 : 
					 oper == '-' ? n1 - n2 :
					 oper == '*' ? n1 * n2 :
					 oper == '/' ? n1 / n2 :
					 oper == '%' ? n1 % n2 : 0;
			System.out.printf("%s = %d\n", str, answer);
		}		
	}
}