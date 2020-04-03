import java.util.Scanner;

public class District {

	private String name;
	private int pincode;
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter district name");
			name = sc.next();
			System.out.println("enter district pin code");
			pincode = sc.nextInt();
	}
	
	void showData()
	{
		System.out.println("district name : "+name);
		System.out.println("district pincode : "+pincode);
		
	}
	// constructor
	District()
	{
		name = null;
		pincode = 0000;
	}
	
	District(String name,int pincode)
	{
		this.name = name;
		this.pincode = pincode;
	}
	
	District (District D)
	{
		name = D.name; 
		pincode = D.pincode;
	}
	
}
