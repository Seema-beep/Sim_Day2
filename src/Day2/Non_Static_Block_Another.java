package Day2;

public class Non_Static_Block_Another {
	//non static variables gets initialised
	int i=10;//2
	
	//non static block gets executed...3
	{
		System.out.println("non static block");
		methodOne();
		
		
		
	}
	//constructor
	Non_Static_Block_Another(){//5
		System.out.println("constructor");
	}

	public static void main(String[] args){//1 
		System.out.println("Main method");
		Non_Static_Block_Another sa=new Non_Static_Block_Another();
		sa.methodOne();
		
		
		
		
		

	}
	//non static block
	public void methodOne()//4
	{
		System.out.println(j);
	}
	int j=20;

}
