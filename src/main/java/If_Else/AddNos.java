package If_Else;

import java.util.Scanner;

public class AddNos {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		if(num>100)
		{
			num = num-10;
			System.out.println(num);
		}
		else
		{
			num = num+10;
			System.out.println(num);
		}
	}

}
