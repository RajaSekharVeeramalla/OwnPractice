package coreJAVA;

//Java program to demonstrate that a static member
//can be accessed before instantiating a class

class StaticKeyword
{
 // static method
 static void m1()
 {
     System.out.println("from m1");
 }

 public static void main(String[] args)
 {
       // calling m1 without creating
       // any object of class Test
        m1();
 }
}