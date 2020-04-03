
/*
 Code - LAPIN
Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S
Example:
Input:
6
gaga
abcde
rotor
xyzxy
abbaab
ababc


Output:
YES
NO
YES
YES
NO
NO

 */

import java.util.Scanner;
public class Lapindromes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			char a[] = new char[s.length()];
			for (int i = 0; i < s.length(); i++) 
				a[i] = s.charAt(i);
			
			
				char a1[] = new char[a.length/2];
				char a2[] = new char[a.length/2];
				for (int i = 0; i<a.length/2 ; i++)
				{
					a1[i]=a[i];
					a2[i]=a[i+a.length/2+a.length%2]; // maintain even or odd parity
				}
				
				final int ALPA = 26; // All alphabet
				int a1check[] = new int[ALPA]; 
				int a2check[] = new int[ALPA];
				
				for (int i = 0; i < a.length/2 ; i++) 
				{
					a1check[(int)a1[i]-97]++;
					a2check[(int)a2[i]-97]++;
				}
				
				boolean flag=true;
				for (int i = 0; i < ALPA; i++) {
					
					if(a1check[i]!=a2check[i])
						{
							flag=false;
							break;
						}
				}
				System.out.println(flag?"YES":"NO");			
		}
	}
}




/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) throws java.lang.Exception {

		java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		List inputList = new ArrayList<String>();
		int testCases = Integer.parseInt(reader.readLine());
		while (testCases > 0) {
			inputList.add(reader.readLine());
			testCases--;
		}
		Iterator itr = inputList.iterator();
		while (itr.hasNext()) {
			String input = (String) itr.next();
			char[] inputArray = input.toCharArray();
			int[] left = new int[26];
			int[] right = new int[26];
			if (input.length() % 2 == 0) {
				for (int i = 0; i < input.length() / 2; i++) {
					left[(inputArray[i] % 97)]++;
				}
				for (int j = (input.length() / 2); j < input.length(); j++) {
					right[(inputArray[j] % 97)]++;
				}
			} else {
				for (int i = 0; i < input.length() / 2; i++) {
					left[(inputArray[i] % 97)]++;
				}
				for (int j = (input.length() / 2) + 1; j < input.length(); j++) {
					right[(inputArray[j] % 97)]++;
				}
			}
			int k = 0;
			boolean check = false;
			while (k < 26) {
				check = (left[k] == right[k]) ? true : false;
				k++;
				if ( !check) {
					System.out.println("NO");
					break;
				}
			}
			if (check)
				System.out.println("YES");
		}
	}
}
*/


