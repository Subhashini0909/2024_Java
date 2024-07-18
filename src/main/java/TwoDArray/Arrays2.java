package TwoDArray;

public class Arrays2 {

	public static void main(String[] args) 
	{
		//Declaration - Approach 1
		int a[][] = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		
		a[1][0] = 3;
		a[1][1] = 4;
		
		a[2][0] = 5;
		a[2][1] = 6;
		
		//Declaration - Approach 2
		int b[][] = {{1,2},{3,4}};
		
		//Size
		System.out.println("Rows : " + a.length);		//Rows
		System.out.println("Columns : " + a[0].length);	//Columns
		
		//Read a single value from an array
		System.out.println("Value of a[1][1] : " + a[1][1]);
		
		//Read all values
		System.out.print("Print all the values : " );
		for(int i = 0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[0].length-1; j++)
			{
				System.out.print(a[i][j] + ",");
			}
			System.out.println();
		}
		
	}

}
