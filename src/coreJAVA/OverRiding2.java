package coreJAVA;

//A Simple Java program to demonstrate
//Overriding and Access-Modifiers

class Old {
 // private methods are not overridden
 private void m1()
 {
     System.out.println("From parent m1()");
 }

 protected void m2()
 {
     System.out.println("From parent m2()");
 }
}

class New extends Old {
 // new m1() method
 // unique to Child class
 private void m1()
 {
     System.out.println("From child m1()");
 }

 // overriding method
 // with more accessibility
 @Override
 public void m2()
 {
     System.out.println("From child m2()");
 }
}

//Driver class
class OverRiding2 {
 public static void main(String[] args)
 {
     Old obj1 = new Old();
     obj1.m2();
     Old obj2 = new New();
     obj2.m2();
 }
}
