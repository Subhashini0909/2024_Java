package While;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		int n= 213;
		int r,rev=0;
		int a=n;
		
		while(n>0)
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
		{
			System.out.println("Not a palindrome");
		}
	}

}
