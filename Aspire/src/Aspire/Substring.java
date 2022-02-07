package Aspire;

public class Substring 
{
	public static void main(String[] args) {
		String Name="Irshath vasur";
		
		String lastname=Name.substring(8,13);
		String firstname=Name.substring(0,7);
		
		System.out.println("First name is "+firstname);
		System.out.println("Last name is "+lastname);
	}
}
