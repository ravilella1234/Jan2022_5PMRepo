package icici.loans.eduloans;

import icici.loans.carloans.A;
import icici.loans.carloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 in C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C");
	}

	public static void main(String[] args) 
	{
		A a  = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		
		C c =  new C();
		c.m1();
		c.m3();
	}

}
