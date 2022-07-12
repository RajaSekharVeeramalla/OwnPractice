package coreJAVA;

//Java program to illustrate the
//concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
 public void print_geek()
 {
     System.out.println("Geeks");
 }
}

class two extends one {
 public void print_for() { System.out.println("for"); }
}

class three extends two {
 public void print_geek()
 {
     System.out.println("GeeksforGeeks");
 }
}

//Drived class
public class InheritanceEx1 {
 public static void main(String[] args)
 {
     three g = new three();
     one o=new three();
     g.print_geek();
     g.print_for();
     o.print_geek();
 }
}
