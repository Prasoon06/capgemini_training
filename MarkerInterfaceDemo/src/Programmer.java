
public class Programmer extends Employee implements Expert{

	public Programmer(String name) {
		super(name);
	}
	@Override
	void doSomething() {
		System.out.println(getName() +" is programming");
		
	}

}
