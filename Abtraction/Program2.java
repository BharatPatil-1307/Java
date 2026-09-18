abstract class Payment
{
    abstract void pay(double amount);
}

class UPIPayment extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("UPI Payment: " + amount);
    }
}

class CreditCardPayment extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class PhonePePayment extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("PhonePe Payment: " + amount);
    }
}

public class Program2
{
    public static void main(String[] args)
    {
        Payment payment;

        payment = new PhonePePayment();
        payment.pay(89999);

        payment = new CreditCardPayment();
        payment.pay(23000);

        payment = new UPIPayment();
        payment.pay(40000);
    }
}