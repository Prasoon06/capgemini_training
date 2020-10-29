/**
 * Use this interface to interact with any database depends on implementation
 * @author pankaj
 *
 */
public interface ConnectDB {
	/**
	 * Call this method to open connection with database
	 */
	void connect();
	
	/**
	 * Call this method for performing DB transaction
	 */
	void use();
	
	/**
	 * Call this method to disconnect from database
	 */
	void disconnect();
	
	default void display() {
		System.out.println("-----------ConnectDB Interface-----------");
	}

}
