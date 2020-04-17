package collectionFramework;

import java.util.List;		// 인터페이스
import java.util.ArrayList;	// 인터페이스 List의 내용을 구현한 클래스

public class Ex02_List {
	public static void main(String[] args) {
//		List list1 = new List();	// Cannot instantiate the type List
		ArrayList list1 = new ArrayList();
		
		list1.add(10);			// add() 메서드를 이용하여 내가 원하는 값을 넣기
		list1.add(20);			
		list1.add("ITBANK");	// 자료형에 상관없이 값을 입력할 수 있다
		list1.add(0, 30);		// 필요하다면, 인덱스를 지정하여 입력할 수도 있다
		list1.add(new Integer(20));	// 20은 이미 리스트에 있으나, 중복을 허용한다
		
		// arr는 arr.length 값을 사용하는데에 비해, list는 list.size() 메서드 반환값을 사용
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("list1.get(" + i + ") : " + list1.get(i));
		}
		
		// 컬렉션에는 Object Type으로 자료를 받으므로, 모든 객체 자료형을 처리할 수 있다
		// 특정 자료형에 대해서만 처리를 할 수 있게, 내부 자료형을 명시할 수 있다
		// Generic Type : 컬렉션 내부 자료형
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("10");
		list2.add("20");
		list2.add("ITBANK");
		list2.add(new String("20"));
		
		// List는 foreach문을 사용할 수 있다
		System.out.println();
		for(String str : list2) {
			System.out.println("list2의 문자열 중 하나 : " + str);
			System.out.println("list2의 문자열 중 하나의 길이 : " + str.length());
		}
		System.out.println();		
	}
}