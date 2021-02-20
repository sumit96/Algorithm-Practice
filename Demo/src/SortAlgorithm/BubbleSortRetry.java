package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRetry {
	public static void main(String arg[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of max number");
		int numberOfElement = sc.nextInt();
		System.out.println("Start enter your values");
		int arrayData[] = new int[numberOfElement];
		
		for(int i=0;i<numberOfElement;i++)
		{
			arrayData[i] = sc.nextInt();
		}
		
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(arrayData));
		
		double startTime = System.nanoTime();
		
		sortData(arrayData);
		
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arrayData));
		
		System.out.println(executionTime(startTime));
		
	}

	public static void sortData(int data[])
	{
		
		int size=data.length;
		for(int i=0; i< size-1; i++)
		{
			int flag=0;
			for(int j=0;j<size-i-1; j++)
			{
				if(data[j] > data[j+1])
				{
					flag=1;
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
					
				}
				
			}
			if(flag == 0)
				break;
		}
		
	}
	private static double executionTime(double startTime)
	{
		return (System.nanoTime() - startTime);
	}
}
