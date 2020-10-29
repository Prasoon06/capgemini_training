package inheritance;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Class Name : ");
		String className = sc.next();
//		// Rule1 :  Compilar Rule :  method call will be based on reference type
		Animal animal;
//		//Rule2: JVM Rule :  method call will be diverted to object type
		
		Class c = Class.forName("inheritance."+className);
		Animal ani = (Animal)c.newInstance(); // object of Cat
		animal=ani;
		animal.setName("Pussy");
		animal.eat();
		animal.run();
		
	}

}
