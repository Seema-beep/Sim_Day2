package Day2;

public class StaticBlock_And_StaticMethod {
	static int i=10;
	//static block 
	
	static {
		System.out.println("static block 1");
		methodOne();
	}

	public static void main(String[] args) {
		System.out.println("main method");
		methodOne();
		

	}
	
	public static void methodOne()
	{
		System.out.println(j);
	}
	
	static {
		System.out.println("static block-2");
	}
	
	static int j=20;

}
