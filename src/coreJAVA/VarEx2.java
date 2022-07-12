package coreJAVA;

import java.io.*;

class VarEx2 {
   
  public static String geek = "Shubham Jain";         //Declared static variable
   
    public static void main (String[] args) {
        
      //geek variable can be accessed with od object creation
      //Displaying O/P
      //GFG.geek --> using the static variable
        System.out.println("Geek Name is : "+VarEx2.geek);
    }
}
