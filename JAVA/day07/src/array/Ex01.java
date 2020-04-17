package array;

public class Ex01 {
	public static void main(String[] args) {
		
		// 배열 : 같은 자료형의 여러 변수를 묶어서 관리하는 자료형
		// 배열의 특정 값에 접근하기 위해서는 첨자, 순번(index)를 사용한다
		
		// 배열 선언하기 (+@ 초기화)
		
		int[] arr = { 2, 7, 4, 8, 6 };
		int arr2[] = { 1, 2, 3, 4, 5 };
		int [] arr3 = new int[100];
		int[] arr4 = new int[] { 3, 4, 5, 6, 7 };
//		int[] arr5 = new int[5] { 4, 5, 6, 7, 8 };
		// 배열 선언 시 길이나 멤버 값 중 하나만 제시해야 한다
		int[] arr6;	// 배열을 참조할 수 있는 참조변수만 선언했을 뿐 배열은 없다
		
		// 자바의 배열은 길이를 자체적으로 가지고 있다
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr3.length : " + arr3.length);
		
		// 배열의 인덱스는 항상 0부터 시작한다
		// 배열의 마지막값은 (길이 - 1) 이다
		// 배열의 길이와 같은 인덱스는 존재하지 않는다
		// 배열의 범위를 벗어나는 접근을 시도하면 ArrayIndexOutOfBoundException이 발생
		System.out.println("arr4[4] : " + arr4[4]);
//		System.out.println("arr4[4] (예외발생): " + arr4[5]);
//		System.out.println("이 코드는 실행되지 않습니다");
		
		// 배열의 멤버 변수는 단일 자료형 변수로 취급하면 된다 <-
		System.out.println("arr4[4] : " + arr4[4]);
		arr4[4] = 10;
		System.out.println("arr4[4] : " + arr4[4]);
		System.out.println("arr4 : " + arr4);	// 참조 주소값 출력
		
		System.out.println("arr4 : " + arr4.getClass().getSimpleName());
		// java.lang 에 정의되어 있는 클래스 자료형이다 -> 생성된 객체는 참조타입이다
		
		
		
		// 1) 일반 for문을 이용하여 배열을 출력하기 (인덱스를 활용하고 싶은 경우)
		System.out.print("1) arr : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		// 2) foreach문을 이용하여 배열을 출력하기 (인덱스가 필요하지 않은 경우)
		System.out.print("2) arr2 : ");
		for(int num : arr2) {	// arr2에 있는 각 멤버 하나하나를 num이라고 할 때
			System.out.print(num + " ");
		}System.out.println();
		
		// !! 배열의 길이는 불변이다. 따라서 배열은 확장할 수 없다
		// 단, 참조의 특성을 활용해서 더 큰 배열을 준비하고, 데이터를 복사해서 옮길 수 있다		
	}
}