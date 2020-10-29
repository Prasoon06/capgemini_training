
public class OracleDriver implements ConnectDB{
	

	@Override
	public void connect() {
		System.out.println("Connecting with Oracle");
		
	}

	@Override
	public void use() {
		System.out.println("Performing Transaction in Oracle");
		
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Oracle");
		
		
	}

}
