package While;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter random no : ");
		int n = s.nextInt();
		int r; int rev=0;
		
		while(n>0)
		{
			r = n%10;
			n=n/10;
			rev = rev*10+r;
		}
		System.out.println(rev);

	}

}
