package pack2;

import pack1.IORead;

public class DemoIORead{

	public static void main(String[] args) {
		
		IORead input = new IORead();
		
		System.out.println("Enter age");
		int age = input.readInt();
		System.out.println("Age : "+age);
		
		System.out.println("Enter salary");
		float salary = input.readFloat();
		System.out.println("salary : "+salary);
		
		System.out.println("Enter name");
		String name = input.readString();
		System.out.println("name : "+name);
		

	}

}
