package Aspire;

public class Varargmethod 
{
	public static void main(String[] args) 
	{
		Varargmethod var=new Varargmethod();
		
		var.method(34,56,77,88);
	}
	
	void method(int... i)
	{
		for(int j=0;j<4;j++)
		{
			System.out.println(i[j]);
		}
		for(int a:i) 
		{
			System.out.print(a+"\t");
		}
	}
}
