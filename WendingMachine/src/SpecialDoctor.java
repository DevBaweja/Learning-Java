import java.util.LinkedList;
import java.util.Queue;

public class SpecialDoctor extends Doctor {

	private Queue<Patient> followUpQueue = new LinkedList<Patient>();
	
	private void addPatientToFollowUpQueue(Patient P)
	{	
		// doctor is on leave
		followUpQueue.add(P);
	}
	
	void addPatientToConsultationQueue(Patient P)
	{
		if (leaveInfo)
			consultationQueue.add(P);
		else 
			{
				System.out.println("Book Later, You have been added to follow up queue");
				this.addPatientToConsultationQueue(P);
			}
	}
}

