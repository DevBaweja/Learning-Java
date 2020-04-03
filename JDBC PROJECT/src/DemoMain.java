import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c;
	while(true)
	{
			System.out.println("1-Add Customer 2-Add Item 3-Shop Now");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
			{
				 System.out.println("Enter Manager");
				 if(sc.next().equals(Manager.mname) && sc.next().equals(Manager.mpass))
				{
					System.out.println("Enter Customer Type");
					// Creating customerv of required type
					System.out.println("Name Password Age Gender");
					c = sc.nextBoolean() ? 
							new PrimeCustomer(sc.next(),sc.next(),sc.nextInt(),sc.next().charAt(0)) : 
								new NonPrimeCustomer(sc.next(),sc.next(),sc.nextInt(),sc.next().charAt(0));		
				}
				
			}
				break;
			case 2:
			{
				 System.out.println("Enter Manager");
				 if(sc.next().equals(Manager.mname) && sc.next().equals(Manager.mpass))
				{
					 System.out.println("Enter Item");
					 System.out.println("Name Price");
					 Item i = new Item(sc.next(),sc.nextInt());
				}
			}
				break;
			case 3:
			{
				System.out.println("Enter Customer User and Password");
				String cname = sc.next();
				String cpass = sc.next();
				System.out.println(Manager.isValid(cname,cpass) ? "You are logged in" : "Incorrect User");
			}
				break;
			default:
				System.out.println("Choose wisely");
				break;
			}
			
		}
	}
}
