package accessModifier;

public class Test { 
	// 필드
	private int pri = 1;
	int pac = 2;
	protected int pro = 3;
	public int pub = 4;
	
	// 메서드
	public void ShowField() {
		System.out.println("pri : " + pri);
		System.out.println("pac : " + pac);
		System.out.println("pro : " + pro);
		System.out.println("pub : " + pub);
	}
}