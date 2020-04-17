package array;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// 1. arr에 Scanner 를 이용하여 숫자를 입력받으세요 (멤버변수가 단일변수취급)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		// 2. 입력받은 숫자를 for문을 활용하여 출력하세요 (인덱스가 필요하면 일반 for문)
		System.out.print("arr : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i != arr.length - 1 ? ", " : "\n");
		}System.out.println();
		
		// 3. 입력받은 숫자가 짝수인 것만 출력하세요 (foreach)
		System.out.print("arr(짝수만) : ");
		for(int num : arr) {
			if(num % 2 == 0) System.out.print(num + " ");
		}System.out.println();
		
		// 4. 입력받은 배열의 마지막값만 출력하세요 (for X)
		System.out.println("arr(마지막값) : " + arr[arr.length - 1]);
		
		// 5. arr2 를 생성하고 arr의 내용을 그대로 복사하여, arr2를 출력하세요
//		int[] arr2 = arr;	// 이건 복사가 아니라, 같은 대상을 바라보는 형태
		
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		// 확인용
		arr2[arr2.length - 1] *= 10;
		
		System.out.print("arr2 : ");
		for(int num : arr2) {
			System.out.print(num + " ");
		}System.out.println("\n");
		System.out.println(arr);
		System.out.println(arr2);		
	}
}