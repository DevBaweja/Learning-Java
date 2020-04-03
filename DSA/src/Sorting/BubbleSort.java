package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();

		// declaration of array
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++)

		{
			System.out.println("enter " + i + " element");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0;i < a.length ;i++)
		System.out.print(a[i]+"  ");
		System.out.println();
		// Bubble sort
	
			for(int i=0; i<a.length-1 ;i++)
			{
				boolean status = false; // in every iteration making it false
				for(int j=0 ; j<a.length-i-1 ; j++)
				{
					if(a[j]>a[j+1])
					{
						// swap a[j] and a[j+1]
						System.out.println(a[j]+" and "+a[j+1]+" is swapped in "+(i+1)+ " pass ");
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
						status = true;  // swap must occurs
					}
				}
				
				for(int k=0;k<a.length;k++)
					System.out.print(a[k]+"  ");
					System.out.println();
				if(status == false)  //	if swap do not occur then it is already sorted 
									// if in any iteration swap do not occurs status remain false so break loop				
					{
					System.out.println("break at "+(i+1)+" iteration");
					break;
					}
			}
			System.out.println("after sorting");
				for(int i=0; i<a.length ;i++)
				System.out.println(i+" index "+a[i]);				
	
	}

}
