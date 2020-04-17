package collectionFramework;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		// Ex04.java 를 새로 작성하여, ArrayList 객체에 Human 2, Student 2를 추가
		ArrayList<Human> al = new ArrayList<Human>();
		
		Human h1 = new Human("이지은", 28);
		Human h2 = new Human("홍진호", 37);
		
		Student s1 = new Student("홍길동", 25, "한양대학교");
		Student s2 = new Student("이순신", 32, "해군사관학교");
		
		al.add(h1); 	al.add(h2); 	al.add(s1); 	al.add(s2);
		
		// index를 활용한 for문으로 한번 출력하세요
		System.out.println("기본 형식 for문");
		for (int i = 0; i < al.size(); i++) {	// arr.length
			al.get(i).show(); 	// arr[i].show();
		}
		System.out.println("======================");
		
		// foreach 문으로 출력하세요
		System.out.println("for each문");
		for (Human h : al) {
			h.show();
		}
		System.out.println("======================");		
	}
}