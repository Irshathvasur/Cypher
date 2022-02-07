package Aspire;

public class array {
	public static void main(String[] args) 
	{
		int legnd[]= {45, 77, 38};
		System.out.println("Going to print two value by accesing a single dimensional array");
		System.out.println(legnd[1]+" "+legnd[2]);
		int myth[][]= {
				{24, 56, 76, 53},
				{49, 87, 34, 62},
				{46, 74, 23}
		};
		System.out.println("No of the rows in myth is "+myth.length);
		System.out.println("Going to print a multidimensional array value");
		System.out.println(myth[1][1]);
		//adding the values of a single dimensional array and a multidimensional array
		System.out.println(myth[2][2]+legnd[1]);
	}
}