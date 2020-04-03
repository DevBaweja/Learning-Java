package Image;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Insert  extends JApplet implements ActionListener{
	
	JLabel lbdes;
	JTextField txdes;
	JButton btinsert;
	
	public void init()
	{
		setLayout(new GridLayout(2, 2));

		lbdes = new JLabel("Des");
		txdes = new JTextField(20);
				
		btinsert = new JButton("Insert");
		
		print();
		
	btinsert.addActionListener(this);
	}
	
	
	public void print()
	
	{

		add(lbdes);
		add(txdes);
		add(btinsert);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == btinsert) 
		{
			try {
				Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector

					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
					
					// server and default mysql port address , username , password
					
					Statement stmt = con.createStatement();
					
					stmt.executeUpdate("create database if not exists ImageDB");
					
					stmt.execute("use imageDB");
					
					stmt.executeUpdate("create table if not exists ImageTB(id int auto_increment,descp varchar(30),img longblob,primary key(id) )");			

					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(null);
					File imgfile = jfc.getSelectedFile();
					
					FileInputStream fin=null;
					try {
						fin = new FileInputStream(imgfile);
					} catch (FileNotFoundException ae) {
						ae.printStackTrace();
					}
					
					
					PreparedStatement prstmt = con.prepareStatement("insert into ImageTB(descp,img) values(?,?)");

					prstmt.setString(1, txdes.getText());
					prstmt.setBinaryStream(2,fin,(int)imgfile.length());
					
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
