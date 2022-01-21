package icici.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance (or) instance-global (or) non-static variable
	static String name = "vmware"; //static (or) static-global
	static VariableTypes obj = new VariableTypes() ;
	
	public void m1()
	{
		int  x = 200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.name);
	}
	
	public static void m2()
	{
		
		System.out.println(obj.x);
		System.out.println(VariableTypes.name);
	}
	
	public static void main(String[] args) 
	{
		//obj = new VariableTypes(); // Non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.name);
	}

}
