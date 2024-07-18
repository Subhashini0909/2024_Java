package While;

public class CountNoOfDigits {

	public static void main(String[] args) 
	{
		int n = 12345;
		int total=0;
		
		while(n>0)
		{
		n = n/10;
		total++;
		}
		System.out.println(total);
		
	}

}
