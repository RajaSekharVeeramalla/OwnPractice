package coreJAVA;



public class VariableNew {
public static void main(String args[])
{
	String name = "John";
	System.out.println(name);
	int myNum = 15;
	System.out.println(myNum);
	int myNum1;
	myNum1 = 15;
	System.out.println(myNum1);
	int myNum2 = 15;
	myNum2 = 20;  // myNum is now 20
	System.out.println(myNum2);
	final int myNum3 = 15;
	//myNum3 = 20;  // will generate an error: cannot assign a value to a final variable
	int myNum5 = 5;
	float myFloatNum = 5.99f;
	char myLetter = 'D';
	boolean myBool = true;
	String myText = "Hello";
	System.out.println("Integer\t" + myNum5 +  "Character\t" + myLetter+ "Boolean\t" +myBool+ "String\t" +myText);
	int x = 5;
	int y = 6;
	int z = 50;
	System.out.println(x + y + z);
}
}
