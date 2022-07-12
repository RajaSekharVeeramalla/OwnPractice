package coreJAVA;

//Java Program Illustrating Lock the Object for
//the shared resource giving consistent output

//Class 1
//Helper class extending Thread class
public class PrintTest1 extends Thread {

 // synchronized code
 // synchronized method will lock the object and
 // releases when thread is terminated or completed its
 // execution.
 synchronized public void printThread(int n)
 {
     for (int i = 1; i <= 10; i++) {
         System.out.println("Thread " + n
                            + " is working...");

         try {

             // pause the execution of current  thread
             // for 600 millisecond
             Thread.sleep(600);
         }
         catch (Exception ex) {
             // overrides toString() method  and prints
             // exception if occur
             System.out.println(ex.toString());
         }
     }
     System.out.println("--------------------------");
     try {

         // pause the execution of current  thread for
         // 1000 millisecond
         Thread.sleep(1000);
     }
     catch (Exception ex) {
         System.out.println(ex.toString());
     }
 }
}
//creating thread1 extending Thread Class

public class Thread01 extends Thread {

 PrintTest1 test;
 Thread01(PrintTest1 p) { test = p; }

 public void run() // entry point for thread1
 {

     test.printThread(1);
 }
}
//creating thread2 extending Thread Class

public class Thread02 extends Thread {

 PrintTest1 test;
 Thread02(PrintTest1 p) { test = p; }
 public void run() // entry point for thread2
 {
     test.printThread(2);
 }
}

public class ThreadSynchronization {

 public static void main(String[] args)
 {

     PrintTest1 p = new PrintTest1();
    
     // passing the same object of class PrintTest to
     // both threads
     Thread01 t1 = new Thread01(p);
     Thread02 t2 = new Thread02(p);
    
     // start function will execute the threads
     t1.start();
     t2.start();
 }
}
