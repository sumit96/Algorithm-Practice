package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/*First Pass:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, Initially 0th index is minimum then then 1st index contains minimum value 
( 1 5 4 2 8 ) –>  ( 1 2 4 5 8 ), Swap 1st position with 0th index , Now 3rd index have minimum value
already sorted after 3rd index with 1st index
complete the iteration
*/

// Worst case and average case complexity - O(n2)
// Best case O(n)

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
			System.out.println(Arrays.toString(data));
		}
		
		
	}
}
