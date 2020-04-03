package StudentDatabase;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowAllRecordinTable1 extends JApplet implements ItemListener{

	JTable tb; 
	JScrollPane jsp;
	JComboBox cbaddress;
	int c= 0;
	Object [][]row;
	Object []col = new Object[4]; 
	public void init()
	{
		cbaddress = new JComboBox();
		setLayout(new FlowLayout());	
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
					cbaddress.addItem(""+rs.getString("address"));
				}
				con.close();

		} 
		
		catch (SQLException ae) {
				ae.printStackTrace();
			}
				
		 catch (ClassNotFoundException ae) {
			ae.printStackTrace();
		 	}
		
		add(cbaddress);
		cbaddress.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if( e.getStateChange() == ItemEvent.DESELECTED ) return; 

		
		
		col[0] = "rollno";
		col[1] = "name";
		col[2] = "age";
		col[3] = "address";
		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists StudentDB");
				
				stmt.execute("Use StudentDB");
				
				stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
				
				PreparedStatement pstmt = con.prepareStatement("select count(*) from PersonalTB where address=?");
				
				pstmt.setString(1, cbaddress.getSelectedItem().toString());
				
				ResultSet rs = pstmt.executeQuery();
				
				rs.next();
				c = rs.getInt(1);
				System.out.println("Number of records: "+ c);
		
				// making column
				row = new Object[c][4];  
		
		
				PreparedStatement pstmt1 = con.prepareStatement("select * from PersonalTB where address=?");
				
				pstmt1.setString(1, cbaddress.getSelectedItem().toString());
				
				ResultSet rs1 = pstmt1.executeQuery(); // it will give every entry
				
				for(int i=0;i<c && rs1.next();i++)
				{
					row [i][0] = rs1.getInt("rollno");
					row[i][1] = rs1.getString("name");
					row[i][2] = rs1.getInt("age");
					row[i][3] = rs1.getString("address");
				}
				
				con.close();

		} 
		
		catch (SQLException ae) {
				ae.printStackTrace();
			}
				
		 catch (ClassNotFoundException ae) {
			ae.printStackTrace();
		 	}
		
		
		tb = new JTable(row,col);
		jsp = new JScrollPane(tb);
		add(jsp);
	}

}
