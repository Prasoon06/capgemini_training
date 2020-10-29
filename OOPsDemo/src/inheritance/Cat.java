package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		super();
	
	}
	public Cat(String name) {
		super(name);
		System.out.println("Object Type : "+getClass().getName());
	}
	public void bite() {
		System.out.println("Animal is biting");
	}
}
