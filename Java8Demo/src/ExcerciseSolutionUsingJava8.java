import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseSolutionUsingJava8 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("pankaj", "sharma", 40000),
				new Employee("aman", "sony", 20000), new Employee("suman", "arya", 50000),
				new Employee("anuj", "rathore", 50000),new Employee("sanam", "patel", 60000));

		// 1. Sort the employee list by first name

		Collections.sort(employees, (e1, e2)-> e1.getFirstName().compareTo(e2.getFirstName()));
			

		// 2. create a method that prints the list of employees
		System.out.println("-----------------Printing Employees by Sorting by firstname------------------");
		printAllEmployeesConditionally(employees,e->true);
		// 3. create a method that prints the list of employees having the first name
		// start with a
			
		System.out.println("-----------------Conditionally------------------");
		printAllEmployeesConditionally(employees, e-> e.getFirstName().startsWith("s"));
			
	}

	private static void printAllEmployeesConditionally(List<Employee> employees,MyCondition condition) {
		for (Employee employee : employees) {
			if (condition.test(employee)) {
				System.out.println(employee);
			}
		}
		
	}
	interface MyCondition{
		boolean test(Employee e);
	}
	

}
