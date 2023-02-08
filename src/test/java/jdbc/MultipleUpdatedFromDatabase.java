package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MultipleUpdatedFromDatabase {

	public static void main(String[] args) throws SQLException {
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		Statement statement = connect.createStatement();
		 int result = statement.executeUpdate("insert into student values(107,'Raja','Mangalore'),(108,'sethu','Goa')");
	     if(result!=1)
		{
			System.out.println("Database updated successfully");
		}
		else {
			System.out.println("Database not updated");
		}
		 
	      ResultSet result1 = statement.executeQuery("select * from student;");
	      while(result1.next())
	      {
	    	  System.out.println(result1.getInt(1)+"\t"+result1.getString(2)+"\t"+result1.getString(3));
	      }
           connect.close();

	}

}
