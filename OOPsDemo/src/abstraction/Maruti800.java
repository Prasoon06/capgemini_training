package abstraction;

public class Maruti800 extends Car {

	public Maruti800(String regNo) {
		super(regNo);
		
	}

	public Maruti800() {
		super();
	}

	@Override
	public void drive() {
		System.out.println("Drive Maruti with Normal steering : reg No :"+getRegNo());
		
	}

	@Override
	public void stop() {
		System.out.println("Stop Maruti with normal Break"+getRegNo());
		
	}

}
