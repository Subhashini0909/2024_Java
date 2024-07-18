package LinearSearch;

public class SearchingAnElement_UsingLinearSearchAlgorithm {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		int target = 9;
		
		boolean status = false;
		
		for(int i = 0; i<=a.length-1; i++) 
		{
		if(a[i]==target)
		{
			System.out.println("Match Found");
			status = true;
			break;
		}
	}
		if(status==false)
		{
		System.out.println("Element not found");
		}
	}
}
