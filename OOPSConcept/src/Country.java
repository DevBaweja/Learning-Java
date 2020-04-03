import java.util.Scanner;

public class Country extends State {

	private String name,capital,PM;
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("enter country name");
			name = sc.next();
			System.out.println("enter country capital");
			capital = sc.next();
			System.out.println("enter country PM");
			PM = sc.next();
			super.readData();
	}
	
	void showData()
	{
		
		System.out.println("country name : "+name);
		System.out.println("country capital : "+capital);
		System.out.println("country PM : "+PM);
		super.showData();
		
	}
	// constructor
	Country()
	{
		name = null;
		capital = null;
		PM = null;
	}
	
	Country(String name,String capital,String PM,String sname,String scapital,String sCM,String dname,int pincode )
	{
		super(sname,scapital,sCM,dname,pincode);
		this.name = name;
		this.capital = capital;
		this.PM = PM;
	}
	
	Country(Country S)
	{
		super(S);
		name = S.name; 
		capital = S.capital;
		PM = S.PM;
	}
	

}
