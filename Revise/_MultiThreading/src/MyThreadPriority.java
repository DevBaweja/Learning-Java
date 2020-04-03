
public class MyThreadPriority extends Thread{

	public MyThreadPriority(String name,int pr) // making parametric constructor
	{
		super.setName(name);
		super.setPriority(pr);
		// calling of the start of thread
		// which will internally call run method
		super.start();
		// super.setName(name);
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(super.getName()+"\t"+i);
		
		// return name of the thread
	}
	
}
