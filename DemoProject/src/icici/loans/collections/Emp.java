package icici.loans.collections;

public class Emp 
{
	int eno;
	String ename;
	
	public Emp(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	public void display()
	{
		System.out.println("EMP ID :" + eno + "     "+ "EMP NAME : " + ename);
	}
	
	public static void main(String[] args) 
	{
		Emp e = new Emp(100,"sai");
		e.display();
	}
}
