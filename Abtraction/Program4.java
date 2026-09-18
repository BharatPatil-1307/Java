abstract class BankAccount
{
    // Common property
    protected double balance;

    // Constructor
    BankAccount(double balance)
    {
        this.balance = balance;
    }

    // Common method
    void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;

            System.out.println("Amount Deposited : " + amount);
            System.out.println("Current Balance : " + balance);
        }
        else
        {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Abstract method
    abstract void withdraw(double amount);

    // Common method
    void displayBalance()
    {
        System.out.println("Current Balance : " + balance);
    }
}


// Saving Account
class SavingAccount extends BankAccount
{
    SavingAccount(double balance)
    {
        super(balance);
    }

    @Override
    void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid Withdraw Amount");
        }
        else if(amount <= balance)
        {
            balance = balance - amount;

            System.out.println("Amount Withdrawn : " + amount);
            System.out.println("Current Balance : " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}


// Current Account
class CurrentAccount extends BankAccount
{
    CurrentAccount(double balance)
    {
        super(balance);
    }

    @Override
    void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid Withdraw Amount");
        }
        else if(amount <= balance)
        {
            balance = balance - amount;

            System.out.println("Amount Withdrawn : " + amount);
            System.out.println("Current Balance : " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}


public class Program4
{
    public static void main(String[] args)
    {
        System.out.println("----- Saving Account -----");

        BankAccount bobj = new SavingAccount(34000);

        bobj.displayBalance();

        bobj.deposit(5000);

        bobj.withdraw(2300);


        System.out.println("\n----- Current Account -----");

        BankAccount bobj1 = new CurrentAccount(12000);

        bobj1.displayBalance();

        bobj1.deposit(8000);

        bobj1.withdraw(5000);
    }
}