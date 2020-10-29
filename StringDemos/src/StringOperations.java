
public class StringOperations {
	public static void main(String[] args) {
		String numberString = "10,20,30,40,50";
		String [] numbers = numberString.split(",");
		int sum=0;
		for (String num : numbers) {
			sum+=Integer.parseInt(num);
		}
		
		System.out.println("Sum of number sequence is : "+sum);
	}

}
