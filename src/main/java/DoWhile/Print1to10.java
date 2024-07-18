package DoWhile;

public class Print1to10 {

	public static void main(String[] args) 
	{
		int a = 1;
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=10);
		//while(a>=10); - Condition fails and output will be printed once
	}
}
