package icici.loans.eduloans;

public class DemoClass 
{
	
	int a,b,sum;
	
	public Integer add(int a,int b)
	{
		sum = a+b;
		System.out.println("Add of A & b is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		DemoClass obj = new DemoClass();
		int sum = obj.add(100, 200);
		System.out.println(sum);
	}

}
