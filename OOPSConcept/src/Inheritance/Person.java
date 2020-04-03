package Inheritance;
import java.util.Scanner;


	public class Person {
		private String name; 
		private int age;
		private String address;
		 
			void readPerson() // here not static as method is called by objects
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter name");
				name = sc.next(); // read single word
				System.out.println("enter age");
				age = sc.nextInt();
				System.out.println("enter address");
				address = sc.next();
			}
			void showPerson()
			{
				System.out.println("name = "+name);
				System.out.println("age = "+age);
				System.out.println("address = "+address);
			}
			
			// default constructor
			Person()
			{
				name = null;
				age =0;
				address = null ;
			}
			// parameteric
			Person(String name,int age,String address)
			{	
				this.name = name;
				this.age = age;
				this.address = address;
			}
			
			Person(Person P) // no need of & in java
			{
				name = P.name;
				address = P.address;
				age = P.age;
			}
			
					

	}


