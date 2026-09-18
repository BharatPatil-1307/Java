abstract class Animal
{
    abstract void sound();
}

class Dog extends Animal
{
    @Override 
    void sound()
    {
        System.out.println("Bhauuuuuu Bhauuuu");
    }
}

class Cat extends Animal
{
    @Override 
    void sound()
    {
        System.out.println("Meoww meoww");
    }
}

class Lion extends Animal
{
    @Override 
    void sound()
    {
        System.out.println("Dharrrrr");
    }
}

public class Program3 
{
    public static void main(String[] args) 
    {
        Lion lobj = new Lion();
        lobj.sound();

        Cat cobj = new Cat();
        cobj.sound();

        Dog dobj = new Dog();
        dobj.sound();
    }    
}
