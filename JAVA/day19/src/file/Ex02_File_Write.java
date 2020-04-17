package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Ex02_File_Write {
	public static void main(String[] args) throws Exception {
		
		File f = new File("test.txt");		
		// 파일 객체
		
		FileOutputStream fos = new FileOutputStream(f);
		// 파일을 대상으로 출력하는 객체(스트림)
		
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		// 출력을 2바이트 형식으로 처리할수 있는 객체
		
		BufferedWriter bw = new BufferedWriter(osw);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 버퍼라는 공간의 크기만큼 한번에 기록할 수 있는 객체
		
		bw.write("Hello, world !!");
		bw.write("\r\n"); 	// 윈도우 메모장에서 식별하는 줄바꿈
		bw.write("작성자 : 원종래\r\n");
		bw.write("작성 일자 : " + new Date().toString() + "\r\n");
		bw.flush();	// 버퍼에 담겨있는 모든 값을 대상으로 밀어넣기
		bw.close();	// 스트림 관련 사용이 끝나면 반드시 닫기 할 것
		
		System.out.println("파일이 존재하는지 : " + f.exists());
		if(f.exists()) {
			Runtime rt = Runtime.getRuntime();
			Process pro = rt.exec("notepad " + f.getName());		// 파일의 이름
			System.out.println(f.getAbsolutePath());				// 파일의 절대 경로
			Thread.sleep(3000);
			pro.destroy();
		}		
	}
}