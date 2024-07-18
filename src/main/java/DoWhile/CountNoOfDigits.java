package DoWhile;

public class CountNoOfDigits {

	public static void main(String[] args) 
	{
		int n=1234556;
		int count=0;
		
		do
		{
			n/=10;
			count++;
		}
		while(n>0);
		System.out.println(count);
	}

}
