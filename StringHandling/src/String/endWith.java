package String;

public class endWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// it is non-static method
		// endWith(String suffix) : boolean
		
		String a = "img.png";
		String b = new String("img.jpg");
		String c = new String();
		
		if(a.endsWith(".png"))
		{
			System.out.println("Low Quality Image");
		}
		else 
		{
			System.out.println("High Quality Image");
		}
	}
}
