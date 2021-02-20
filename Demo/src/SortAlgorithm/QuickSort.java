package SortAlgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
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
		
		sortData(arrayData, 0, arrayData.length-1);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(arrayData));
	}

	
	public static void sortData(int[] data, int start, int end)
	{
		if(start < end)
		{
			int pIndex=partiion(data, start, end);
			sortData(data, start, pIndex-1);
			sortData(data, pIndex+1, end);
		}
	}
	
	public static int partiion(int[] data, int start,int end)
	{
		int pIndex=start;
		int range=end-start+1;
		
		int pivotIndex=(int)(Math.random()*range)+start;
		int pivot =data[pivotIndex];
		
		for(int i=start; i<end; i++)
		{
			if(data[i] <= pivot)
			{
				swap(data, i, pIndex);
				pIndex=pIndex+1;
			}
		}
		swap(data,pIndex,pivotIndex);
		return pIndex;
	}
	
	public static void swap(int data[], int one, int two)
	{
		
		int temp=data[one];
		data[one]=data[two];
		data[two]=temp;
	}
	
	
}
