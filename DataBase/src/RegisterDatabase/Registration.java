package RegisterDatabase;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Registration extends JApplet implements ActionListener,ItemListener,FocusListener{
              
              JLabel lbuser,lbpass,lbhead,lbpic,lbpicnet;
              JLabel lbgender,lbdob;
              JLabel lbmobile;
              JLabel lbemail;
              JLabel lblanguage;
              JButton btregister,btrefresh,btclose,btbrowse;
              JTextField txuser,txmobile,txemail;
               
              JPasswordField txpass;
              JPanel P,Phead,Pgender,Pdob,Pbutton1,Pbutton2,PLang,Pimage;
              JRadioButton ckmale,ckfemale,ckhidden;
              JCheckBox chenglish,chhindi,chothers;
              ButtonGroup gr;
              JComboBox chyy,chmm,chdd;
              JScrollPane jsp;
              File imgfile;
              JFileChooser jf;
              FileInputStream fin;
                           
             public void init()
              {
                           
                           setVisible(true);
                           setSize(700,700);

                           lbhead = new JLabel("Registration");
                           lbuser = new JLabel("User Name");
                           lbpass = new JLabel("Password");
                           lbemail = new JLabel("Email ID");
                           lbgender = new JLabel("Gender");
                           lbpic = new JLabel("Pics");
                           
                           lbpicnet = new JLabel("");
                           lblanguage = new JLabel("language");                           
 
                           
                            gr = new ButtonGroup();
                           ckmale = new JRadioButton("Male");
                           ckfemale = new JRadioButton("Female");
                           ckhidden = new JRadioButton("Hidden"); // dont add this
                           
                           gr.add(ckmale);
                           gr.add(ckfemale);
                           gr.add(ckhidden);
                           
                           chenglish = new JCheckBox("English");
                           chhindi = new JCheckBox("Hindi");
                           chothers = new JCheckBox("Others"); // dont add this
                           
                           lbdob =  new JLabel("DOB");
                           
                           chyy = new JComboBox();
                           chmm = new JComboBox();
                           chdd = new JComboBox();
                           
                           lbmobile = new JLabel("Mobile");
                           
                           btregister = new JButton("Register");
                           btrefresh= new JButton("Refresh");
                           btclose = new JButton("Close");
                           btbrowse = new JButton("Browse");
                           
                           txuser = new JTextField();   
                           txpass = new JPasswordField();
                           txpass.setEchoChar('*');

                           txmobile = new JTextField(); 
                           txemail = new JTextField();
                           
              
                           print();
                           
                           
                           chyy.addItemListener(this);
                           chmm.addItemListener(this);
                           
                           btregister.addActionListener(this);
                           btrefresh.addActionListener(this);
                           btbrowse.addActionListener(this);
                           btclose.addActionListener(this);
                           txpass.addFocusListener(this);
                           
                          
              }
              
              public void print()
              {
                           chyy.addItem("Year");
                           for(int i=1981;i<=2000;i++)
                           chyy.addItem(i+"");
                           
                           chmm.addItem("Month");
                           for(int i=1;i<=12;i++)
                                         chmm.addItem(i+"");
                           
                           chdd.addItem("Date");
                           
                           // according to month and year date must change
              
                           
                           Phead = new JPanel();
                           Phead.add(lbhead);
                           
                           Pgender = new JPanel();
                           Pgender.setLayout(new GridLayout(1, 2));
                           Pdob = new JPanel();
                           Pdob.setLayout(new GridLayout(1, 3));
                           Pbutton1 = new JPanel();
                           Pbutton1.setLayout(new GridLayout(1,1));
                           Pbutton2 = new JPanel();
                           Pbutton2.setLayout(new GridLayout(1, 2));
                           
                           Pgender.add(ckmale);
                           Pgender.add(ckfemale);
                           // dont add this hidden check box
                           
                           PLang = new JPanel();
                           PLang.setLayout(new GridLayout(1, 3));
                           PLang.add(chenglish);
                           PLang.add(chhindi);
                           PLang.add(chothers);
                           
                           Pdob.add(chyy);
                           Pdob.add(chmm);
                           Pdob.add(chdd);
                           
                           
                           Pimage = new JPanel();
                           PLang.setLayout(new GridLayout(1,2 ));
                           Pimage.add(lbpicnet);
                           Pimage.add(btbrowse);
                           
                           Pbutton1.add(btregister);
                           Pbutton2.add(btrefresh);
                           Pbutton2.add(btclose);
              
                          
                          
                           P = new JPanel();
                           P.setLayout(new GridLayout(9,2));
                           
                           P.add(lbpic);
                           P.add(Pimage);
                           
                           P.add(lbemail);
                           P.add(txemail);
                           P.add(lbuser);
                           P.add(txuser);
                           P.add(lbpass);
                           P.add(txpass);
                           
                           P.add(lbmobile);
                           P.add(txmobile);
                           
                           P.add(lbdob);
                           P.add(Pdob);
                           P.add(lbgender);
                           P.add(Pgender);
                           
                      
                           P.add(lblanguage);
                           P.add(PLang);
                          
                           P.add(Pbutton1);
                           P.add(Pbutton2);
                           
                           
                           jsp = new JScrollPane(P);
                           add(jsp,BorderLayout.CENTER); // default of JApplet
                           
                           add(Phead,BorderLayout.NORTH);
              
              }

              @Override
              public void itemStateChanged(ItemEvent ie) {
                           
                           
                           // Object src = ie.getSource();
                           
                           
              // yymmdd 
                            if(chyy.getSelectedIndex() != 0 && chmm.getSelectedIndex() != 0)
                           {
                           
                                         
                            int yy = Integer.parseInt( chyy.getSelectedItem().toString() );
                           int mm = Integer.parseInt( chmm.getSelectedItem().toString() );
                           
                            // every time it come here we will remove previous entered item 
                            // and then it will add automatically
                           
                            //  for(int i=1;i<chdd.getItemCount();i++)
                           // chdd.remove(1);
                                         
                           chdd.removeAllItems();
                           chdd.addItem("Date");
                           
                            int days = 0;
                           
                            if(mm == 2)
                                         {
                                         if(yy%4 ==0)
                                         
                                                        days = 29;
                                         else
                                                       days = 28;
                                         }
                           else 
                                                      { 
                                                                    if(mm == 4 || mm == 6 || mm == 9 || mm == 11)
                                                                                 days = 30;
                                                                   else 
                                                                                  days = 31;
                                                     }
              
                                         for(int i=1 ; i<=days ;i++)
                                                       chdd.addItem(i+"");
              
                           }

}

              @Override
              public void actionPerformed(ActionEvent ae) {
                           
                           Object src = ae.getSource();
                           // in refresh radio JButton will remain as it
                           // making hidden radio JButton
                           
                           if(src == btregister)
                           {
                        	   try {
      								
      								
      								Class.forName("com.mysql.jdbc.Driver");
      								Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
      								Statement stmt = con.createStatement();
      								stmt.executeUpdate("create database if not exists RegisterDb");
      								stmt.execute("Use RegisterDb");
      								stmt.executeUpdate("create table if not exists  Worktb( emailid varchar(100),user varchar(100),pass varchar(100),phone varchar(100), dob date ,gender varchar(100),language varchar(100),img longblob,primary key(user))");
      								
      								PreparedStatement pre = con.prepareStatement("insert into Worktb (emailid,user,pass,phone,dob,gender,language,img) values (?,?,?,?,?,?,?,?)");
      				
      								pre.setString(1,txemail.getText());
      								pre.setString(2, txuser.getText());
      								pre.setString(3, txpass.getText());
      								pre.setString(4, txmobile.getText());
      								
      								
      								int yy = Integer.parseInt(chyy.getSelectedItem().toString());
      								int mm = Integer.parseInt(chmm.getSelectedItem().toString());
      								int dd = Integer.parseInt(chdd.getSelectedItem().toString());
      								Date dob = new Date(yy-1900, mm-1 , dd);
      										/*
      										 * year the year minus 1900; must be 0 to 8099. (Note that8099 is 9999 minus 1900.)
      										 * month 0 to 11
      										 * day 1 to 31
      										 */
      								
      								pre.setDate(5, dob);
      								
      								if( ckmale.isSelected())
      								{
      									pre.setString(6,"Male");
      								}else if( ckfemale.isSelected() )
      								{
      									pre.setString(6, "Female");
      								}
      								
      								String res = "";
      								if( chenglish.isSelected() )
      								{
      									res += " English";
      								}
      								if( chhindi.isSelected() )
      								{
      									res += " Hindi";
      								}
      								if( chothers.isSelected() )
      								{
      									res += " Others";
      								}
      								pre.setString(7, res);
      								
      								
      								pre.setBinaryStream(8, fin, (int)imgfile.length());

      								pre.executeUpdate();
      								System.out.println("Insertion Sucessfully");
      								
      								con.close();
      							} catch (ClassNotFoundException e) {
      								// TODO Auto-generated catch block
      								e.printStackTrace();
      							} catch (SQLException e) {
      								// TODO Auto-generated catch block
      								e.printStackTrace();
      							}
       
                        	   
                        	   
                           }
                           else if(src == btrefresh)
                           {
                        	   	txemail.setText("");
                        	   	txuser.setText("");
                        	   	txpass.setText("");
                        	   	txmobile.setText("");
                        	   	chdd.setSelectedIndex(0);
                        		chmm.setSelectedIndex(0);
                        		chyy.setSelectedIndex(0);
                        		
                        		ckhidden.setSelected(true);
                        		
                        		chenglish.setSelected(false);
                        		chhindi.setSelected(false);
                        		chothers.setSelected(false);

                        		
                           }
                           else if(src == btclose)
                           {
                        	 System.out.println(Integer.parseInt(chyy.getSelectedItem().toString()));  
                        	 System.out.println(Integer.parseInt(chmm.getSelectedItem().toString()));
                        	 System.out.println(Integer.parseInt(chdd.getSelectedItem().toString()));
                           }
                           else if(src == btbrowse)
                           {
                        	   
   								jf = new JFileChooser();
   								int ans = jf.showOpenDialog(null);
   								
   								if(ans == JFileChooser.APPROVE_OPTION)
   								{
   									imgfile = jf.getSelectedFile();
   									lbpicnet.setIcon(new ImageIcon(imgfile+""));
									try {
										fin = new FileInputStream(imgfile);
									} catch (FileNotFoundException e) {
										e.printStackTrace();
									}
									
   								}
   							                       	   
                        	   
                           }
                           
              }

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
			Object src = e.getSource();
				
				if(src == txpass)
				{
					String em = txemail.getText();
					String u = txuser.getText();
				
					txpass.setText(em+u);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
	
			}
         

                            
}



