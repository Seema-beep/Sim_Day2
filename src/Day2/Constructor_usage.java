package Day2;

class Emp{
	private int empno;
	private String name;
	private String address;
	
	
	public Emp(int empno, String name, String address) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
	}
		
		public void printData()
		{
			System.out.println(empno+"\t"+name+"\t"+address);
		}
		
		
	
	
	
}

public class Constructor_usage {

	public static void main(String[] args) {
		Emp e= new Emp(1, "kamalesh", "nogaon");
		e.printData();
		
		Emp e1= new Emp(1, "seema", "nogaon");
		e1.printData();
		

	}

}
