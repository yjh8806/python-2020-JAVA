package for1;

public class Ex01 {
	public static void main(String[] args) {

		int cnt = 0;
		while (cnt < 5) {
			System.out.println("Hello, world !!");
			cnt++;
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello, world !! : " + i);
		}
		System.out.println();
		
		
		String str = "Java is Easy~";
		
		for(char ch : str.toCharArray()) {
			System.out.print(ch + " ");
		}

	}
}