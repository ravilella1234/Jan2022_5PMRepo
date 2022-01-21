package icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("Dell");
		a.add("Urbanpro");
		a.add("kosmik");
		a.add("Oaktech");
		
		System.out.println(a);
		
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("oracle"))
				val.set("Durgasoft");
			else
				val.remove();
		}

		System.out.println(a);
	}

}
