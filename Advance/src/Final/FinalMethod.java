package Final;
public class FinalMethod
{
    public static void main (String[] args)
    {
        // We can also use final keyword with method as well as
        // this is done so that method overriding can be prevented of that method in any other derived class of it
        
        FMB obj = new FMB();
        obj.imp();
    }
}

class FMA{
    
    public static float PI = 3.14f;
    
    public final void imp()
    {
        System.out.println("This is important");
    }
}


class FMB extends FMA
{
    // once A's method imp() is declared final it cannot be Override
    // public void imp()
    // {
    //     System.out.println("Overriding method");
    // }
}
