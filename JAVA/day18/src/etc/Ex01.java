package etc;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException, InterruptedException {
										// 입출력 예외를 전가시키는 코드
		Runtime rt = Runtime.getRuntime();
//		rt.exec("calc");
		
		String command = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		command += " http://search.naver.com";
		command += "/search.naver?query=아이유";
		rt.exec(command);
		
		String cmd2 = "shutdown /s /t /60 /m \\\\%s";
		String ip = "192.168.0.100";
		cmd2 = String.format(cmd2, ip);
//		Process pro = rt.exec("notepad");
		Thread.sleep(3000);
//		pro.destroy();
		
		// Unhandled exception type IOException
		// 입출력 관련 예외가 처리되지 않았습니다
	}
}