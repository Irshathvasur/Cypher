package Aspire;

public class Callbyrefval {
	public static void main(String[] args) 
	{
		
		Callbyrefval obj=new Callbyrefval();
		phoenix phoen=new phoenix();
		
		System.out.println("The size of the object phoen is "+phoen.size);
		
		obj.change(phoen.size);
		
		System.out.println("The size after calling by value is "+phoen.size);
		
		obj.change(phoen);
		
		System.out.println("The size after calling by reference is "+phoen.size);
		
	}
	
	int change(int i)
	{
		i=55;
		
		System.out.println("The size at the function is "+i);
		
		return i;
	}
	
	void change(phoenix phoen1)
	{
		phoen1.size=64;
	}

}

class phoenix
{
	int size= 50;
}
