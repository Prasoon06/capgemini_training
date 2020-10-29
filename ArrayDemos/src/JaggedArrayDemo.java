
public class JaggedArrayDemo {

	public static void main(String[] args) {
		int arr[][] =  new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;
		
		arr[2][0] = 60;
		arr[2][1] = 70;
		arr[2][2] = 80;
		arr[2][3] = 90;
		
			
		
		System.out.println("arr hashcode : "+arr.hashCode());
		System.out.println("arr[0] hashcode : "+arr[0].hashCode());
		System.out.println("arr[1] hashcode : "+arr[1].hashCode());
		System.out.println("arr[2] hashcode : "+arr[2].hashCode());
		
		System.out.println("------------Before Changes-----------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("hash code of arr[i[] : "+arr[1].hashCode());
		int temp[]= {100,200,300,400,500,600};
		System.out.println("length of temp array : "+temp.length);
		System.out.println("hash code of temp : "+temp.hashCode());
		arr[1]=temp;
		System.out.println("hash code of arr[1] : "+arr[1].hashCode());
		
		System.out.println("------------After Changes-----------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
