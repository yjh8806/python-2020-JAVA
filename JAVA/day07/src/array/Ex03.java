package array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] arr = { 2, 7, 4, 8, 6 };
		Arrays.sort(arr);	// 자바 배열 (컬렉션) 관련 클래스, 기본값 오름차순, asc
		
		for(int num : arr) {
			System.out.print(num + " ");
		}System.out.println();
		
		Integer[] arr2 = new Integer[] { 6, 2, 5, 3, 4 };
		Arrays.sort(arr2, Collections.reverseOrder());	// 역정렬(내림차순), desc
		
		for(int num : arr2) {
			System.out.print(num + " ");
		}System.out.println();
		
		String[] arr3 = {"사과", "바나나", "수박", "딸기" , "복숭아"};
		Arrays.sort(arr3);	// 문자열도 abc 혹은 가나다 순에 의해서 정렬 가능
		for(String value : arr3) {
			System.out.print(value + " ");
		}System.out.println();
	}
}