package Corejava;

import java.util.Scanner;

public class MaxandMin1 {
	
	    public static void main(String args[]) {
	    	int arr[]=new int[20];
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter size:");
			int size=sc.nextInt();
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<size;i++) {
				System.out.println(arr[i]);
			}
	    	
	       
	        int max = arr[0];
	        int min = arr[0];
	        
	       
	        for (int i = 0;i < size; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; 
	            }
	            if (arr[i] < min) {
	                min = arr[i]; 
	            }
	        }
	        
	       
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }
	  


}
