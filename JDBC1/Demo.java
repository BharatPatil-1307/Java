import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver class loaded successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");

            System.out.println("Connection established successfully");

           Statement stm = con.createStatement();

           stm.execute("create database demoooo");
           System.out.println("DB created");

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
    }
}