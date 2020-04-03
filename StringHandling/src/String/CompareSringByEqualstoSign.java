package String;

public class CompareSringByEqualstoSign {

	public static void main(String[] args) {
		
		// String can be compared by == operator as mostly in c/c++
		
		// authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator)
		
		// equals(Object anObject):boolean and equalsIgnoreCase(String anotherString:boolean compares the original content of String
		// it does not bother about the reference of instances ie Objects then who does ?  '=='- i do;   
		// compareTo(String anotherString):int method compares values lexicographically
		
		String s1 = "fill";
		String s2 = "fill";
		// they both ref to same String instance in String literal pool
		// so they are considered equal
		if(s1==s2)
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		// even though it look like content of s1 and s3 are equal
		// but s1 ref belong to String literal pool and s3 ref belongs String instance which is not in String literal pool
		// so they are considered unequal by == operator 
		// but other function of String will consider it equal as they check for content of String instance
		String s3 = new String(s1); 
		if(s1==s3)
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
				
	}
}
