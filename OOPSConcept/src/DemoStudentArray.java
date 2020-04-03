import java.util.Scanner;

public class DemoStudentArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers of student");
		int n = sc.nextInt();
		Student S[] = new Student[n]; // creating and giving memory array of datatype Student
		
		for(int i=0; i<n ;i++)
		{
			S[i] = new Student();   // giving memory
			System.out.println("reading "+(i+1)+" student");
			S[i].readStudent();
		}
		
		System.out.println("Results");
		
		for(int i=0; i<n ;i++)
		S[i].resultStudent();

	}

}
