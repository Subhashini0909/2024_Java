package ForLoop;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		int n=344;
		int r, rev=0;
		int a =n;
		
		for( ;n>0; )
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(a==rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

}
