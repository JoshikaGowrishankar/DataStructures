package Corejava;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 {
	public static void main (String args[]) {
		int num[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		}
		System.out.println("Enter the positioin to del:");
		int pos=sc.nextInt();
		num[pos-1]=0;
		for(int mydel=pos-1;mydel<size;mydel++) {
			num[mydel]=num[mydel+1];
			
		}
		size--;
		System.out.println(Arrays.toString(num));
	}

}
