package Sorting;

import java.util.Arrays;

public class UsingDefaultFunctions {

	public static void main(String[] args) 
	{
		int a[] = {7,4,2,5,8,5,1};
		
		
		System.out.println(".....Sorting Integer.....");
		String Bfore_Sorting = Arrays.toString(a); 
					/*
					 Here Arrays is a class. Instead of using for loop to read all elements in 
					 an array we can use Arrays.tostring to read all the elements
					 This converts an array into a string representation
					*/
		System.out.println("Before Sorting " + Bfore_Sorting);
		
		Arrays.sort(a);
		System.out.println("After Sorting " + Arrays.toString(a));
		System.out.println();
		
		
		System.out.println(".....Sorting Char.....");
		char[] b = { 'a', 'd','b','f', 'c'};
		String Bfore_Sorting_char = Arrays.toString(b); 
		System.out.println("Before Sorting " + Bfore_Sorting_char);
		
		Arrays.sort(b);
		System.out.println("After Sorting " + Arrays.toString(b));
		System.out.println();
		
		
		System.out.println(".....Sorting String.....");
		String[] c = { "abc", "def ","abd","afh", "chi"};
		String Bfore_Sorting_str = Arrays.toString(c); 
		System.out.println("Before Sorting " + Bfore_Sorting_str);
		
		Arrays.sort(c);
		System.out.println("After Sorting " + Arrays.toString(c));
	}

}
