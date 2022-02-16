package Aspire;

import java.util.Scanner;

public class Methods 
{
	public static void main(String[] args) 
	{
		Methods fun=new Methods();
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter two numbers to add");
		int a=scan.nextInt(),b=scan.nextInt();
		//Adding through calling method
		System.out.println("The sum is "+fun.add(a,b));
	}
	
	int add(int i,int j)
	{
		i+=j;
		return i;
	}
}
