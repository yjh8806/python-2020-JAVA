package reference;

class RemoteController { // 리모컨
	
	TV target;		// TV 객체를 참조할 수 있는, 비어있는 참조변수
	
	void setTV(TV tv) 	{		target = tv;	}
	
	void power() 		{		target.Power();	}
	void chup() 		{		target.ChUp();	}
	void chdn() 		{		target.ChDn();	}
	void volup() 		{		target.VolUp();	}
	void voldn() 		{		target.VolDn();	}
	void mute()			{		target.Mute();  }
}

public class Ex03 {
	public static void main(String[] args) {
		TV tv = new TV();	// 같은 패키지 내의 클래스를 참조해서 객체 생성
		RemoteController rc = new RemoteController();
		rc.setTV(tv);	// 메인함수에서 만들어진 객체 tv를 rc에게 전달
		rc.power();
		rc.chup();
		rc.chdn();
		rc.volup();
		rc.voldn();
		
	}
}