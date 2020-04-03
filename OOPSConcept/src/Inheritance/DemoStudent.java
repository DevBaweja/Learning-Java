package Inheritance;

import java.util.Scanner;

public class DemoStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student S = new Student();
		S.readStudent();
		S.showStudent();
		
		System.out.println("enter number of students");
		int n = sc.nextInt();
		
		// creating references arrays
		Student A[] = new Student[n];
		for(int i =0; i<A.length;i++)
		{
			System.out.println("enter details of "+(i+1)+" Student");
			A[i].readStudent();
		}
		
		for(int i=0;i<A.length;i++)
		{
			A[i].showStudent();
		}

	}

}
