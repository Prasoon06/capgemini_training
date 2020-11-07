
public class MessageTest {

	public static void main(String[] args) {
		MessageFormate messageFormat = ()-> System.out.println("---------Some Dummy Message----------");
//		MessageFormate messageFormat =  new MessageFormate() {
//			
//			@Override
//			public void render() {
//				System.out.println("Test Message");
//				
//			}
//		};
		System.out.println(messageFormat);
		//display(messageFormat);
		messageFormat.render();

	}

	private static void display(MessageFormate messageFormat) {
		messageFormat.render();
		
	}

}
