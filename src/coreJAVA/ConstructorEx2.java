package coreJAVA;

//Java Program to illustrate constructor overloading
//using same task (addition operation ) for different
//types of arguments.

import java.io.*;

class Vibe
{
 // constructor with one argument
 Vibe(String name)
 {
     System.out.println("Constructor with one " +
                   "argument - String : " + name);
 }

 // constructor with two arguments
 Vibe(String name, int age)
 {

     System.out.println("Constructor with two arguments : " +
             " String and Integer : " + name + " "+ age);

 }

 // Constructor with one argument but with different
 // type than previous..
 Vibe(long id)
 {
     System.out.println("Constructor with one argument : " +
                                         "Long : " + id);
 }
}

class ConstructorEx2
{
 public static void main(String[] args)
 {
     // Creating the objects of the class named 'Geek'
     // by passing different arguments

     // Invoke the constructor with one argument of
     // type 'String'.
     Vibe geek2 = new Vibe("Shikhar");

     // Invoke the constructor with two arguments
     Vibe geek3 = new Vibe("Dharmesh", 26);

     // Invoke the constructor with one argument of
     // type 'Long'.
     Vibe geek4 = new Vibe(325614567);
 }
}
