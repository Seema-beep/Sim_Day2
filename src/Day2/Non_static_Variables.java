package Day2;
class Sample2
{
	 int x=10;
	void show()
	{
		System.out.println(x);//non static variables accessible within non static method
	}
}

public class Non_static_Variables {

	public static void main(String[] args) {
		Sample2 sa1=new Sample2();
		++sa1.x;
		sa1.show();//11
		
		Sample2 sa2=new Sample2();
		sa2.show();//10

	}

}
/*11 non static variables has different values for different objects
 * 
10*/

