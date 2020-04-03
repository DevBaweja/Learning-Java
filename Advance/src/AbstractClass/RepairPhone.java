package AbstractClass;


public class RepairPhone{
    
    public static void main (String[] args) {
        /* code */
        
        // Phone p = new Phone();
        // cannot create object of abstract class
        
        Phone ip = new Iphone();
        Phone hp = new Honor();
        
        ip.call();
        ip.camera();
        
        hp.call();
        hp.camera();
    }
}

class RepairShop
{
    
    public void repair(Phone P)
    {
        P.call();
        P.camera();
    }
    
}

abstract class Phone
{
    abstract void call();
    abstract void camera();
}

class Iphone extends Phone
{
    void call()
    {
        System.out.println("Iphone call");
    }
    void camera()
    {
        System.out.println("Iphone camera");
    }
}

class Honor extends Phone
{
     void call()
    {
        System.out.println("Honor call");
    }
    void camera()
    {
        System.out.println("Honor camera");
    }
}
