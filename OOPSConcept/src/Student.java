import java.util.Scanner;

public class Student {

	private int rollno,total;
	private int marks[] = new int[3]; // array
	private float percent;
	private boolean status ;
	private void calculateStudent()
	{
		int t=0 ; 
		for(int i=0;i<marks.length;i++)
		t += marks[i];
		total = t ; // total marks
		percent = (float)t/marks.length; // total marks / number of subjects
		if(percent>=30)
		{
			status = true;
		}
	}
	
	
	void readStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll number");
		rollno = sc.nextInt();
		 // array
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter "+(i+1)+" subject marks");
			marks[i] = sc.nextInt();
		}
		
		calculateStudent();
	}
	

	void resultStudent()
	{
		System.out.println("roll no : "+rollno);
		System.out.println("marks in each subject");
		for(int i=0;i<marks.length;i++)
			System.out.print(marks[i]+"\t");
		System.out.println();
		System.out.println("total :"+total);
		System.out.println("percent :"+percent);
		
		if(status)
		System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
	
	// constructors
	Student()
	{
		rollno = 0 ; 
		total = 0;
		percent = 0;
		status = false;
	}
	
	Student(int rollno,int[] marks) // parametric constructor
	{
		this.rollno = rollno;
		for(int i= 0;i<marks.length;i++)
		this.marks[i] = marks[i];
		// here we can use reference
		// this.marks = marks ;
		// it will not effect original marks ref due to functional scope 
		calculateStudent();
	}
	
	Student(Student S) // copy
	{
		rollno = S.rollno;
		for(int i=0;i<marks.length;i++)
			marks[i] = S.marks[i];
		// marks = S.marks;
		total = S.total;
		percent = S.percent;
		status = S.status;
	}

	
}
