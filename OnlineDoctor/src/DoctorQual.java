import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;

public class DoctorQual extends JPanel{

	// this should not run again
	public DoctorQual()
	{

        
 	   try {
 		
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create database if not exists ManagementDb");
			stmt.execute("Use ManagementDb");
			stmt.executeUpdate("create table if not exists  DoctorqualTb(qualification varchar(150) primary key)");

String s[]= {
					"Bachelor of Medicine(MBBS, BMBS)",
					"Bachelor of Surgery (MBChB, MBBCh)",
					"Doctor of Medicine (MD, Dr.MuD, Dr.Med)",
					"Doctor of Osteopathic Medicine (DO)",
					"Doctor of Medicine by research (MD(Res), DM)",
					"Doctor of Philosophy (PhD, DPhil)",		
					"Master of Clinical Medicine (MCM)",
					"Master of Medical Science (MMSc, MMedSc)",
					"Master of Medicine (MM, MMed)",
					"Master of Philosophy (MPhil)",
					"Master of Surgery (MS, MSurg, MChir, MCh, ChM, CM)",
					"Master of Science in Medicine or Surgery (MSc)",
					"Doctor of Clinical Medicine (DCM)",
					"Doctor of Clinical Surgery (DClinSurg)",
					"Doctor of Medical Science (DMSc, DMedSc)",
					"Doctor of Surgery (DS, DSurg)"
			};
			for(int i=0;i<s.length;i++)
					{
				System.out.println(s[i]);
					PreparedStatement pre = con.prepareStatement("insert into  DoctorqualTb(qualification) values(?)");
						pre.setString(1,s[i].toString());			
						pre.executeUpdate();
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
}
