
public class TestEmployee {
	
	public static void main(String[] args) {
		Employee [] employees = {new Programmer("Aman"), new Tester("Vijay"),new Programmer("Aishri"),new Programmer("Sushmita"),new Tester("Rakesh")};
		for (Employee employee : employees) {
			if(employee instanceof Expert) {
				employee.doSomething();
			}
			
		}
		
	
	}

}
