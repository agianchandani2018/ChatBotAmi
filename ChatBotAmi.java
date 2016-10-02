/**
 * @author Ami Gianchandani
 * @date October 2, 2016
 * This is a Chat Bot that interacts with the user. The series of questions does not end until the user says "bye"
 *
 */

import java.util.Scanner;

 public class ChatBotAmi
 {
 	/** 
 	* This is the main method that java interpreter calls
 	* @param args This is a command line argument
 	*/
 	public static void main(String[] args)
 	{
 		//create a new Scanner object
 		Scanner kb = new Scanner(System.in);  //get input from keyboard
 		System.out.print("Please enter your name: ");
 		String name = kb.nextLine();
 		System.out.println("Hi " + name + "! How are you doing today?");
 		String input = kb.nextLine();
 		System.out.println("Your answer is " + input);
 		System.out.println("How old are you? ");
 		int age = kb.nextInt ();
 		
 		if(age > 30)
 		{
 			System.out.println(name + ", you are old");
 				 
 		}
 		else
 		{
 			System.out.println("nice!");
 		}
 		System.out.print("How tall are you: " );
 		double height = kb.nextDouble();
 		if (height > 6.0)
 		{
 			System.out.println(name + ", you are tall!");
 		}
 		else if (height > 5.0)
 		{
 			System.out.println(name + ", good height");
 		}
 		else
 		{
 			 System.out.println(name + ", you are short");
 		} 
 		//will get rid of the new line character from previous input
 		kb.nextLine();
		System.out.println("What is your favorite color? ");
		String color = kb.nextLine();
		System.out.println(color + " is my fav too!");


		String animal = "";
		while (! animal.equals("bye") && ! animal.equals("Bye"))
		{
			//kb.nextLine();
			System.out.println("Name an animal");
			animal = kb.nextLine();
		}


 	}
 }	