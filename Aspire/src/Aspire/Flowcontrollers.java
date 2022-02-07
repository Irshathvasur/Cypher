package Aspire;

import java.util.Scanner;

public class Flowcontrollers 
{
	public static void main(String[] args) {
		
		/*Accessing by switch
		 * 1.if
		 *2.else if
		 *3.do while 
		 *4.while 
		 *5.for
		 *6.conditional operator */
		Scanner scan=new Scanner(System.in);
		System.out.println("Which statements you want to use\n1.if\n2.else if\n3.do while\n4.while\n5.for\n6.conditional operator");
		System.out.println("Enter the serial number-");
		int choo=scan.nextInt();
		switch(choo)
		{
		case 1:
			System.out.println("Enter a number-");
			int i=scan.nextInt();
			if(i==0)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			break;
		case 2:
			System.out.println("Enter a number-");
			int j=scan.nextInt();
			int num=j%2;
			if(num==0)
			{
				System.out.println("The number is even");
			}
			else
			{
				System.out.println("The number is odd");
			}
			break;
		case 3:
			int k=0;
			do {
				System.out.println("do while Loop "+k);
				k++;
			}while(k<=10);
			break;
		case 4:
			i=10;
			while(i>0) {
				System.out.println("the value of i is...:"+i);
				i--;
			}
			break;
		case 5:
			for(int m=0;m<=10;m++)
			{
				System.out.println("for loop "+m);
			}
			break;
		case 6:
			System.out.println("0 is true\n1 or anyother number is false");
			System.out.println("Enter a number-");
			int n=scan.nextInt();
			boolean bool=(n==0);
			String result=bool?"True":"false";
			System.out.println(result);
			break;
		default:
			System.out.println("Enter a valid serial number");
		};	
	}

}
