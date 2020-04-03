package ___;

public class SimpleThread extends Thread{

	public SimpleThread(String name) {
		start();
		setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(i+"\t"+getName());
			System.out.println(i);
		}
	}
	
}
