
public class TwoDArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][5];
		System.out.println("arr --->"+arr);
		System.out.println("Length -->"+arr.length);
		System.out.println("arr[0] : "+arr[0]);
		System.out.println("arr[1] : "+arr[1]);
		System.out.println("arr[2] : "+arr[2]);
		System.out.println("arr[0] -Length : "+arr[0].length);
		System.out.println("arr[1] -Length : "+arr[1].length);
		System.out.println("arr[2] -Length: "+arr[2].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	
	}

}
