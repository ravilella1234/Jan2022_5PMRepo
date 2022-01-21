package icici.loans.eduloans;

public class EmployeeChild extends Employee
{
	String city;

	public EmployeeChild(String city) 
	{
		//super();
		super(1,"sai",23.4f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	
	
	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
