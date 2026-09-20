import java.io.File;
import java.io.IOException;

public class program1 
{
    public static void main(String[] args) 
    {
        File Fobj = new File("Rakesh1.txt");

        try
        {
            if(Fobj.createNewFile())
            {
                System.out.println("File successfully created...");
            }
            else
            {   
                if(Fobj.exists())
                {
                    System.out.println("File Allredy exits");
                    System.out.println();
                }
            }
            
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}