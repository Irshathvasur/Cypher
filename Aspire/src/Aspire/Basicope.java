package Aspire;

import java.util.Scanner;

public class Basicope 
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt(),num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("THe sum is "+sum);
	}
}