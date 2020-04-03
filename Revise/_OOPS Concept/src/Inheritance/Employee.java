package Inheritance;
import java.util.Scanner;

public class Employee extends Person{
	
	private int emp_id; 
	private int salary;
	private String desg;
	 
		void readEmployee() 
		{
			Scanner sc = new Scanner(System.in);
			
			super.readPerson();
			System.out.println("enter emp_id");
			emp_id = sc.nextInt(); 
			System.out.println("enter salary");
			salary = sc.nextInt();
			System.out.println("enter desg");
			desg = sc.next();
		}
		void showEmployee()
		{
			super.showPerson();
			System.out.println("emp_id = "+emp_id);
			System.out.println("salary = "+salary);
			System.out.println("desg = "+desg);
		}
		
		// default constructor
		Employee()
		{
			// super() is called automatically of base class 
			emp_id = 0;
			salary =0;
			desg = null ;
		}
		// parameteric
		Employee(String name,int age,String address,int emp_id,int salary,String desg)
		{	
			super(name,age,address); // will call the parametric constructor of base class
			this.emp_id = 0;
			this.salary = salary;
			this.desg = desg;
		}
		
		Employee(Employee E) // no need of & in java
		{
			super(E); // it will call copy constructor of the base class
					//		Object Slicing
			emp_id = E.emp_id;
			desg = E.desg;
			salary = E.salary;
		}
		
	
}
