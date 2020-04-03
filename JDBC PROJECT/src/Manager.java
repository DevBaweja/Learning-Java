import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {

	static final String mname = "admin"; 
	static final String mpass = "admin"; 
	
	Manager() {
		// TODO Auto-generated constructor stub
	}
	
	static boolean isValid(String name,String pass)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
			Statement stmt=con.createStatement();
			stmt.execute("create database if not exists Shopping");
			stmt.execute("use Shopping");
			stmt.execute("create table if not exists Customer(cname varchar(10) primary key,cpass varchar(10),cage int(2),gender enum('M','F'),type boolean )");
			
			PreparedStatement pstmt = con.prepareStatement("select count(*) as count from Customer where cname = ? and cpass = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int c = rs.getInt("count");
			
			if(c!=1)
					return false;
			else
				return true;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
