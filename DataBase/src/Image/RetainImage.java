package Image;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RetainImage  extends JApplet{
	

	
	public void init()
	{
		setLayout(new FlowLayout());

		try {
			Class.forName("com.mysql.jdbc.Driver"); // imported external jar mysql JConnector

				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				
				// server and default mysql port address , username , password
				
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("create database if not exists ImageDB");
				
				stmt.execute("use imageDB");
				
				stmt.executeUpdate("create table if not exists ImageTB(id int auto_increment,descp varchar(30),img longblob,primary key(id) )");			

				
				PreparedStatement prstmt = con.prepareStatement("select descp,img from ImageTB");
			
				ResultSet rs = prstmt.executeQuery();
				
				rs.next();
				
				System.out.println("Desr");
				System.out.println(rs.getString(1));
				
				File image = new File("D:\\temp.jpg");
				FileOutputStream fos = new FileOutputStream(image); 
				
				byte[] buffer = new byte[1];
				InputStream is = rs.getBinaryStream(2);
				
				
					while(is.read(buffer) > 0)
					{
						fos.write(buffer);
					}
				
				
				
					fos.close();
				
				add(new JLabel(new ImageIcon("D:\\temp.jpg")));
				
				con.close();
		}
		catch (IOException e) {
					e.printStackTrace();
				}
	
		catch (SQLException e1) {
				e1.printStackTrace();
			}
				
		 catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		 	}
			
	}
	
	
	
}
