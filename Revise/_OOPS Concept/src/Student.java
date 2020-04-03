import java.util.Scanner;

public class Student {
	// Static are not made for every one only once
	private int rollno;
	private int marks[] = new int[3]; // Memory is allocated here
	// in c++ we cannot allocate it 
	private float total,percent;
	private Boolean status;
	
	private void calculateStudent()
	{
		total = 0 ;
		for(int i=0;i<marks.length;i++)
			total += marks[i];
		percent = total/3;
		if( percent > 33.33)
			status = true;
		else 
			status = false;
		
	}
	
	void readStudent()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter roll no");
		rollno = sc.nextInt();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter "+(i+1)+" subject marks");
			marks[i] = sc.nextInt();
		}
		calculateStudent(); // read and calculate both
	}
	
	void showStudent()
	{
		System.out.println("rollno: "+rollno);
		for(int i=0;i<marks.length;i++)
		System.out.println("Marks of "+(i+1)+" is "+marks[i]);
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percent);
		if(status)
			System.out.println("Status: PASS");
		else 
			System.out.println("Status: FAIL");
		System.out.println();
	}
	
	// Constructor
	Student() // default
	{
		rollno=0;
		for(int i=0;i<marks.length;i++)
		marks[i]=0; // no need as java already make array initialise to zero
		total = 0.0f;
		percent = 0.0f; // here we need to write f to make it float otherwise it is double
		status = true;
		
	}
	
	Student(int rollno,int marks[])
	{
		this.rollno = rollno;
		this.marks = marks ;
				// local array
		calculateStudent(); // to fill other details
	}
	
	
	Student(Student S) // copy
	{
		rollno = S.rollno;
		marks = S.marks; // it will not effect original as functions create its local object S
		total = S.total;
		percent = S.percent;
		status = S.status;
	}
	
	
	// Advance Checking
	 Boolean showStatus()
	 {
		 return status; 
		 // it will return that current status of that student 
	 }
	 
	 float checkTop()
	 {
		 return percent;
	 }
	 


}
