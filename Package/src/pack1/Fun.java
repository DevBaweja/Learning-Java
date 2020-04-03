package pack1;
	
public class Fun {
	
	@SuppressWarnings("unused")
	private void pri_fun()
	{
		System.out.println("private access");
	}
	
	void fri_fun() // default access
	{
		System.out.println("default access");
	}
	
	protected void pro_fun()
	{
		System.out.println("protected access");
	}
	
	// it can be access anywhere
	public void pub_fun()
	{
		System.out.println("public access");
		// pri_fun();
		// here private method can be accessed by accessing this public method
	}
	

}
