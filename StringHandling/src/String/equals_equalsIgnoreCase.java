package String;

public class equals_equalsIgnoreCase {

	public static void main(String[] args) {
	 	
		// The String equals(Object anObject):boolean method overrides the equals(Object anObject):boolean method of Object class.

		// public boolean equals(Object anObject)
		// it is an non-static method
	
		// it takes Object as an argument
		// as it is been overrides the method of Object Class
		
		/* Internal Implementation 

		 public boolean equals(Object anObject) {  
      if (this == anObject) {  
          return true;  
      }  
      if (anObject instanceof String) {  
          String anotherString = (String) anObject;  
          int n = value.length;  
          if (n == anotherString.value.length) {  
              char v1[] = value;  
              char v2[] = anotherString.value;  
              int i = 0;  
              while (n-- != 0) {  
                  if (v1[i] != v2[i])  
                          return false;  
                  i++;  
              }  
              return true;  
          }  
      }  
      return false;  
  } 
		 */
		
		String s1 = "Hi";
		String s2 = new String("Hi");
		
		
		System.out.println(s1.equals(""));
		// will return false unless s1 is also an empty String 
		// empty String significant can be shown in compareTo() method as it will give us Unicode of that String
		
		if(s1.equals(s2))
		System.out.println("true");
		else 
		System.out.println("false");
		
		
		StringBuffer sbuffer = new StringBuffer(s1);
		// Even though it appears to be same 
		// But due to Object Type difference it is not treated as equal
		System.out.println(s1.equals(sbuffer));
		System.out.println(s1.equals(sbuffer.toString()));
		
		String s3 = "HI";
		System.out.println(s1.equals(s3)); // Case Matters 
		
		
		System.out.println();
		
		/* Internal Implemetation
		  
		  public boolean equalsIgnoreCase(String anotherString) {  
	
       return (this == anotherString) ? true  
               : (anotherString != null)  
               && (anotherString.value.length == value.length)  
               && regionMatches(true, 0, anotherString, 0, value.length);  
   }  
   */
		// public boolean equalsIgnoreCase(String anotherString)
		// it is non-static method
		
		// it takes String as an argument
		if(s1.equalsIgnoreCase(s2))
		System.out.println("true");
		else 
		System.out.println("false");
		
		// equalsIgnoreCase(String anotherString):boolean take only String as compared to equals(Object anObject):boolean
		// s1.equalsIgnoreCase(sbuffer) will give error as it is not String Object
		System.out.println(s1.equalsIgnoreCase(sbuffer.toString()));
		
		System.out.println(s1.equalsIgnoreCase(s3)); // false in case of equals(Object anObject)
		
		
		
	}
}
