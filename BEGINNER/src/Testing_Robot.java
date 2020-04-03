import java.util.Scanner;
//
//public class Testing_Robot {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0)
//		{
//			int n = sc.nextInt();
//			int startNum = sc.nextInt();
//			String s = sc.next();
//			char givenArray[] = new char[n];
//			for (int i = 0; i < s.length(); i++)
//				givenArray[i]=s.charAt(i);
//				
//			int count = 1;
//			boolean visitedArray[] = new int[n+1];
//			visitedArray[0]=startNum;
//			
//			 for (int j = 0; j < givenArray.length; j++)
//			{
//				if(givenArray[j]=='R')
//					{
//						startNum++;
//					}
//				
//				if(givenArray[j]=='L')
//					{
//							startNum--;
//					}
//				
//				boolean flag = false; // it dont occur
//				for (int i = 0; i < visitedArray.length; i++) 
//					if(visitedArray[i]==startNum)
//						{
//							flag=true;
//							break;
//						}
//				
//					if(!flag)
//						visitedArray[count++]=startNum;
//					
//				}
//				
//			System.out.println(count);
//			
//		}
//	}
//}
//
//



//
//import java.util.Scanner;
//import java.util.ArrayList;
//
//class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        while(T-->0){
//            int n=sc.nextInt(),x=sc.nextInt();
//            ArrayList<Integer> arrL=new ArrayList<Integer>();
//            arrL.add(x);
//            String s=sc.next();
//            for(int i=0;i<n;i++)
//	            {
//	                if(s.charAt(i)=='R')
//	                {
//	                    x+=1;  
//	                }
//	                if(s.charAt(i)=='L')
//	                {
//	                    x-=1;
//	                }
//	                if(!arrL.contains(x)){
//	                    arrL.add(x);
//	            }
//            }
//            System.out.println(arrL.size());
//        }
//    }
//}