package Continue;

public class PrintOdd {

	public static void main(String[] args) 
	{
		for(int n=1; n<=10; n++)
		{
			if(n%2==0)
			{
				continue;
			}
			System.out.println(n);
		}
	}
}
