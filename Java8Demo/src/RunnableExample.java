
public class RunnableExample {
	
	public static void main(String[] args) {
		Thread normalThread =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Normal Thread");
				
			}
		});
		
		Thread lambdaThread = new Thread(()->System.out.println("Lambda Thread"));
		
		normalThread.start();
		lambdaThread.start();
	}

}
