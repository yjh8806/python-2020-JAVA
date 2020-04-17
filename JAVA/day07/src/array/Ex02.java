package array;

public class Ex02 {
	public static void main(String[] args) {
		// 배열을 활용한 정렬
		
		int[] arr = { 2, 7, 4, 8, 6 };
		
		System.out.print("arr : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}System.out.println();
		
		// 두 변수의 값 교환
		int n1 = 7;
		int n2 = 8;
		int tmp;
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
		tmp = n1;
		n1 = n2;
		n2 = tmp;
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
		
		// 오름차순 정렬 (값이 점점 올라간다, 커진다)
		
		for (int i = 0; i < arr.length - 1; i++) {		// 기준 (처음부터 끝까지)
			for (int j = i + 1; j < arr.length; j++) {	// 비교대상(기준 이후값만)
				if(arr[i] > arr[j]) { // 기준이 더 작아야 오름차순인데,기준이 더 크면
					tmp = arr[i];	  // 기준과 비교대상을 바꿔라
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력
		System.out.print("arr : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}		
	}
}