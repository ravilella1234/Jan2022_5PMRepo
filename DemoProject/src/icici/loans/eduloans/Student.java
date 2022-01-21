package icici.loans.eduloans;

class Student 
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		Student s = new Student(100, "sai");
		System.out.println("Sno :" + s.sno);
		System.out.println("Sname : " + s.sname);
		System.out.println(s);
	}
	
}
