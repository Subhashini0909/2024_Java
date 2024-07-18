package DoWhile;

public class PalindromeOrNot {

	public static void main(String[] args)
	{
		int n=212;
		int r,rev=0;
		int original = n;
		do
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		while(n>0);
		if(original == rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

}
