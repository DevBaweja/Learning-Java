import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int givenmin[] = {-1,-1,1,7,4,2,0,8}; // for min
		 ArrayList<Integer> finalmin = new ArrayList<Integer>();
		 ArrayList<Integer> finalmax = new ArrayList<Integer>();
		 int t = sc.nextInt();
		 while(t-->0)
		 {
			 int unit = sc.nextInt();
			 for (int j = 7; j >=2 ; ) // for min 
			 {
				 if(unit-j>=0 && unit-j!=1) // should not be equal to 1 mapping is impossible 
				 {
					 unit -= j;
					 finalmin.add(givenmin[j]);

					 // last condition
					 if(unit==0)
						 break;
				 }
				 else
					 j--;
			}
			Collections.sort(finalmin); 
			if(finalmin.get(0)==0)
				{
					finalmin.remove(0);
					finalmin.add(1,0);
				}
			
			for (int j = 0; j < finalmin.size(); j++) 
				System.out.print(finalmin.get(j));
			finalmin.clear();
							
//			Iterator<Integer> itr = finalmin.iterator();  
//			  while(itr.hasNext())  
//			   System.out.print(itr.next());
		 }   
	}
}
