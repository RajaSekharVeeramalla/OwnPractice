package coreJAVA;

//A java program to demonstrate use
//of static keyword with Classes

import java.io.*;

public class StaticClass {

 private static String str = "GeeksforGeeks";

 // Static class
 static class MyNestedClass {
     
     // non-static method
     public void disp(){ 
       System.out.println(str); 
     }
 }
 
 public static void main(String args[])
 {
     StaticClass.MyNestedClass obj
         = new StaticClass.MyNestedClass();
     obj.disp();
 }
}
