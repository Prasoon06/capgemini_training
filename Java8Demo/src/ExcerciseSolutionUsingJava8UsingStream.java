import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExcerciseSolutionUsingJava8UsingStream {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("pankaj", "sharma", 40000),
				new Employee("aman", "sony", 20000), new Employee("suman", "arya", 50000),
				new Employee("anuj", "rathore", 50000),new Employee("sanam", "patel", 60000));
		
		System.out.println("--------------Print all Employees-------------------");
		employees.stream()
		.forEach(e->System.out.println(e));
		
		System.out.println("--------------Print all Employees first name start with a-------------------");
		employees.stream()
		.filter(e->e.getFirstName().startsWith("a"))
		.forEach(e->System.out.println(e));

	}
	

}
