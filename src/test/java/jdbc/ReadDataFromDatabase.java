package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root" ,"root");
		Statement statement =connect.createStatement();
		ResultSet result = statement.executeQuery("select * from student;");
		while (result.next()) 
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2));
		}
		connect.close();

	}

}
