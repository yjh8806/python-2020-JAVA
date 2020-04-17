package exception;
// 발생한 예외를 전가시키기

class Calc {
	public static int sub(int a, int b) {
		try {
			return a / b;	// 실제 예외가 발생하는 코드
			
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int sub2(int a, int b) throws ArithmeticException {
		return a / b;
		// 모든 메서드의 코드마다 예외처리를 일일히 하려면 작업량도 늘고 가독성도 떨어진다
	}
}

public class Ex04 {
	public static void main(String[] args) throws Exception {
		int n1 = 6;
		int n2 = 0;
		int result = 0;
		
		result = Calc.sub2(n1, n2);
		
		
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
}