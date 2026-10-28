package ex12;

class Emp {
	// fields
	 private int 	 eno;
	 private String  name;
	 private String  phone;
	
	 // 생선자
	public Emp(int eno, String name, String phone) {
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	// method
	 public void info() {
		System.out.printf("%d %s %s\n"
				, eno, name, phone);
	}
	 
	// Getter / Setter : 형태 함수
	 public int getEno() {
		 return eno;
	 }
	 public void setEno(int eno) {
		 this.eno = eno;
	 }

	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getPhone() {
		 return phone;
	 }
	 public void setPhone(String phone) {
		 this.phone = phone;
	 }
}

public class TestGetterSetter {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		//emp1.eno = 1;
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("010-2222-3333");
		emp1.info();
		
	//	int neweno = emp1.getEno();
	//	System.out.println( neweno );
		
		
		Emp emp2 = new Emp(2, "카리나", "010-1111-2222");
		emp2.info();
		
	}

}
