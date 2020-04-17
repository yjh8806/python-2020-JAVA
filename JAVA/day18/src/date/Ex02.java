package date;

import java.util.Date;

public class Ex02 {
	
	public static long getFacto(int n) {
		int result = 1;
		
		while(n != 0) {
			result *= n--;
		}
		return result;
	}
	public static long getFacto2(int n) {
		if(n == 1) 	return n;
		else 		return n * getFacto2(n - 1);
	}
	
	public static void main(String[] args) {
		// Factorial : 지정한 수에서 1씩 감소시키며, 0 이전까지의 값을 모두 곱한 값
		// 4! : 4 * 3 * 2 * 1 = 24
		// 5! : 5 * 4 * 3 * 2 * 1 = 120
		
		System.out.println("4! : " + getFacto(4));
		System.out.println("5! : " + getFacto(5));
		
		System.out.println("4! : " + getFacto2(4));
		System.out.println("5! : " + getFacto2(5));
		
//		long start = new Date().getTime();
		long start = System.nanoTime();
		long test1 = getFacto(50);
//		long end = new Date().getTime();
		long end = System.nanoTime();
		
		long elapsedTime = end - start;
		System.out.println("test1 : " + (end - start) + " ms");
		
		start = System.nanoTime();
		long test2 = getFacto2(50);
		end = System.nanoTime();
		System.out.println("test2 : " + (end - start) + " ms");
		
		System.out.println(new Date());		
	}
}