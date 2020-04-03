package StudentDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ShowAllAddress1 {

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
				
				Scanner sc = new Scanner(System.in);
				System.out.println();
				String search = sc.next(); 
				
				PreparedStatement pstmt = con.prepareStatement("select * from PersonalTB where address=?");
				pstmt.setString(1, search); // 1 is for ques value				
				
				ResultSet rs = pstmt.executeQuery();
				
	
				System.out.print("RollNo"+"\t");
				System.out.print("Name"+"\t");
				System.out.print("Address"+"\t");
				System.out.println();
				while(rs.next())
				{
					System.out.print(rs.getInt("rollno")+"\t"); // by index
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println();
				}
				
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


