public class Demo
{
    public static void main(String[] args) 
    {
        System.out.println("Jay ganesh...!");
        System.out.println("Hello word");
        System.out.println(10 + 20);
        try
        {
            System.out.println(10 / 0);
        }catch(ArithmeticException aobj)
        {
            System.out.println("Dont divid by zero...");
        }
            
        System.out.println("End off program...");
    }
}