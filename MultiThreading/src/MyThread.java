
public class MyThread extends Thread {

	MyThread() // default constructor 
	{
		// super.start(); we can call Th.start() in main function
	}
	
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(super.getName()+"\t"+i);
		}
		// getname() return current working Thread Name
	}
}
