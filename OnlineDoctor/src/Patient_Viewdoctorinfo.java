
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Patient_Viewdoctorinfo extends JDialog implements ActionListener,ItemListener,FocusListener,KeyListener{
                JPanel p,phead,pbutton;
                JButton btcancel,btbook;
                JTextField txuser;
                JTextArea taddress;
                JTextField txmobile;
                JTextField txemail,txlocation;
                JComboBox cbcity,cbstate;
                JComboBox chspecilization,chqualification;
                JTextField txHospitalName,txHospitalLocation,txclinicname,txcliniclocation;
                JPanel Pgender,Pdob,PLang;
                JRadioButton ckmale,ckfemale,ckhidden;
                JCheckBox chenglish,chhindi,chothers,chlanghidden;
                ButtonGroup gr;
                JComboBox chyy,chmm,chdd;
                JComboBox cMs;
                String trial;
                JLabel lbuser,lbemail,lbmobile,lbgender,lbstatus,lbdob,lblocation,lbaddress,lbstate,lbcity,lbspeci,lbqualification,lblang,lbhosn,lbhosl,lbclin,lbclinl;
                String userd;
                
                public Patient_Viewdoctorinfo()
                {
                                  userd = Patient_SearchDoctor.userd; // taking username from previous login form
                                trial="";
                                setVisible(true);
                                setSize(new Dimension(700, 700));
                                setPreferredSize(new Dimension(700, 700));
                                setLayout(new BorderLayout());
                                txuser = new JTextField("User Name");
                                txuser.setEnabled(false);
                                txemail = new JTextField("Email ID");

                                cMs=new JComboBox();
                                cMs.addItem("Select status");
                                cMs.addItem("Single");
                                cMs.addItem("Married");

                                txlocation= new JTextField("Location");
                                cbcity= new JComboBox();
                        		cbcity.addItem("Select City"); 
                        		cbstate= new JComboBox();
                        		cbstate.addItem("Select State");
                        		fillcbstate();
                                gr = new ButtonGroup();
                                ckmale = new JRadioButton("Male");
                                ckfemale = new JRadioButton("Female");
                                ckhidden = new JRadioButton("Hidden"); // dont add this

                                gr.add(ckmale);
                                gr.add(ckfemale);
                                gr.add(ckhidden);
                                
                                chspecilization= new JComboBox();
                                chspecilization.addItem("Select Specilization");
                                fillspec();
                                chqualification= new JComboBox();
                                chqualification.addItem("Select Qualification");
                                fillqual();
                                
                                chenglish = new JCheckBox("English");
                                chhindi = new JCheckBox("Hindi");
                                chothers = new JCheckBox("Others"); // dont add this

                                txHospitalName = new JTextField("Hospital Name");
                                txHospitalLocation = new JTextField("Hospital Location");
                                txclinicname = new JTextField("Clinic Name");
                                txcliniclocation = new JTextField("Clinic Location");

                                chyy = new JComboBox();
                                chmm = new JComboBox();
                                chdd = new JComboBox();


                                taddress = new JTextArea("Address");
                                txmobile = new JTextField("Personal Number");

                                btcancel=new JButton("Cancel");
                                btcancel.addActionListener(this);

                                btbook=new JButton("Book");
                                btbook.addActionListener(this);
                                cbstate.addItemListener(this);
                                
                                lbuser=new JLabel("USER NAME : ");
                                lbemail=new JLabel("EMAIL : ");
                                lbmobile=new JLabel("PERSONAL NO :");
                                lbgender=new JLabel("GENDER : ");
                                lbstatus=new JLabel("MATERIAL STATUS : ");
                                lbdob=new JLabel("DOB : ");
                                lblocation=new JLabel("LOCATION : ");
                                lbaddress=new JLabel("ADDRESS : ");
                                lbstate=new JLabel("STATE : ");
                                lbcity=new JLabel("CITY : ");
                                lbspeci=new JLabel("SPECILIZATION : ");
                                lbqualification=new JLabel("QUALIFICATION : ");
                                lblang=new JLabel("LANGUAGE : ");
                                lbhosn=new JLabel("HOSPITAL NAME : ");
                                lbhosl=new JLabel("HOSPITAL LOCATION: ");
                                lbclin=new JLabel("CLINIC NAME : ");
                                lbclinl=new JLabel("CLINIC LOCATION : ");

                                chyy.addItemListener(this);
                                chmm.addItemListener(this);
                                txmobile.addKeyListener(this);
                                print();
                                
                                style();
                                enable(false);
                                fillform(); // overwriting
                                
                                

                }
                
                public void fillspec()
                {

                    
              	   try {
              		
             			
             			Class.forName("com.mysql.jdbc.Driver");
             			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
             			Statement stmt = con.createStatement();
             			stmt.executeUpdate("create database if not exists ManagementDb");
             			stmt.execute("Use ManagementDb");
             			stmt.executeUpdate("create table if not exists  DoctorspecTb(specilisation varchar(150))");

       				ResultSet rs = stmt.executeQuery("select distinct specilisation from DoctorspecTb"); 
       				
       				while(rs.next())
       				{
       					chspecilization.addItem(""+rs.getString("specilisation"));
       				}
                    	 
             					con.close();
             				} catch (ClassNotFoundException e) {
             					// TODO Auto-generated catch block
             					e.printStackTrace();
             				} catch (SQLException e) {
             					// TODO Auto-generated catch block
             					e.printStackTrace();

             				}
             		
             	
              	  
                }
                
                public void fillqual()
                {


                    
             	   try {
             		
            			
            			Class.forName("com.mysql.jdbc.Driver");
            			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            			Statement stmt = con.createStatement();
            			stmt.executeUpdate("create database if not exists ManagementDb");
            			stmt.execute("Use ManagementDb");
            			stmt.executeUpdate("create table if not exists  DoctorqualTb(qualification varchar(150))");

      				ResultSet rs = stmt.executeQuery("select distinct qualification from DoctorqualTb"); 
      				
      				while(rs.next())
      				{
      					chqualification.addItem(""+rs.getString("qualification"));
      				}
                   	 
            					con.close();
            				} catch (ClassNotFoundException e) {
            					// TODO Auto-generated catch block
            					e.printStackTrace();
            				} catch (SQLException e) {
            					// TODO Auto-generated catch block
            					e.printStackTrace();

            				}
                }
                
            	public void fillcbstate()
            	{
            		try {
            			Class.forName("com.mysql.jdbc.Driver");
            			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            			Statement stmt = con.createStatement();
            			stmt.executeUpdate("create database if not exists state");
            			stmt.execute("Use state");
            			// table exist already

            			ResultSet rs = stmt.executeQuery("select distinct city_state from cities"); 

            			while(rs.next())
            			{
            				cbstate.addItem(""+rs.getString("city_state"));
            			}
            			con.close(); 

            		} catch (ClassNotFoundException ae) {
            			// TODO Auto-generated catch block
            			ae.printStackTrace();
            		} catch (SQLException ae) {
            			// TODO Auto-generated catch block
            			ae.printStackTrace();
            		}
            	}
                public void fillform()
                {
                                try {


                                                Class.forName("com.mysql.jdbc.Driver");
                                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
                                                Statement stmt = con.createStatement();
                                                stmt.executeUpdate("create database if not exists ManagementDb");
                                                stmt.execute("Use ManagementDb");
                                                stmt.executeUpdate("create table if not exists  DoctorTb( username varchar(100),"
                                                                                + "password varchar(100),"
                                                                                + "email varchar(100),"
                                                                                + "phone varchar(100),"
                                                                                + "gender int,"
                                                                                + "material int,"
                                                                                + "dob date ,"
                                                                                + "location varchar(100),"
                                                                                + "address varchar(100),"
                                                                                + "city varchar(100),"
                                                                                + "state varchar(100),"
                                                                                + "spec varchar(100),"
                                                                                + "qual varchar(100),"
                                                                                + "lang varchar(100),"
                                                                                + "hname varchar(100),"
                                                                                + "hloc varchar(100),"
                                                                                + "cname varchar(100),"
                                                                                + "cloc varchar(100),"
                                                                                + "primary key(username))");

                                                PreparedStatement pstmt = con.prepareStatement("select * from DoctorTb where username = ?");
                                                pstmt.setString(1, userd);
                                                ResultSet rs =  pstmt.executeQuery();
                                                rs.next();

                                                txuser.setText(rs.getString("username"));
                                                txemail.setText(rs.getString("email"));
                                                txmobile.setText(rs.getString("phone"));
                                                txlocation.setText(rs.getString("location"));
                                                taddress.setText(rs.getString("address"));
                                                
                                    			cbstate.setSelectedItem(rs.getString("state"));
                                    			cbcity.setSelectedItem(rs.getString("city"));
                                    			
                                                chspecilization.setSelectedItem(rs.getString("spec"));
                                                chqualification.setSelectedItem(rs.getString("qual"));
                                                txHospitalName.setText(rs.getString("hname"));
                                                txHospitalLocation.setText(rs.getString("hloc"));
                                                txclinicname.setText(rs.getString("cname"));
                                                txcliniclocation.setText(rs.getString("cloc"));
                                                
                                                
                                                int g = rs.getInt("gender"); 
                                                if(g==1)
                                                                ckmale.setSelected(true);
                                                else if(g==0)
                                                                ckfemale.setSelected(true);

                                                String l = rs.getString("lang");
                                                if(l.charAt(0)== '1')
                                                	chenglish.setSelected(true);
                                                else 
                                                	chenglish.setSelected(false);
                                                if(l.charAt(1)== '1')
                                                	chhindi.setSelected(true);
                                                else 
                                                	chhindi.setSelected(false);
                                                if(l.charAt(2)== '1')
                                                	chothers.setSelected(true);
                                                else 
                                                	chothers.setSelected(false);
                                                
                                                cMs.setSelectedIndex(rs.getInt("material"));

                                                Date dob = rs.getDate("dob");
                                                int dd = dob.getDate();
                                                int mm = dob.getMonth();
                                                int yy = dob.getYear();

                                                chyy.setSelectedItem(Integer.toString(1900+yy));
                                                chmm.setSelectedItem(Integer.toString(1+mm));
                                                chdd.setSelectedItem(Integer.toString(dd));

                                                

                                                con.close();
                                } catch (ClassNotFoundException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                } catch (SQLException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                }



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


                                Pgender = new JPanel();
                                Pgender.setLayout(new GridLayout(1, 2));
                                Pdob = new JPanel();
                                Pdob.setLayout(new GridLayout(1, 3));

                                Pgender.add(ckmale);
                                Pgender.add(ckfemale);
                                // dont add this hidden check box

                                Pdob.add(chyy);
                                Pdob.add(chmm);
                                Pdob.add(chdd);

                                PLang = new JPanel();
                                PLang.setLayout(new GridLayout(1, 3));
                                PLang.add(chenglish);
                                PLang.add(chhindi);
                                PLang.add(chothers);


                                p = new JPanel();            
                                p.setLayout(new GridLayout(17,2));
                                p.add(lbuser);
                                p.add(txuser);
                                p.add(lbemail);
                                p.add(txemail);
                                p.add(lbmobile);
                                p.add(txmobile);
                                p.add(lbgender);
                                p.add(Pgender);
                                p.add(lbstatus);
                                p.add(cMs);
                                p.add(lbdob);
                                p.add(Pdob);
                                p.add(lblocation);
                                p.add(txlocation);
                                p.add(lbaddress);
                                p.add(taddress);
                                p.add(lbstate);
                                p.add(cbstate);
                                p.add(lbcity);
                                p.add(cbcity);
                                p.add(lbspeci);
                                p.add(chspecilization);
                                p.add(lbqualification);
                                p.add(chqualification);
                                p.add(lblang);
                                p.add(PLang);
                                p.add(lbhosn);
                                p.add(txHospitalName);
                                p.add(lbhosl);
                                p.add(txHospitalLocation);
                                p.add(lbclin);
                                p.add(txclinicname);
                                p.add(lbclinl);
                                p.add(txcliniclocation);

                                //add(phead,BorderLayout.NORTH);
                                add(p,BorderLayout.CENTER);
                                //p.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.cyan));
                                p.setBorder(BorderFactory.createTitledBorder(null, "::DOCTOR INFO::"));
                                //p.setBorder(BorderFactory.createEtchedBorder(10,Color.green, Color.BLACK));
                                //phead.setBorder(BorderFactory.createRaisedBevelBorder());
                                pbutton = new JPanel();
                                pbutton.add(btbook);
                                pbutton.add(btcancel);
                                add(pbutton,BorderLayout.SOUTH);
                                // enable(false);
                }

                @Override
                public void itemStateChanged(ItemEvent ie) {
                                // TODO Auto-generated method stub
                	Object src = ie.getSource();
                	if(src == cbstate)
            		{
            			cbcity.removeAllItems();
            			cbcity.addItem("Select City");


            			String s = cbstate.getSelectedItem().toString();

            			try {


            				Class.forName("com.mysql.jdbc.Driver");
            				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            				Statement stmt = con.createStatement();
            				stmt.executeUpdate("create database if not exists state");
            				stmt.execute("Use state");
            				// table exist already

            				PreparedStatement pstmt = con.prepareStatement("select distinct city_name from cities where city_state=?");
            				pstmt.setString(1, s);
            				ResultSet rs = pstmt.executeQuery(); 

            				while(rs.next())
            				{
            					cbcity.addItem(""+rs.getString("city_name"));
            				}
            				con.close(); 

            			} catch (ClassNotFoundException ae) {
            				// TODO Auto-generated catch block
            				ae.printStackTrace();
            			} catch (SQLException ae) {
            				// TODO Auto-generated catch block
            				ae.printStackTrace();
            			}
            		}
                	else
                                if(chyy.getSelectedIndex() != 0 && chmm.getSelectedIndex() != 0)
                                {


                                                int yy = Integer.parseInt( chyy.getSelectedItem().toString());
                                                int mm = Integer.parseInt( chmm.getSelectedItem().toString());

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
                public void focusGained(FocusEvent e) {
                                // TODO Auto-generated method stub

                }

                @Override
                public void focusLost(FocusEvent e) {
                                // TODO Auto-generated method stub

                }


                @Override
                public void actionPerformed(ActionEvent ae) {
                                // TODO Auto-generated method stub
                                Object src= ae.getSource();
                                if(src==btcancel)
                                {
                                         this.dispose();       
                                }
                                else if(src==btbook)
                                {
                                	try {
                            			
                            			
                            			Class.forName("com.mysql.jdbc.Driver");
                            			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
                            			Statement stmt = con.createStatement();
                            			stmt.executeUpdate("create database if not exists ManagementDb");
                            			stmt.execute("Use ManagementDb");
                            			stmt.executeUpdate("create table if not exists  DoctorscheduleTb(username varchar(100),days  varchar(100),morningtimestart varchar(100),morningtimeend varchar(100),eveningtimestart varchar(100),eveningtimeend varchar(100),primary key(username))");
                            			
                            			
                            			PreparedStatement pstmt = con.prepareStatement("select count(*) from DoctorscheduleTb where username=?");
                            			pstmt.setString(1, userd);
                            			ResultSet rs = pstmt.executeQuery();
                            			rs.next();
                            			int c = rs.getInt(1);
                            			
                                    	if(c==0)
                                        	JOptionPane.showMessageDialog(null, "Dr "+userd+" have not set schedule","Doctor is currently unavailable for some time", JOptionPane.INFORMATION_MESSAGE);
                                        else if(c==1) // as there is only one doctor in schedule
                                        	{
                                        	
                                        	  new Patient_BookingDoctor();
                                        	  this.dispose();
                                        	}
                            					
                                    	con.close();
                            		} catch (ClassNotFoundException ce) {
                            			// TODO Auto-generated catch block
                            			ce.printStackTrace();
                            		} catch (SQLException ce) {
                            			// TODO Auto-generated catch block
                            			ce.printStackTrace();
                            		}

                                }

                }
               
                public void enable(boolean status)
                {

                                txemail.setEnabled(status);

                                cMs.setEnabled(status);

                                txlocation.setEnabled(status);
                                cbcity.setEnabled(status);
                                cbstate.setEnabled(status);

                                ckmale.setEnabled(status);
                                ckfemale.setEnabled(status);

                                chspecilization.setEnabled(status);
                                chqualification.setEnabled(status);

                                chenglish.setEnabled(status);
                                chhindi.setEnabled(status);
                                chothers.setEnabled(status);

                                txHospitalName.setEnabled(status);
                                txHospitalLocation.setEnabled(status);
                                txclinicname.setEnabled(status);
                                txcliniclocation.setEnabled(status);

                                chyy.setEnabled(status);
                                chmm.setEnabled(status);
                                chdd.setEnabled(status);

                                taddress.setEnabled(status);
                                txmobile.setEnabled(status);
                }
                
                public void style()

                {
                
                                Color c1= new Color(20,110,140);
        Font f1  = new Font("comic sans",Font.ITALIC+Font.BOLD , 20);
        Font f2  = new Font("comic sans",Font.ITALIC+Font.BOLD , 40);
        Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        Border h = BorderFactory.createTitledBorder(loweredbevel,":: ABOUT DOCTOR "+userd+" ::", TitledBorder.CENTER , TitledBorder.TOP ,f2,Color.red);
        Border k = BorderFactory.createMatteBorder(0,10,0,0,Color.red);
        p.setBorder(BorderFactory.createCompoundBorder(h, k));

        lbuser.setFont(f1);
                                lbemail.setFont(f1);
                                lbmobile.setFont(f1);
                                lbgender.setFont(f1);
                                lbstatus.setFont(f1);
                                lbdob.setFont(f1);
                                lblocation.setFont(f1);
                                lbaddress.setFont(f1);
                                lbstate.setFont(f1);
                                lbcity.setFont(f1);
                                lbqualification.setFont(f1);
                                lbspeci.setFont(f1);
                                lblang.setFont(f1);
                                lbhosn.setFont(f1);
                                lbhosl.setFont(f1);
                                lbclin.setFont(f1);
                                lbclinl.setFont(f1);
                                
                                lbuser.setForeground(c1);
                                lbemail.setForeground(c1);
                                lbmobile.setForeground(c1);
                                lbgender.setForeground(c1);
                                lbstatus.setForeground(c1);
                                lbdob.setForeground(c1);
                                lblocation.setForeground(c1);
                                lbaddress.setForeground(c1);
                                lbstate.setForeground(c1);
                                lbcity.setForeground(c1);
                                lbqualification.setForeground(c1);
                                lbspeci.setForeground(c1);
                                lblang.setForeground(c1);
                                lbhosn.setForeground(c1);
                                lbhosl.setForeground(c1);
                                lbclin.setForeground(c1);
                                lbclinl.setForeground(c1);
                                
        
}
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

					// TODO Auto-generated method stub

					// TODO Auto-generated method stub
					int code = e.getKeyCode();	
					//System.out.println(code);
					if(txmobile.getText().length() <=10)
					{
						if(!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9) 
								&& code != KeyEvent.VK_BACK_SPACE 
								&& code != KeyEvent.VK_LEFT 
								&& code != KeyEvent.VK_RIGHT 
								&& code != KeyEvent.VK_DELETE)
							{	
								//e.consume();
								txmobile.setText(trial);
									getToolkit().beep();
							
							}
						trial=txmobile.getText();
				}
					else 
					{
						txmobile.setText(trial);
						getToolkit().beep();
						trial=txmobile.getText();
					}
				
				
				}


}






