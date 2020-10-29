package polymorphism_methodoverriding;

public class Monkey extends Animal{
	@Override
	public void eat() {
		System.out.println("Monkey intake food from hand to mouth");
	}

}
