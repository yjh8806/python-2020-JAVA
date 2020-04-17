package quiz;

import java.util.Scanner;

// 학생 성적 관리 프로그램

class Student {		// 기본 단위 클래스 
					// Value Object, vo
					// Data Transfer Object, dto
	
	private String name;
	private int kor, eng, mat, sum;
	private double avg;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	
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
}

class StudentHandler {
	private Student[] arr; // 참조변수만 있고, 배열의 실물은 없다
	private Scanner sc;
	
	public StudentHandler() {	// 멤버 필드 객체의 초기값 지정
		arr = new Student[5];	// 배열을 만들었지만 학생 객체는 없다(비어있다)
		sc = new Scanner(System.in);
	}
	
	// 배열에서 빈 칸을 찾아서 빈칸에 학생 한명의 정보를 [입력]하는 메서드 만들기
	public boolean insertStudent() {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {
					System.out.println("추가할 학생의 이름 입력 : ");
					String name = sc.nextLine();
					System.out.printf("%s 학생의 국어 성적 입력 : ", name);
					int kor = Integer.parseInt(sc.nextLine());
					System.out.printf("%s 학생의 영어 성적 입력 : ", name);
					int eng = Integer.parseInt(sc.nextLine());
					System.out.printf("%s 학생의 수학 성적 입력 : ", name);
					int mat = Integer.parseInt(sc.nextLine());
					
					arr[i] = new Student(name, kor, eng, mat);
					return true;	// 학생을 추가했습니다
				}
			}
			return false;	// 빈자리가 없어서 학생을 추가할 수 없습니다
		}

	// 학생 한명을 전달받아서 그 학생의 정보를 [출력]하는 메서드 만들기
	public void showStudent(Student st) {
		System.out.printf("%s) %3d, %3d, %3d\n", 
				st.getName(), st.getKor(), st.getEng(), st.getMat());
		System.out.printf("합계 : %3d, 평균 : %5.2f\n\n", 
				st.getSum(), st.getAvg());
	}
	
	// 배열에 있는 모든 학생의 정보를 [출력]하는 메서드 만들기
	public void showAll() {
		for(Student st: arr) {
			if (st != null) {
				showStudent(st);
			}
		}
		System.out.println();
	}

	// 이름으로 학생 한 명을 [검색]해서 [출력]하고, 객체를 반환하는 메서드 만들기
	public Student searchStudent() {
		System.out.print("검색할 학생의 이름 입력 : ");
		String find = sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && find.equals(arr[i].getName())) {
				showStudent(arr[i]);
				return arr[i];	// 검색 조건이 맞는 학생을 찾으면 학생 객체를 반환
			}
		}
		System.out.printf("[%s] 학생을 찾을 수 없습니다\n\n", find);
		return null;	// 조건에 맞는 학생이 없으면, null을 반환
	}
	
	// 검색을 활용해서, 이름으로 검색한 이후 해당 학생의 정보를 수정하는 메서드 만들기
	public boolean updateStudent() {
		Student st = searchStudent();
		if(st != null) {	// 검색한 학생이 있으면
			System.out.println("이름 수정 : ");
			String name = sc.nextLine();
			
			System.out.println("국어 점수 수정 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.println("영어 점수 수정 : ");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.println("수학 점수 수정 : ");
			int mat = Integer.parseInt(sc.nextLine());
			
			st.setName(name);	
			st.setKor(kor);
			st.setEng(eng);
			st.setMat(mat);
			st.setSum(kor + eng + mat);
			st.setAvg(st.getSum() / 3.0);
			
			System.out.println("=== 수정된 정보 ===\n");
			showStudent(st);
			return true;
		}
		return false;
	}
	
	// 검색을 활용해서, 이름으로 검색한 이후 해당 학생의 정보를 배열에서 삭제하는 메서드 만들기
	public boolean deleteStudent() {
		Student st = searchStudent();
		if(st != null) {
			for (int i = 0; i < arr.length; i++) {
				if(st.equals(arr[i])) {
					System.out.printf("[%s] 학생 정보가 삭제되었습니다\n\n", arr[i].getName());
					arr[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	// 이름을 기준으로 가나다순으로 정렬하는 메서드 (이후 전체출력 메서드를 호출)
	// 성적(합계 or 평균)을 기준으로 내림차순으로 정렬하는 메서드 (이후 전체출력 메서드를 호출)
	
	// 현재 학생 수를 반환하는 메서드 (배열의 길이)
	public int getStudentCount() {
		return arr.length;
	}
	
}

public class Quiz2_School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentHandler handler = new StudentHandler();
		int menu = 0;
		
		do {
			System.out.println("현재 등록된 학생 수 : " + handler.getStudentCount());
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 검색");
			
			switch(menu) {
			case 1: handler.insertStudent(); break;
			case 2: handler.searchStudent(); break; 
			}
		}while (menu!= 0);
	}
}

