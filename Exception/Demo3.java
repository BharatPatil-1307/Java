import java.util.Scanner;

class AgeNotValidException extends RuntimeException
{
    AgeNotValidException(String msg)
    {
        super(msg);
    }
}

public class Demo3 
{
    void Check()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the age : ");
        int age = sobj.nextInt();

        sobj.close();

        if(age < 18)
        {
            throw new AgeNotValidException("Age Not Valid Exception..");    // throw keyword use for user define exception
        }
        else
        {
            System.out.println("Eligible for voting...");
        }
    }

    public static void main(String[] args) 
    {
        Demo3 dobj = new Demo3();

        try
        {
            dobj.Check();
        }catch(AgeNotValidException aobj)
        {
            System.out.println(aobj.getMessage());
        }
    }    
}
