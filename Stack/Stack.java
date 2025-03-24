package Corejava;

public class Stack {
	int[] stack1=new int[10];
	int top=-1;
	public void push(int val)
	{
		if(top<9)
		{
			stack1[++top]=val;
		}
		else
		{
			System.out.println("Stackfull");
		}
	
	}
	public void peek()
	{
		System.out.println(stack1[top]+" ");
	}

}
