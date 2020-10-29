
public class Tester extends Employee {

	public Tester(String name) {
		super(name);
	}

	@Override
	void doSomething() {
		System.out.println(getName()+" is testing");

	}

}
