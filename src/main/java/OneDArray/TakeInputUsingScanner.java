package OneDArray;
import java.util.Arrays;
import java.util.Scanner;

public class TakeInputUsingScanner {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int b[] = new int[5];
		
		for(int i = 0; i<b.length; i++)
		{
			System.out.print("Enter value for the position " + i + " : ");
			b[i] = s.nextInt();
		}
		
	//Approach 1 : 
		System.out.print("Printing the user provided value : ");
		for(int x : b)
		{
			System.out.print(x + ",");
		}
	//Approach 2 : 	
		System.out.println(Arrays.toString(b));

	}

}
