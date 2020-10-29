
public class MutableDemo {

	public static void main(String[] args) {
		StringBuilder sb =  new StringBuilder("Hello");
		System.out.println("sb -> "+sb);
		System.out.println("sb hash code : "+sb.hashCode());
		sb.append(" Friend");
		System.out.println("sb -> "+sb);
		System.out.println("sb hash code : "+sb.hashCode());	

	}
}
