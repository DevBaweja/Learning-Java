import java.util.Scanner;

public class Patient {

	private int pid;
	private String name;
	private int age;
	
	void readPatient()
	{
		Scanner sc = new Scanner(System.in);
		this.pid = (int)(Math.random()*100);
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your age");
		age = sc.nextInt();		
	}
}
