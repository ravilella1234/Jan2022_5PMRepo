package icici.loans.eduloans;

import java.util.Scanner;

public class OneDimenssionArray 
{
	
	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum =0; 
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+ a[i]);
			sum = sum + a[i];
		}
		System.out.println("sum of the array elements are : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		
		/*
		 * int[] a = {10,20,30,40}; for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]); }
		 */
		
		OneDimenssionArray obj = new OneDimenssionArray();
		int count = obj.m1();
		System.out.println("Count of array is : " + count);
		
	}

}
