package String;

public class ApplytoString {

	public static void main(String[] args) {

		Student s = new Student(18081, "Dev");

		System.out.println(s);
		// it will implicit class toString Method of Object Class
		// as every class extends Object Class

	}
}

class Student extends Object
{
	
	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
	}
	
	
//	   public String toString() {
//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{"+"rollno="+rollno+" ,name="+name+"}";	
	}
	
}