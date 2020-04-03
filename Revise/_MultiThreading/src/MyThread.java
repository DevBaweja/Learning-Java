
public class MyThread extends Thread{

	public MyThread()
	{
		// calling of the start of thread
		// which will internally call run method
		super.start();
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(super.getName()+"\t"+i);
		
		// return name of the thread
	}
	
}
