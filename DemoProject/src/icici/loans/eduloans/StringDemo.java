package icici.loans.eduloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf('v'));
		
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3= "Ravikanth";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "ravi";
		System.out.println(s1.contains(s4));
		
		//s1 = s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		System.out.println(s3.replace('R', 'K'));
		
		System.out.println(s3.substring(2, 7));
		
		System.out.println(s4.startsWith("ra"));
		System.out.println(s4.endsWith("vi"));
		
		String s5 = "ravikanth";
		String s6 = "Ravikan";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
				
		System.out.println(s5.contains(s6.toLowerCase()));
		
		String s7 = "ravi kanth lella";
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String s8 = " ravikanth";
		System.out.println(s5.equals(s8));
		System.out.println(s5.equals(s8.trim()));
		
	}

}
