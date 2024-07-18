package While;

import java.util.Scanner;

public class Evennos {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		
		int a=2;
		
//Approach 1		
		while(a<=num)
		{
			if(a%2==0)
			System.out.println("Even No's : " + a +",");
			a++;
		}
		
//Approach 2	
		while(a<=num)
		{
			System.out.println("Even No's : " + a +",");
			a+=2;
		}
		
	}

}
