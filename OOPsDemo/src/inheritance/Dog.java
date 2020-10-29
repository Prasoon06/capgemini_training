package inheritance;

public class Dog extends Animal {
	
public Dog() {
	super();
}
	
	public Dog(String name) {
		super(name); // Call Delegation
		System.out.println("Object Type : "+getClass().getName());
	}
	public void bark() {
		System.out.println(getName()+" is barking");
	}
}
