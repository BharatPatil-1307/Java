interface Test
{   
    int id = 23; // by defult public static final

    void gun(); // by defult public abstract 
}

public class Program1 implements Test
{
    public void gun()
    {
        System.out.println("Inside gun");
    }   

    public static void main(String[] args) 
    {
        Test test = new Program1();
        test.gun();
    }
}