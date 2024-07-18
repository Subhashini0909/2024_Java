package TwoDArray;

public class ObjectTypeVariable_ToStoreAllTypesOfVariableina2DArray {

	public static void main(String[] args) 
	{
		Object a[][] = {{1,'c'}, {2,true}, {"Hi",4}};
		
		for(Object r[] : a)
		{
			for(Object c : r)
			{
				System.out.print(c + ",");
			}
			System.out.println();
		}
	}

}
