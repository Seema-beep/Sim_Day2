package Day2;

class Emp2
{
	private int empno;
	private String name;
	private String address;
	
	//No argument constructor explicitly required for setting desired property
	//otherwise can't create objects 
	//properties can be set and get using setter and getter
	public Emp2() {
		
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

public class Constructor_NoArgument {

	public static void main(String[] args) {
		Emp2 e1=new Emp2();
		e1.setName("Babu");
		e1.setAddress("guwahati");
		System.out.println(e1.getName()+"\t"+e1.getAddress());

	}

}
