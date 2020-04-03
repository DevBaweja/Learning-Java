package Encapsulation;
public class Encapsulation{
    

    public static void main (String[] args)
    {
        A obj = new A();
        // as methods are non-static
        
        obj.setI(1);
        System.out.println(obj.getI());
        
        obj.setJ(1);
         System.out.println(obj.getJ());
       //println
    } 
}

class A{
    
    private int i;
    private static int j;
    public void setI(int i)
    {
        this.i = i;
    }
    public int getI()
    {
        return i;
    }
    
    @SuppressWarnings("static-access")
	public void setJ(int j)
    {
        this.j = j;
    }
    public int getJ()
    {
        return j;
    }
    // in encapsulation hiding of data is done
    // get and set methods are used 
    // here get and set methods are non-static methods so they can access non-static as well as static variables
}
