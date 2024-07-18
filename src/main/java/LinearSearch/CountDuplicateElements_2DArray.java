package LinearSearch;

public class CountDuplicateElements_2DArray {

	public static void main(String[] args) 
	{
		int a[][]= {{1,3}, {2,3}, {3,3}, {4,3}, {5,3}};
		int count =0;
		
		for(int r[] : a) //r represents each sub-array. r is not an index but an array itself.
		{
			for(int c :r) //c represents each element within that sub-array. c is a value, not an index.
			{
				if(c==3)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
//		for(int r =0; r<=a.length-1; r++)
//		{
//			for(int c = 0; c<=a[0].length-1; c++)
//			{
//				if(a[r][c]==3)
//					{
//						count++;
//					}
//			}
//		}
//		System.out.println(count);
	}

}
