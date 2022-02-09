package Aspire;

public class Enhancedloop 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {3,4,5,6};
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("\n");
		
		
		int arr2d[][]=
		{
				{2,4,6,8},
				{1,3,5,7},
				{10,20,30,40}
		};
		
		for(int j[]:arr2d)
		{
			for(int m:j) 
			{
				System.out.print(m+"\t");
			}
			System.out.println();
		}
	}
}
