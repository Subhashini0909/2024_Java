package ForLoop;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		int r; int rev=0;
		for(int n=356; n>0;)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println(rev);
	}

}
