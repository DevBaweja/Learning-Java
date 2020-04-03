import java.util.Scanner;

public class DemoStudentArray {
	
	
	 
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of Student");
		int n = sc.nextInt();
		Student []A ; // array ref
		A = new Student[n]; // n ref of student class
		
		for(int i=0;i<A.length;i++)
		{
			// memory allocation 
			A[i] = new Student();
			System.out.println();
			System.out.println("Enter"+(i+1)+" Student Details");
			A[i].readStudent();
		}
		
		for(int i=0;i<A.length;i++)
		{
			System.out.println((i+1)+" Student Details");
			A[i].showStudent();
		}		
		
		
		Boolean check[] = new Boolean[A.length]; // initial false
		
		// Ques1 ALSO BY MAKING AN STATIC variable in that class count
		// and static function 
		
		// Ques2 Passing array as whole
		/*
		 * static int failures(Stduent []S)
		 * {
		 * 	int c=0;
		 * for()
		 * 	{
		 * 		if(!S[i].showStatus)
		 * 				c++;
		 * 	}
		 * return c;
		 * }
		 * 
		 */
		int count=0;
		for(int i=0;i<A.length;i++)
		{
		    if(!A[i].showStatus()) // Ques3 if return type is String
		    		{
		    			count++; // fail
		    			check[i] = false;
		    		}
		    else
		    	check[i] = true; // pass
		}
		System.out.println("Total Failures: "+count);
		System.out.println();
		
		 
		 for(int i=0;i<A.length;i++)
		 {
			 if(!check[i])
				 A[i].showStudent();
		 }
			 
			 	 
				int t = 0 ;// Let First Student Topper
				 
				 for(int i=1;i<A.length;i++)
				{
					 if(A[t].checkTop() < A[i].checkTop())
						 t=i;
				} 
				 System.out.println("Topper Record:");
				 A[t].showStudent();
		
	// counting number of failures and their records
	// Topper Records
	}
}
