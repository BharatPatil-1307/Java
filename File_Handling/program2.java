import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numbers of file :");
        int num = sobj.nextInt();

        sobj.close();
        for(int i = 1; i <= num; i++)
        {
            File Fobj = new File("program "+i+".txt");
            try
            {
                if(Fobj.createNewFile())    // create file 
                {
                    System.out.println("File created..");
                }
                else
                {
                    System.out.println("File allredy exitss...");
                }
            }catch(IOException iobj)
            {
                iobj.printStackTrace();
            }
        }
    }    
}
