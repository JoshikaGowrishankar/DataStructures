package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	public static void  main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		     for(int i=0;i<size;i++) {
		    	 System.out.println(arr[i]);
			
		}
		     System.out.println("Sorted array");
		    Arrays.sort(arr);
		    for(int i=0;i<size;i++) {
		    	 System.out.println(arr[i]);
			
		}
		    System.out.println("Enter the element to find:");
		    int find=sc.nextInt();
		    int l=0;
		    int r=size-1;
		   
		   while(l<=r) {
			  int m=(l+r)/2;
			   if(arr[m]==find) {
				   System.out.println("Value" +find+"found at the index"+m);
				   return;
			   }
			   else if(arr[m]<find) {
				   l=m+1;
				   
			   }
			   else  {
				   r=m-1;
		   }
			 
			   
		   
		   }
		

	}
	                                                      

}
