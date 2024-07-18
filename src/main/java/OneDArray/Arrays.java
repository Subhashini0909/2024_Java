package OneDArray;

public class Arrays {

	public static void main(String[] args) 
	{
		//Approach 1 - Static			(Declaration)
			int a[] = new int[3];
			a[0]=1;					   //Adding Values
			a[1]=2;
			a[2]=3;
			
		//Approach 2 - Dynamic			(Declaration + Adding values)
			int b[] = {1,2,3};
			
		//Size
			int len = b.length;
			System.out.println("Length : " + len);
		
		//Read a value
			System.out.println("Element in index 1 : " + a[1]);
			
		//To read all the element
			System.out.print("Extraacting all elements : " );
			for(int i=0; i<=a.length-1; i++)
			{
				System.out.print(a[i] + ",");
			}
			
		
	}

}
