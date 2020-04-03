
public class DemoThreadDaemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread Th1 = new ThreadDaemon("First");
		Thread Th2 = new ThreadDaemon("Second");
		// Non-daemon thread will stop main from killing the main thread
		
		// daemon thread are thread which are killed if main kill itself
	}

}
