
public class MyThreadNamePri extends Thread {

	MyThreadNamePri() // constructor
	{
		super.start(); // calling of run method ie Thread class method
	}
	
	
	MyThreadNamePri(String name,int pr) // parametric constructor
	{
		super.setName(name);
		super.setPriority(pr);
		// super(name,pr);
		super.start();
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
