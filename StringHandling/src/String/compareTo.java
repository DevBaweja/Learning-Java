package String;

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public int compareTo(String anotherString)
		// it is an non-static method
		// compareTo(anotherString):int method compares values lexicographically
		// it gives +ve if s1>s2 , -ve if s1<s2 , 0 if s1=s2 lexicographically
		
		
		/* Internal Implementation  
		 * 
		 */
		
		String s1 = "fill";
		String s2 = new String("fill");
		// compareTo(String anotherString) takes String as argument unlike Object in equals(Object anObject)
		// it compares the content of the String not the ref unlike ' == ' operator
		System.out.println(s1.compareTo(s2));
	
		System.out.println(s1.compareTo("eill")); //fill-eill = 1 
		System.out.println(s1.compareTo("gill")); //fill - gill = -1
	
		// Comparison with empty String is significant as it will give us unicode
		System.out.println("fill".compareTo(""));
		System.out.println("".compareTo("fill"));
	}

}
