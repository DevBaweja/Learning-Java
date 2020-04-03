import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Patient_BookingDoctor extends JDialog implements ActionListener,ItemListener{

	// This is JDialog 
	// Called by Patient_Viewdoctorinfo(); // also dispose it
	
	JLabel lbdoc,lbpat,lbslot,lbdate,lbday;
	JTextField txdoctor,txpatient;
	JComboBox chyy,chmm,chdd,chday;
	JRadioButton chmslot,cheslot;
	ButtonGroup time;
	JComboBox cbms,cbme,cbes,cbee;
	JPanel p1,pslot,P,Pdob;
	JPanel pbtn;
	JButton btbook,btcancel;
	String userp;
	String userd; 
	String mstart,mend,estart,eend;
	int f;

	public Patient_BookingDoctor()
	{
		setVisible(true);
		setSize(new Dimension(1000,1000));
		setPreferredSize(new Dimension(1000,1000));
		userp = PatientTabbedBar.userp;
				
			
		// Already login
		userd = Patient_SearchDoctor.userd;
			
		//here should be those who have filled their schedule 
		
		// Doctor whose appointment is to be booked
		
			setLayout(new BorderLayout());
			lbdoc = new JLabel("Doctor Name");
			lbpat = new JLabel("Patient Name");
			lbslot = new JLabel("SLOTS:");
			lbday = new JLabel("DAY:");
			lbdate = new JLabel("DATE:");

			txdoctor = new JTextField();
			txpatient = new JTextField();
			
            chyy = new JComboBox();
            chmm = new JComboBox();
            chdd = new JComboBox();
            

            chyy.addItem("Year");
            for(int i=1981;i<=2000;i++)
            chyy.addItem(i+"");
            
            chmm.addItem("Month");
            for(int i=1;i<=12;i++)
                          chmm.addItem(i+"");
            
            chdd.addItem("Date");
            
            chday = new JComboBox();
            filldays(); // it will fill days
            
            Pdob = new JPanel();
            Pdob.setLayout(new GridLayout(1,3));
            // according to month and year date must change
            Pdob.add(chyy);
            Pdob.add(chmm);
            Pdob.add(chdd);
            
			txdoctor.setText(userd);
			txpatient.setText(userp);

			chmslot = new JRadioButton("Morning time");
			cheslot = new JRadioButton("Evening time");
			
			time = new ButtonGroup();
			time.add(chmslot);
			time.add(cheslot);
			
			cbms = new JComboBox();
			cbme = new JComboBox();
			cbme.setEnabled(false);
			//fillmslottime();
			

			cbes = new JComboBox();
			cbee = new JComboBox();
			cbee.setEnabled(false);
			//filleslottime();

			btbook = new JButton("Confirm Booking");
			btcancel = new JButton("Cancel");
			
			pbtn = new JPanel();
			pbtn.setLayout(new FlowLayout());
			pbtn.add(btbook);
			pbtn.add(btcancel);
					
			p1= new JPanel();
			pslot= new JPanel();
			pslot.add(chmslot);
			pslot.add(cheslot);

			p1.setLayout(new GridLayout(7,2,50,50));
			p1.add(lbdoc);
			p1.add(txdoctor);
			p1.add(lbpat);
			p1.add(txpatient);
			p1.add(lbdate);
			p1.add(Pdob);
			p1.add(lbday);
			p1.add(chday);
			p1.add(lbslot);
			p1.add(pslot);
			p1.add(cbms);
			p1.add(cbes);
			p1.add(cbme);
			p1.add(cbee);
			add(p1,BorderLayout.CENTER);
			add(pbtn,BorderLayout.SOUTH);

			enableevening(false);
			enablemorning(false);
			
			btbook.addActionListener(this);
			btcancel.addActionListener(this);
			
			txdoctor.setEnabled(false);
			txpatient.setEnabled(false);
		
			// slots
			chmslot.addItemListener(this);
			cheslot.addItemListener(this);
			
			chyy.addItemListener(this);
            chmm.addItemListener(this);
            chdd.addItemListener(this);
            
            cbms.addItemListener(this);
            cbes.addItemListener(this);
			style();
			

		}
	public void filldays()
	{
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create database if not exists ManagementDb");
			stmt.execute("Use ManagementDb");
			stmt.executeUpdate("create table if not exists  DoctorscheduleTb(username varchar(100),days  varchar(100),morningtimestart varchar(100),morningtimeend varchar(100),eveningtimestart varchar(100),eveningtimeend varchar(100),primary key(username))");
			
			
			PreparedStatement pstmt = con.prepareStatement("select days from DoctorscheduleTb where username=?");
			pstmt.setString(1, userd);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next(); // as only one doctor is there
			String q = rs.getString("days");
			// getting 01010101
			 String d[] = {":: Days ::","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	            // dont take zero index
			 chday.addItem(d[0]);
			 for(int i=0;i<q.length();i++)
			 {
				 if(q.charAt(i) == '1')
					 chday.addItem(d[i+1]);
			 }

		} catch (ClassNotFoundException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		} catch (SQLException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
	}
		
	}
	public void fillmslottime()
	{
	try {
				
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("create database if not exists ManagementDb");
				stmt.execute("Use ManagementDb");
				stmt.executeUpdate("create table if not exists  DoctorscheduleTb(username varchar(100),days  varchar(100),morningtimestart varchar(100),morningtimeend varchar(100),eveningtimestart varchar(100),eveningtimeend varchar(100),primary key(username))");
				
				
				PreparedStatement pstmt = con.prepareStatement("select morningtimestart,morningtimeend from DoctorscheduleTb where username=?");
				pstmt.setString(1, userd);
				
				ResultSet rs = pstmt.executeQuery();
				
				rs.next(); // as only one doctor is there
				mstart = rs.getString("morningtimestart");
				mend = rs.getString("morningtimeend");
				
				//System.out.println(mstart);
				//System.out.println(mend);
			
				fillmslottimeinterval(); 
				
			} catch (ClassNotFoundException ce) {
				// TODO Auto-generated catch block
				ce.printStackTrace();
			} catch (SQLException ce) {
				// TODO Auto-generated catch block
				ce.printStackTrace();
		}
	}
	
	
	public void fillmslottimeinterval()
	{
		cbms.removeAllItems();
		cbme.removeAllItems();
		
		for(int i=6;i<=12;i++) 
		{	
			if(i<=9)
				cbms.addItem("0"+i+":00 AM");
			
			else 
				cbms.addItem(i+":00 AM");
		}
		
		cbms.addItem("01:00 PM");
		// fill all the entries of chms
		
		while(true)
		{
			
			if(!cbms.getItemAt(cbms.getItemCount()-1).equals(mend))
				cbms.removeItemAt(cbms.getItemCount()-1);
			else 
				break;
		}
		
		while(true)
		{
			if(!cbms.getItemAt(0).equals(mstart))
				cbms.removeItemAt(0);
			else
			break;
		}
		
		cbms.removeItemAt(cbms.getItemCount()-1);
		cbme.addItem(cbms.getItemAt(1).toString());
	
	}
	
	public void filleslottime()
	{
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create database if not exists ManagementDb");
			stmt.execute("Use ManagementDb");
			stmt.executeUpdate("create table if not exists  DoctorscheduleTb(username varchar(100),days  varchar(100),morningtimestart varchar(100),morningtimeend varchar(100),eveningtimestart varchar(100),eveningtimeend varchar(100),primary key(username))");
			
			
			PreparedStatement pstmt = con.prepareStatement("select eveningtimestart,eveningtimeend from DoctorscheduleTb where username=?");
			pstmt.setString(1, userd);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next(); // as only one doctor is there
			estart = rs.getString("eveningtimestart");
			eend = rs.getString("eveningtimeend");
			
			
			//System.out.println(estart);
			//System.out.println(eend);
			
			filleslottimeinterval();
			
		} catch (ClassNotFoundException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		} catch (SQLException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
	}	
	}
	
	public void filleslottimeinterval()
	{
		cbes.removeAllItems();
		cbee.removeAllItems();
		
		
		for(int i=2;i<=9;i++) 
			cbes.addItem("0"+i+":00 PM");	
		cbes.addItem("10:00 PM");
		// filling all entries of ches
		
		while(true)
		{
			if(!cbes.getItemAt(cbes.getItemCount()-1).equals(eend))
				cbes.removeItemAt(cbes.getItemCount()-1);
			else 
				break;
		}
		
		while(true)
		{
			if(!cbes.getItemAt(0).equals(estart))
				cbes.removeItemAt(0);
			else
			break;
		}
		
		
		cbes.removeItemAt(cbes.getItemCount()-1);
		cbee.addItem(cbes.getItemAt(1).toString());
	}
	
		public void enablemorning(boolean status)
		{
			cbms.setVisible(status);
			cbme.setVisible(status);
		}
		public void enableevening(boolean status)
		{
			cbes.setVisible(status);
			cbee.setVisible(status);
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
			Border h = BorderFactory.createTitledBorder(loweredbevel,":: BOOK YOUR DOCTOR ::", TitledBorder.CENTER , TitledBorder.TOP ,f2,Color.red);
			Border k = BorderFactory.createMatteBorder(0,10,0,0,Color.red);
			p1.setBorder(BorderFactory.createCompoundBorder(h, k));

			lbdoc.setForeground(c1);
			lbpat.setForeground(c1);
			lbslot.setForeground(c1);
			lbday.setForeground(c1);
			lbdate.setForeground(c1);
			txdoctor.setForeground(c1);
			txpatient.setForeground(c1);
			
			btbook.setForeground(c1);
			btcancel.setForeground(c1);

			Font f = new Font("comic sans",Font.BOLD,25);
			lbdoc.setFont(f);
			lbpat.setFont(f);
			lbday.setFont(f1);
			lbdate.setFont(f1);
			lbslot.setFont(f1);
			txdoctor.setFont(f1);
			txpatient.setFont(f1);
		

		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object src = e.getSource();
					if(src == btbook)
					{
						if(chyy.getSelectedIndex()==0
								|| chmm.getSelectedIndex()==0
								|| chdd.getSelectedIndex()==0
								|| chday.getSelectedIndex() == 0 
								|| !(chmslot.isSelected() || cheslot.isSelected())
								)
								JOptionPane.showMessageDialog(null, "Kindly fill all the entries of the form", "Form Unfilled", JOptionPane.ERROR_MESSAGE);
						else {
							bookdoctor();
							this.dispose();
						}
					}
					else if(src == btcancel)
					{
						
						this.dispose();
					}
		}
		
		public void bookdoctor()
		{
		
			 try {
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
					Statement stmt = con.createStatement();
					stmt.executeUpdate("create database if not exists ManagementDb");
					stmt.execute("Use ManagementDb");
					stmt.executeUpdate("create table if not exists  dr"+userd+"Tb( patient varchar(100),"
							+ "dob date ,"
							+ "day varchar(100),"
							+ "slot varchar(100),"
							+ "timestart varchar(100),"
							+ "timeend varchar(100),"
							+ "frequency int,"
							+ "rating int,"
							+ "primary key(patient))");
					
					
					// finding if he has already booked an appointment before
					PreparedStatement prstmt = con.prepareStatement("select count(*) from dr"+userd+"Tb where patient=?");
					prstmt.setString(1, txpatient.getText());
					ResultSet rs = prstmt.executeQuery();
					
					rs.next();
					int c = rs.getInt(1);
					 if(c==0) // no booking before is set
						{
							PreparedStatement pres = con.prepareStatement("insert into dr"+userd+"Tb values(?,?,?,?,?,?,?,?)");
					
							pres.setString(1,txpatient.getText());
							
							int yy = Integer.parseInt(chyy.getSelectedItem().toString());
								int mm = Integer.parseInt(chmm.getSelectedItem().toString());
								int dd = Integer.parseInt(chdd.getSelectedItem().toString());
								Date dob = new Date(yy-1900, mm-1 , dd);
										/*
										 * year the year minus 1900; must be 0 to 8099. (Note that8099 is 9999 minus 1900.)
										 * month 0 to 11
										 * day 1 to 31
										 */
								
								pres.setDate(2, dob);
			
							pres.setString(3,chday.getSelectedItem().toString());
					
							String x = "";
							if(chmslot.isSelected())
								x = "Morning";
							else if(cheslot.isSelected())
								x= "Evening";
							
							pres.setString(4,x);
							
							if(x.equalsIgnoreCase("Morning"))
							{
								pres.setString(5,cbms.getSelectedItem().toString());
								pres.setString(6,cbme.getSelectedItem().toString());
							}
							else if(x.equalsIgnoreCase("Evening"))
							{
								pres.setString(5,cbes.getSelectedItem().toString());
								pres.setString(6,cbee.getSelectedItem().toString());
							}
							pres.setInt(7, 1); // as its patient first time 
							pres.setInt(8, -1); // at first appointment no rating is done
								pres.executeUpdate();
							JOptionPane.showMessageDialog(null, "You have booked appointment for dr "+userd+"","Thanks for Booking", JOptionPane.PLAIN_MESSAGE);
								// first booking of that patient
							int app;
							int pat;
							
								PreparedStatement premain = con.prepareStatement("select patient,appointment from DoctorFinalTb where username=?");
								premain.setString(1,userd);
								ResultSet rremain = premain.executeQuery();
								
								rremain.next();
								 pat = rremain.getInt("patient");
								 app = rremain.getInt("appointment"); 
								
							// if previously rated
							PreparedStatement p = con.prepareStatement("update DoctorFinalTb set patient=?,appointment=? where username=?");
							p.setString(3,userd);
							p.setInt(1,pat+1);
							p.setInt(2,app+1);
							p.executeUpdate();
						} 
					 else
					if(c==1) // already booked before need to update as it will contain that 1 patient
					{
						// getting booking time
						// updating frequency and rating 
						PreparedStatement p = con.prepareStatement("select frequency from dr"+userd+"Tb where patient=?");
						p.setString(1, txpatient.getText());
						ResultSet r = p.executeQuery();
						r.next();
						f = r.getInt("frequency"); // for total appointment
						
						JOptionPane.showMessageDialog(null, "You have booked appointment for dr "+userd+" "+f+" times before","Thanks for Booking Again", JOptionPane.PLAIN_MESSAGE);
						
						Object s[] = {"0","1","2","3","4","5"};
						
                        Object doc = JOptionPane.showInputDialog(null, "Please rate dr "+userd+" based upon your previous meeting","Rating Previous Meeting", JOptionPane.QUESTION_MESSAGE,null,s, 0);
                        int rate;
                        if(doc != null)
                        {
                        	rate = Integer.parseInt(doc.toString());
                        }
                        else 
                        	rate = -1; // if pressed cancel
                        // dont press cancel
                     
						f++; // increasing frequency
					
						PreparedStatement pres = con.prepareStatement("update dr"+userd+"Tb set dob=?,day=?,slot=?,timestart=?,timeend=?,frequency=?,rating=? where patient=?");
						pres.setString(8,txpatient.getText());
						
						pres.setInt(6, f); // setting new frequency
						
						
						
						int yy = Integer.parseInt(chyy.getSelectedItem().toString());
							int mm = Integer.parseInt(chmm.getSelectedItem().toString());
							int dd = Integer.parseInt(chdd.getSelectedItem().toString());
							Date dob = new Date(yy-1900, mm-1 , dd);
									/*
									 * year the year minus 1900; must be 0 to 8099. (Note that8099 is 9999 minus 1900.)
									 * month 0 to 11
									 * day 1 to 31
									 */
							
							pres.setDate(1, dob);
		
						pres.setString(2,chday.getSelectedItem().toString());
				
						String x = "";
						if(chmslot.isSelected())
							x = "Morning";
						else if(cheslot.isSelected())
							x= "Evening";
						
						if(rate!= -1) // change it
							pres.setInt(7,rate);
							
						else // remain it
						{
							PreparedStatement prerate = con.prepareStatement("select rating from dr"+userd+"Tb where patient=?");
									prerate.setString(1,txpatient.getText());
							ResultSet rsetprerate = prerate.executeQuery();
							rsetprerate.next();
							int rpre = rsetprerate.getInt(1);
			
									pres.setInt(7,rpre);
						} 
							
						pres.setString(3,x);
						
						if(x.equalsIgnoreCase("Morning"))
						{
							pres.setString(4,cbms.getSelectedItem().toString());
							pres.setString(5,cbme.getSelectedItem().toString());
						}
						else if(x.equalsIgnoreCase("Evening"))
						{
							pres.setString(4,cbes.getSelectedItem().toString());
							pres.setString(5,cbee.getSelectedItem().toString());
						}
						
							pres.executeUpdate();
							
							 
							updatefinaltable(); // in doctorfinaltb
					}
					else
							con.close();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				}
		}
		
		// final rating will be from that all rating
		// final appointment is from frequency
		public void updatefinaltable()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("create database if not exists ManagementDb");
				stmt.execute("Use ManagementDb");
				
				// for final rating
				PreparedStatement prate = con.prepareStatement("select rating from dr"+userd+"Tb");
				ResultSet rrate = prate.executeQuery();
				int no = 0;
				float finalrate = 0;
				while(rrate.next())
				{
					
					int rone = (rrate.getInt(1));
					if(rone!=-1)
						{
							finalrate += rone;
							no++;
						}
				}

				float avgsum =  (float)(finalrate/no);
				DecimalFormat df = new DecimalFormat("0.0");
				
				// for final appoint
				PreparedStatement pappoint = con.prepareStatement("select frequency from dr"+userd+"Tb");
				ResultSet rappoint = pappoint.executeQuery();
				int finalappoint = 0;
				while(rappoint.next())
				{
					int rone = (rappoint.getInt(1));
							finalappoint += rone;
				}
				
				// for final patient
				PreparedStatement prstmt = con.prepareStatement("select count(*) from dr"+userd+"Tb");
				ResultSet rs = prstmt.executeQuery();
				rs.next();
				int finalpatient = rs.getInt(1);
				
				PreparedStatement p = con.prepareStatement("update DoctorFinalTb set patient=?,appointment=?,rating=? where username=?");
				
						p.setString(4,userd);
						p.setFloat(3,Float.parseFloat(df.format(avgsum)));
						p.setInt(2,finalappoint);
						p.setInt(1,finalpatient);
						p.executeUpdate();
				
				con.close();
			} catch (ClassNotFoundException ce) {
				// TODO Auto-generated catch block
				ce.printStackTrace();
			} catch (SQLException ce) {
				// TODO Auto-generated catch block
				ce.printStackTrace();
		}	
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			Object src = e.getSource();
			if( e.getStateChange() ==  ItemEvent.SELECTED)
			{
			
					if(src == chyy || src == chmm)
					{
						chdd.removeItemListener(this);
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
					   chdd.addItemListener(this);
					   
					}
					   else if(src == chdd)
					   {
						   // filling day
					   }
					
					   else if(src == chmslot)
					   {
						   cbms.removeItemListener(this);
						   enablemorning(true);
						   enableevening(false);
						   fillmslottime();
						   cbms.addItemListener(this);
					   }
					   else if(src == cheslot)
					   {
						   cbes.removeItemListener(this);
						   enableevening(true);
						   enablemorning(false);
						   filleslottime();
						   cbes.addItemListener(this);
					   }
					   else if(src == cbms)
					   {
						   cbme.removeAllItems();
						   if(cbms.getSelectedIndex() == cbms.getItemCount()-1)
						      cbme.addItem(mend);
						   else
							   cbme.addItem((cbms.getItemAt(cbms.getSelectedIndex()+1)).toString());
						   
					   }
					   else if(src == cbes)
					   {
						   cbee.removeAllItems();
						   if(cbes.getSelectedIndex() == cbes.getItemCount()-1)
							   cbee.addItem(eend);
						   else
							   cbee.addItem((cbes.getItemAt(cbes.getSelectedIndex()+1)).toString());
						
					   }
			}
		}
}

