import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExcerciseSolutionUsingJava8UsingPredicate {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("pankaj", "sharma", 40000),
				new Employee("aman", "sony", 20000), new Employee("suman", "arya", 50000),
				new Employee("anuj", "rathore", 50000),new Employee("sanam", "patel", 60000));

		// 1. Sort the employee list by first name

		Collections.sort(employees, (e1, e2)-> e1.getFirstName().compareTo(e2.getFirstName()));
			

		// 2. create a method that prints the list of employees
		System.out.println("-----------------Printing Employees by Sorting by firstname------------------");
		printAllEmployeesConditionally(employees,e->true,e->System.out.println(e));
		// 3. create a method that prints the list of employees having the first name
		// start with a
			
		System.out.println("-----------------Conditionally------------------");
		printAllEmployeesConditionally(employees, e-> e.getFirstName().startsWith("s"),e->System.out.println(e.getFirstName()));
			
	}

	private static void printAllEmployeesConditionally(List<Employee> employees,Predicate<Employee> predicate, Consumer<Employee> consumer) {
		for (Employee employee : employees) {
			if (predicate.test(employee)) {
				consumer.accept(employee);
			}
		}
		
	}
	

}
