
interface Test
{
    public static void m1()
    {
        System.out.println("Static method");
    }

    private void m2()
    {
        System.out.println("Private method");
    }

    default void m3()
    {
        System.out.println("Default method");
        m2();
    }

}

public class Program2 implements Test
{
    public static void main(String[] args) 
    {
        Program2 pobj = new Program2();
        
        Test.m1();
        pobj.m3();
    }
}
