package icici.loans.carloans;

import java.util.Date;

public  abstract class A 
{
	public  final int x = 100;
	public final static String cname = "dell";
	
	public  void m1()
	{
		final int y =200;
		
		System.out.println("iam m1 from A");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static block...");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public abstract void m6();

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		A.m4();
	}

}
