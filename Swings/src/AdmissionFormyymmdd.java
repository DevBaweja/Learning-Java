

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdmissionFormyymmdd extends JApplet implements ActionListener,ItemListener{
	
	JLabel lbcname,lbfname;
	JLabel lbgender,lbdob,lbaddress;
	JLabel lbdegree,lbdegreefee,lbfac,lbfacfee,lbtotalfee;
	JButton btcal,btrec,btrefresh,btclose;
	JTextField txcname,txfname,txdegreefee,txfacfee,txtotalfee;
	JTextArea taddress;
	Panel Pgender,Pdob,Pfac,Pbutton1,Pbutton2;
	JCheckBox ckmess,ckhostel,ckbus;
	JRadioButton ckmale,ckfemale,ckhidden;
	ButtonGroup gr;
	JComboBox chyy,chmm,chdd,chdegree;
	int ffees,dfees;
	JScrollPane jsp;
	JPanel P;
		
	public void init()
	{


		lbcname = new JLabel("Candidate Name");
		lbfname = new JLabel("Father Name");
		
		lbgender = new JLabel("Gender");
		gr = new ButtonGroup();
		ckmale = new JRadioButton("Male");
		ckfemale = new JRadioButton("Female");
		ckhidden = new JRadioButton("Hidden"); // dont add this
		gr.add(ckmale);
		gr.add(ckfemale);
		gr.add(ckhidden);
		
		lbdob =  new JLabel("DOB");
		
		chyy = new JComboBox();
		chmm = new JComboBox();
		chdd = new JComboBox();
		
		lbaddress = new JLabel("Address");
		lbdegree = new JLabel("Degree");
		
		chdegree = new JComboBox();
		
		lbdegreefee = new JLabel("Degree Fee");
		lbfac = new JLabel("Facility");
		lbfacfee = new JLabel("Facility Fee");
		lbtotalfee = new JLabel("Total Fee");
		
		btcal = new JButton("Calculate");
		btrec = new JButton("Receipt");
		btrefresh= new JButton("Refresh");
		btclose = new JButton("Close");
		
		txcname = new JTextField();   
		txfname = new JTextField();
		txdegreefee = new JTextField();
		txfacfee = new JTextField(); 
		txtotalfee = new JTextField();
		txdegreefee.setEnabled(false);
		txfacfee.setEnabled(false);
		txtotalfee.setEnabled(false);
		
		taddress = new JTextArea();
		
		ckmess = new JCheckBox("Mess");
		ckhostel = new JCheckBox("Hostel");
		ckbus = new JCheckBox("Bus");		
		
	
		print();
		
		chdegree.addItemListener(this);
		
		ckmess.addItemListener(this);
		ckhostel.addItemListener(this);
		ckbus.addItemListener(this);
		
		chyy.addItemListener(this);
		chmm.addItemListener(this);
		
		btcal.addActionListener(this);
		btrec.addActionListener(this);
		btrefresh.addActionListener(this);
		btclose.addActionListener(this);
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
		
		chdegree.addItem("Select Degree");
		chdegree.addItem("Btech");
		chdegree.addItem("Mtech");
		chdegree.addItem("PG");
		chdegree.addItem("UG");
		
		Pgender = new Panel();
		Pgender.setLayout(new GridLayout(1, 2));
		Pdob = new Panel();
		Pdob.setLayout(new GridLayout(1, 3));
		Pfac = new Panel();
		Pfac.setLayout(new GridLayout(1, 3));
		Pbutton1 = new Panel();
		Pbutton1.setLayout(new GridLayout(1, 2));
		Pbutton2 = new Panel();
		Pbutton2.setLayout(new GridLayout(1, 2));
		
		Pgender.add(ckmale);
		Pgender.add(ckfemale);
		// dont add this hidden check box
		
		Pdob.add(chyy);
		Pdob.add(chmm);
		Pdob.add(chdd);
		
		Pfac.add(ckmess);
		Pfac.add(ckhostel);
		Pfac.add(ckbus);
		
		Pbutton1.add(btcal);
		Pbutton1.add(btrec);
		Pbutton2.add(btrefresh);
		Pbutton2.add(btclose);
		
		
		setLayout(new GridLayout(11,2));
		add(lbcname);
		add(txcname);
		add(lbfname);
		add(txfname);
		add(lbgender);
		add(Pgender);
		add(lbdob);
		add(Pdob);
		add(lbaddress);
		add(taddress);
		add(lbdegree);
		add(chdegree);
		add(lbdegreefee);
		add(txdegreefee);
		add(lbfac);
		add(Pfac);
		add(lbfacfee);
		add(txfacfee);
		add(lbtotalfee);
		add(txtotalfee);
		add(Pbutton1);
		add(Pbutton2);
	
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		
		
		Object src = ie.getSource();
		
		// only degree fee
		if(src == chdegree)
		{
		dfees=0;
		int a = chdegree.getSelectedIndex();
		switch(a)
		{
		case 1:{// Btech
					dfees = 60000;
					break;
				}
		case 2:{//Mtech
					dfees = 	80000;
					break;
				}
		case 3:{//PG
					dfees = 30000;
					break;
				}
		case 4:{//UG
					dfees = 40000;
					break;
				}
		}
		
		txdegreefee.setText(dfees+"");
		}
		else 
		{
		ffees=0;
		if(ckmess.isSelected())
		{
			ffees += 9000;
		}
		if(ckhostel.isSelected())
		{
			ffees += 20000;
		}
		if(ckbus.isSelected())
		{
			ffees += 14000;
		}
		
		txfacfee.setText(ffees+"");

		}
		txtotalfee.setText((dfees+ffees)+"");
		
	// yymmdd 
		 if(chyy.getSelectedIndex() != 0 && chmm.getSelectedIndex() != 0)
		 {
		
			 
		 int yy = Integer.parseInt( chyy.getSelectedItem().toString() );
		 // in place of chyy.getSelectedItem()
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
		
		if(src == btcal)
		{
			
		}
		else if(src == btrec)
		{
			
		}
		else if(src == btrefresh)
		{
			txcname.setText(" ");
			txfname.setText(" ");
			
			//Radio JButton
			ckhidden.setSelected(true);
			// if it is true then other will automatically will get off
			
			chyy.setSelectedIndex(0);
			chmm.setSelectedIndex(0);
			chdd.setSelectedIndex(0);
			taddress.setText(" ");
			chdegree.setSelectedIndex(0);
			txdegreefee.setText(" ");
			
			
			ckmess.setSelected(false);
			ckhostel.setSelected(false);
			ckbus.setSelected(false);
			
			txfacfee.setText(" ");
			txtotalfee.setText(" ");
			
			
		}
		else 
		{
			System.exit(-1);
		}
	}
	
}
