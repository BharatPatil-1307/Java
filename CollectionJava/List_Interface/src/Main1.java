import java.util.ArrayList;

class Users
{
    private String userName;
    private String userId;
    private String department;
    private double salary;

    Users(String userName , String userId , String department , double salary)
    {
        this.userName = userName;
        this.userId = userId;
        this.department = department;
        this.salary = salary;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getDeparment()
    {
        return department;
    }

    public void setDeparment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    void display()
    {
        System.out.println("-----------------------");
        System.out.println("Name :" + userName);
        System.out.println("Id  :" + userId);
        System.out.println("Department :" + department);
        System.out.println("Salary :" + salary);
        System.out.println("-----------------------");
    }
}

public class Main1
{
    public static void main(String[] args) {
        ArrayList<Users> als = new ArrayList<Users>();
        als.add(new Users("Rakesh", "2313131", "It", 450000));
        als.add(new Users("Piyuuu", "3213121", "Software developer", 45100));
        als.add(new Users("Harshal", "446433", "UI UX", 320000));
        als.add(new Users("Sonu", "23131212", "Android", 420000));
        als.add(new Users("Tejas", "23131221", "IOS", 560000));
        als.add(new Users("Himanshu", "2334221", "Frontend", 410000));

//        for(int i = 0; i < als.size(); i++)
//        {
//            Users obj = als.get(i);
//            obj.display();
//        }

        double maxSalary = 0;
        Users maxUser = null;

        for (Users uobj : als)
        {
            if(uobj.getDeparment().equals("It"))
            {
                uobj.display();
            }
        }

//        if(maxUser != null)
//        {
//            System.out.println("High Income: " + maxSalary);
//            System.out.println("Name: " + maxUser.getUserName());
//            System.out.println("ID: " + maxUser.getUserId());
//            System.out.println("Department: " + maxUser.getDeparment());
//        }
    }
}
