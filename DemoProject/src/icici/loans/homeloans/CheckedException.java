package icici.loans.homeloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException 
{

	public static void m1() 
	{
		try {
			BufferedReader obj = new BufferedReader(new FileReader("d:\\abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) 
	{
		m1();
	}

}