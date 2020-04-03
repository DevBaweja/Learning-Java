
public class MyFirstRunnable implements Runnable{

	Thread Th; 
	public  MyFirstRunnable(String name) 
	{
		
		Th = new Thread(this); // memory allocation
		// this is for runnable class interface object as passing argument 
		Th.setName(name); // parametric constructor
		Th.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
			{
			System.out.println(Th.getName()+"\t"+i);
			
			 try {
				Th.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}

}
