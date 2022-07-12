package coreJAVA;

public class ExceptionTryCatchFinally {
	// Java program to demonstrate
	// control flow of try-catch clause
	// when exception occur in try block
	// and handled in catch block

		
	    public static void main (String[] args)
	    {
	         
	        // array of size 4.
	        int[] arr = new int[4];
	        try
	        {
	            int i = arr[4];
	                 
	            // this statement will never execute
	            // as exception is raised by above statement
	            System.out.println("Inside try block");
	        }
	        catch(ArrayIndexOutOfBoundsException ex)
	        {
	            System.out.println("Exception caught in Catch block");
	        }
	         
	        // rest program will be executed
	        System.out.println("Outside try-catch clause");
	    }
	}
/*  // Java program to demonstrate
// control flow of try-catch-finally clause
// when exception occur in try block
// and handled in catch block
class GFG
{
    public static void main (String[] args)
    {
         
        // array of size 4.
        int[] arr = new int[4];
         
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}  */




/*   // Java program to demonstrate
// control flow of try-catch clause
// when exception occurs in try block
// but not handled in catch block
class GFG
{
    public static void main (String[] args)
    {
         
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        // not a appropriate handler
        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught");
        }
         
        // rest program will not execute
        System.out.println("Outside try-catch clause");
    }
} */

/*
//Java program to demonstrate
//control flow of try-catch-finally clause
//when exception occur in try block
//but not handled in catch block
class GFG
{
 public static void main (String[] args)
 {
      
     // array of size 4.
     int[] arr = new int[4];
      
     try
     {
         int i = arr[4];
              
         // this statement will never execute
         // as exception is raised by above statement
         System.out.println("Inside try block");
     }
      
     // not a appropriate handler
     catch(NullPointerException ex)
     {
         System.out.println("Exception has been caught");
     }
      
     finally
     {
         System.out.println("finally block executed");
     }
      
     // rest program will not execute
     System.out.println("Outside try-catch-finally clause");
 }
}
*/


/*
//Java program to demonstrate
//control flow of try-finally clause
//when exception doesn't occur in try block
class GFG
{
 public static void main (String[] args)
 {
      
     try
     {
         String str = "123";
          
         int num = Integer.parseInt(str);
          
         // this statement will execute
         // as no any exception is raised by above statement
         System.out.println("Inside try block");
     }
      
     finally
     {
         System.out.println("finally block executed");
     }
      
     // rest program will be executed
     System.out.println("Outside try-finally clause");
 }
}   */