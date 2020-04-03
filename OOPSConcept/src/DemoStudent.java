
public class DemoStudent {

	public static void main(String[] args) {
		
		Student A = new Student(); // dymanic allocation
		System.out.println("For Student A");
		A.readStudent();
		A.resultStudent();
		Student B = new Student(); // Default constructor
		System.out.println("Default Constructor for Student B");
		B.resultStudent();
		
		int marks[] = {54,65,85};
		int rollno = 100;
		Student C = new Student(rollno,marks); // parametric constructor
		System.out.println("for Student C");
		C.resultStudent();
		
		Student D = new Student(A); // copy constructor passing object
		D.resultStudent();

	}

}
