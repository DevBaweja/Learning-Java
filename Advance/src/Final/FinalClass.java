package Final;
public class FinalClass
{
    public static void main (String[] args)
    {
        // We can also use final keyword with class as well as
        // this is done so that this class is self sufficient and need not to be extends by any other 
     
        // it dont put any restriction on the variables or the method of that class
        FCA obj = new FCA();
        obj.imp();
    }
}

final class FCA{
    
    public static float PI = 3.14f;
    
    public final void imp()
    {
        System.out.println("This is important");
    }
}


// class FCB extends FCA
// {

// }
