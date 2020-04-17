package function;

import java.util.Scanner;

public class Quiz3 {
	
	static boolean isValid(String cardNumber) {
		
		int sum = 0;	// 합계를 저장할 변수
		
		for (int i = 0; i < cardNumber.length(); i++) {	// 각 자릿 만큼 반복
			int num = Integer.parseInt(cardNumber.substring(i, i + 1)); // 자릿수를 num에 저장
			if (i % 2 == 0) {							// 만약 숫자가 짝수이
			num *= 2;									// 2를 곱하기
			num = num < 10 ? num : num / 10 + num % 10;	// 10보다 작으면 그대로, 아니면 몫과 나머지 더함
			}
			sum += num;									// 변경된 숫자를 합계 (sum)에 더함
		}
		return sum % 10 == 0;							// 합계가 10으로 나누어 떨어지는지 아닌지를 반환 (true/ false)
	}
						
	
	
	public static void main(String[] args) {
		
		System.out.println(Quiz2.applyCardNumFormat("9440123478561234"));
		// 같은 패키지 내의 다른 클래스의 메서드를 호출해서 사용할 수 있다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카드 번호 16자리를 숫자만 입력하세요 : ");
		String input = sc.nextLine();
		
		System.out.print("결과) " + Quiz2.applyCardNumFormat(input) + " : ");
		System.out.println(isValid(input) ? "유효함" : "유효하지 않음");
		
		
		
		
/*
신용카드는 총 16자리의 숫자로 구성되어 있다. 언뜻 보기에는 무작위로 된 숫자로 구성되어 있는 것 같이 보이지만 
그 속에는 하나의 수학적 비밀이 숨겨져 있다. 
그중 하나가 카드 번호가 유효 한지 유효하지 않은 지 검사하는 Luhn 공식이다. 그 공식은 다음과 같다.

1. 신용카드의 16자리 숫자에서 맨 우측 수부터 세어 홀수 번째 수는 그대로 두고, 짝수 번째 수를 2배로 만든다.
2. 2배로 만든 짝수 번째 수가 10 이상인 경우, 각 자리의 숫자를 더하고 그 수로 대체한다.
3. 이와 같이 얻은 모든 자리의 수를 더한다.
4. 그 합이 10으로 나뉘면 “정당한 번호”(유효)이고 그렇지 않으면 “부당한 번호”(유효하지 않음)로 판정된다.

ex)
2720992711828767    T
3444063910462763    F
o o o o o o o o
6011733895106094    T
*/

	}
}