import java.util.Scanner;

public class DemoStudentArrayStatic {
	
	
	 
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of Student");
		int n = sc.nextInt();
		StudentStatic []A ; // array ref
		A = new StudentStatic[n]; // n ref of student class
		
		for(int i=0;i<A.length;i++)
		{
			// memory allocation 
			A[i] = new StudentStatic();
			System.out.println();
			System.out.println("Enter"+(i+1)+" Student Details");
			A[i].readStudentStatic();
		}
		
		for(int i=0;i<A.length;i++)
		{
			System.out.println((i+1)+" Student Details");
			A[i].showStudentStatic();
		}		
		
		
		System.out.println("Failures "+StudentStatic.failures(A)); // static function
		
		System.out.println("Topper Record");
		StudentStatic.showTopper(A); // static function
		
		
	// counting number of failures and their records
	// Topper Records
	}
}
