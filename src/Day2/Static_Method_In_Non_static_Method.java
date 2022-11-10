package Day2;



public class Static_Method_In_Non_static_Method {
	
	static int x=10;
	//static method
	
	public static void show() {
		System.out.println(x);
	}
	public void display()
	{
		show();//static method within a non static method
	}

	public static void main(String[] args) {
		show();//static method
		Static_Method_In_Non_static_Method sa=new Static_Method_In_Non_static_Method();
		sa.display();//non static method can be called by creating objects
		
		

	}

}
/*10
10*/
