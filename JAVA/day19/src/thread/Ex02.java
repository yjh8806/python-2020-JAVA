package thread;

class Timer {
	private int countSec;

	public int getCountSec() {
		return countSec;
	}
	protected void setCountSec(int countSec) { // 상속이 아니면, 값을 세팅할 수 없다
		this.countSec = countSec;
	}
	public void startCount() throws InterruptedException {
		for(int i = countSec; i != -1; i--) {
			System.out.println(i + " !!");
			Thread.sleep(1000); 	// CPU에게 일시정지를 전달한다 (1/1000초)
		}
	}
}

class Job2 extends Timer implements Runnable {	
						// Thread 클래스를 직접 상속받을 수 없을때 사용하는 인터페이스
	Job2(){
		super.setCountSec(5);
	}

	@Override
	public void run() {	// 내가 실행할 내용을 작성하는 메서드
		try {
			startCount();
			
		} catch (InterruptedException e) {}
	}
}

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		
		Job2 t = new Job2();
//		t.startCount();
//		t.run();	// run은 내용만 작성하고, start()로 호출해야 한다
//		t.start();	// Runnable 인터페이스는 start()가 없다

		Thread th = new Thread(t);	
		// Runnable 속성 객체를 생성자 매개변수로 전달하여 스레드 생성	
		
		th.start();
		Thread.sleep(100);
		
		for (int i = 1; i <= 25; i++) {
			System.out.printf("%2d ", i );
			Thread.sleep(200);
		}		
	}
}