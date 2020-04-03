
public class MyFirstRunnable implements Runnable {
	// interface Runnable
	
	Thread Th;
	
	MyFirstRunnable(String nm)
	{
		Th = new Thread(this,nm);
		Th.start();
	}
	

	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Th.getName()+"\t"+i);
		}
	}
	


}
