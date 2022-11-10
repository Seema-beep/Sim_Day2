package Day2;
class Sample
{
	static int x=10;
	void show()
	{
		System.out.println(x);//static variables accessible within non static method
	}
}

public class Static_variables {

	public static void main(String[] args) {
		Sample sa1=new Sample();
		++sa1.x;
		sa1.show();
		
		Sample sa2=new Sample();
		sa2.show();
		
	}

}


/*11 for both the reference variable same copy of static variable
11*/