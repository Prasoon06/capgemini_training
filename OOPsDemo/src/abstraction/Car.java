package abstraction;

public abstract class Car {
	
	private String regNo;
	
	/*
	 * to control the functionlities
	 */
	public Car() {
		this("AAA123"); //delegation : constructor chainging
		drive();
		stop();
		fillTank();
	}
	public Car(String regNo) {
		super();
		this.regNo = regNo;
	}
	
	public String getRegNo() {
		return regNo;
	}
	public void fillTank() {
		System.out.println("Car is fuling : Reg No :"+getRegNo());
	}
	
	public abstract void drive();
	public abstract void stop();

}
