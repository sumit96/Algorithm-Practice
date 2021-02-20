package searchalgo;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BinarySearch {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[]=new int[size];
        boolean isAsc=true;
        	
            int index=1;
           
            for(int i=0; i<size;i++)
            {
                    arr[i]=s.nextInt();
            }
            if(arr[0] > arr[1])
                isAsc=false;
            
            System.out.println("Enter no. of query");
            int totalQueries= s.nextInt();
           
        int outarr[] =new int[totalQueries];
        for(int j=0; j<totalQueries;j++){
        	 int dataIndex=0;
        	System.out.println("query no. "+j);
            int item=s.nextInt();
            int low=0;
            int high=size-1;
            
            while(low <= high)
            {
            	
                int mid = (high+low)/2;
                System.out.println("mid = "+mid);
                if(arr[mid] ==  item) {
                    dataIndex = mid; 
                    break;
                }

                if(arr[mid] < item){
                    if(isAsc)
                        low=mid+1; 
                    else
                        high=mid-1;   
                }
                if(arr[mid] > item){
                    if(isAsc)
                        high=mid-1;
                    else
                        low=mid+1;    
                }
            }
            //if(!isAsc)  
              //  dataIndex=totalQueries-(dataIndex-1);
            System.out.println("total Query = "+totalQueries);
            System.out.println(dataIndex);
        }
           
        }   
    }

