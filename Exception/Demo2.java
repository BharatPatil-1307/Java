import java.util.ArrayList;

class Books
{
    private String bookName;
    private String bookNumber;
    private int quintetiy;
    private double price;

    Books(String bookName, String bookNumber, int quintetiy, double price)
    {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.quintetiy = quintetiy;
        this.price = price;
        Display();
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookNumber()
    {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber)
    {
        this.bookNumber = bookNumber;
    }

    public int getQuintetiy()
    {
        return quintetiy;
    }

    public void setQuintetiy(int quintetiy)
    {
        this.quintetiy = quintetiy;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void Display()
    {
        System.out.println("----------------------------");
        System.out.println("Book :" + bookName);
        System.out.println("Number : " + bookNumber);
        System.out.println("Quintitey : " + quintetiy);
        System.out.println("Price : " + price);
        System.out.println("Total Price : " + price * quintetiy);
        System.out.println("----------------------------");
    }

}

public class Demo2 
{
    public static void main(String[] args) 
    {
        ArrayList<Books> aobj = new ArrayList<Books>();
        aobj.add(new Books("Slambook" , "322441", 3, 699.0));
        aobj.add(new Books("Dont Hurt Me", "34223442", 5, 453));
        aobj.add(new Books("How To Write Solid Code", "23123442", 2, 899));

    }    
}
