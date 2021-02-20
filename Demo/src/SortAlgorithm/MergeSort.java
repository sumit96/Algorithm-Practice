package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/* Java program for Merge Sort */
class MergeSort {
	
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
		if(size < 2)
			return;
		
		int mid= size/2;
		int[]left= new int[mid];
		int[]right= new int[size-mid];
		
		for(int i=0; i<=mid-1; i++)
		{
			left[i]=data[i];
		}
		
		for(int j=mid; j<=size-1;j++)
		{
			right[j-mid]=data[j];
		}
		
		sortData(left);
		sortData(right);

		mergeSort(left, right, data);
		
	}
	
	public static void mergeSort(int[] left, int[] right, int[] array)
	{
		int lSize=left.length;
		int rSize=right.length;
		int i=0;
		int j=0;
		int k=0;
		while(i < lSize && j < rSize)
		{
			if(left[i] <= right[j])
			{
				array[k]=left[i];
				i++;
			}else {
				array[k]=right[j];
				j++;
			}
			k++;
		}
		
		
		while(i<lSize)
		{
			array[k]=left[i];
			i++;
			k++;
		}
		
		while(j<rSize)
		{
			array[k]=right[j];
			j++;
			k++;
		}
	}
} 
