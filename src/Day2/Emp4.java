package Day2;

public class Emp4 {
	
	private int empno;
	private String name;
	private String address;
	
	//no agrument constructor
	
	public Emp4() {
		
	}
	//parameterised constructor
	public Emp4(int empno, String name, String address) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
	}
	
	//getters and setters
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
