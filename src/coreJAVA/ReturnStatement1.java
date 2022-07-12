package coreJAVA;

//Java program to illustrate no return
//keyword needed inside void method

//Main class
class ReturnStatement1 {

 // Since return type of RR method is
 // void so this method shouldn't return any value
 void demoSum(int a, int b)
 {
     int sum = 0;
     sum = (a + b) / 10;
     System.out.println(sum);

     // No return statement in this method
 }

 // Method 2
 // Main driver method
 public static void main(String[] args)
 {
     // Calling the method
     // Over custom inputs
     new ReturnStatement1().demoSum(5, 5);

     // Display message on the console for successful
     // execution of the program
     System.out.print(
         "No return keyword is used and program executed successfully");
 }

 // Note here we are not returning anything
 // as the return type is void
}
