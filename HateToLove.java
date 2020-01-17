/**
Program that reads and displys a line of text with hate changed with love.
Author: Daniel Oszczapinski	
Homework 2: Programming project 2
Completed: September 26, 2016
*/
import java.util.Scanner;


public class HateToLove
{
	public static void main(String[] args)
	{
		String text;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter a line of text");
		text = in.nextLine();
		System.out.println("I have rephrased the line to read:");
		
		String replaced = text.replaceFirst("hate", "love");
		System.out.println(replaced);
	}
	
}	