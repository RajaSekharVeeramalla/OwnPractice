package coreJAVA;

//Java program to illustrate the
//concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface Tata {
 public void print_geek();
}

interface Nanna {
 public void print_for();
}

interface Manvadu extends Tata, Nanna {
 public void print_geek();
}
class Manavaralu implements Manvadu {
 @Override public void print_geek()
 {
     System.out.println("Geeks");
 }

 public void print_for() { System.out.println("for"); }
}

//Drived class
public class InheritanceEx2 {
 public static void main(String[] args)
 {
     Manavaralu c = new Manavaralu();
     c.print_geek();
     c.print_for();
     c.print_geek();
 }
}