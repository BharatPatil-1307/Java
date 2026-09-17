import Package1.Demo;

public class Main 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo();
        int iRet = dobj.Display(12 , 45);

        System.out.println("Multiplication is : " + iRet);
    }
}
