import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo 
{
    public static void main(String[] args) 
    {
        //Driver class load/register
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306",
                    "root", 
                    "");

           Statement stmt = con.createStatement();
           stmt.execute("create database rakesh");
           System.out.println("Databases created");

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        

    }
}
