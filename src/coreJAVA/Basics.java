package coreJAVA;


import java.io.*;

class Basics {

	public String geek; // Declared Instance Variable

	public Basics()
	{ // Default Constructor

		this.geek = "Shubham Jain"; // initializing Instance Variable
	}
	//Main Method
	public static void main(String[] args)
	{

		// Object Creation
		Basics name = new Basics();
		// Displaying O/P
		System.out.println("Geek name is: " + name.geek);
	}
}