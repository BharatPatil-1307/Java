import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Products
{
    private String productName;
    private double productPrice;
    private int quantity;

    Products(String productName , double productPrice , int quantity)
    {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

//    @Override
//    public String toString()
//    {
//        return "Products{" +
//                "productName='" + productName + '\'' +
//                ", productPrice=" + productPrice +
//                ", quantity=" + quantity +
//                '}';
//    }
}

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Products> als = new ArrayList<Products>();
        als.add(new Products("Iphone", 45000, 2));
        als.add(new Products("Tv", 39101, 3));
        als.add(new Products("Ipad", 45700, 2));

//        for(int i = 0; i < als.size(); i++)
//        {
//            Products pobj = als.get(i);
//            System.out.println("------------------------------");
//            System.out.println("Product  : " + pobj.getProductName());
//            System.out.println("Price    : " + pobj.getProductPrice());
//            System.out.println("Quantity : " + pobj.getQuantity());
//            System.out.println("Total    : " +
//                    pobj.getProductPrice() * pobj.getQuantity());
//            System.out.println("------------------------------");
//        }
//        for(Products pobj:als)
//        {
//            System.out.println("--------------------------------------");
//            System.out.println("Prodcut : "+ pobj.getProductName());
//            System.out.println("Price   :  " + pobj.getProductPrice());
//            System.out.println("Quantity: " + pobj.getQuantity());
//            System.out.println("Total :" + pobj.getProductPrice() * pobj.getQuantity());
//            System.out.println("--------------------------------------");
//        }

//        Iterator<Products> ils =  als.iterator();
//        while(ils.hasNext())
//        {
//            Products pobj = ils.next();
//            System.out.println("--------------------------------------");
//            System.out.println("Product  : " + pobj.getProductName());
//            System.out.println("Price    : " + pobj.getProductPrice());
//            System.out.println("Quantity : " + pobj.getQuantity());
//            System.out.println("Total    : " +
//                    pobj.getProductPrice() * pobj.getQuantity());
//            System.out.println("--------------------------------------");
//        }

        ListIterator<Products> lit = als.listIterator();
        double maxPrice = 0;
        Products maxProduct = null;
        while(lit.hasNext())
        {
            Products pobj = lit.next();

            if(pobj.getProductPrice() > maxPrice)
            {
                maxPrice = pobj.getProductPrice();
                maxProduct = pobj;
            }
        }

        if(maxProduct != null)
        {
            System.out.println("Most Expensive Product: "
                    + maxProduct.getProductName());

            System.out.println("Price: "
                    + maxProduct.getProductPrice());
        }
    }
}