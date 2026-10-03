import java.util.ArrayList;

class Books
{
    private String bookName;
    private String bookAuthor;
    private double price;
    private int quantity;

    Books(String bookName , String bookAuthor , double price , int quantity )
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void display()
    {
        System.out.println("--------------------------");
        System.out.println("Book Name   : " + bookName);
        System.out.println("Author      : " + bookAuthor);
        System.out.println("Price       :" + price);
        System.out.println("Quantity    :" + quantity);
        System.out.println("Total Price : " + price * quantity);
    }
}

public class Main2
{
    public static void main(String[] args)
    {
        ArrayList<Books> als = new ArrayList<Books>();
        als.add(new Books("Head First Java", "Kathy Sierra", 650.0, 10));
        als.add(new Books("Effective Java", "Joshua Bloch", 900.0, 8));
        als.add(new Books("Clean Code", "Robert C. Martin", 750.0, 12));
        als.add(new Books("The Pragmatic Programmer", "Andrew Hunt", 850.0, 6));
        als.add(new Books("Java: The Complete Reference", "Herbert Schildt", 800.0, 9));
        als.add(new Books("Core Java Volume I", "Cay S. Horstmann", 950.0, 5));
        als.add(new Books("Head First Design Patterns", "Eric Freeman", 700.0, 7));
        als.add(new Books("The C Programming Language", "Brian Kernighan", 500.0, 4));
        als.add(new Books("Introduction to Algorithms", "Thomas H. Cormen", 1200.0, 3));
        als.add(new Books("Python Crash Course", "Eric Matthes", 600.0, 11));

        double maxPrice = 0;
        double minPrice = Double.MAX_VALUE;
        Books bobj = null;
        for(Books b : als)
        {

        }
    }
}
