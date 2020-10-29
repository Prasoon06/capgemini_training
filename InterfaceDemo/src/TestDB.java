
public class TestDB {

	public static void main(String[] args) {
		ConnectDB con;
		con=new OracleDriver();
		con.connect();
		con.use();
		con.disconnect();
		con.display();

	}

}
