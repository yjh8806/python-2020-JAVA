package function;

public class Quiz1 {
	// 모든 함수는 아래에 작성합니다. 함수 반환형 앞에 static 키워드를 붙여주세요
	static int getMaxNum(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	static int getMaxNum(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		return max;
	}
	static int getAsciiCode(String str) {
		char ch = str.charAt(0);
		return (int)ch;
	}
	
	public static void main(String[] args) {
		// 1. 두 수중 큰 수를 반환하는 함수 getMaxNum()
		int n1 = 2, n2 = 5;
		System.out.printf("%d와 %d중에서 큰 수는 %d\n\n",
				n1, n2, getMaxNum(n1, n2));
		
		// 2. 세 수중 큰 수를 반환하는 함수 getMaxNum3()
		int v1 = 3, v2 = 10, v3 = -100;
		System.out.printf("%d, %d, %d 중에서 가장 큰 수는 %d\n\n", 
				v1, v2, v3, getMaxNum(v1, v2, v3));
		
		// 3. 전달하는 문자열의 첫번째 글자의 아스키 코드를 반환하는 함수 getAsciiCode()
		String str = "Apple";
		System.out.printf("%s에서 첫 글자의 아스키 코드는 %d\n\n"
				, str, getAsciiCode(str));
	}
}