package ForLoop;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter random no : ");
		int num = s.nextInt();
		
		int count=0;
		
		for(; num>0; )
		{
			num/=10;
			count++;
		}
		System.out.println("Total No.of.digits : " + count);
	}

}
