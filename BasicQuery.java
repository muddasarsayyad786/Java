package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/college";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String query = "create table student (\r\n"
				+ "rollNo int not null,\r\n"
				+ "firstname varchar(20) not null,\r\n"
				+ "lastname varchar(20) not null);";
		
		try {
			con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection successful");
			Statement st = con.createStatement();
			int count= st.executeUpdate(query);
			System.out.println(count + "row(s) affected");
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
