import java.util.Scanner;

public class Employee extends Person {
	private int emp_id ; 
	private float sal;
	private String desg;
	 
		void readEmployee() 
		{
			Scanner sc = new Scanner(System.in);
			super.readPerson(); 
			// we can write simply readPerson();
			System.out.println("enter emp_id");
			emp_id = sc.nextInt();
			System.out.println("enter sal");
			sal = sc.nextFloat();
			System.out.println("enter desg");
			desg = sc.next();
		}
		void showEmployee()
		{
			super.showPerson();
			System.out.println("emp_id = "+emp_id);
			System.out.println("sal = "+sal);
			System.out.println("desg = "+desg);
		}
		
		// default constructor
		Employee() // here person name ,age ,address constructor is called itself
		{
			emp_id = 0;
			sal = 0;
			desg = null ;
		}
		// parameteric
		Employee(String name,int age,String address,int emp_id,float sal,String desg)
		{	
			super(name,age,address); // here parametric of person is called
			this.emp_id = emp_id;
			this.sal = sal;
			this.desg = desg;
		}
		
		Employee(Employee E) // no need of & in java
		{
			super(E); // here elements of P employee person is copied to P employee person
			// Object SLicing
			emp_id = E.emp_id;
			sal = E.sal;
			desg = E.desg;
		}
		
				

}