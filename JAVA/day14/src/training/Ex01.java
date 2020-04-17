package training;

class Student {
	// 이름, 국어, 영어, 수학 성적, 합계, 평균을 필드로 설정
	private String name;
	private int kor, eng, mat, sum;
	private double avg;
	
	// getter / setter 자동 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	// 자신의 이름, 합계, 평균(소수점둘째자리) 출력하는 메서드 void show() 정의
	public void show() {
		System.out.printf("일반) 이름 : %s, 합계 : %d, 평균 : %.2f\n", name, sum, avg);
	}
	
	// 이름과 국영수 점수를 전달받아서 필드를 초기화하는 생성자 정의
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
}
class SpecialStudent extends Student {
	// 추가 과목 (외국어, 컴퓨터) 2개만 선언
	private int lang, com;
	
	// getter / setter 자동 생성
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	// 자신의 이름, 합계, 평균(소수점둘째자리) 출력하는 메서드 void show() [재정의]
	@Override
	public void show() {
		System.out.printf("특기) 이름 : %s, 합계 : %d, 평균 : %.2f\n", 
				getName(), getSum(), getAvg());
	}
	// 고유 메서드
	public void test() {
		System.out.println("나는 특기생입니다~");
	}
	// 이름과 국영수 점수를 전달받아서 필드를 초기화하는 생성자
	public SpecialStudent(String name, int kor, int eng, int mat, int lang, int com) {
		super(name, kor, eng, mat);
		// 부모생성자가 처리하지 않는 값만 자신이 직접 처리
		this.lang = lang;
		this.com = com;
//		super.sum += lang + com;	// 접근제한자가 protect 이어야 직접 접근 가능
		setSum(getSum() + lang + com);
		setAvg(getSum() / 5.0);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Student [] arr = new Student[5];	// 특기생도 학생 배열에 넣을 수 있음
		// 배열 : 같은 자료형의 데이터를 index로 묶어서 관리하는 형태
		
		arr[0] = new Student("이지은", 100, 99, 87);
		arr[1] = new SpecialStudent("홍진호", 22, 22, 22, 22, 22);
		arr[2] = new Student("이병건", 99, 88, 97);
		arr[3] = new SpecialStudent("주호민", 91, 92, 93, 94, 95);
		
		// 일반 고유 메서드는 상속 관계에 있더라도, 참조형태가 슈퍼 클래스이면, 서브클래스의 메서드 호출 불가
//		arr[3].test();
		((SpecialStudent)arr[3]).test();
		
		// 재정의 메서드는 슈퍼클래스로 참조되더라도, 서브 클래스의 메서드가 호출된다 (덮어쓰기)
		
		for(Student st : arr) {
			if(st != null) {
				System.out.printf("%s의 클래스 : %s\n", 
						st.getName(), st.getClass().getSimpleName());				
				st.show();	// 재정의 된 메서드
				
				System.out.println();
			}
		}		
	}
}