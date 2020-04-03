package StudentDatabase;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateDelete  extends JApplet implements ActionListener,ItemListener{
	
	JLabel lbname,lbage,lbaddress,lbroll;
	JTextField txname,txage;
	JTextArea txaddress;
	JButton btupdate,btdelete;
	JComboBox cbroll;
	// JComboBox<E>
	
	public void init()
	{
		setLayout(new GridLayout(5, 2));

		lbroll = new JLabel("Rollno");
		lbname = new JLabel("Name");
		lbage = new JLabel("Age");
		lbaddress = new JLabel("Address");
		
		txname = new JTextField(20);
		txage = new JTextField(20);
		txaddress = new JTextArea();
		
		cbroll = new JComboBox();
		cbroll.addItem("Select Rollno");
		
		btupdate = new JButton("Update");
		btdelete = new JButton("Delete");
	
		btupdate.addActionListener(this);
		btdelete.addActionListener(this);
		
		cbroll.addItemListener(this);
		
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
				
				ResultSet rs = stmt.executeQuery("select rollno from PersonalTB");
		
				while(rs.next())
				{
					cbroll.addItem(rs.getInt("rollno"));
				}
			
				
				con.close();

		} 
		
		catch (SQLException e) {
				e.printStackTrace();
			}
				
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 	}

		
		
		print();
	}
	
	
	public void print()
	{
		add(lbroll);
		add(cbroll);
		add(lbname);
		add(txname);
		
		add(lbage);
		add(txage);
		
		add(lbaddress);
		add(txaddress);
		
		add(btupdate);
		add(btdelete);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == btupdate) 
		{
			
			try {
				Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
					
					// server and default mysql port address , username , password
					
					Statement stmt = con.createStatement();
					
					stmt.executeUpdate("create database if not exists StudentDB");
					
					stmt.execute("Use StudentDB");
					
					stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
			
					PreparedStatement pstmt = con.prepareStatement("update PersonalTB set name=?,age=?,address=? where rollno=?");
					
					pstmt.setString(1, txname.getText());
					pstmt.setInt(2, Integer.parseInt(txage.getText()) );
					pstmt.setString(3, txaddress.getText());
					pstmt.setInt(4, Integer.parseInt( cbroll.getSelectedItem().toString() ));
					
					pstmt.executeUpdate();
					
					con.close();

			} 
			
			catch (SQLException ae) {
					ae.printStackTrace();
				}
					
			 catch (ClassNotFoundException ae) {
				 	ae.printStackTrace();
			 	}
		}
		else if(src == btdelete)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
					
					// server and default mysql port address , username , password
					
					Statement stmt = con.createStatement();
					
					stmt.executeUpdate("create database if not exists StudentDB");
					
					stmt.execute("Use StudentDB");
					
					stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
			
					PreparedStatement pstmt = con.prepareStatement("delete from PersonalTB where rollno=?");
					
					pstmt.setInt(1,Integer.parseInt( cbroll.getSelectedItem().toString() ));
					
					pstmt.executeUpdate();
					
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


	@Override
	public void itemStateChanged(ItemEvent ae) {
		// TODO Auto-generated method stub
		if(cbroll.getSelectedIndex()==0)
		{
			
			txname.setText("");
			txage.setText("");
			txaddress.setText("");
			return ;
		}
		
		
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
	
			
					
				PreparedStatement pstmt = con.prepareStatement("select * from PersonalTB where rollno=?");
				pstmt.setString(1,cbroll.getSelectedItem().toString());
				
				ResultSet rs = pstmt.executeQuery();
				
				rs.next();
				
					txname.setText(rs.getString("name"));
					txage.setText(Integer.toString((rs.getInt("age"))));
					txaddress.setText(rs.getString("address"));
				
				
				
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
