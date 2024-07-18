package LinearSearch;

public class SearchingAnElementin2DArray_UsingLinearSearchAlgorithm {

	public static void main(String[] args) 
	{
		int a[][]= {{1,3}, {2,3}, {3,3}, {4,3}, {5,3}};
		int target = 7;
		
		boolean status = false;
		
		for(int r[] : a)
		{
			for(int c :r)
			{
				if(c==target)
				{
					System.out.println("Match Found");
					status = true;
					break;
				}
			}
		}
		if(status == false)
		{
			System.out.println("Match Not found");
		}
	}

}
