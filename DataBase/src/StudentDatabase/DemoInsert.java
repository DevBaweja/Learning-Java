package StudentDatabase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemoInsert  extends JApplet implements ActionListener{
	
	JLabel lbname,lbage,lbaddress;
	JTextField txname,txage;
	JTextArea txaddress;
	JButton btinsert,btcancel;
	
	public void init()
	{
		setLayout(new GridLayout(4, 2));

		lbname = new JLabel("Name");
		lbage = new JLabel("Age");
		lbaddress = new JLabel("Address");
		
		txname = new JTextField(20);
		txage = new JTextField(20);
		txaddress = new JTextArea();
		
		btinsert = new JButton("Insert");
		btcancel = new JButton("Cancel");
	
		btinsert.addActionListener(this);

		
		
		print();
	}
	
	
	public void print()
	{
		add(lbname);
		add(txname);
		
		add(lbage);
		add(txage);
		
		add(lbaddress);
		add(txaddress);
		
		add(btinsert);
		add(btcancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == btinsert) 
		{
	
			
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
					
					stmt.execute("use StudentDB");
					
					stmt.executeUpdate("create table if not exists PersonalTB(rollno int auto_increment,name varchar(50),age int,address varchar(100),primary key(rollno))");
					
					
					String name = txname.getText();
					int age = Integer.parseInt(txage.getText());
					String address = txaddress.getText();
					
					
					PreparedStatement prstmt = con.prepareStatement("insert into PersonalTB(name,age,address) values(?,?,?)");
					
					prstmt.setString(1, name);
					prstmt.setInt(2, age);
					prstmt.setString(3, address);
					
					prstmt.executeUpdate();
					con.close();

			} 
			
			catch (SQLException e1) {
					e1.printStackTrace();
				}
					
			 catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			 	}
				
		}
	}
	
}
