package pack2;

import pack1.IORead;

public class DemoIORead {

	public static void main(String[] args) {
		
			IORead in = new IORead();

			System.out.println("enter name");
			String name = in.next();
			System.out.println("name is: "+name);
			
			System.out.println("enter age");
			 int age = in.nextInt();
			 System.out.println("Age is: "+age);
			 
				
			System.out.println("enter salary");
			float salary = in.nextFloat();
			System.out.println("Salary: "+salary);
	}

}
