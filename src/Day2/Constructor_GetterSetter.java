package Day2;
class Emp1{
	private int empno;
	private String name;
	private String address;
	public Emp1(int empno, String name, String address) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
		
		
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}


public class Constructor_GetterSetter {
	
	public static void main(String[] args) {
		Emp1 e1=new Emp1(1, "manvik", "nogaon");
		System.out.println(e1.getName()+"\t"+e1.getAddress());
		Emp1 e2=new Emp1(2,"seema" , "morigaon");
		System.out.println(e2.getName()+"\t"+e2.getEmpno());
		
		

	}

}
