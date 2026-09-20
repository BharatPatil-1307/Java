import java.io.File;
import java.util.Scanner;

public class program3 
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
            Fobj.delete();                              // delete methos use to delete file 
            System.out.println("deleted...");
        }
    }    
}
