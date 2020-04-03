import java.util.Scanner;

public class State extends District {

	private String name,capital,CM;
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter state name");
			name = sc.next();
			System.out.println("enter state capital");
			capital = sc.next();
			System.out.println("enter state CM");
			CM = sc.next();
			super.readData();
	}
	
	void showData()
	{
		
		System.out.println("state name : "+name);
		System.out.println("state capital : "+capital);
		System.out.println("state CM : "+CM);
		super.showData();
		
	}
	// constructor
	State()
	{
		name = null;
		capital = null;
		CM = null;
	}
	
	State(String name,String capital,String CM,String dname,int pincode)
	{
		super(dname,pincode);
		this.name = name;
		this.capital = capital;
		this.CM = CM;
	}
	
	State(State S)
	{
		super(S);
		name = S.name; 
		capital = S.capital;
		CM = S.CM;
	}
	
	

}
