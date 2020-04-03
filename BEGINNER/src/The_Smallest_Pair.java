
//  n2 complex,
import java.util.Scanner;

public class The_Smallest_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        while(k-->0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i]=sc.nextInt();
           
            int min = Integer.MAX_VALUE; // Max Values
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if(i!=j)
                    {
                       int newmin = a[i]+a[j];
                       if(newmin<min)
                       {
                           min = newmin;
                       }
                    }
                }
            }
            System.out.println(min);
        }
    }
}


//import java.util.Scanner;
//
//public class The_Smallest_Pair1 {
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k=sc.nextInt();
//        while(k-->0)
//        {
//            int n = sc.nextInt();
//            int a[] = new int[n];
//            for (int i = 0; i < a.length; i++)
//                a[i]=sc.nextInt();
//           
//            int min1 = Integer.MAX_VALUE; // Max Value
//            int j=0; // Base index 
//            for (int i = 0; i < a.length; i++) 
//            	if(a[i]<min1)
//            	{
//            		min1=a[i]; // new min
//            		j=i;
//            	}
//            int min2 = Integer.MAX_VALUE;
//            for (int i = 0; i < a.length; i++) 
//            {
//            	if(i!=j&&a[i]<min2)
//            		min2=a[i];
//            }
//            System.out.println(min1+min2);
//        }
//    }
//}
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class The_Smallest_Pair2 {
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k=sc.nextInt();
//        while(k-->0)
//        {
//            int n = sc.nextInt();
//            int a[] = new int[n];
//            for (int i = 0; i < a.length; i++)
//                a[i]=sc.nextInt();
//            Arrays.parallelSort(a); // Kind on Merge Sort
// Sort can also be used
//            System.out.println(a[0]+a[1]);
//            
//        }
//    }
//}

//import java.io.* ;
//import java.math.BigInteger;
//import java.util.* ;
//class Codeshefcode {
//	public static void main(String[] args) {
//	FasterScanner input = new FasterScanner() ;
//	PrintWriter output = new PrintWriter(System.out) ;
//	int test = input.nextInt() ;
//	for(int i=0 ; i<test ; i=i+1){
//	   int length = input.nextInt() ;
//	   int b=input.nextInt() ;
//	   int c=input.nextInt() ;
//	   int temp=c ;
//	   if(c<b){
//		   c=b ;
//	       b=temp ;}
//	   for(int j=2 ; j<length ; j=j+1){
//	      temp = input.nextInt() ;
//	      if(temp<c){
//		     if(temp<b){
//			     c=b ;
//			     b=temp ;}
//		     else
//			     c=temp ;}
//	   }
//	   b=b+c ;
//	   output.println(b) ;
//	}
//	
//	output.flush() ;
//	output.close();
//	
//	}
//    
//        
//	}
//
//
//class FasterScanner {
//
//    private InputStream mIs;
//    private byte[] buf = new byte[1024];
//    private int curChar;
//    private int numChars;
//
//    public FasterScanner() {
//        this(System.in);
//    }
//
//    public FasterScanner(InputStream is) {
//        mIs = is;
//    }
//
//    public int read() {
//        if (numChars == -1) {
//            throw new InputMismatchException();
//    
//    }
//        if (curChar >= numChars) {
//            curChar = 0;
//            try {
//                numChars = mIs.read(buf);
//            } catch (IOException e) {
//                throw new InputMismatchException();
//            }
//            if (numChars <= 0) {
//                return -1;
//            }
//        }
//        return buf[curChar++];
//    }
//
//    public String nextLine() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        StringBuilder res = new StringBuilder();
//        do {
//            res.appendCodePoint(c);
//            c = read();
//        } while (!isEndOfLine(c));
//        return res.toString();
//    }
//
//    public String nextString() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        StringBuilder res = new StringBuilder();
//        do {
//            res.appendCodePoint(c);
//            c = read();
//        } while (!isSpaceChar(c));
//        return res.toString();
//    }
//
//    public long nextLong() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        long res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public int nextInt() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        int res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public boolean isSpaceChar(int c) {
//        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//    }
//
//    public boolean isEndOfLine(int c) {
//        return c == '\n' || c == '\r' || c == -1;
//    }
//
//}


//
////PROGRAM TO ADD TWO NUMBERS
//
//import java.io.*;
//import java.util.*;
//import java.math.*;
//import java.util.Arrays;
//class devuthief1
//{	
//	public static void main(String args[]) throws IOException
//	{
//		InputReader in=new InputReader(System.in);
//		PrintWriter pw=new PrintWriter(System.out);
//		int t=in.readInt();int n,i;
//		while(t-->0)
//		{
//		    n=in.readInt();
//		    int arr[] = new int [n];
//		    for(i=0 ; i<n ; i++)
//		     arr[i]=in.readInt();
//		     
//		     Arrays.sort(arr);
//		     
//		     pw.println(arr[1]+arr[0]);
//		     
//			
//		}
//		pw.flush();
//	}
//}
//class IOUtils 
//{
//	public static int[] readIntArray(InputReader in, int size) 
//	{
//		int[] array = new int[size];
//		for (int i = 0; i < size; i++)
//		{	
//			array[i] = in.readInt();
//		}
//		return array;
//	}
//	static int GCD(int a,int b)
//	{
//		if(b==0)
//			return a;
//		return GCD(b,a%b);
//	}
//	static int expo(int a, int b)
//	{
//		int result = 1;
//		while (b!=0)
//		{
//			if ((b&1)!=0)
//			{
//				result *= a;
//			}
//			b >>=1 ;
//			a *= a;
//		}
//		return result;
//	}
//	static int min(int a,int b)
//	{
//		if(a>b)
//			return b;
//		return a;
//	}
//	static int[] getPrimesUptoRootN(int n)
//	{
//		int x=(int) Math.ceil(Math.sqrt(n));
//		boolean flags[] =new boolean[x+1];
//		Arrays.fill(flags,true);
//		for(int i=2;i<=x;i++)
//		{
//			if(flags[i])
//			{
//				for(int j=i*2;j<=x;j=j+i)
//				{
//					flags[j]=false;
//				}
//			}
//		}
//		int count=0;
//		int myprimes[]=new int[x];
//		for(int i=2;i<=x;i++)
//		{
//			if(flags[i])
//			{
//				myprimes[count++]=i;
//			}
//		}
//		return myprimes;
//	}
//	static int[] primegenerate(int primes[],int m,int n)
//	{
//		boolean flags[]=new boolean[n-m+1];
//		Arrays.fill(flags,true);
//		for(int i=0;i<primes.length;i++)
//		{
//			if(primes[i]!=0)
//			{
//				int x=primes[i];
//				int start=(int)m/x;
//				start=start*x;
//				if(start<m)
//				{
//					start+=x;
//				}
//				for(int j=start;j<=n;j=j+x)
//				{
//					flags[j-m]=false;
//				}
//			}
//		}
//		int count=0;
//		int myprimes[]=new int[n-m+1];
//		for(int i=0;i<(n-m+1);i++)
//		{
//			if(flags[i])
//			{
//				myprimes[count++]=m+i;
//			}
//		}
//		return myprimes;
//	}
//	static LinkedHashSet<Integer> primegenerator(int m,int n)
//	{
//		if(m<2)
//		{
//			m=2;
//		}
//		int primes[]=getPrimesUptoRootN(n);
//		LinkedHashSet<Integer> prime=new LinkedHashSet<Integer>();
//		for(int i=0;i<primes.length;i++)
//		{
//			if(primes[i]!=0 && primes[i]>=m)
//			{
//				prime.add(primes[i]);
//			}
//		}
//		int finprimes[]=primegenerate(primes,m,n);
//		for(int i=0;i<finprimes.length;i++)
//		{
//			if(finprimes[i]!=0)
//			{
//				prime.add(finprimes[i]);
//			}
//		}
//		return prime;
//	}
//}
//class InputReader 
//{
//	private InputStream stream;
//	private byte[] buf = new byte[1024];
//	private int curChar;
//	private int numChars;
//	private SpaceCharFilter filter;
//	public InputReader(InputStream stream) 
//	{
//		this.stream = stream;
//	}
// 
//	public int read() 
//	{
//		if (numChars == -1)
//			throw new InputMismatchException();
//		if (curChar >= numChars) 
//		{
//			curChar = 0;
//			try 
//			{
//				numChars = stream.read(buf);
//			} 
//			catch (IOException e) 
//			{
//				throw new InputMismatchException();
//			}
//			if (numChars <= 0)
//				return -1;
//		}
//		return buf[curChar++];
//	}
// 
//	public int readInt() 
//	{
//		int c = read();
//		while (isSpaceChar(c))
//			c = read();
//		int sgn = 1;
//		if (c == '-') 
//		{
//			sgn = -1;
//			c = read();
//		}
//		int res = 0;
//		do 
//		{
//			if (c < '0' || c > '9')
//				throw new InputMismatchException();
//			res *= 10;
//			res += c - '0';
//			c = read();
//		} 
//		while (!isSpaceChar(c));
//		return res * sgn;
//	}
// 
//	public String readString() 
//	{
//		int c = read();
//		while (isSpaceChar(c))
//			c = read();
//		StringBuilder res = new StringBuilder();
//		do 
//		{
//			res.appendCodePoint(c);
//			c = read();
//		} 
//		while (!isSpaceChar(c));
//		return res.toString();
//	}
// 
//	public boolean isSpaceChar(int c) 
//	{
//		if (filter != null)
//			return filter.isSpaceChar(c);
//		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//	}
// 
//	public String next() 
//	{
//		return readString();
//	}
// 
//	public interface SpaceCharFilter 
//	{
//		public boolean isSpaceChar(int ch);
//	}
//}   

//
//import java.io.*;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
///**
// *
// * @author akashvermaofskt
// */
//  class SMPAIR {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    static StringTokenizer st = null;
//    
//    static String next() {
//        while (st == null || !st.hasMoreElements()) {
//            try {
//                st = new StringTokenizer(br.readLine());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return st.nextToken();
//    }
//    
//    static int nextInt() {
//        return Integer.parseInt(next());
//    }
//    
//    public static void main(String args[]) {
//        try {
//            int T=nextInt();
//            while(T-- >0){
//            
//                int N=nextInt();
//                int A[]=new int[N];
//                
//                for (int i = 0; i < N; i++) {
//                    A[i]=nextInt();
//                }
//                
//                Arrays.sort(A);
//                
//                bw.write(""+(A[0]+A[1])+"\n");
//                
//            }
//            bw.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

//public class The_Smallest_Pair {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("enter k");
//      int k=sc.nextInt();
//      while(k-->0)
//      {
//          int n = sc.nextInt();
//          int min = Integer.MAX_VALUE;
//          int smin = Integer.MAX_VALUE;
//          for (int i = 0; i < n; i++) {
//        	  int num = sc.nextInt();
//        	 if(num<min) // also num<smin        	 
//        	 {
//        		 smin=min;
//        		 min=num;
//        	 }
//        	 else // num>min
//        		 if(num<smin)
//        		 {
//        			 smin=num;
//        		 }
//          }
//          System.out.println(min+smin);
//      }
//  }
//}