/*
	Code - S10E
	
Chef wants to buy a new phone, but he is not willing to spend a lot of money. Instead, he checks the price of his chosen model everyday and waits for the price to drop to an acceptable value. So far, he has observed the price for N days (numbere 1 through N); for each valid i, the price on the i-th day was Pi dollars.

On each day, Chef considers the price of the phone to be good if it is strictly smaller than all the prices he has observed during the previous five days. If there is no record of the price on some of the previous five days (because Chef has not started checking the price on that day yet), then Chef simply ignores that previous day ― we could say that he considers the price on that day to be infinite.

Now, Chef is wondering ― on how many days has he considered the price to be good? Find the number of these days.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers P1,P2,…,PN.
Output
For each test case, print a single line containing one integer ― the number of days with a good price.

Constraints
1≤T≤100
7≤N≤100
350≤Pi≤750 for each valid i
Subtasks
Subtask #1 (30 points): N=7
Subtask #2 (70 points): original constraints

Example Input
1
7
375 750 723 662 647 656 619
Example Output
2
Explanation
Example case 1: Chef considers the price to be good on day 1, because he has not observed any prices on the previous days. The prices on days 2,3,4,5,6 are not considered good because they are greater than the price on day 1. Finally, the price on day 7 is considered good because it is smaller than all of the prices on days 2,3,4,5,6.

*/



// Using switch case, creating array
/*
import java.util.Scanner;

public class Phone_Prices {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter k");
        int k = sc.nextInt();
        while (k-- != 0) {
            int n = sc.nextInt(); // total days
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int count = 1; // as first day is considered as good day
            for (int i = 1; i < a.length; i++) // start with 1
            {

                int test = a[i];
                switch (i) {
                    case 1:
                        if (test < a[i - 1]) {
                            count++;
                        }
                        break;
                    case 2:
                        if (test < a[i - 1] && test < a[i - 2]) {
                            count++;
                        }
                        break;
                    case 3:
                        if (test < a[i - 1] && test < a[i - 2] && test < a[i - 3]) {
                            count++;
                        }
                        break;
                    case 4:
                        if (test < a[i - 1] && test < a[i - 2] && test < a[i - 3] && test < a[i - 4]) {
                            count++;
                        }
                        break;
                    default:
                        if (test < a[i - 1] && test < a[i - 2] && test < a[i - 3] && test < a[i - 4] && test < a[i - 5]) {
                            count++;
                        }
                        break;
                }
            }
            System.out.println(count);
        }
    }
}
*/

// Learning i/o , functional approch and one validation condition to avoid switch case
/*
import java.io.PrintWriter;
import java.util.Scanner;

public class Phone_Prices {

    public static void main(String[] args) {
            try(Scanner in = new Scanner(System.in);
                    PrintWriter out = new PrintWriter(System.out)){
                new Phone_Prices1().solve(in,out);
            }
    }

    void solve(Scanner in, PrintWriter out) {
//        System.out.println("Enter t");
        int t = in.nextInt();
        while(t-- >0)
        {
            int n = in.nextInt(); // total digits
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i]=in.nextInt();
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                boolean check = true; // ie it is good already
                for (int j = 1; j <= 5; j++) {
                    if(i-j>=0) // validates everything
                    {
                        if(a[i-j] <= a[i]) // finding another day having less price
                            // AS I element must be minimum among 5 elements or 6 element array last element must be minimum
                        {
                            check = false;
                            break;
                        }
                    }
                }
                if(check) count++;
            }
            out.println(count);
        }
    }
}
*/

