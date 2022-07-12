package coreJAVA;



/* Base class Person */
class Simple
{
    void message()
    {
        System.out.println("This is person class");
    }
}
  
/* Subclass Student */
class Life extends Simple
{
    void message()
    {
        System.out.println("This is student class");
    }
  
    // Note that display() is only in Student class
    void display()
    {
        // will invoke or call current class message() method
        message();
  
        // will invoke or call parent class message() method
        super.message();
    }
}
  
/* Driver program to test */
class SuperKeyword1
{
    public static void main(String args[])
    {
        Life s = new Life();
  
        // calling display() of Student
        s.display();
    }
}
