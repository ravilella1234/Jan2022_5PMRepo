package icici.loans.eduloans;

public class Calculations1 
{
	int a,b, result;

	public Calculations1(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("sub of A & b is : " + result);
	}
	
	public static void main(String[] args) 
	{
		Calculations1 obj = new Calculations1(10, 20);
		obj.add();
		obj.sub();
		
		Calculations1 obj1 = new Calculations1(100, 200);
		obj1.add();
		obj1.sub();
	}

}
