package While;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		int n=1;
		int a = 10;
	while(n<=a)
	{
		if(n%2==0)
		{
			System.out.println(n + " is even");
		}
		else
			System.out.println(n + " is odd");
		n++;
	}
	}

}
