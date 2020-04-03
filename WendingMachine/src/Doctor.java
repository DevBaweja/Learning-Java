import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Doctor {

	private String name;
	private float fee;
	protected boolean leaveInfo;
	protected Queue<Patient> consultationQueue = new LinkedList<Patient>(); // Queue is interface
																	// by default type is String

	private void updateLeaveInfo(boolean leaveInfo) 
	{
		this.leaveInfo = leaveInfo;
	}

	void consult() 
	{
		if (consultationQueue.size() != 0)
			consultationQueue.poll();
		else
			System.out.println("Queue is empty");
	}

	void addPatientToConsultationQueue(Patient P)
	{
		if (leaveInfo)
			consultationQueue.add(P);
		else 
		{
			System.out.println("Redirecting to Special Doctor");
		}
	}

	void readDoctor()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter fees");
		fee = sc.nextFloat();
		System.out.println("Enter leave info");
		this.updateLeaveInfo(sc.nextBoolean());
		
	}

}
