package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");// register the driver 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nikhil", "root", "Hawkeye0");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee_details");
			
			while (rs.next())
				
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}


	