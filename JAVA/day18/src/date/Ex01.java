package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Date 클래스의 객체 살펴보기\n");
		
		System.out.println("date.getTime() : " + date.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (hh:mm:ss)");
		String getTime = sdf.format(date);
		System.out.println("getTime : " + getTime);
	}
}
