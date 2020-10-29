public class Demo1 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String("Hello");
		System.out.println("str1 - >"+str1);
		System.out.println("str2 - >"+str2);
		System.out.println("str1 hash code : "+str1.hashCode());
		System.out.println("str2 hash code : "+str2.hashCode());
		if(str1==str2) {
			System.out.println("str1 and str2 are same");
		}
		else {
			System.out.println("str1 and str2 are not same");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Value of str1 and str2 is same");
		}
		
	}

}
