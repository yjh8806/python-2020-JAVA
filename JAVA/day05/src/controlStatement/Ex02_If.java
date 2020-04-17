package controlStatement;

import java.util.Scanner;

public class Ex02_If {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cash, card;
		
		System.out.print("보유 현금을 입력 : ");
		cash = Integer.parseInt(sc.nextLine());
		
		System.out.print("카드 잔액을 입력 : ");
		card = Integer.parseInt(sc.nextLine());
		
		if(cash >= 1300 || card >= 1300) {
			if(cash >= 1300 && card < 1300) {
				System.out.print("현금을 지불하고 ");
			}
			else
				System.out.print("카드를 이용해서 ");
				
			System.out.println("지하철을 타고 간다");
		}
		else {
			System.out.println("걸어간다");
		}
	}
}