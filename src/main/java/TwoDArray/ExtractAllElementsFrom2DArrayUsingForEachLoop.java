package TwoDArray;

public class ExtractAllElementsFrom2DArrayUsingForEachLoop {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{3,4},{6,7}};
		
		for(int r[]:a)
		{
			for(int c:r)
			{
				System.out.print(c + ",");
			}
			System.out.println();
		}
	}
}
/*
 * int r[] - Will store the values 1,2 at first then get into inner loop. Now r has 1,2 share the 
 value to c 1 and print it then share 2 and print it. 
 * Then get to the outer loop and r[] stores 3,4 and then get into inner loop. Now r has 3,4 share 
 the value to c 3 and print it then share 4 and print it. 
 *Then get to the outer loop and r[] stores 3,4 and then get into inner loop. Now r has 3,4 share 
 the value to c 3 and print it then share 4 and print it. 
*/