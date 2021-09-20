package com.DSA.Graphs;

public class Stack {
	
	int stack[];
	int top;
	
	Stack(int max)
	{
		stack=new int[max];
		top=-1;
	}
	
	public  void push(int v)
	{
		stack[++top]=v;
	}
	
	public  int pop()
	{
		return stack[top--];
	}
	
	public  int peak()
	{
		return stack[top];
	}
	
	public  boolean isEmpty()
	{
		return top==-1;
	}

}
