package coreJAVA;

//Java Program to Illustrate StringBuffer class
//via delete() and deleteCharAt() Methods

//Importing I/O classes
import java.io.*;

//Main class
class StringBufferEx3 {

 // Main driver method
 public static void main(String[] args)
 {
     StringBuffer s = new StringBuffer("GeeksforGeeks");

     s.delete(0, 5);
     // Returns forGeeks
     System.out.println(s);

     s.deleteCharAt(7);
     // Returns forGeek
     System.out.println(s);
     StringBuffer s1 = new StringBuffer("GeeksforGeeks");
     s1.replace(5, 8, "are");

     // Returns GeeksareGeeks
     System.out.println(s1);
 }
}