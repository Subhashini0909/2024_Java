package Continue;

public class UsingContinue {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue; //As soon as the if condition becomes true, continue will jump to for loop 
								//instead of print, so 5 will be skipped
			}
			System.out.println(i);
		}
	}

}
