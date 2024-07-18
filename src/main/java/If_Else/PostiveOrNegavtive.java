package If_Else;

import java.util.Scanner;

public class PostiveOrNegavtive {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = s.nextInt();
		
		if(a>0)
		{
			System.out.println("Positive");
		}
		
		else
			System.out.println("Negative");
	}

}
