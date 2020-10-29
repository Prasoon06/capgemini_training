
public class ImmutableDemo {

	public static void main(String[] args) {
		String str1="Hello";
		System.out.println("str1 -> "+str1);
		System.out.println("str1 hash code : "+str1.hashCode());
		str1=str1+ " Friends";
		System.out.println("str1 -> "+str1);
		System.out.println("str1 hash code : "+str1.hashCode());

	}

}
