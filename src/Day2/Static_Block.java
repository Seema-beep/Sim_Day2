package Day2;

public class Static_Block {
	//static block
	static {
		System.out.println("Static block-1");
	
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		
	}
	
	static {
		System.out.println("Static block-2");
	}

}
/*
Static block-1
Static block-2
Main method

Always highest priority is given to static blocks in sequence...then main method..since it is a
static method...and then other methods by JVM
*/