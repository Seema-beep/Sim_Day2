package Day2;

class Parent1{
	public Parent1() {
		//super.Parent of Parent ..Internally calling Object class constructor
		System.out.println("Parent class Constructor");
	}
}

class Child1 extends Parent1{
	//super ..Internally calling  super class no argument constructor
	public Child1() {

System.out.println("Child class Constructor");
	}
}


public class Constructor_Inheritance {

	public static void main(String[] args) {
new Child1();


	}

}

/*Parent class Constructor
Child class Constructor*/