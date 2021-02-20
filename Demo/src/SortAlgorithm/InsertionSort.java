package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
		for(int i=1; i<size-1; i++)
		{
			int value=data[i];
			int hole=i;
			
			while(hole > 0 && data[hole-1] > value)
			{
				data[hole]=data[hole-1];
				hole=hole-1;
			}
			System.out.println("Hole ="+hole);
			data[hole]=value;
			
		}
	}
	
}