/* package codechef; // don't place package name! */
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Reader;
//
//class Phone_Prices {
//
//    public static void main(String[] args) throws IOException {
//        // Input/Output Stream - Reader/Writer Abstract Classes
//        InputStreamReader ir = new InputStreamReader(System.in); // bridge from byte streams to character streams
//        BufferedReader br = new BufferedReader(ir); // Now this can be used as Scanner
//        System.out.println("Enter t");
//       int t = Integer.parseInt(br.readLine()); // throws IOException
//        for (int i = 0; i < 10; i++)
//       {
//           int n = Integer.parseInt(br.readLine());
//           String g1[];
//           int ar[] = new int[n];
//           String s1 = br.readLine();
//           g1 = s1.split(" ");
//           int c=1;
//           int p=0;
//           
//           for (int j = 0; j < 10; j++)
//               ar[j]=Integer.parseInt(g1[j]); // Making Duplicate
//           
//           int min = ar[0];
//           for (int j = 1; j < 5; j++) // loop start at 1
//           {
//               if(ar[j]<min)
//               {
//                   c+=1;
//                   min=ar[j];
//               }
//           }
//           
//           
//           
//       }
//       
//    }
//    
//    public static void main(String[] args) throws IOException {
//        InputStreamReader ir = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(ir);
//        System.out.println("Enter t");
//        int T = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= T; i++) {
//            int n = Integer.parseInt(br.readLine());
//            String g1[];
//            int ar[] = new int[n];
//            String s1 = br.readLine();
//            g1 = s1.split(" ");
//            int c = 1;
//            int p = 0;
//            for (int j = 0; j < n; j++) {
//                ar[j] = Integer.parseInt(g1[j]);
//            }
//            int min = ar[0];
//            for (int j = 1; j < 5; j++) {
//                if (ar[j] < min) {
//                    c += 1;
//                    min = ar[j];
//                }
//            }
//
//            for (int q = 5; q < n; q++) {
//                min = ar[p];
//                for (int f = p; f < q; f++) {
//                    if (ar[f] < min) {
//                        min = ar[f];
//                    }
//                }
//                //System.out.println(min);
//                if (ar[q] < min) {
//                    c += 1;
//                }
//                p += 1;
//            }
//            System.out.println(c);
//        }
//    }

// }



///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class codechef
//{
//public static void main(String[] args)throws IOException
//{
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		int T=Integer.parseInt(br.readLine());
//		for(int i=1;i<=T;i++)
//		{
//		int n=Integer.parseInt(br.readLine());
//		String g1[];
//		int ar[]=new int[n];
//		String s1=br.readLine();
//		g1=s1.split(" ");
//		int c=1;
//		int p=0;
//		for(int j=0;j<n;j++)
//		{
//			ar[j]=Integer.parseInt(g1[j]);
//		}
//		int min=ar[0];
//		for(int j=1;j<5;j++)
//		{
//			if(ar[j]<min)
//			{
//			c+=1;
//			min=ar[j];
//			}
//		}
//		
//		for(int q=5;q<n;q++)
//		{
//		    min=ar[p];
//			for(int f=p;f<q;f++)
//			{
//			if(ar[f]<min)
//			{
//			min=ar[f];
//			}
//			}
//			//System.out.println(min);
//			if(ar[q]<min)
//			c+=1;
//			p+=1;
//		}
//		System.out.println(c);
//		}
//}
//
//
//}
//
///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder res = new StringBuilder();
//		
//		int T = Integer.parseInt(br.readLine());
//		for(int t = 0; t < T;t++){
//		    int N = Integer.parseInt(br.readLine());
//		    
//		    int[] nums = convert(br.readLine().split("\\s+"));
//		    int gp = 0;
//		    for(int i = 0; i < nums.length;i++){
//		        boolean flag = true;
//		        for(int j = 5; j > 0; j--){
//		            if(i-j < 0)continue;
//		            else if(nums[i-j] <= nums[i]){
//		                flag = false;
//		                break;
//		            }
//		        }
//		        if(flag)gp++;
//		    }
//		    res.append(gp);
//		    res.append('\n');
//		}
//		System.out.print(res.toString());
//		br.close();
//	}
//	public static int[] convert(String[] nums){
//	    int[] res = new int[nums.length];
//	    for(int i = 0; i < nums.length;i++){
//	        res[i] = Integer.parseInt(nums[i]);
//	    }
//	    return res;
//	}
//}

//package Phone_Prices;
//
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class Phone_Prices3 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt();
//        for (int tc = 0; tc < T; tc++) {
//            int N = sc.nextInt();
//            int[] P = new int[N];
//            for (int i = 0; i < P.length; i++) {
//                P[i] = sc.nextInt();
//            }
//
//            System.out.println(solve(P));
//        }
//
//        sc.close();
//    }
//
//    static int solve(int[] P) {
//        return (int) IntStream.range(0, P.length)
//                .filter(i -> IntStream.range(Math.max(0, i - 5), i).allMatch(j -> P[j] > P[i])).count();
//    }
//}
