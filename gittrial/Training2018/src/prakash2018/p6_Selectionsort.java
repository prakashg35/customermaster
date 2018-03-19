package prakash2018;

import java.util.Scanner;

public class p6_Selectionsort {

	public static void main(String[] args) 
	{
	
		int elements=0;
		System.out.println("Enter the No of Elements");
		Scanner n= new Scanner(System.in);
		elements= n.nextInt();		
		System.out.println("Enter the Elements:");
		int array[]= new int[elements];

		for(int i=0; i<elements; i++)
		{
			array[i]=n.nextInt();
		}
        
		System.out.println("Array Before Selection Sort");  
        for(int i:array)
        {  
        	System.out.print(i + " ");  
        }  
    	System.out.println();  
    	
    	selsort(array);
    	
    	 System.out.println("After Selection Sort");  
         for(int i:array){  
             System.out.print(i+" ");  
         }     
	}

	  public static void selsort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	

}
