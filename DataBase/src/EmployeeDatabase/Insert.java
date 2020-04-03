package EmployeeDatabase;

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

public class Insert  extends JApplet implements ActionListener{
	
	JLabel lbcode,lbname,lbage,lbsalary,lbpost;
	JTextField txcode,txname,txage,txsalary,txpost;
	JButton btinsert,btcancel;
	
	public void init()
	{
		setLayout(new GridLayout(6, 2));

		lbcode = new JLabel("Code");
		lbname = new JLabel("Name");
		lbage = new JLabel("Age");
		lbsalary = new JLabel("Salary");
		lbpost = new JLabel("Post");
		
		txcode = new JTextField(20);
		txname = new JTextField(20);
		txage = new JTextField(20);
		txsalary = new JTextField(20);
		txpost = new JTextField(20);
		
		
		btinsert = new JButton("Insert");
		btcancel = new JButton("Cancel");
	
		btinsert.addActionListener(this);

		
		
		print();
	}
	
	
	public void print()
	
	{
		add(lbcode);
		add(txcode);
		
		add(lbname);
		add(txname);
		
		add(lbage);
		add(txage);
		
		add(lbsalary);
		add(txsalary);
		
		add(lbpost);
		add(txpost);
		
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
					
					stmt.executeUpdate("create database if not exists EmployeeDB");
					
					stmt.execute("use EmployeeDB");
					
					stmt.executeUpdate("create table if not exists InfoTB(code int,name varchar(50),age int,salary int,post varchar(50))");
					
					
					int code = Integer.parseInt(txcode.getText());
					String name = txname.getText();
					int age = Integer.parseInt(txage.getText());
					int salary = Integer.parseInt(txsalary.getText());
					String post = txpost.getText();
					
					
					PreparedStatement prstmt = con.prepareStatement("insert into InfoTB(code,name,age,salary,post) values(?,?,?,?,?)");
					
					prstmt.setInt(1, code);
					prstmt.setString(2, name);
					prstmt.setInt(3, age);
					prstmt.setInt(4, salary);
					prstmt.setString(5,post);
					
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
