package for1;

public class Ex04 {
	public static void main(String[] args) {
		
		
		// [한 단 반복하는 출력문]을 여러번 반복하는 반복문 
		for (int i = 2; i < 10; i++) {
			
			if(i % 2 != 0) {
				
				// 한 단만 출력하는 반복문
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
				// 한 단이 끝나면 한 줄 띄우자
				System.out.println();
			}
		}		
	}
}