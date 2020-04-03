package Final;
public class FinalVariable
{
    public static void main (String[] args)
    {
        // Mostly final keywords are used when to create fixed value
        // in class they are mostly public as well as static as we dont want it in every instance
        // declared it final so that noone can change its value
        
        System.out.println(FVA.PI);
    }
}

class FVA{
    
    public static float PI = 3.14f;
}
