package collectionFramework;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<Human>();
		
		Human h1 = new Human("이지은", 28);
		list.add(h1);
		list.add(new Human("홍진호", 37));
		list.add(new Human("봉준호", 45));
		
		for(Human h : list) {
			h.show();
		}
//		==================================================
		ArrayList list2 = new ArrayList();
		
		list2.add(new Human("송강호", 45));
		list2.add(new Human("조여정", 42));
		list2.add(new Human("박소담", 24));
		
		// Type mismatch: cannot convert from element type Object to Human
		for(Object h : list2) {
			((Human)h).show();
		}		
	}
}