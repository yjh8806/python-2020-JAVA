 package collectionFramework;

import java.util.Map;		// 인터페이스
import java.util.Set;
import java.util.Enumeration;
import java.util.Hashtable;	// Map을 구현한 클래스
import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		// Map : 리스트에서 index 대신, key형식을 사용하여
		// key와 value를 1:1 Mapping 하여 저장하는 방식
		// key는 중복될 수 없고, value는 중복될 수 있다
		
		Hashtable <String, Object> ht = new Hashtable<String, Object>();
		
		// 값 추가하기 : key, value의 형식으로 추가한다
		ht.put("a", "apple");
		ht.put("b", "banana");
		ht.put("c", "carpet");
		
		// 값 꺼내오기 : key를 제시하면 value를 구할 수 있다 (반대는 불가능)
		System.out.println("ht.get(\"a\") : " + ht.get("a"));
		System.out.println("ht.get(\"b\") : " + ht.get("b"));
		System.out.println("ht.get(\"apple\") : " + ht.get("apple"));
		

		System.out.println("모든 값을 한번에 출력하기 (enumeration)");
		Enumeration<String> enu = ht.keys();
		// 열거자
		while(enu.hasMoreElements()) {		// enu에 아직 확인하지 않은 값이 남아있다면
			String key = enu.nextElement();	// 그중 하나를 꺼내서 key로 저장
			Object value = ht.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		
		System.out.println("모든 값을 한번에 출력하기 (set, iterator)");
		Set<String> keyset = ht.keySet();
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Object value = ht.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();		
	}
}