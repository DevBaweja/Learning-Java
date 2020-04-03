import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Item {

	String iname;
	int iprice;
	
	Item(String iname, int iprice) {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
			Statement stmt=con.createStatement();
			stmt.execute("create database if not exists Shopping");
			stmt.execute("use Shopping");
			stmt.execute("create table if not exists Item(iname varchar(10) primary key,iprice int(5))");
			
			PreparedStatement pstmt = con.prepareStatement("select count(*) as count from Item where iname = ?");
			pstmt.setString(1, iname);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int c = rs.getInt("count");
			
			if(c!=0)
				System.out.println("Item already exists");
			else
			{
				PreparedStatement ipstmt = con.prepareStatement(" insert into Item values(?,?) ");
				ipstmt.setString(1, iname);
				ipstmt.setInt(2, iprice);

				ipstmt.execute();
			}
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
