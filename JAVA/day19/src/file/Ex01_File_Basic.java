package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01_File_Basic {
	public static void main(String[] args) throws Exception {
		
		// 파일 입출력을 위해서는 예외처리가 전제되어야 한다
		// (파일이 없거나, 형식이 다르거나, 권한이 없거나 기타 등등의 안되는 사유가 많다)
		
		File f1 = new File("test1.txt");	
				// 파일을 객체 형식으로 생성한다
				// 이때, 실제 파일이 있는지 없는지는 상관이 없다
		
		File d2 = new File("C:\\windows\\system32\\drivers\\etc\\");
				// 폴더(디렉토리)도 파일 객체의 형식으로 생성이 가능하다
				// 없는 경로라도 객체로 생성할 수 있다
		
		File f3 = new File(d2, "hosts");
				// 첫번째 매개변수는 경로, 두번째 매개변수는 파일이름이다
				// 지정한 위치의 지정한 파일을 객체로 지정하고 싶은 경우 사용한다
		
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("d2이 존재하는가 : " + d2.exists());
		System.out.println("f3이 존재하는가 : " + f3.exists());
		System.out.println();
		
		System.out.println("f1은 파일인가 : " + f1.isFile());
		System.out.println("d2은 파일인가 : " + d2.isFile());
		System.out.println("f3은 파일인가 : " + f3.isFile());
		System.out.println();
		
		System.out.println("f1은 디렉토리인가 : " + f1.isDirectory());
		System.out.println("d2은 디렉토리인가 : " + d2.isDirectory());
		System.out.println("f3은 디렉토리인가 : " + f3.isDirectory());
		System.out.println();
		
		Scanner sc;
		
		if(f3.exists() && f3.isFile() && f3.canRead()) {
			sc = new Scanner(f3);
			System.out.println("==> " + f3.getName() + " <==");
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				Thread.sleep(1000);
			}
			System.out.println();
		}		
	}
}