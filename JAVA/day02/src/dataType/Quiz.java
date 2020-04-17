package dataType;

public class Quiz {
	public static void main(String[] args) {
		
		byte by = 10;
		short sh = 20;
		char ch = 65;
		int num = 30;
		long lo = 40L;
		float fl = 3.14f;
		double db = 97.56;
		
		int a = by;
		char b = (char)db;	// 1. 실수보다 정수가 표현범위가 작다
							// 2. char 2바이트, double 8바이트
		long c = sh;
		float d = num;
		short e = (short)ch;// 표현범위가 서로 어긋난다
							// char : 0 ~ 65535
							// short : -32768 ~ 32767
		double f = by;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}

