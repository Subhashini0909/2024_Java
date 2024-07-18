package LinearSearch;

public class CountDuplicateElements {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,4,6,7,8,4};
		int count=0;
		
		for(int i = 0; i<=a.length-1; i++) 
		{
			if(a[i]==4)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
