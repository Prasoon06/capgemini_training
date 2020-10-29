
class Student{
	private String name;
	
	public Student(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
}
public class ArrayDemo3 {

	public static void main(String[] args) {	
		Student student =  new Student("Pankaj");
		System.out.println("Name : "+student.getName());
	}
}
