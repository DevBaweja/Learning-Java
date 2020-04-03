
public class NonPrimeCustomer extends Customer{

	NonPrimeCustomer() {
		// TODO Auto-generated constructor stub
	}
	NonPrimeCustomer(String cname,String cpass,int cage,char cgender)
	{
		super(cname,cpass,cage,cgender,false);
		System.out.println("Non Prime");
	}
}
