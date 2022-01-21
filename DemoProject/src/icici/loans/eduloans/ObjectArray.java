package icici.loans.eduloans;

public class ObjectArray 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(10, "sai");
		Student s2 = new Student(20, "varun");
		Student s3 = new Student(30, "kiran");
		Student s4 = new Student(40, "vamsi");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);

		//int[] a = new int[3];
		Student[] st = new Student[4];	
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
