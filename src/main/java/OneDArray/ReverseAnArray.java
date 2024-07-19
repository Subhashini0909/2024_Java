package OneDArray;

public class ReverseAnArray {

	public static void main(String[] args) 
	{
		int a[] = {3,4,2,5,1};
		
		
		System.out.println(".....Before Reversing.....");
		for(int b : a)
		{
			System.out.print(b + ",");
		}
		
		System.out.println();
		System.out.println(".....After Reversing.....");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] + ",");
		}
	}

}
