package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 입력받은 내용을 파일에 기록하는 문제
		/*
		 * 	1. 폴더이름은 오늘날짜로 하세요 (yyyy-MM-dd)
		 * 	2. 파일이름은 현재시각으로 하세요 (hh:mm:ss)
		 * 	3. 스캐너를 이용해서 키보드로 입력받은 내용을 지정한 파일에 기록하세요
		 * 	4. 폴더가 없다면, dir.mkdirs(); 메서드를 호출하면 새 폴더를 생성할 수 있습니다
		 */
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh시 mm분 ss초");
													// : 은 파일 이름에 사용할 수 없다
		String folderName = sdf1.format(date);
		String fileName = sdf2.format(date);
		
		folderName = "C:\\" + folderName;
		fileName += ".txt";
		
		System.out.println("폴더이름 : " + folderName);
		System.out.println("파일이름 : " + fileName);
		
		// 폴더 생성하기
		File dir = new File(folderName);
		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("새 폴더 생성함");
		}
		else {
			System.out.println("지정한 경로에 이미 폴더가 있습니다");
		}
		
		// 파일 생성하기
		File file = new File(dir, fileName);
		
		// 파일이 없으면 새로운 파일을 생성해라
		if(file.exists() == false) file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		System.out.print("파일에 기록하고 싶은 내용 입력 : ");
		String context = sc.nextLine();
		bw.write(context);
		
		bw.flush();
		bw.close();
		
		if(file.exists()) {	// 만약 파일이 존재하면
			Process pro = Runtime.getRuntime().exec("notepad " + file.getAbsolutePath());
			Thread.sleep(3000);
			pro.destroy();
		}
	}
}