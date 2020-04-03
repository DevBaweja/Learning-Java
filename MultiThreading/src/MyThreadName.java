
public class MyThreadName extends Thread {

	MyThreadName() // constructor
	{
		// super.start(); calling of run method ie Thread class method
	}
	
	
	MyThreadName(String name) // parametric constructor
	{
		super.setName(name);
		// super.start();
	}
	
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(super.getName()+"\t"+(i+1));
		}
		// getname() return current working Thread Name
	}
	
	

}
