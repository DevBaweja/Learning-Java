package StudentDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowAllRecordinTable extends JApplet {

	JTable tb; 
	JScrollPane jsp;
	
	int c= 0;
	
	public void init()
	{

		Object []col = {"rollno","name","age","address"} ; 
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				ResultSet rs = stmt.executeQuery("select count(*) from PersonalTB");

				
				rs.next();
				
				c = rs.getInt(1);
				System.out.println("Number of records: "+ c);
		} 
		
		catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 	}
		
		Object [][]row = new Object[c][4];  
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector


				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				ResultSet rs = stmt.executeQuery("select * from PersonalTB");
				
				for(int i=0;i<c && rs.next();i++)
				{
					row [i][0] = rs.getInt("rollno");
					row[i][1] = rs.getString("name");
					row[i][2] = rs.getInt("age");
					row[i][3] = rs.getString("address");
				}
				
				con.close();

		} 
		
		catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 	}
		
		
		tb = new JTable(row,col);
		jsp = new JScrollPane(tb);
		add(jsp);
	}

}
