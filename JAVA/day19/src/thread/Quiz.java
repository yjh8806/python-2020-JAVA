package thread;

import java.util.ArrayList;
import java.util.Scanner;

class Timer2 extends Thread{
	private boolean over;
	private double min;
	private int sec = 10; 
 	public Timer2(double min) {		this.min = min;	}
	public void count() {
		for (int i = (int) (min * 60); i >= 0; i--) {
			//System.out.printf("\t\t\t\t[%02d : %02d]\n", i / 60, i % 60);
			sec = i % 60;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
		over = true;
	}
	@Override
	public void run() 		{		count();		}
	public int getSec() 	{		return sec;		}
	public boolean isOver() {		return over;	}
}

class Input extends Thread{
	
	private Scanner sc = new Scanner(System.in);
	private Timer2 t;
	private ArrayList<String> al = new ArrayList<String>();
 
	public Input(Timer2 t) {		this.t = t;		}
	
	public void func() {
		while(true) {
			System.out.printf("문자열 입력 (%02d) : ", t.getSec());
			al.add(sc.nextLine());
			if(t.isOver())		break;
		}
		for(String str : al) 
			System.out.print(str + " ");
	}
	
	@Override
	public void run() {		func();		}
}

public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		// 10초 동안 문자열을 입력받아서, 10초 안에 입력받은 문자열만 화면에 출력하는 코드
		
		/*
		 * 1. 10초 안에 사용자가 몇 개나 입력할지 알 수 없다
		 * 2. 문자열 입력대기와, 시간 체크는 별도로 이루어져야 한다
		 * 3. 10초가 지나면, 입력을 종료하고(마지막 입력은 강제로 받아야 함) 지금까지 받은 문자열 출력
		 * 
		 */
		Timer2 ob1 = new Timer2(0.17); // Timer2() : double min -> 1 = 1/1000초; 1초는 대략 0.17;
		Input ob2 = new Input(ob1);
		
		ob1.start();
		System.err.println("시작");
		Thread.sleep(500);		// 실행 시점 일정시간 이후 시작하려고 만든 딜레이
		ob2.start();
	}
}