import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ReadDemo {
	private static Logger logger=Logger.getLogger(ReadDemo.class);
	public static void main(String[] args) {
		try {
			//1: Gather DB Information
			String driverClassName="org.postgresql.Driver";
			String url="jdbc:postgresql://localhost:5432/employeedb";
			String user="postgres";
			String pwd="admin";
			//2: Register Driver
			Class c = Class.forName(driverClassName);
			logger.info(c);
			//3: Get Connection
			Connection con =  DriverManager.getConnection(url, user, pwd);
			logger.info(con);
			//4: Prepare sql and Statement and execute query
			String sql = "select * from employees";
			Statement stmt =  con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				int age = rs.getInt("age");
				System.out.println(fname + " : "+lname+" : "+age);
			}
			logger.info(stmt);
			
			
			//5: Release resources
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
