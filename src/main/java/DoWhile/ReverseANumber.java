package DoWhile;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		int r; int rev=0;
		int n=123;
		do
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		while(n>0);
		System.out.println(rev);
	}

}
