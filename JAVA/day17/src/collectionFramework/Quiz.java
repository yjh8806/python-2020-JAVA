package collectionFramework;

import java.util.Hashtable;
import java.util.Scanner;

class Database {
	private Database() {}
	
	private static Hashtable<String, String> db;
	
	public static Hashtable<String, String> getDatabase(){
		if(db == null) db = new Hashtable<String, String>();
		return db;
	}
	
	public static String login(String userid, String userpw) {
		if(userpw.equals(db.get(userid))) 
			return userid + "님, 환영합니다";
		else 
			return "계정을 다시 확인해주세요";
	}
}
public class Quiz {
	public static void main(String[] args) {
		Hashtable<String, String> db = Database.getDatabase();
		
		db.put("iu930516", "iu");
		db.put("test", "1234");
		db.put("itbank", "it");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String userid = sc.nextLine();
		System.out.print("Password : ");
		String userpw = sc.nextLine();
		
		String result = Database.login(userid, userpw);
		System.out.println(result);		
	}
}