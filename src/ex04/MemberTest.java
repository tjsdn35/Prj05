package ex04;

import java.time.LocalDate;

/*RESCENE
원이 리브 미나미 메이 제나
2004 2006 2006   18   17
리더 보컬 보컬   랩   보컬 
*/

class GirMember{
	//Fields
	private String  name;
	private int     byear;
	private String  role;
	
	//Constructor
	public GirMember(String name, int byear, String role) {
		this.name = name;
		this.byear = byear;
		this.role = role;
	}
	
	//methods
	public void info() {
		int age = LocalDate.now().getYear() - this.byear;
		System.out.printf("%s %d %d %s\n", 
				name, byear, age, role);
		
	}

	
}

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirMember resc1 = new GirMember("원이", 2004, "리더");
		resc1.info();
		GirMember resc2 = new GirMember("리브", 2006, "보컬");
		resc2.info();
		GirMember resc3 = new GirMember("미나미", 2006, "보컬");
		resc3.info();
		GirMember resc4 = new GirMember("메이", 2008, "랩");
		resc4.info();
		GirMember resc5 = new GirMember("제나", 2009, "보컬");
		resc5.info();
		System.out.println();
		
		// 배열로 저장해서
		//1.먼저 저장할 배열을 인원수에 맞게 준비
		GirMember [] rescArr = new GirMember [5];
		
		rescArr[0] = new GirMember("원이", 2004, "리더");    // == resc1
		rescArr[1] = new GirMember("리브", 2006, "보컬");    // == resc2
		rescArr[2] = new GirMember("미나미", 2006, "보컬");	 // == resc3
		rescArr[3] = new GirMember("메이", 2008, "랩");		 // == resc4
		rescArr[4] = new GirMember("제나", 2009, "보컬");	 // == resc5
		
		for (int i = 0; i < rescArr.length; i++) {
			rescArr[i].info();
		}
		
		/*
		rescArr[0].info();
		rescArr[1].info();		
		rescArr[2].info();
		rescArr[3].info();
		rescArr[4].info();
		*/		
	}

}
