package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/*First Pass:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )*/

public class BubbleSort {
	
	public static void main(String arg[])
	{
		double startTime = System.nanoTime();
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("How many element required");
		int size=sc.nextInt();
		
		int arrayData[]=new int[size];
		
		for(int i=0; i < size; i++)
		{
			System.out.println("Enter your "+(i+1)+" element");
			
			int data=sc.nextInt();
			arrayData[i]=data;
		}
		System.out.println("Congrats complete data entered !!!");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
		System.out.println("Data = "+Arrays.toString(arrayData));
		
		bubbleSort(arrayData);
		
		System.out.println("Sorted Data = "+Arrays.toString(arrayData));
		
		System.out.println("Execution Time = "+executionTime(startTime));
	}

	private static void bubbleSort(int arrayData[])
	{
		
		for(int j=0; j < arrayData.length-1; j++) {
			System.out.println("PHASE "+(j+1));
			boolean swap= false;
			for(int i=0; i < arrayData.length-j-1; i++)
			{
				if(arrayData[i] > arrayData[i+1]) {
					int temp=arrayData[i];
					arrayData[i]=arrayData[i+1];
					arrayData[i+1]=temp;
					swap=true;
				}
				
				System.out.println("Data = "+Arrays.toString(arrayData));
			}
			if(swap==false)
				break;
		}
	}
	
	
	private static double executionTime(double startTime)
	{
		return (System.nanoTime() - startTime);
	}
}
