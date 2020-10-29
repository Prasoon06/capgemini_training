package abstraction;

public class BMW extends Car{
	
	public BMW() {
		super();
	}

	public BMW(String regNo) {
		super(regNo);
		
	}

	@Override
	public void drive() {
		System.out.println("Drive BMW with Power steering. Bhoom Bhoom"+getRegNo());
		
	}

	@Override
	public void stop() {
		System.out.println("Stop BMW with power Break"+getRegNo());
		
	}


}
