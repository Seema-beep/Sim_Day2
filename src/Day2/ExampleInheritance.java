package Day2;

class Parent{
	public void methodOne() {
		System.out.println("parent method");
	}
}
  
class Child extends Parent{
	public void methodTwo() {
		System.out.println("Child method");
		
	}
}


public class ExampleInheritance {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.methodOne();//parent method
		
		Child c=new Child();
		c.methodOne();//parent method
		c.methodTwo();//Child method
		
		Parent p1=new Child();
		p1.methodOne();//parent reference refering to child object..output parent method
		
		/*Child c1=(Child) Parent();//cannot convert from parent to child
		c1.methodOne();//class cast exception*/

				

	}

}
