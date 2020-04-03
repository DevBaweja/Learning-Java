
public class PrimeCustomer extends Customer {

	PrimeCustomer() {
		// TODO Auto-generated constructor stub
	}
	PrimeCustomer(String cname,String cpass,int cage,char cgender)
	{
		super(cname,cpass,cage,cgender,true);
		System.out.println("Prime");
	}
}
