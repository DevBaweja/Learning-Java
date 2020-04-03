package StudentDatabase;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JComboBox;

public class AddressRecords extends JApplet implements ItemListener{

	JComboBox cbaddress;
	
	public void init()
	{
		setLayout(new GridLayout(3,3));
		cbaddress = new JComboBox();
		add(cbaddress);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector


				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				ResultSet rs = stmt.executeQuery("select distinct address from PersonalTB");
		
				while(rs.next())
				{
					cbaddress.addItem(rs.getString("address"));
				}
			
				
				con.close();

		} 
		
		catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 	}

		cbaddress.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if( e.getStateChange() == ItemEvent.DESELECTED ) return; 
		
		String a = cbaddress.getSelectedItem().toString();
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				PreparedStatement pstmt = con.prepareStatement("select count(*) from PersonalTB where address=?");
				
				pstmt.setString(1, a);
				ResultSet rs = pstmt.executeQuery();
				
				int c= 0;
				rs.next();
				c = rs.getInt(1);
				System.out.println("Number of address records: "+ c);
				
				con.close();
		} 
		
		catch (SQLException ae) {
				ae.printStackTrace();
			}
				
		 catch (ClassNotFoundException ae) {
			 	ae.printStackTrace();
		 	}
	}
	
	
}
