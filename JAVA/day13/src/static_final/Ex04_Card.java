package static_final;

class Card{
	// 각 객체가 공유해야 하는 값은 static으로 설정하기
	
	private char kind;			
	private int num;			
	private int width;		
	private int height;	
	private String p;
	
	public void setCard(char kind, int num) {
		this.kind=kind;
		this.num=num;
		if(kind=='H')		p="♥";
		else if(kind=='S')	p="♠";
		else if(kind=='C')	p="♣";	//다이아는 형태 깨져서 안만듬
	}

	public void showCard(){
		System.out.println("["+kind+num+" CARD]");
		for (int i = 0; i < height; i++)
		{
			if		(i==0)			System.out.print("┌");
			else if	(i==height-1)	System.out.print("└");
			else 					System.out.print("│");//줄의 가장 왼쪽
			
			if(i==0 || i==height-1)			//줄의 가운데 부분 출력
				for(int j=0;j<width;j++)
					System.out.print("─");
			else
			{
				for(int j=0;j<width;j++)
					{
						if(j==width/2 && (i>=height/2-num/2 && i<=height/2+num/2)) 
						{
							if(num%2==0 && i==height/2)	System.out.print(" ");
							else System.out.print(p);
						}
						else System.out.print(" ");
					}
			}
			
			if		(i==0)			System.out.print("┐");
			else if	(i==height-1)	System.out.print("┘");
			else 					System.out.print("│");
			System.out.println();
		}
	}

	public void setSize(int i) {
		//Set_Size에서 가로 세로 값을 할당
		width = i;
		height = i;
	}
}
public class Ex04_Card{
	public static void main(String[] args) {
		// 객체를 생성하기 전에 미리 카드의 크기를 결정하고
		// 이후 같은 크기로 카드들을 생성합니다
		
//		Card.setSize(7);
		
		Card card01 = new Card();	// 하나의 클래스로 서로 다른 객체를 생성한 경우
		Card card02 = new Card();	// 객체들이 같은 값을 갖게 만들고 싶다면
		Card card03 = new Card();	// static을 활용하면 된다
			
		card01.setCard('H', 3);
		card01.showCard();
		card02.setCard('C', 1);
		card02.showCard();
		card03.setCard('S', 2);
		card03.showCard();
	}
}