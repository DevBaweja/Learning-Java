package Encapsulation;
public class EncapsulationStatic{
    

    public static void main (String[] args)
    {
        // no need of obj
        // as methods are static
        
       // B.setI(1);
       // System.out.println(B.getI());
        
        B.setJ(1);
         System.out.println(B.getJ());
       //println
    } 
}

class B{
    
    @SuppressWarnings("unused")
	private int i;
    private static int j;
    
    
    // public static void setI(int i)
    // {
    //     this.i = i;
    // }
    // public static int getI()
    // {
    //     return i;
    // }
    
    // it will give compilation error
    public static void setJ(int k)
    {
        /// this.j = j;
        j = k;
    }
    public static int getJ()
    {
        return j;
    }
    // in encapsulation hiding of data is done
    // get and set methods are used 
    // here get and set methods are static methods so they can access static variables only and not non-static variables
    
    // this is non static variable
}
