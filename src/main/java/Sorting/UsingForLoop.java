package Sorting;

import java.util.Arrays;

public class UsingForLoop {

	public static void main(String[] args) 
	{
		int[] a = {10,30,20,100,70,50};
		
		Arrays.sort(a);
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}

	}

}
