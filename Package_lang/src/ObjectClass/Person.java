package ObjectClass;


import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	private String address;
	
	void readPerson() 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter address");
		address = sc.next();
	}
	
	void showPerson() 
	{
		// TODO Auto-generated method stub
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	
	Person() 
	{
		// TODO Auto-generated constructor stub
		name = null;
		age = 0;
		address = null;
	}
	
	Person(String name,int age,String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	Person(Person P)
	{
		this.name = P.name;
		this.age = P.age;
		this.address = P.address;
	}
}
