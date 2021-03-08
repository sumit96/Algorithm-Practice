package stack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImplementationOfStack {

	
	static int[] stackData;
	static int top=-1;
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of records");
		int size=sc.nextInt();
		stackData =new int[size];
			pop1();
			push1(2);
			push1(4);
			push1(10);
			System.out.println(Arrays.toString(stackData));
			
			pop1();
			push1(1);
			push1(11);
			System.out.println(Arrays.toString(stackData));
			
			pop1();
			
		System.out.println("Left records in Stack ");
		for(int data : stackData)
		{
			if(top == -1)
				break;
			
			System.out.print(data+",");
			
			top--;
			
		}
	}
	
	private static void push1(int data)
	{
		if(top == stackData.length-1)
		{
			System.out.println("Overflow");
			return;
		}
		stackData[++top]=data;
			
	}
	
	private static void pop1()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
			return;
			
		}
		int itemDelete=stackData[top--];
		System.out.println("Deleted record = "+itemDelete);
		
	}
	
	
}
