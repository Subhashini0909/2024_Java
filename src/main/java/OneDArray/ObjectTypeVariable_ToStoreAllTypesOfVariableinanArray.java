package OneDArray;

public class ObjectTypeVariable_ToStoreAllTypesOfVariableinanArray {

	public static void main(String[] args) 
	{
		Object a[] = {1,'a', true, "Hi"};
		
		for(Object x : a)
		{
			System.out.print(x + ",");
		}
	}

}
