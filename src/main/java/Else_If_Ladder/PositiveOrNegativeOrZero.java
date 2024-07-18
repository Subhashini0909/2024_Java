package Else_If_Ladder;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		if(num>0)
		{
			System.out.println("Postive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}


	}
	

}
