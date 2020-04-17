package array;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		String [] names = new String[5];
		int[] ages = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// 5명의 이름과 5명의 나이를 서로 다르게 입력하고,
		// 정렬 안된 상태로 한번 출력, 나이 기준 내림차순으로 정렬하고 한번 더 출력하세요
		
		// 입력
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + 1 + "번째 이름 입력 : ");
			names[i] = sc.nextLine();
			System.out.print(i + 1 + "번째 나이 입력 : ");
			ages[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println("정렬 전 출력");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s : %d살\n", names[i], ages[i]);
		}
		
		// 내림차순 정렬 
		for (int i = 0; i < ages.length - 1; i++) {		// i= 0,1,2,3
			for (int j = i + 1; j < ages.length; j++) {	
				if(ages[i] < ages[j]) { // <- 오름차순과 내림차순을 결정하는 부등호 방향 
					int age = ages[i];	// 나이를 변경하면
					ages[i] = ages[j];
					ages[j] = age;
					String name = names[i]; // 그에 맞게 이름도 변경해라
					names[i] = names[j];
					names[j] = name;
				}
			}
		}
		System.out.println("\n정렬 후 출력");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s : %d살\n", names[i], ages[i]);
		}		
	}
}