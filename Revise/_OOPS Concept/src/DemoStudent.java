import java.util.Scanner;

public class DemoStudent {

	public static void main(String[] args) {
		
		Student S = new Student(); // Default
		// here default constructor 
		S.readStudent();
		// here calculate will also be called as indirect way of calling that private function in that class
		S.showStudent();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no");
		int r = sc.nextInt();
		int m[] = new int[3];
		for(int i=0;i<m.length;i++)
			{
				System.out.println("enter "+(i+1)+" marks");
				m[i] = sc.nextInt();
			}
		
		Student Q = new Student(r,m);
		// parametric constructor is called with calculate function
		Q.showStudent();
		
		Student R = new Student(Q);
		// copy constructor will copy all its data without calling calculate function
		R.showStudent();
		
	

	}

}
