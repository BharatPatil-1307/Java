public class Demo1
{
    public static void main(String[] args) 
    {
        int arr[] = new int[10];
        arr[0] = 32;
        arr[1] = 78;
        arr[2] = 7;
        arr[3] = 28; 
        arr[4] = 88;
        arr[5] = 123;
        

        System.out.println(arr[9]);
        try
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + "\t");
            }
            arr[34] = 34;
            System.out.println(arr[34]);
        }catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println(aobj.getMessage());
        }
        System.out.println(arr[3]);
        
    }
}