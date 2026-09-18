public class Demo5
{
    void fun() throws ArithmeticException , NullPointerException , ArrayIndexOutOfBoundsException
    {
        int arr[] = new int[12];
        System.out.println(10 / 1);

        System.out.println(arr[13]);
    }
    public static void main(String[] args) 
    {
        Demo5 dobj =new Demo5();
        try
        {
            dobj.fun();
        }catch(ArithmeticException a)
        {
            System.out.println(a.getMessage());
        }
    }
}