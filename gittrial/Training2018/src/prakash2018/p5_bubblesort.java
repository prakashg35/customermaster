package prakash2018;

import java.util.Scanner;



public class p5_bubblesort {

	    static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	    public static void main(String[] args) {  
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
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(array);//sorting array elements using bubble sort  
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i:array){  
                        System.out.print(i + " ");  
                }  
   /*
	                
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	   */
	         
	    n.close();
	} }