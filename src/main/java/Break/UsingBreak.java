package Break;

public class UsingBreak {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break; //As soon as it breaks it comes out of the loop and will not execute anything
			}
			//else
			System.out.println(i);
		}

	}

}
