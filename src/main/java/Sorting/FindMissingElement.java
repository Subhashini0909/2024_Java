package Sorting;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		int a[] = {1,4,2,5,3,7};
		
		int n = a.length+1; //Length of array a[] + no of missing element
		int exp = n*(n+1)/2; //Sum of Natural nos
		int actual = 0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			actual = actual+a[i]; //actual +=a[i]
		}
		
		int Missing_Element = exp-actual;
		System.out.println("The missing element in the sequence is : " + Missing_Element);
	}

}
