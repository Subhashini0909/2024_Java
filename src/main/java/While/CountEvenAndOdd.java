package While;

public class CountEvenAndOdd {

	public static void main(String[] args) 
	{
		int n = 12345;
		int counte=0;
		int counto=0;
		
		while(n>0)
		{
			int a=n%10;
			if(a%2==0)
			{
				counte++;	
			}
			else
			{
				counto++;
			}
			n = n / 10;
		}
		System.out.println("Even - " + counte);
		System.out.println("Odd - " + counto);
	}

}
