package coreJAVA;

//Java program to illustrate Incompatible data Type
//for Explicit Type Conversion

//Main class
public class TypecastingExplicit {

 // Main driver method
 public static void main(String[] argv)
 {

     // Declaring character variable
     char ch = 'c';
     // Declaringinteger variable
     int num = 88;
     // Trying to insert integer to character
     char d = (char)num;
     System.out.println(d);
 }
}
