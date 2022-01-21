package icici.loans.homeloans;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{		
		String name=null;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the 10 charater String :");
			name = sc.nextLine();
			try 
			{
				if (name.length() != 10) 
				{
					throw new UserDefinedException("String should be 10 character String");
				} 
				else 
				{
					System.out.println(name);
					break;
				}
			} 
			catch (UserDefinedException e) 
			{
				e.printStackTrace();
			} 
		}
		
	}

}
