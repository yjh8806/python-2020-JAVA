package array;

public class Ex04 {
	public static void main(String[] args) {
		// 배열의 길이를 증가시켜보자
		// 배열은 길이가 고정이므로, 실제로는 배열의 길이가 증가할 수 없다
		
		
		// 하나의 참조변수가 다른 대상을 참조할 수 있으므로, 이 특성을 이용하면
		// 마치 배열의 길이가 늘어난것과 같은 효과를 볼 수 있다
		
		int size = 3;				// 배열 크기 기본값 지정
		int[] arr = new int[size];	// 기본 크기만큼 생성
		arr[0] = 10;	arr[1] = 20; 	arr[2] = 30;	// 입력 대신 직접 대입
		
		System.out.printf("arr[%d] : ", arr.length);	// 배열 처음부터 끝까지 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		int[] tmp = new int[arr.length + size];	// 현재 배열보다 더 큰 임시 배열을 생성 
		for (int i = 0; i < arr.length; i++) {	// 기존 배열의 값을 임시배열에 복사
			tmp[i] = arr[i];
		}
		
		arr = tmp;	// arr 참조변수가 새 배열(더 큰 크기의 배열)을 참조하도록 변경
			
		arr[3] = 40;	arr[4] = 50;	arr[5] = 60;	// 빈곳에 값 추가 입력
		System.out.printf("arr[%d] : ", arr.length);	// 배열 처음부터 끝까지 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();	
	}
}