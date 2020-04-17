package collectionFramework;

import java.util.Set;		// 인터페이스
import java.util.HashSet;	// Set을 구현한 클래스
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// Set : 인덱스가 없고, 중복을 허용하지 않는 컬렉션
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
//		set.add("ITBANK");	// 제네릭을 지정하면 다른 자료형의 데이터는 넣을 수 없다
		set.add(20);
		
//		System.out.println(set.get(0));	// set은 인덱스가 없다
		
		System.out.println("set의 크기 : " + set.size());
		
		for(Integer num : set) {	// 인덱스가 없으니 foreach
			System.out.println(num);
		}
		System.out.println();
		
		// Set은 단독으로 사용하기 보다, Map의 key값을 저장하는 용도로 사용한다
		// Map의 key는 index와 같은 역할이다 (중복되면 안된다)
		
		Iterator<Integer> it = set.iterator();	
		// 순환자 -> set에 담긴 값을 순환할 수 있는 형태로 옮겨담는다
		System.out.println("iterator 를 이용한 순회");
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
}