package thread;

class Job1 extends Thread {	// 1) 내가 만든 클래스가 Thread를 상속받도록 한다
	
	public void job() {
		for (int i = 0; i < 25; i++) {
			System.out.print(i + " ");
		}
	}
	// 2. Thread 클래스의 public void run() 메서드를 오버라이딩한다 
	// (스레드로 실행할 내용)
	@Override public void run() {
		job();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Thread : 동시에 여러작업을 구동하기 위한 논리적 단위
		Job1 ob1 = new Job1();
//		ob1.job();
//		ob1.run();		// 다중 실행 내용은 run()에 작성하지만
		ob1.start();	// 호출은 start() 로 호출한다
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}		
	}
}