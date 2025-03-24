package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] num=new int[size];
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
	
		for(int i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}
		int left = 0, right = size - 1;

		while(left < right) {
			int temp=num[left];
			num[left]=num[right];
			num[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(num));
	}
}
		