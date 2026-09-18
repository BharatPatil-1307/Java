import java.util.Scanner;

class AmountNotValidException extends RuntimeException
{
    AmountNotValidException(String msg)
    {
        super(msg);
    }
}

public class Demo4 
{
    void Check()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the amount : ");
        int amout = sobj.nextInt();
        sobj.close();
        if(amout < 0)
        {
            throw new AmountNotValidException("Amount not valid....");
        }
        else
        {
            System.out.println("Succesfull...");
        }
    }
    public static void main(String[] args) 
    {
        Demo4 dobj = new Demo4();
        try
        {
            dobj.Check();
        }catch(AmountNotValidException aobj)
        {
            System.out.println(aobj.getMessage());
        }
    }    
}
