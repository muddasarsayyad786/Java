package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicOpsDB {
	public static void executeSelect(Connection con, String query)
	{
		try {
			Statement st = con.createStatement();
			ResultSet records = st.executeQuery(query);
			while(records.next())
			{
				System.out.println(records.getInt(1) + " , " + records.getString(2)
				+ " , " + records.getString(3));
			}
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public static void executeInsert(Connection con, String query, int rollno, String firstname, String lastname)
	{
		try {
			PreparedStatement st= con.prepareStatement(query);
			st.setInt(1, rollno);
			st.setString(2, firstname);
			st.setString(3, lastname);
			int count = st.executeUpdate();
			System.out.println(count + " row(s) affected");
		}
		catch (SQLException e) {
		  System.out.println(e);
		}
	}
	
	public static void executeUpdate(Connection con, String query, int rollno, String lastname)
	{
		try {
			PreparedStatement st= con.prepareStatement(query);
			st.setString(1, lastname);
			st.setInt(2, rollno);
			int count = st.executeUpdate();
			System.out.println(count + " row(s) affected");
		}
		catch (SQLException e) {
		  System.out.println(e);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/college";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String selectquery = "SELECT * from student";
		
		String insetquery = "INSERT into student VALUES (?,?,?)";
		String updatequery = "UPDATE student SET lastname = ? WHERE rollno =?";
		
		try {
			con = DriverManager.getConnection(url, "root", "root");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		BasicOpsDB.executeSelect(con, selectquery);
		
		
//		BasicOpsDB.executeInsert(con, insetquery, 4, "abc", "d");		
//		System.out.println("After Insert");
//		BasicOpsDB.executeSelect(con, selectquery);
		
		
		BasicOpsDB.executeUpdate(con, updatequery, 4, "p");
		System.out.println("After Insert");
		BasicOpsDB.executeSelect(con, selectquery);
	}

}
