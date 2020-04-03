package Inheritance;

import java.util.Scanner;

public class Student extends Person implements Academics,Sports {
	// name,age,address from Person base class
	private int rollno;
	private float percent;
	private String sportname,sporttype;
	
	Scanner sc = new Scanner(System.in);
public void readAcademics() {
	System.out.println("enter roll no.");
	rollno = sc.nextInt();
	System.out.println("enter percentage");
	percent = sc.nextFloat();
}


public void showAcademics() {
	// roll no
	System.out.println("roll no: "+rollno);
	// percent
	System.out.println("Percentage: "+percent);
	// Academics.college from Academics interface
	System.out.println("College: "+Academics.college);
	
}



public void readSports() {
	// sportname
	System.out.println("enter Sportname");
	sportname = sc.next();
	// sporttype
	System.out.println("enter Sporttype");
	sporttype = sc.next();
}


public void showSports() {
	// sportname
	System.out.println("Sportname: "+sportname);
	// sporttype
	System.out.println("Sporttype: "+sporttype);
}

public void readStudent()
{
	// all functions
	super.readPerson(); // from person class
	readAcademics();
	readSports();
	
}

public void showStudent()
{
	// all functions
	super.showPerson();
	showAcademics();
	showSports();
}

// constructors
Student()
{
	rollno=0;
	percent=0;
	sportname= null;
	sporttype= null;
}

Student(String name,int age,String address,int rollno,float percent,String sportname, String sporttype)
{
	super(name,age,address); // it will go to person base class
	this.rollno = rollno;
	this.percent = percent;
	this.sportname = sportname;
	this.sporttype = sporttype;
	
}



Student(Student S)
{
	super(S); // it will go to person base class
	rollno = S.rollno;
	percent = S.percent;
	sportname = S.sportname;
	sporttype = S.sporttype;
}


}