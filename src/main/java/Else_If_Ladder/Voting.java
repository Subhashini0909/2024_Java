package Else_If_Ladder;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Citizenship : ");
		String citizen = s.next();
		
		System.out.print("Age : ");
		int age = s.nextInt();
		
		if (citizen.equalsIgnoreCase("India")) 
		{   
            if (age >= 18) 
            {
            	 System.out.println("That's great!! You are eligible to vote");
            }
            else 
    		{
                System.out.println("You cannot vote as you did not attain the age to vote");
            }
        } 
		else 
		{
            System.out.println("You cannot vote as you are not the citizen of India");
        }
		

}
}
