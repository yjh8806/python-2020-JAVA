package reference;

public class TV {
	
	
	// 내가 생성할 객체의 [속성]은 필드로 표현 : 전원, 채널, 볼륨, TV제조사, 모델명
	boolean power;
	int ch = 8, vol = 20;
	int mute;	// 초기값을 할당하지 않으면 필드는 자동으로 초기화가 된다 (지역변수는 수동으로 초기화)
				// boolean : false
				// 정수 : 0, 실수 : 0.0
				// 문자열 : null, 나머지 모든 객체형 참조변수 : null
	
	String name = "My TV";
	
	// 내가 생성할 객체의 [기능]은 메서드로 표현 : 
	// 전원켜기/끄기, 채널올림(△), 채널내림(▽), 볼륨올림(+), 볼륨내림(-), 음소거, 화면출력
	
	// 외부에서 호출 가능한 메서드
	void Power() {
//		int test;
//		System.out.println(test);
// 		The local variable test may not have been initialized
		power = !power;
		show();
	}
	void ChUp()  { if(power) ch++;  checkValue(); show(); }
	void ChDn()  { if(power) ch--;  checkValue(); show(); }
	void VolUp() { if(power) vol++; checkValue(); show(); }
	void VolDn() { if(power) vol--; checkValue(); show(); }
	void Mute() {
		if(power) {
			int tmp = mute;
			mute = vol;
			vol = tmp;
			show();
		}
	}
	
	// 내부에서만 호출 가능한 메서드
	void checkValue() {
		if(ch < 2)  ch = 20;
		if(ch > 20) ch = 2;
		if(vol > 50) vol = 50;
		if(vol < 0)  vol = 0;
	}
	void show() {
		if(power) {
			System.out.printf("┌──── %5s ─────┐\n", name);
			System.out.printf("│    ch : %3d    │\n", ch);
			System.out.printf("│   vol : %3d    │\n", vol);
			System.out.printf("└────────────────┘\n");			
		}
		else {
			System.out.printf("┌────────────────┐\n");
			System.out.printf("│                │\n");
			System.out.printf("│                │\n");
			System.out.printf("└────────────────┘\n");
		}
	}
	// 만약 초기 작동 / 초기값이 필요하면 생성자 활용	
}