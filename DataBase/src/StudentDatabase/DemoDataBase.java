package StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// import from java.sql

public class DemoDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector

			
			// Class inbuild class(lang package)
			// forName is static method
			// com  super package
			// mysql  sub package
			// jdbc  sub package
			// Driver class

				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				stmt.executeUpdate("insert into PersonalTB(name,age,address) values('Anil',21,'jnv') ");
				
				con.close();

		} 
		
		catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 	}
		
		

	}

}
