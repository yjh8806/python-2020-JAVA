package for1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		String [] names = {"이지은", "홍진호", "한석규"};
		int [] ages = {28, 37, 55};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 : ");
		String find = sc.nextLine();
		boolean flag = false;
		
		for (int i = 0; i < names.length; i++) {	// 배열.length : 배열의 길이값(int)
			if(find.equals(names[i])) {		// 검색어와 이름이 일치하면
				System.out.printf("%s님의 나이는 %d살입니다\n", names[i], ages[i]);
				flag = true;
				break;
			}
		}
		
		if(flag == false) 
			System.out.println("결과를 찾을 수 없습니다");		
	}
}