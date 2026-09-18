abstract class Demo     // absyract class in abstraction 
{
    // abstract class madhe sagal astt ek normal class sarkh fkt abstract class ch object tayar hot nhi ani abtract class madhe abstract mthods astat

   Demo()   // constructor
   {

   }

   int id;  // instace variable
   static String nam = "TCS";   // static variable

   void Display()   // instance method
   {

   }

   static void gun()    // static method
   {
        System.out.println("Hello");
   }

   abstract void login();   // abstract methods without body
   abstract void  admin();  // abstract methods without body


}

public class Program1 extends Demo  // chaild class give to body abstract methods and impliment the abstract class 
{
    void login()
    {

    }

    void admin()
    {

    }

    public static void main(String[] args) 
    {

    }     
}