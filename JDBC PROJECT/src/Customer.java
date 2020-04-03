import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


abstract class Customer {

	String cname;
	String cpass;
	char cgender;
	int cage;
	
	Customer() {
		// TODO Auto-generated constructor stub
	}

	Customer(String cname, String cpass, int cage, char cgender,Boolean type) {
		// TODO Auto-generated constructor stub
		System.out.println("Created");
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
				Statement stmt=con.createStatement();
				stmt.execute("create database if not exists Shopping");
				stmt.execute("use Shopping");
				stmt.execute("create table if not exists Customer(cname varchar(10) primary key,cpass varchar(10),cage int(2),gender enum('M','F'),type boolean )");
				
				PreparedStatement pstmt = con.prepareStatement("select count(*) as count from Customer where cname = ?");
				pstmt.setString(1, cname);
				ResultSet rs = pstmt.executeQuery();
				rs.next();
				int c = rs.getInt("count");
				
				if(c!=0)
					System.out.println("Username already exists");
				else
				{
					PreparedStatement ipstmt = con.prepareStatement(" insert into Customer values(?,?,?,?,?) ");
					ipstmt.setString(1, cname);
					ipstmt.setString(2, cpass);
					ipstmt.setInt(3, cage);
					ipstmt.setString(4, String.valueOf(cgender));
					ipstmt.setBoolean(5, type);
					
					ipstmt.execute();
				}
				

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

	}
}
