package While;

import java.util.Scanner;

public class SumOfNaturalNos {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt(); //The no till 
		
		int sum = 0;
		int a = 1;
		
		while (a<=n)
		{
			sum +=a;
			a++;
		}
		System.out.println("Sum of the natural no's : " +sum);
	}
	
	 
}
