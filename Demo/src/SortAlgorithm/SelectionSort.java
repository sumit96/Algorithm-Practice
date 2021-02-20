package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
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
		
		sortData(arrayData);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arrayData));
	}

	public static void sortData(int[] data)
	{
		int size=data.length;
		for(int i=0;i< size-1; i++)
		{
			int iMin= i;
			for(int j=i+1;j<size;j++)
			{
				if(data[j] < data[iMin])
					iMin = j;
			}
			int temp=data[i];
			data[i]=data[iMin];
			data[iMin]=temp;
		}
		
		
	}
}
