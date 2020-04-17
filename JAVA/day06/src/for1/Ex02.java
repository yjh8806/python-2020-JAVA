package for1;

public class Ex02 {
	public static void main(String[] args) {
		// 예제) 1에서 100 사이의 수 중 홀수의 합과 짝수의 합을 구해서 화면에 출력하세요
		
		int oddSum = 0, evenSum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0)  evenSum += i;
			else 			oddSum += i;
		}
		
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);		
	}
}