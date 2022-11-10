package Day2;
//Non static block gets executed when object is created

public class Non_Static_Block {
	static int count=0;
	
	//creating constructor
	Non_Static_Block(){
		System.out.println("constructor");
	}
	{
		++count;
	}

	public static void main(String[] args) {
		Non_Static_Block sa=new Non_Static_Block();
		Non_Static_Block sa1=new Non_Static_Block();
		System.out.println(Non_Static_Block.count);
		
		

	}

}
/*
Always the static method gets executed first and then non static block or method*/ 
