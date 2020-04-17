package io;

import java.io.BufferedReader;
import java.io.IOException;	
// io : Input / Output
// IOException : 입출력간에 발생할 수 있는 여러 예외 
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02_Input {
	public static void main(String[] args) throws IOException {
		
		// 자바의 기초적인 입력 방식 (1바이트)
		System.out.print("글자 하나 입력 : ");
		int n = System.in.read();	// 사용자 입력 1바이트의 아스키코드를 정수로 반환
		System.out.println("입력한 글자 : " + n);
		System.in.read();	// 13	\r
		System.in.read();	// 10	\n
		
		// ASCII : American Standard Code Information Interchange
		// 글자(키)에 대응되는 숫자 코드값을 저장한 표 : 1 byte
		
		
		
		// 2바이트 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("한글 하나 입력 : ");
		int n2 = isr.read();
		System.out.println("입력한 글자 : " + n2);
		System.out.println("입력한 글자 : " + (char)n2);
		
		
		// 버퍼 단위로 입력 받기
		// 버퍼 : 여러 입력을 받기 위한 임시 변수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장을 입력하세요 : ");
		String str = br.readLine();	// Line, 줄 만큼 입력받겠다. 엔터치는 값 이전까지
		System.out.println("입력한 문장 : " + str);
		
		// 버퍼리더보다 간단하게 만들고, 많은 기능을 가지고, 자체적으로 예외처리가 되는 입력도구
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("실수 입력 : ");
		double db = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		
		System.out.println(num + ", " + db + ", " + str2);
		sc.close();
	}
}

