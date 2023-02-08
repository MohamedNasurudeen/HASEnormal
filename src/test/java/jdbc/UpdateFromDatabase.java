package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateFromDatabase {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		Statement statement = connect.createStatement();
		int result = statement.executeUpdate("insert into student values(104,'mohan','tamilnadu');");
		if (result==1) {
			System.out.println("Db updated successfully");
			
		} else {
        System.out.println("Db not updated");
		}
		
	}

}
