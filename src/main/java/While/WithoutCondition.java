package While;

public class WithoutCondition {

	public static void main(String[] args) 
	{
		int a = 1;
		while(true)
		{
			System.out.println("Hello");
			a++;
		}
		
	}

}

//Output - Infinite loop 
/*As in condition we've made the condition as true. So the condition will be true always
 * So it is printing infinite loop.
*/