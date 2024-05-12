import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	
	  static void bubbleSort(int array[]) {
	    int size = array.length;
	    
	  
	    for (int i = 0; i < size - 1; i++)
	    
	     
	      for (int j = 0; j < size - i - 1; j++)

	      
	        if (array[j] > array[j + 1]) {

	          
	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	        }
	  }

	  public static void main(String args[]) {
	      
		  int n;  
		  Scanner sc=new Scanner(System.in);  
		  System.out.print("Enter the number of elements you want to store: ");  
		  
		  n=sc.nextInt();  
		
		  int[] data = new int[n];  
		  System.out.println("..................................................................");
		  System.out.println("Enter the elements of the array: "); 
		  System.out.println("..................................................................");
		  for(int i=0; i<n; i++)  
		  {  
		  
		  data[i]=sc.nextInt();  
		  }  
		  System.out.println("Array elements are: ");  
		 
		  for (int i=0; i<n; i++)   
		  {  
		  System.out.println(data[i]);  
		  }  
		  System.out.println("..................................................................");
	    
	   
	    BubbleSort.bubbleSort(data);
	    
	    System.out.println("Sorted Array in Ascending Order:");
	    System.out.println(Arrays.toString(data));
	  }
	
}
